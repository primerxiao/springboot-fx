package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: pub_sys_info
 */
public class PubSysInfo {
    /**
     * Column: sys_id
     * Remark: 系统编号
     */
    private String sysId;

    /**
     * Column: sys_name
     * Remark: 系统名称
     */
    private String sysName;

    /**
     * Column: headoffice
     * Remark: 未知
     */
    private String headoffice;

    /**
     * Column: progress
     * Remark: 未知
     */
    private String progress;

    /**
     * Column: openday
     * Remark: 营业日期
     */
    private String openday;

    /**
     * Column: last_openday
     * Remark: 上一营业日期
     */
    private String lastOpenday;

    /**
     * Column: effectivedays
     * Remark: 未知
     */
    private BigDecimal effectivedays;

    /**
     * Column: sys_status
     * Remark: 系统状态
     */
    private String sysStatus;

    /**
     * Column: loginmode
     * Remark: 未知
     */
    private String loginmode;

    /**
     * Column: slmode
     * Remark: 未知
     */
    private String slmode;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getHeadoffice() {
        return headoffice;
    }

    public void setHeadoffice(String headoffice) {
        this.headoffice = headoffice == null ? null : headoffice.trim();
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public String getOpenday() {
        return openday;
    }

    public void setOpenday(String openday) {
        this.openday = openday == null ? null : openday.trim();
    }

    public String getLastOpenday() {
        return lastOpenday;
    }

    public void setLastOpenday(String lastOpenday) {
        this.lastOpenday = lastOpenday == null ? null : lastOpenday.trim();
    }

    public BigDecimal getEffectivedays() {
        return effectivedays;
    }

    public void setEffectivedays(BigDecimal effectivedays) {
        this.effectivedays = effectivedays;
    }

    public String getSysStatus() {
        return sysStatus;
    }

    public void setSysStatus(String sysStatus) {
        this.sysStatus = sysStatus == null ? null : sysStatus.trim();
    }

    public String getLoginmode() {
        return loginmode;
    }

    public void setLoginmode(String loginmode) {
        this.loginmode = loginmode == null ? null : loginmode.trim();
    }

    public String getSlmode() {
        return slmode;
    }

    public void setSlmode(String slmode) {
        this.slmode = slmode == null ? null : slmode.trim();
    }
}