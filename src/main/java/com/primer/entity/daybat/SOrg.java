package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_org
 */
public class SOrg {
    /**
     * Column: organno
     * Remark: 机构码
     */
    private String organno;

    /**
     * Column: suporganno
     * Remark: 上级机构码
     */
    private String suporganno;

    /**
     * Column: locate
     * Remark: 所属地区
     */
    private String locate;

    /**
     * Column: organname
     * Remark: 机构名称
     */
    private String organname;

    /**
     * Column: organshortform
     * Remark: 机构简称
     */
    private String organshortform;

    /**
     * Column: enname
     * Remark: 选项值
     */
    private String enname;

    /**
     * Column: orderno
     * Remark: 排序字段
     */
    private BigDecimal orderno;

    /**
     * Column: distno
     * Remark: 地区编号
     */
    private String distno;

    /**
     * Column: launchdate
     * Remark: 开办日期
     */
    private String launchdate;

    /**
     * Column: organlevel
     * Remark: 机构级别
     */
    private BigDecimal organlevel;

    /**
     * Column: fincode
     * Remark: 金融代码
     */
    private String fincode;

    /**
     * Column: state
     * Remark: 状态
     */
    private BigDecimal state;

    /**
     * Column: organchief
     * Remark: 机构负责人
     */
    private String organchief;

    /**
     * Column: telnum
     * Remark: 联系电话
     */
    private String telnum;

    /**
     * Column: address
     * Remark: 地址
     */
    private String address;

    /**
     * Column: postcode
     * Remark: 邮编
     */
    private String postcode;

    /**
     * Column: control
     * Remark: 控制字
     */
    private String control;

    /**
     * Column: arti_organno
     * Remark: 所属法人机构码
     */
    private String artiOrganno;

    /**
     * Column: distname
     * Remark: 地区名称
     */
    private String distname;

    /**
     * Column: area_dev_cate_type
     * Remark: 地区发展分类
     */
    private String areaDevCateType;

    /**
     * Column: is_marketing
     * Remark: 是否营销中心
     */
    private String isMarketing;

    /**
     * Column: busiorganno
     * Remark: 业务机构编号
     */
    private String busiorganno;

    public String getOrganno() {
        return organno;
    }

    public void setOrganno(String organno) {
        this.organno = organno == null ? null : organno.trim();
    }

    public String getSuporganno() {
        return suporganno;
    }

    public void setSuporganno(String suporganno) {
        this.suporganno = suporganno == null ? null : suporganno.trim();
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate == null ? null : locate.trim();
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname == null ? null : organname.trim();
    }

    public String getOrganshortform() {
        return organshortform;
    }

    public void setOrganshortform(String organshortform) {
        this.organshortform = organshortform == null ? null : organshortform.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public BigDecimal getOrderno() {
        return orderno;
    }

    public void setOrderno(BigDecimal orderno) {
        this.orderno = orderno;
    }

    public String getDistno() {
        return distno;
    }

    public void setDistno(String distno) {
        this.distno = distno == null ? null : distno.trim();
    }

    public String getLaunchdate() {
        return launchdate;
    }

    public void setLaunchdate(String launchdate) {
        this.launchdate = launchdate == null ? null : launchdate.trim();
    }

    public BigDecimal getOrganlevel() {
        return organlevel;
    }

    public void setOrganlevel(BigDecimal organlevel) {
        this.organlevel = organlevel;
    }

    public String getFincode() {
        return fincode;
    }

    public void setFincode(String fincode) {
        this.fincode = fincode == null ? null : fincode.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public String getOrganchief() {
        return organchief;
    }

    public void setOrganchief(String organchief) {
        this.organchief = organchief == null ? null : organchief.trim();
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum == null ? null : telnum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control == null ? null : control.trim();
    }

    public String getArtiOrganno() {
        return artiOrganno;
    }

    public void setArtiOrganno(String artiOrganno) {
        this.artiOrganno = artiOrganno == null ? null : artiOrganno.trim();
    }

    public String getDistname() {
        return distname;
    }

    public void setDistname(String distname) {
        this.distname = distname == null ? null : distname.trim();
    }

    public String getAreaDevCateType() {
        return areaDevCateType;
    }

    public void setAreaDevCateType(String areaDevCateType) {
        this.areaDevCateType = areaDevCateType == null ? null : areaDevCateType.trim();
    }

    public String getIsMarketing() {
        return isMarketing;
    }

    public void setIsMarketing(String isMarketing) {
        this.isMarketing = isMarketing == null ? null : isMarketing.trim();
    }

    public String getBusiorganno() {
        return busiorganno;
    }

    public void setBusiorganno(String busiorganno) {
        this.busiorganno = busiorganno == null ? null : busiorganno.trim();
    }
}