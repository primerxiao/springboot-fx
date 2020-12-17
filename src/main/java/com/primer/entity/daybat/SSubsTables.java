package com.primer.entity.daybat;

/**
 * Table: s_subs_tables
 */
public class SSubsTables {
    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: tab_name
     * Remark: 表名称
     */
    private String tabName;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

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

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName == null ? null : tabName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}