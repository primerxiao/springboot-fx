package com.primer.entity.daybat;

/**
 * Table: bat_task_locale_config
 */
public class BatTaskLocaleConfig {
    /**
     * Column: locale_id
     * Remark: 执行场所编号
     */
    private String localeId;

    /**
     * Column: locale_name
     * Remark: 执行场所名称
     */
    private String localeName;

    /**
     * Column: locale_type
     * Remark: 场所类型
     */
    private String localeType;

    /**
     * Column: locale_ip
     * Remark: 场所ip
     */
    private String localeIp;

    /**
     * Column: locale_port
     * Remark: 场所端口
     */
    private String localePort;

    /**
     * Column: login_type
     * Remark: 登录方式
     */
    private String loginType;

    /**
     * Column: login_user
     * Remark: 登录用户名
     */
    private String loginUser;

    /**
     * Column: login_pwd
     * Remark: 登录密码
     */
    private String loginPwd;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId == null ? null : localeId.trim();
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName == null ? null : localeName.trim();
    }

    public String getLocaleType() {
        return localeType;
    }

    public void setLocaleType(String localeType) {
        this.localeType = localeType == null ? null : localeType.trim();
    }

    public String getLocaleIp() {
        return localeIp;
    }

    public void setLocaleIp(String localeIp) {
        this.localeIp = localeIp == null ? null : localeIp.trim();
    }

    public String getLocalePort() {
        return localePort;
    }

    public void setLocalePort(String localePort) {
        this.localePort = localePort == null ? null : localePort.trim();
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser == null ? null : loginUser.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}