package com.primer.entity.daybat;

/**
 * Table: s_inst_srvs_conf
 */
public class SInstSrvsConf {
    /**
     * Column: srvs_inst_id
     * Remark: 服务组件实例标识
     */
    private String srvsInstId;

    /**
     * Column: srvs_code
     * Remark: 服务组件代码
     */
    private String srvsCode;

    /**
     * Column: sys_inst_id
     * Remark: 系统实例标识
     */
    private String sysInstId;

    /**
     * Column: is_allow_service
     * Remark: 是否允许运行
     */
    private String isAllowService;

    /**
     * Column: rsv_flag
     * Remark: 保留字段(标志)
     */
    private String rsvFlag;

    public String getSrvsInstId() {
        return srvsInstId;
    }

    public void setSrvsInstId(String srvsInstId) {
        this.srvsInstId = srvsInstId == null ? null : srvsInstId.trim();
    }

    public String getSrvsCode() {
        return srvsCode;
    }

    public void setSrvsCode(String srvsCode) {
        this.srvsCode = srvsCode == null ? null : srvsCode.trim();
    }

    public String getSysInstId() {
        return sysInstId;
    }

    public void setSysInstId(String sysInstId) {
        this.sysInstId = sysInstId == null ? null : sysInstId.trim();
    }

    public String getIsAllowService() {
        return isAllowService;
    }

    public void setIsAllowService(String isAllowService) {
        this.isAllowService = isAllowService == null ? null : isAllowService.trim();
    }

    public String getRsvFlag() {
        return rsvFlag;
    }

    public void setRsvFlag(String rsvFlag) {
        this.rsvFlag = rsvFlag == null ? null : rsvFlag.trim();
    }
}