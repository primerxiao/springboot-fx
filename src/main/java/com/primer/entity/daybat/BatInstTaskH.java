package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: bat_inst_task_h
 */
public class BatInstTaskH {
    /**
     * Column: task_id
     * Remark: 任务编号
     */
    private String taskId;

    /**
     * Column: batch_serial_no
     * Remark: 批次流水号
     */
    private String batchSerialNo;

    /**
     * Column: batch_id
     * Remark: 批次标识
     */
    private String batchId;

    /**
     * Column: batch_order
     * Remark: 批次序号
     */
    private Integer batchOrder;

    /**
     * Column: batch_date
     * Remark: 批次日期
     */
    private String batchDate;

    /**
     * Column: task_name
     * Remark: 任务名称
     */
    private String taskName;

    /**
     * Column: stage_id
     * Remark: 阶段编号
     */
    private String stageId;

    /**
     * Column: stage_name
     * Remark: 阶段名称
     */
    private String stageName;

    /**
     * Column: task_run_state
     * Remark: 任务执行状态
     */
    private String taskRunState;

    /**
     * Column: task_intervene_state
     * Remark: 任务干预状态
     */
    private String taskInterveneState;

    /**
     * Column: start_time
     * Remark: 启动时间
     */
    private String startTime;

    /**
     * Column: end_time
     * Remark: 结束时间
     */
    private String endTime;

    /**
     * Column: cost_time
     * Remark: 运行时长
     */
    private BigDecimal costTime;

    /**
     * Column: warn_count
     * Remark: 警告次数
     */
    private Integer warnCount;

    /**
     * Column: other
     * Remark: 其它
     */
    private String other;

    /**
     * Column: state_desc
     * Remark: 状态描述
     */
    private String stateDesc;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getBatchSerialNo() {
        return batchSerialNo;
    }

    public void setBatchSerialNo(String batchSerialNo) {
        this.batchSerialNo = batchSerialNo == null ? null : batchSerialNo.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public Integer getBatchOrder() {
        return batchOrder;
    }

    public void setBatchOrder(Integer batchOrder) {
        this.batchOrder = batchOrder;
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate == null ? null : batchDate.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId == null ? null : stageId.trim();
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getTaskRunState() {
        return taskRunState;
    }

    public void setTaskRunState(String taskRunState) {
        this.taskRunState = taskRunState == null ? null : taskRunState.trim();
    }

    public String getTaskInterveneState() {
        return taskInterveneState;
    }

    public void setTaskInterveneState(String taskInterveneState) {
        this.taskInterveneState = taskInterveneState == null ? null : taskInterveneState.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public Integer getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(Integer warnCount) {
        this.warnCount = warnCount;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }
}