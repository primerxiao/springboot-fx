package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_role
 */
public class SRole {
    /**
     * Column: roleno
     * Remark: 角色码
     */
    private String roleno;

    /**
     * Column: rolename
     * Remark: 角色名称
     */
    private String rolename;

    /**
     * Column: orderno
     * Remark: 排序字段
     */
    private BigDecimal orderno;

    /**
     * Column: type
     * Remark: 类型
     */
    private BigDecimal type;

    /**
     * Column: memo
     * Remark: 备注
     */
    private String memo;

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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public BigDecimal getOrderno() {
        return orderno;
    }

    public void setOrderno(BigDecimal orderno) {
        this.orderno = orderno;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}