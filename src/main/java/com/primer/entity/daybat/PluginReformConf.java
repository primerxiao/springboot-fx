package com.primer.entity.daybat;

/**
 * Table: plugin_reform_conf
 */
public class PluginReformConf {
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
     * Column: reform_table_schema
     * Remark: 表所属模式
     */
    private String reformTableSchema;

    /**
     * Column: reform_table_name
     * Remark: 重整表名称
     */
    private String reformTableName;

    /**
     * Column: reform_group_id
     * Remark: 重整组id
     */
    private String reformGroupId;

    /**
     * Column: reform_cycle_day
     * Remark: 重整周期
     */
    private Integer reformCycleDay;

    /**
     * Column: last_reform_date
     * Remark: 上次重整日期
     */
    private String lastReformDate;

    /**
     * Column: rsv_option
     * Remark: 备用选项
     */
    private String rsvOption;

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

    public String getReformTableSchema() {
        return reformTableSchema;
    }

    public void setReformTableSchema(String reformTableSchema) {
        this.reformTableSchema = reformTableSchema == null ? null : reformTableSchema.trim();
    }

    public String getReformTableName() {
        return reformTableName;
    }

    public void setReformTableName(String reformTableName) {
        this.reformTableName = reformTableName == null ? null : reformTableName.trim();
    }

    public String getReformGroupId() {
        return reformGroupId;
    }

    public void setReformGroupId(String reformGroupId) {
        this.reformGroupId = reformGroupId == null ? null : reformGroupId.trim();
    }

    public Integer getReformCycleDay() {
        return reformCycleDay;
    }

    public void setReformCycleDay(Integer reformCycleDay) {
        this.reformCycleDay = reformCycleDay;
    }

    public String getLastReformDate() {
        return lastReformDate;
    }

    public void setLastReformDate(String lastReformDate) {
        this.lastReformDate = lastReformDate == null ? null : lastReformDate.trim();
    }

    public String getRsvOption() {
        return rsvOption;
    }

    public void setRsvOption(String rsvOption) {
        this.rsvOption = rsvOption == null ? null : rsvOption.trim();
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