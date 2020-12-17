package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_deptuser
 */
public class SDeptuser {
    /**
     * Column: organno
     * Remark: 机构码
     */
    private String organno;

    /**
     * Column: actorno
     * Remark: 用户码
     */
    private String actorno;

    /**
     * Column: depno
     * Remark: 部门码
     */
    private String depno;

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

    public String getOrganno() {
        return organno;
    }

    public void setOrganno(String organno) {
        this.organno = organno == null ? null : organno.trim();
    }

    public String getActorno() {
        return actorno;
    }

    public void setActorno(String actorno) {
        this.actorno = actorno == null ? null : actorno.trim();
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno == null ? null : depno.trim();
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