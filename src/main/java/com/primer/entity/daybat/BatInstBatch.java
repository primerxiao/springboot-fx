package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: bat_inst_batch
 */
public class BatInstBatch {
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
     * Column: batch_name
     * Remark: 批次名称
     */
    private String batchName;

    /**
     * Column: batch_state
     * Remark: 批次状态
     */
    private String batchState;

    /**
     * Column: batch_intervene_state
     * Remark: 干预状态
     */
    private String batchInterveneState;

    /**
     * Column: batch_date
     * Remark: 批次日期
     */
    private String batchDate;

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
     * Column: need_run_count
     * Remark: 需调度任务数
     */
    private Integer needRunCount;

    /**
     * Column: exist_run_count
     * Remark: 运行中任务数
     */
    private Integer existRunCount;

    /**
     * Column: not_run_count
     * Remark: 未运行任务数
     */
    private Integer notRunCount;

    /**
     * Column: succeed_run_count
     * Remark: 运行成功任务数
     */
    private Integer succeedRunCount;

    /**
     * Column: faild_run_count
     * Remark: 运行失败任务数
     */
    private Integer faildRunCount;

    /**
     * Column: warn_run_count
     * Remark: 运行警告任务数
     */
    private Integer warnRunCount;

    /**
     * Column: skip_run_count
     * Remark: 运行置过任务数
     */
    private Integer skipRunCount;

    /**
     * Column: batch_serial_no
     * Remark: 批次流水号
     */
    private String batchSerialNo;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: cost_time
     * Remark: 运行时长
     */
    private BigDecimal costTime;

    /**
     * Column: stage_name
     * Remark: 阶段名称
     */
    private String stageName;

    /**
     * Column: stage_id
     * Remark: 阶段编号
     */
    private String stageId;

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

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public String getBatchState() {
        return batchState;
    }

    public void setBatchState(String batchState) {
        this.batchState = batchState == null ? null : batchState.trim();
    }

    public String getBatchInterveneState() {
        return batchInterveneState;
    }

    public void setBatchInterveneState(String batchInterveneState) {
        this.batchInterveneState = batchInterveneState == null ? null : batchInterveneState.trim();
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate == null ? null : batchDate.trim();
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

    public Integer getNeedRunCount() {
        return needRunCount;
    }

    public void setNeedRunCount(Integer needRunCount) {
        this.needRunCount = needRunCount;
    }

    public Integer getExistRunCount() {
        return existRunCount;
    }

    public void setExistRunCount(Integer existRunCount) {
        this.existRunCount = existRunCount;
    }

    public Integer getNotRunCount() {
        return notRunCount;
    }

    public void setNotRunCount(Integer notRunCount) {
        this.notRunCount = notRunCount;
    }

    public Integer getSucceedRunCount() {
        return succeedRunCount;
    }

    public void setSucceedRunCount(Integer succeedRunCount) {
        this.succeedRunCount = succeedRunCount;
    }

    public Integer getFaildRunCount() {
        return faildRunCount;
    }

    public void setFaildRunCount(Integer faildRunCount) {
        this.faildRunCount = faildRunCount;
    }

    public Integer getWarnRunCount() {
        return warnRunCount;
    }

    public void setWarnRunCount(Integer warnRunCount) {
        this.warnRunCount = warnRunCount;
    }

    public Integer getSkipRunCount() {
        return skipRunCount;
    }

    public void setSkipRunCount(Integer skipRunCount) {
        this.skipRunCount = skipRunCount;
    }

    public String getBatchSerialNo() {
        return batchSerialNo;
    }

    public void setBatchSerialNo(String batchSerialNo) {
        this.batchSerialNo = batchSerialNo == null ? null : batchSerialNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId == null ? null : stageId.trim();
    }
}