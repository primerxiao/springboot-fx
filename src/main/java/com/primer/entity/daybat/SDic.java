package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_dic
 */
public class SDic {
    /**
     * Column: enname
     * Remark: 选项值
     */
    private String enname;

    /**
     * Column: opttype
     * Remark: 选项类别
     */
    private String opttype;

    /**
     * Column: cnname
     * Remark: 选项名称
     */
    private String cnname;

    /**
     * Column: memo
     * Remark: 选项描述
     */
    private String memo;

    /**
     * Column: flag
     * Remark: 标志
     */
    private String flag;

    /**
     * Column: levels
     * Remark: 级别
     */
    private String levels;

    /**
     * Column: orderid
     * Remark: 排序字段
     */
    private BigDecimal orderid;

    /**
     * Column: modify_date
     * Remark: 修改日期
     */
    private String modifyDate;

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getOpttype() {
        return opttype;
    }

    public void setOpttype(String opttype) {
        this.opttype = opttype == null ? null : opttype.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate == null ? null : modifyDate.trim();
    }
}