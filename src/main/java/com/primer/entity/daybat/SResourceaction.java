package com.primer.entity.daybat;

/**
 * Table: s_resourceaction
 */
public class SResourceaction {
    /**
     * Column: resourceid
     * Remark: 资源id
     */
    private String resourceid;

    /**
     * Column: actid
     * Remark: 操作id
     */
    private String actid;

    /**
     * Column: descr
     * Remark: 描述
     */
    private String descr;

    /**
     * Column: flag
     * Remark: 标志
     */
    private String flag;

    /**
     * Column: confirmmsg
     * Remark: 提示确认信息
     */
    private String confirmmsg;

    /**
     * Column: orgid
     * Remark: 组织号
     */
    private String orgid;

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }

    public String getActid() {
        return actid;
    }

    public void setActid(String actid) {
        this.actid = actid == null ? null : actid.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getConfirmmsg() {
        return confirmmsg;
    }

    public void setConfirmmsg(String confirmmsg) {
        this.confirmmsg = confirmmsg == null ? null : confirmmsg.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}