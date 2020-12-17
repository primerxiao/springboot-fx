package com.primer.entity.daybat;

/**
 * Table: s_resource
 */
public class SResource {
    /**
     * Column: resourceid
     * Remark: 资源id
     */
    private String resourceid;

    /**
     * Column: cnname
     * Remark: 选项名称
     */
    private String cnname;

    /**
     * Column: systempk
     * Remark: 所属子系统
     */
    private String systempk;

    /**
     * Column: url
     * Remark: 资源url
     */
    private String url;

    /**
     * Column: parentid
     * Remark: 上级资源id
     */
    private String parentid;

    /**
     * Column: tablename
     * Remark: 表名
     */
    private String tablename;

    /**
     * Column: procid
     * Remark: 流程模板
     */
    private String procid;

    /**
     * Column: orderid
     * Remark: 序号
     */
    private String orderid;

    /**
     * Column: memo
     * Remark: 备注
     */
    private String memo;

    /**
     * Column: icon
     * Remark: 资源图标
     */
    private String icon;

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

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getSystempk() {
        return systempk;
    }

    public void setSystempk(String systempk) {
        this.systempk = systempk == null ? null : systempk.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getProcid() {
        return procid;
    }

    public void setProcid(String procid) {
        this.procid = procid == null ? null : procid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}