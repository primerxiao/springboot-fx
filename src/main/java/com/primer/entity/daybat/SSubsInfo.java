package com.primer.entity.daybat;

/**
 * Table: s_subs_info
 */
public class SSubsInfo {
    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: subs_name
     * Remark: 子系统名称
     */
    private String subsName;

    /**
     * Column: subs_data_date
     * Remark: 子系统数据日期
     */
    private String subsDataDate;

    /**
     * Column: subs_last_data_date
     * Remark: 子系统上一数据日期
     */
    private String subsLastDataDate;

    /**
     * Column: subs_load_date
     * Remark: 子系统装数完成日期
     */
    private String subsLoadDate;

    /**
     * Column: subs_bat_date
     * Remark: 子系统批次完成日期
     */
    private String subsBatDate;

    /**
     * Column: batch_id_prefix
     * Remark: 批次编号前缀
     */
    private String batchIdPrefix;

    /**
     * Column: rsv_date
     * Remark: 备用日期
     */
    private String rsvDate;

    /**
     * Column: rsv_state
     * Remark: 备用状态
     */
    private String rsvState;

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public String getSubsName() {
        return subsName;
    }

    public void setSubsName(String subsName) {
        this.subsName = subsName == null ? null : subsName.trim();
    }

    public String getSubsDataDate() {
        return subsDataDate;
    }

    public void setSubsDataDate(String subsDataDate) {
        this.subsDataDate = subsDataDate == null ? null : subsDataDate.trim();
    }

    public String getSubsLastDataDate() {
        return subsLastDataDate;
    }

    public void setSubsLastDataDate(String subsLastDataDate) {
        this.subsLastDataDate = subsLastDataDate == null ? null : subsLastDataDate.trim();
    }

    public String getSubsLoadDate() {
        return subsLoadDate;
    }

    public void setSubsLoadDate(String subsLoadDate) {
        this.subsLoadDate = subsLoadDate == null ? null : subsLoadDate.trim();
    }

    public String getSubsBatDate() {
        return subsBatDate;
    }

    public void setSubsBatDate(String subsBatDate) {
        this.subsBatDate = subsBatDate == null ? null : subsBatDate.trim();
    }

    public String getBatchIdPrefix() {
        return batchIdPrefix;
    }

    public void setBatchIdPrefix(String batchIdPrefix) {
        this.batchIdPrefix = batchIdPrefix == null ? null : batchIdPrefix.trim();
    }

    public String getRsvDate() {
        return rsvDate;
    }

    public void setRsvDate(String rsvDate) {
        this.rsvDate = rsvDate == null ? null : rsvDate.trim();
    }

    public String getRsvState() {
        return rsvState;
    }

    public void setRsvState(String rsvState) {
        this.rsvState = rsvState == null ? null : rsvState.trim();
    }
}