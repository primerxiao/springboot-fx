package com.primer.entity.daybat;

/**
 * Table: plugin_check_conf
 */
public class PluginCheckConf {
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
     * Column: check_item_name
     * Remark: 检查项名称
     */
    private String checkItemName;

    /**
     * Column: check_item_sql
     * Remark: 检查项sql
     */
    private String checkItemSql;

    /**
     * Column: check_suc_condition
     * Remark: 检查成功条件
     */
    private String checkSucCondition;

    /**
     * Column: check_err_desc
     * Remark: 错误描述
     */
    private String checkErrDesc;

    /**
     * Column: check_faild_deal
     * Remark: 检查失败处理方式
     */
    private String checkFaildDeal;

    /**
     * Column: valid_date
     * Remark: 生效日期
     */
    private String validDate;

    /**
     * Column: invalid_date
     * Remark: 失效日期
     */
    private String invalidDate;

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

    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName == null ? null : checkItemName.trim();
    }

    public String getCheckItemSql() {
        return checkItemSql;
    }

    public void setCheckItemSql(String checkItemSql) {
        this.checkItemSql = checkItemSql == null ? null : checkItemSql.trim();
    }

    public String getCheckSucCondition() {
        return checkSucCondition;
    }

    public void setCheckSucCondition(String checkSucCondition) {
        this.checkSucCondition = checkSucCondition == null ? null : checkSucCondition.trim();
    }

    public String getCheckErrDesc() {
        return checkErrDesc;
    }

    public void setCheckErrDesc(String checkErrDesc) {
        this.checkErrDesc = checkErrDesc == null ? null : checkErrDesc.trim();
    }

    public String getCheckFaildDeal() {
        return checkFaildDeal;
    }

    public void setCheckFaildDeal(String checkFaildDeal) {
        this.checkFaildDeal = checkFaildDeal == null ? null : checkFaildDeal.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public String getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate == null ? null : invalidDate.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }
}