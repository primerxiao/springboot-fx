package com.primer.entity.daybat;

/**
 * Table: plugin_export_conf
 */
public class PluginExportConf {
    /**
     * Column: plugin_conf_id
     * Remark: 配置标识符
     */
    private String pluginConfId;

    /**
     * Column: conf_sort
     * Remark: 配置顺序
     */
    private Integer confSort;

    /**
     * Column: export_mode
     * Remark: 数据导出方式
     */
    private String exportMode;

    /**
     * Column: export_target
     * Remark: 数据表/sql语句
     */
    private String exportTarget;

    /**
     * Column: export_to_file
     * Remark: 文件存放路径
     */
    private String exportToFile;

    /**
     * Column: field_separator
     * Remark: 字段分隔符
     */
    private String fieldSeparator;

    /**
     * Column: file_charset
     * Remark: 文件编码格式
     */
    private String fileCharset;

    /**
     * Column: is_ok_file
     * Remark: 是否需要生成OK文件
     */
    private String isOkFile;

    /**
     * Column: ok_file_full_name
     * Remark: OK文件存放路径名称
     */
    private String okFileFullName;

    /**
     * Column: ok_file_content
     * Remark: OK文件内容配置
     */
    private String okFileContent;

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

    public String getPluginConfId() {
        return pluginConfId;
    }

    public void setPluginConfId(String pluginConfId) {
        this.pluginConfId = pluginConfId == null ? null : pluginConfId.trim();
    }

    public Integer getConfSort() {
        return confSort;
    }

    public void setConfSort(Integer confSort) {
        this.confSort = confSort;
    }

    public String getExportMode() {
        return exportMode;
    }

    public void setExportMode(String exportMode) {
        this.exportMode = exportMode == null ? null : exportMode.trim();
    }

    public String getExportTarget() {
        return exportTarget;
    }

    public void setExportTarget(String exportTarget) {
        this.exportTarget = exportTarget == null ? null : exportTarget.trim();
    }

    public String getExportToFile() {
        return exportToFile;
    }

    public void setExportToFile(String exportToFile) {
        this.exportToFile = exportToFile == null ? null : exportToFile.trim();
    }

    public String getFieldSeparator() {
        return fieldSeparator;
    }

    public void setFieldSeparator(String fieldSeparator) {
        this.fieldSeparator = fieldSeparator == null ? null : fieldSeparator.trim();
    }

    public String getFileCharset() {
        return fileCharset;
    }

    public void setFileCharset(String fileCharset) {
        this.fileCharset = fileCharset == null ? null : fileCharset.trim();
    }

    public String getIsOkFile() {
        return isOkFile;
    }

    public void setIsOkFile(String isOkFile) {
        this.isOkFile = isOkFile == null ? null : isOkFile.trim();
    }

    public String getOkFileFullName() {
        return okFileFullName;
    }

    public void setOkFileFullName(String okFileFullName) {
        this.okFileFullName = okFileFullName == null ? null : okFileFullName.trim();
    }

    public String getOkFileContent() {
        return okFileContent;
    }

    public void setOkFileContent(String okFileContent) {
        this.okFileContent = okFileContent == null ? null : okFileContent.trim();
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