package com.primer.service.impl;

import com.google.common.base.CaseFormat;
import com.primer.common.database.DataSourceManager;
import com.primer.service.BatchService;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


@Service
public class BatchServiceImpl implements BatchService {


    @Override
    public List list(String dataSourceKey, String sql, Class clasz) throws SQLException, IllegalAccessException, InstantiationException {
        HashMap<String, String> map = getRowProcessorMap(clasz);
        QueryRunner qr = new QueryRunner(DataSourceManager.getDataSource(dataSourceKey));
        BeanListHandler<Object> beanListHandler = new BeanListHandler<Object>(clasz, new BasicRowProcessor(new BeanProcessor(map)));
        return qr.execute(sql, beanListHandler).get(0);
    }

    @Override
    public Object queryOne(String dataSourceKey, String sql, Class clasz) throws SQLException, IllegalAccessException, InstantiationException {
        HashMap<String, String> map = getRowProcessorMap(clasz);
        QueryRunner qr = new QueryRunner(DataSourceManager.getDataSource(dataSourceKey));
        BeanHandler<Object> beanHandler = new BeanHandler<Object>(clasz, new BasicRowProcessor(new BeanProcessor(map)));
        return qr.execute(sql, beanHandler).get(0);
    }

    @Override
    public int delete(String dataSourceKey, String sql) throws SQLException {
        QueryRunner qr = new QueryRunner(DataSourceManager.getDataSource(dataSourceKey));
        return qr.update(sql);
    }

    private HashMap<String, String> getRowProcessorMap(Class clasz) {
        HashMap<String, String> map = new HashMap<>();
        Field[] declaredFields = clasz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            map.put(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, declaredField.getName()), declaredField.getName());
        }
        return map;
    }

    @Override
    public int update(String dataSourceKey, String sql) throws SQLException {
        QueryRunner qr = new QueryRunner(DataSourceManager.getDataSource(dataSourceKey));
        return qr.update(sql);
    }
}
