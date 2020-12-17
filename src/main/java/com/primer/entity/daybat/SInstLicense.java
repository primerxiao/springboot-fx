package com.primer.entity.daybat;

/**
 * Table: s_inst_license
 */
public class SInstLicense {
    /**
     * Column: sys_inst_id
     * Remark: 系统实例标识
     */
    private String sysInstId;

    /**
     * Column: host_name
     * Remark: 主机名/ip地址
     */
    private String hostName;

    /**
     * Column: web_port
     * Remark: web端口
     */
    private String webPort;

    /**
     * Column: sys_code
     * Remark: 系统代码
     */
    private String sysCode;

    /**
     * Column: sys_name
     * Remark: 系统名称
     */
    private String sysName;

    /**
     * Column: auth_target
     * Remark: 授权目标
     */
    private String authTarget;

    /**
     * Column: auth_begin_date
     * Remark: 授权起始日期
     */
    private String authBeginDate;

    /**
     * Column: auth_end_date
     * Remark: 授权截止日期
     */
    private String authEndDate;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    public String getSysInstId() {
        return sysInstId;
    }

    public void setSysInstId(String sysInstId) {
        this.sysInstId = sysInstId == null ? null : sysInstId.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getWebPort() {
        return webPort;
    }

    public void setWebPort(String webPort) {
        this.webPort = webPort == null ? null : webPort.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getAuthTarget() {
        return authTarget;
    }

    public void setAuthTarget(String authTarget) {
        this.authTarget = authTarget == null ? null : authTarget.trim();
    }

    public String getAuthBeginDate() {
        return authBeginDate;
    }

    public void setAuthBeginDate(String authBeginDate) {
        this.authBeginDate = authBeginDate == null ? null : authBeginDate.trim();
    }

    public String getAuthEndDate() {
        return authEndDate;
    }

    public void setAuthEndDate(String authEndDate) {
        this.authEndDate = authEndDate == null ? null : authEndDate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}