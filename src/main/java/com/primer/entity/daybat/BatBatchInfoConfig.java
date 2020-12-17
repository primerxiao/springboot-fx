package com.primer.entity.daybat;

/**
 * Table: bat_batch_info_config
 */
public class BatBatchInfoConfig {
    /**
     * Column: batch_id
     * Remark: 批次标识
     */
    private String batchId;

    /**
     * Column: batch_name
     * Remark: 批次名称
     */
    private String batchName;

    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: launch_type
     * Remark: 发起方式
     */
    private String launchType;

    /**
     * Column: batch_cron_value
     * Remark: 定时周期
     */
    private String batchCronValue;

    /**
     * Column: valid_date
     * Remark: 生效日期
     */
    private String validDate;

    /**
     * Column: equally_task_amount
     * Remark: 任务并发数
     */
    private Integer equallyTaskAmount;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: is_run_again
     * Remark: 是否允许重跑
     */
    private String isRunAgain;

    /**
     * Column: agent_id
     */
    private String agentId;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public String getLaunchType() {
        return launchType;
    }

    public void setLaunchType(String launchType) {
        this.launchType = launchType == null ? null : launchType.trim();
    }

    public String getBatchCronValue() {
        return batchCronValue;
    }

    public void setBatchCronValue(String batchCronValue) {
        this.batchCronValue = batchCronValue == null ? null : batchCronValue.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public Integer getEquallyTaskAmount() {
        return equallyTaskAmount;
    }

    public void setEquallyTaskAmount(Integer equallyTaskAmount) {
        this.equallyTaskAmount = equallyTaskAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsRunAgain() {
        return isRunAgain;
    }

    public void setIsRunAgain(String isRunAgain) {
        this.isRunAgain = isRunAgain == null ? null : isRunAgain.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }
}