package com.primer.entity.daybat;

/**
 * Table: plugin_load_conf_copy
 */
public class PluginLoadConfCopy {
    /**
     * Column: table_name
     * Remark: 数据库表名
     */
    private String tableName;

    /**
     * Column: plugin_conf_id
     * Remark: 配置标识符
     */
    private String pluginConfId;

    /**
     * Column: table_cnname
     * Remark: 表中文名称
     */
    private String tableCnname;

    /**
     * Column: table_type
     * Remark: 数据表类型
     */
    private String tableType;

    /**
     * Column: table_load_mode
     * Remark: 数据装载方式
     */
    private String tableLoadMode;

    /**
     * Column: up_sysname
     * Remark: 供数系统名称
     */
    private String upSysname;

    /**
     * Column: load_from_file
     * Remark: 文件路径
     */
    private String loadFromFile;

    /**
     * Column: file_row_flag
     * Remark: 是否允许条数为零
     */
    private String fileRowFlag;

    /**
     * Column: load_warn_flag
     * Remark: 是否忽略警告
     */
    private String loadWarnFlag;

    /**
     * Column: diff_comp_method
     * Remark: 差异比较方式
     */
    private String diffCompMethod;

    /**
     * Column: limit_percent
     * Remark: 比较阀值(%)
     */
    private Integer limitPercent;

    /**
     * Column: diff_deal_method
     * Remark: 差异处理方式
     */
    private String diffDealMethod;

    /**
     * Column: last_modify_date
     * Remark: 最后更新日期
     */
    private String lastModifyDate;

    /**
     * Column: conf_sort
     * Remark: 配置顺序
     */
    private Integer confSort;

    /**
     * Column: load_separator
     * Remark: 字段分隔符
     */
    private String loadSeparator;

    /**
     * Column: before_load_sql
     * Remark: 装载前执行语句
     */
    private String beforeLoadSql;

    /**
     * Column: after_load_sql
     * Remark: 装载后执行语句
     */
    private String afterLoadSql;

    /**
     * Column: file_charset
     * Remark: 文件编码格式
     */
    private String fileCharset;

    /**
     * Column: load_buffer_size
     * Remark: 缓冲区大小(k)
     */
    private Integer loadBufferSize;

    /**
     * Column: load_faild_deal
     * Remark: 装载失败处理方式
     */
    private String loadFaildDeal;

    /**
     * Column: load_fields
     * Remark: 指定字段
     */
    private String loadFields;

    /**
     * Column: create_table_ddl
     * Remark: 建表语句
     */
    private String createTableDdl;

    /**
     * Column: is_deal_empty_str
     * Remark: 是否处理空字符串
     */
    private String isDealEmptyStr;

    /**
     * Column: deal_empty_str
     * Remark: 空串替换值
     */
    private String dealEmptyStr;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getPluginConfId() {
        return pluginConfId;
    }

    public void setPluginConfId(String pluginConfId) {
        this.pluginConfId = pluginConfId == null ? null : pluginConfId.trim();
    }

    public String getTableCnname() {
        return tableCnname;
    }

    public void setTableCnname(String tableCnname) {
        this.tableCnname = tableCnname == null ? null : tableCnname.trim();
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType == null ? null : tableType.trim();
    }

    public String getTableLoadMode() {
        return tableLoadMode;
    }

    public void setTableLoadMode(String tableLoadMode) {
        this.tableLoadMode = tableLoadMode == null ? null : tableLoadMode.trim();
    }

    public String getUpSysname() {
        return upSysname;
    }

    public void setUpSysname(String upSysname) {
        this.upSysname = upSysname == null ? null : upSysname.trim();
    }

    public String getLoadFromFile() {
        return loadFromFile;
    }

    public void setLoadFromFile(String loadFromFile) {
        this.loadFromFile = loadFromFile == null ? null : loadFromFile.trim();
    }

    public String getFileRowFlag() {
        return fileRowFlag;
    }

    public void setFileRowFlag(String fileRowFlag) {
        this.fileRowFlag = fileRowFlag == null ? null : fileRowFlag.trim();
    }

    public String getLoadWarnFlag() {
        return loadWarnFlag;
    }

    public void setLoadWarnFlag(String loadWarnFlag) {
        this.loadWarnFlag = loadWarnFlag == null ? null : loadWarnFlag.trim();
    }

    public String getDiffCompMethod() {
        return diffCompMethod;
    }

    public void setDiffCompMethod(String diffCompMethod) {
        this.diffCompMethod = diffCompMethod == null ? null : diffCompMethod.trim();
    }

    public Integer getLimitPercent() {
        return limitPercent;
    }

    public void setLimitPercent(Integer limitPercent) {
        this.limitPercent = limitPercent;
    }

    public String getDiffDealMethod() {
        return diffDealMethod;
    }

    public void setDiffDealMethod(String diffDealMethod) {
        this.diffDealMethod = diffDealMethod == null ? null : diffDealMethod.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }

    public Integer getConfSort() {
        return confSort;
    }

    public void setConfSort(Integer confSort) {
        this.confSort = confSort;
    }

    public String getLoadSeparator() {
        return loadSeparator;
    }

    public void setLoadSeparator(String loadSeparator) {
        this.loadSeparator = loadSeparator == null ? null : loadSeparator.trim();
    }

    public String getBeforeLoadSql() {
        return beforeLoadSql;
    }

    public void setBeforeLoadSql(String beforeLoadSql) {
        this.beforeLoadSql = beforeLoadSql == null ? null : beforeLoadSql.trim();
    }

    public String getAfterLoadSql() {
        return afterLoadSql;
    }

    public void setAfterLoadSql(String afterLoadSql) {
        this.afterLoadSql = afterLoadSql == null ? null : afterLoadSql.trim();
    }

    public String getFileCharset() {
        return fileCharset;
    }

    public void setFileCharset(String fileCharset) {
        this.fileCharset = fileCharset == null ? null : fileCharset.trim();
    }

    public Integer getLoadBufferSize() {
        return loadBufferSize;
    }

    public void setLoadBufferSize(Integer loadBufferSize) {
        this.loadBufferSize = loadBufferSize;
    }

    public String getLoadFaildDeal() {
        return loadFaildDeal;
    }

    public void setLoadFaildDeal(String loadFaildDeal) {
        this.loadFaildDeal = loadFaildDeal == null ? null : loadFaildDeal.trim();
    }

    public String getLoadFields() {
        return loadFields;
    }

    public void setLoadFields(String loadFields) {
        this.loadFields = loadFields == null ? null : loadFields.trim();
    }

    public String getCreateTableDdl() {
        return createTableDdl;
    }

    public void setCreateTableDdl(String createTableDdl) {
        this.createTableDdl = createTableDdl == null ? null : createTableDdl.trim();
    }

    public String getIsDealEmptyStr() {
        return isDealEmptyStr;
    }

    public void setIsDealEmptyStr(String isDealEmptyStr) {
        this.isDealEmptyStr = isDealEmptyStr == null ? null : isDealEmptyStr.trim();
    }

    public String getDealEmptyStr() {
        return dealEmptyStr;
    }

    public void setDealEmptyStr(String dealEmptyStr) {
        this.dealEmptyStr = dealEmptyStr == null ? null : dealEmptyStr.trim();
    }
}