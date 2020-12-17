package com.primer.entity.daybat;

/**
 * Table: plugin_excel_conf
 */
public class PluginExcelConf {
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
     * Column: excel_oper_type
     * Remark: excel操作类型
     */
    private String excelOperType;

    /**
     * Column: param_key_value
     * Remark: 参数键值对
     */
    private String paramKeyValue;

    /**
     * Column: configure_file
     * Remark: excel操作配置文件
     */
    private String configureFile;

    /**
     * Column: faild_deal
     * Remark: 失败处理方式
     */
    private String faildDeal;

    /**
     * Column: last_modify_date
     * Remark: 最后更新日期
     */
    private String lastModifyDate;

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

    public String getExcelOperType() {
        return excelOperType;
    }

    public void setExcelOperType(String excelOperType) {
        this.excelOperType = excelOperType == null ? null : excelOperType.trim();
    }

    public String getParamKeyValue() {
        return paramKeyValue;
    }

    public void setParamKeyValue(String paramKeyValue) {
        this.paramKeyValue = paramKeyValue == null ? null : paramKeyValue.trim();
    }

    public String getConfigureFile() {
        return configureFile;
    }

    public void setConfigureFile(String configureFile) {
        this.configureFile = configureFile == null ? null : configureFile.trim();
    }

    public String getFaildDeal() {
        return faildDeal;
    }

    public void setFaildDeal(String faildDeal) {
        this.faildDeal = faildDeal == null ? null : faildDeal.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }
}