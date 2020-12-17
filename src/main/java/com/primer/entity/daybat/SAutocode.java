package com.primer.entity.daybat;

/**
 * Table: s_autocode
 */
public class SAutocode {
    /**
     * Column: atype
     * Remark: 类型
     */
    private String atype;

    /**
     * Column: owner
     * Remark: 拥有者
     */
    private String owner;

    /**
     * Column: initcycle
     * Remark: 未知
     */
    private String initcycle;

    /**
     * Column: cur_sernum
     * Remark: 当前序号值
     */
    private String curSernum;

    /**
     * Column: zero_flg
     * Remark: 未知
     */
    private String zeroFlg;

    /**
     * Column: cur_date
     * Remark: 当前日期
     */
    private String curDate;

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getInitcycle() {
        return initcycle;
    }

    public void setInitcycle(String initcycle) {
        this.initcycle = initcycle == null ? null : initcycle.trim();
    }

    public String getCurSernum() {
        return curSernum;
    }

    public void setCurSernum(String curSernum) {
        this.curSernum = curSernum == null ? null : curSernum.trim();
    }

    public String getZeroFlg() {
        return zeroFlg;
    }

    public void setZeroFlg(String zeroFlg) {
        this.zeroFlg = zeroFlg == null ? null : zeroFlg.trim();
    }

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate == null ? null : curDate.trim();
    }
}