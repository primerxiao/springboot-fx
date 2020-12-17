package com.primer.entity.daybat;

/**
 * Table: s_srvs_admin_log
 */
public class SSrvsAdminLog {
    /**
     * Column: serial_no
     * Remark: 流水号
     */
    private String serialNo;

    /**
     * Column: srvs_inst_id
     * Remark: 服务组件实例标识
     */
    private String srvsInstId;

    /**
     * Column: srvs_inst_action
     * Remark: 实例操作类型
     */
    private String srvsInstAction;

    /**
     * Column: action_time
     * Remark: 操作时间
     */
    private String actionTime;

    /**
     * Column: action_result
     * Remark: 操作结果
     */
    private String actionResult;

    /**
     * Column: action_detail_info
     * Remark: 操作详情
     */
    private String actionDetailInfo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getSrvsInstId() {
        return srvsInstId;
    }

    public void setSrvsInstId(String srvsInstId) {
        this.srvsInstId = srvsInstId == null ? null : srvsInstId.trim();
    }

    public String getSrvsInstAction() {
        return srvsInstAction;
    }

    public void setSrvsInstAction(String srvsInstAction) {
        this.srvsInstAction = srvsInstAction == null ? null : srvsInstAction.trim();
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime == null ? null : actionTime.trim();
    }

    public String getActionResult() {
        return actionResult;
    }

    public void setActionResult(String actionResult) {
        this.actionResult = actionResult == null ? null : actionResult.trim();
    }

    public String getActionDetailInfo() {
        return actionDetailInfo;
    }

    public void setActionDetailInfo(String actionDetailInfo) {
        this.actionDetailInfo = actionDetailInfo == null ? null : actionDetailInfo.trim();
    }
}