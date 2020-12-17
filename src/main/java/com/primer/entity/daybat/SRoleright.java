package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_roleright
 */
public class SRoleright {
    /**
     * Column: roleno
     * Remark: 角色编号
     */
    private String roleno;

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
     * Column: state
     * Remark: 状态
     */
    private BigDecimal state;

    /**
     * Column: orgid
     * Remark: 组织号
     */
    private String orgid;

    public String getRoleno() {
        return roleno;
    }

    public void setRoleno(String roleno) {
        this.roleno = roleno == null ? null : roleno.trim();
    }

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

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}