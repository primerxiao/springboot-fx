package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_roleuser
 */
public class SRoleuser {
    /**
     * Column: roleno
     * Remark: 角色码
     */
    private String roleno;

    /**
     * Column: actorno
     * Remark: 用户码
     */
    private String actorno;

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

    public String getActorno() {
        return actorno;
    }

    public void setActorno(String actorno) {
        this.actorno = actorno == null ? null : actorno.trim();
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