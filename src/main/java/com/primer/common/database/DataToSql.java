package com.primer.common.database;

import com.google.common.base.CaseFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Strings;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 对象数据转换成sql
 * @author 肖均辉
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataToSql {

    private Class dataClass;

    private List<? extends Object> dataList;

    public List<String> createInsertSqls() throws IllegalAccessException {
        final ArrayList<String> sqls = new ArrayList<>();
        if (dataList == null || dataList.isEmpty()) {
            return sqls;
        }
        for (Object o : dataList) {

            sqls.add(createInsertSql(o));
        }
        return sqls;
    }

    protected final String createInsertSql(Object data) throws IllegalAccessException {
        ArrayList<String> columnNames = getColumnNames();
        if (columnNames.isEmpty()) {
            return "";
        }
        //获取字段名
        StringBuilder columnBuilder = new StringBuilder();
        columnBuilder.append("insert into ");
        columnBuilder.append("efp_daybat.");
        columnBuilder.append(getTableName());
        columnBuilder.append("(");
        for (int i = 0; i < columnNames.size(); i++) {
            //设置字段
            columnBuilder.append(columnNames.get(i));
            if (i != columnNames.size() - 1) {
                columnBuilder.append(",");
            }
        }
        columnBuilder.append(")");
        columnBuilder.append(" ");
        columnBuilder.append("values");
        //获取值
        Field[] fields = data.getClass().getDeclaredFields();
        columnBuilder.append("(");
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);
            String value = String.valueOf(fields[j].get(data));
            if ("null".equals(value)) {
                columnBuilder.append("null");
            }else {
                //这里设置上标
                columnBuilder.append("'");
                if (Strings.isNotEmpty(value)) {
                    if (value.contains("'")) {
                        value = value.replaceAll("'", "\\\\'");
                    }
                    columnBuilder.append(value);
                }
                columnBuilder.append("'");
            }

            if (j != fields.length - 1) {
                columnBuilder.append(",");
            }
            fields[j].setAccessible(false);
        }
        columnBuilder.append(")");
        columnBuilder.append(";");
        return columnBuilder.toString();
    }

    public String getTableName() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, dataClass.getSimpleName());
    }

    public ArrayList<String> getColumnNames() {
        ArrayList<String> columnNameList = new ArrayList<>();
        Field[] fields = dataClass.getDeclaredFields();
        for (Field field : fields) {
            columnNameList.add(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field.getName()));
        }
        return columnNameList;
    }
}
