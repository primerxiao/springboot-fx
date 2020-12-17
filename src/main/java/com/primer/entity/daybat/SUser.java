package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_user
 */
public class SUser {
    /**
     * Column: actorno
     * Remark: 用户码
     */
    private String actorno;

    /**
     * Column: enname
     * Remark: 选项值
     */
    private String enname;

    /**
     * Column: actorname
     * Remark: 用户名称
     */
    private String actorname;

    /**
     * Column: nickname
     * Remark: 昵称
     */
    private String nickname;

    /**
     * Column: state
     * Remark: 状态
     */
    private String state;

    /**
     * Column: password
     * Remark: 密码
     */
    private String password;

    /**
     * Column: startdate
     * Remark: 启用日期
     */
    private String startdate;

    /**
     * Column: passwvalda
     * Remark: 密码
     */
    private String passwvalda;

    /**
     * Column: firedate
     * Remark: 解雇日期
     */
    private String firedate;

    /**
     * Column: birthday
     * Remark: 生日
     */
    private String birthday;

    /**
     * Column: telnum
     * Remark: 联系电话
     */
    private String telnum;

    /**
     * Column: idcardno
     * Remark: 身份证号码
     */
    private String idcardno;

    /**
     * Column: allowopersys
     * Remark: 允许操作的系统
     */
    private String allowopersys;

    /**
     * Column: lastlogdat
     * Remark: 最后登陆日期
     */
    private String lastlogdat;

    /**
     * Column: creater
     * Remark: 创建人
     */
    private String creater;

    /**
     * Column: creattime
     * Remark: 创建时间
     */
    private String creattime;

    /**
     * Column: usermail
     * Remark: 邮箱
     */
    private String usermail;

    /**
     * Column: wrongpinnum
     * Remark: 密码输入错误次数
     */
    private BigDecimal wrongpinnum;

    /**
     * Column: isadmin
     * Remark: 是否管理员
     */
    private String isadmin;

    /**
     * Column: memo
     * Remark: 备注
     */
    private String memo;

    /**
     * Column: ipmask
     * Remark: 用户ip掩码
     */
    private String ipmask;

    /**
     * Column: orderno
     * Remark: 排序字段
     */
    private BigDecimal orderno;

    /**
     * Column: question
     * Remark: 用户防伪问题
     */
    private String question;

    /**
     * Column: answer
     * Remark: 用户防伪答案
     */
    private String answer;

    /**
     * Column: orgid
     * Remark: 组织号
     */
    private String orgid;

    /**
     * Column: depno
     * Remark: 部门编号
     */
    private String depno;

    /**
     * Column: session_id
     * Remark: 当前登录会话id
     */
    private String sessionId;

    /**
     * Column: rank
     * Remark: 职级
     */
    private String rank;

    /**
     * Column: parentactorno
     * Remark: 主账号用户码
     */
    private String parentactorno;

    /**
     * Column: device_no
     * Remark: 未知
     */
    private String deviceNo;

    /**
     * Column: is_priority_show
     * Remark: 是否优先显示
     */
    private String isPriorityShow;

    /**
     * Column: if_together_wf
     * Remark: 是否合并待办
     */
    private String ifTogetherWf;

    /**
     * Column: op_model
     * Remark: 操作模式
     */
    private String opModel;

    /**
     * Column: mob_num
     * Remark: 手机号码
     */
    private String mobNum;

    /**
     * Column: menu_config
     * Remark: 未知
     */
    private byte[] menuConfig;

    public String getActorno() {
        return actorno;
    }

    public void setActorno(String actorno) {
        this.actorno = actorno == null ? null : actorno.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname == null ? null : actorname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate == null ? null : startdate.trim();
    }

    public String getPasswvalda() {
        return passwvalda;
    }

    public void setPasswvalda(String passwvalda) {
        this.passwvalda = passwvalda == null ? null : passwvalda.trim();
    }

    public String getFiredate() {
        return firedate;
    }

    public void setFiredate(String firedate) {
        this.firedate = firedate == null ? null : firedate.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum == null ? null : telnum.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getAllowopersys() {
        return allowopersys;
    }

    public void setAllowopersys(String allowopersys) {
        this.allowopersys = allowopersys == null ? null : allowopersys.trim();
    }

    public String getLastlogdat() {
        return lastlogdat;
    }

    public void setLastlogdat(String lastlogdat) {
        this.lastlogdat = lastlogdat == null ? null : lastlogdat.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime == null ? null : creattime.trim();
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    public BigDecimal getWrongpinnum() {
        return wrongpinnum;
    }

    public void setWrongpinnum(BigDecimal wrongpinnum) {
        this.wrongpinnum = wrongpinnum;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin == null ? null : isadmin.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getIpmask() {
        return ipmask;
    }

    public void setIpmask(String ipmask) {
        this.ipmask = ipmask == null ? null : ipmask.trim();
    }

    public BigDecimal getOrderno() {
        return orderno;
    }

    public void setOrderno(BigDecimal orderno) {
        this.orderno = orderno;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno == null ? null : depno.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getParentactorno() {
        return parentactorno;
    }

    public void setParentactorno(String parentactorno) {
        this.parentactorno = parentactorno == null ? null : parentactorno.trim();
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo == null ? null : deviceNo.trim();
    }

    public String getIsPriorityShow() {
        return isPriorityShow;
    }

    public void setIsPriorityShow(String isPriorityShow) {
        this.isPriorityShow = isPriorityShow == null ? null : isPriorityShow.trim();
    }

    public String getIfTogetherWf() {
        return ifTogetherWf;
    }

    public void setIfTogetherWf(String ifTogetherWf) {
        this.ifTogetherWf = ifTogetherWf == null ? null : ifTogetherWf.trim();
    }

    public String getOpModel() {
        return opModel;
    }

    public void setOpModel(String opModel) {
        this.opModel = opModel == null ? null : opModel.trim();
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum == null ? null : mobNum.trim();
    }

    public byte[] getMenuConfig() {
        return menuConfig;
    }

    public void setMenuConfig(byte[] menuConfig) {
        this.menuConfig = menuConfig;
    }
}