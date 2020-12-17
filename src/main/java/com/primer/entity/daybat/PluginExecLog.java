package com.primer.entity.daybat;

/**
 * Table: plugin_exec_log
 */
public class PluginExecLog {
    /**
     * Column: batch_sn
     * Remark: 批次流水号
     */
    private String batchSn;

    /**
     * Column: plugin_id
     * Remark: 应用插件id
     */
    private Integer pluginId;

    /**
     * Column: plugin_name
     * Remark: 应用插件名称
     */
    private String pluginName;

    /**
     * Column: action_name
     * Remark: 操作名称
     */
    private String actionName;

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

    /**
     * Column: task_id
     * Remark: 任务编号
     */
    private String taskId;

    /**
     * Column: task_name
     * Remark: 任务名称
     */
    private String taskName;

    /**
     * Column: record_time
     * Remark: 记录时间
     */
    private String recordTime;

    public String getBatchSn() {
        return batchSn;
    }

    public void setBatchSn(String batchSn) {
        this.batchSn = batchSn == null ? null : batchSn.trim();
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }
}