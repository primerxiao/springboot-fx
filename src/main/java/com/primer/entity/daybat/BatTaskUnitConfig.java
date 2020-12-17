package com.primer.entity.daybat;

/**
 * Table: bat_task_unit_config
 */
public class BatTaskUnitConfig {
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
     * Column: previous_task_id
     * Remark: 前一任务编号
     */
    private String previousTaskId;

    /**
     * Column: batch_id
     * Remark: 批次标识
     */
    private String batchId;

    /**
     * Column: stage_id
     * Remark: 阶段编号
     */
    private String stageId;

    /**
     * Column: locale_id
     * Remark: 执行场所编号
     */
    private String localeId;

    /**
     * Column: plugin_id
     * Remark: 应用插件id
     */
    private Integer pluginId;

    /**
     * Column: plugin_source_type
     * Remark: 插件配置数据来源方式
     */
    private String pluginSourceType;

    /**
     * Column: plugin_para_flag
     * Remark: 插件配置数据标识
     */
    private String pluginParaFlag;

    /**
     * Column: task_pri
     * Remark: 任务优先级
     */
    private String taskPri;

    /**
     * Column: task_run_type
     * Remark: 任务执行类型
     */
    private String taskRunType;

    /**
     * Column: task_cycle_type
     * Remark: 任务周期类型
     */
    private String taskCycleType;

    /**
     * Column: task_cron_value
     * Remark: 任务定时周期
     */
    private String taskCronValue;

    /**
     * Column: task_delay_time
     * Remark: 任务延时执行时间(秒)
     */
    private Integer taskDelayTime;

    /**
     * Column: task_skip_tactic
     * Remark: 任务失败跳过策略
     */
    private String taskSkipTactic;

    /**
     * Column: again_run_space
     * Remark: 任务重复调起时间间隔(秒)
     */
    private Integer againRunSpace;

    /**
     * Column: task_estimate_time
     * Remark: 任务预计执行时间(秒)
     */
    private Integer taskEstimateTime;

    /**
     * Column: task_use_state
     * Remark: 任务使用状态
     */
    private String taskUseState;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: max_run_count
     * Remark: 任务最大重复调起次数
     */
    private Integer maxRunCount;

    /**
     * Column: task_timeout_time
     * Remark: 任务运行超时时间(秒)
     */
    private Integer taskTimeoutTime;

    /**
     * Column: task_timeout_tactic
     * Remark: 任务运行超时策略
     */
    private String taskTimeoutTactic;

    /**
     * Column: subs_ds_code
     * Remark: 子系统数据源代码
     */
    private String subsDsCode;

    /**
     * Column: task_use_area
     * Remark: 任务使用场景
     */
    private String taskUseArea;

    /**
     * Column: plugin_type
     * Remark: 应用插件类型
     */
    private String pluginType;

    /**
     * Column: max_wait_time
     * Remark: 最长等待时间
     */
    private Integer maxWaitTime;

    /**
     * Column: cycle_inteval
     * Remark: 轮询间隔(秒)
     */
    private Integer cycleInteval;

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

    public String getPreviousTaskId() {
        return previousTaskId;
    }

    public void setPreviousTaskId(String previousTaskId) {
        this.previousTaskId = previousTaskId == null ? null : previousTaskId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId == null ? null : stageId.trim();
    }

    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId == null ? null : localeId.trim();
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getPluginSourceType() {
        return pluginSourceType;
    }

    public void setPluginSourceType(String pluginSourceType) {
        this.pluginSourceType = pluginSourceType == null ? null : pluginSourceType.trim();
    }

    public String getPluginParaFlag() {
        return pluginParaFlag;
    }

    public void setPluginParaFlag(String pluginParaFlag) {
        this.pluginParaFlag = pluginParaFlag == null ? null : pluginParaFlag.trim();
    }

    public String getTaskPri() {
        return taskPri;
    }

    public void setTaskPri(String taskPri) {
        this.taskPri = taskPri == null ? null : taskPri.trim();
    }

    public String getTaskRunType() {
        return taskRunType;
    }

    public void setTaskRunType(String taskRunType) {
        this.taskRunType = taskRunType == null ? null : taskRunType.trim();
    }

    public String getTaskCycleType() {
        return taskCycleType;
    }

    public void setTaskCycleType(String taskCycleType) {
        this.taskCycleType = taskCycleType == null ? null : taskCycleType.trim();
    }

    public String getTaskCronValue() {
        return taskCronValue;
    }

    public void setTaskCronValue(String taskCronValue) {
        this.taskCronValue = taskCronValue == null ? null : taskCronValue.trim();
    }

    public Integer getTaskDelayTime() {
        return taskDelayTime;
    }

    public void setTaskDelayTime(Integer taskDelayTime) {
        this.taskDelayTime = taskDelayTime;
    }

    public String getTaskSkipTactic() {
        return taskSkipTactic;
    }

    public void setTaskSkipTactic(String taskSkipTactic) {
        this.taskSkipTactic = taskSkipTactic == null ? null : taskSkipTactic.trim();
    }

    public Integer getAgainRunSpace() {
        return againRunSpace;
    }

    public void setAgainRunSpace(Integer againRunSpace) {
        this.againRunSpace = againRunSpace;
    }

    public Integer getTaskEstimateTime() {
        return taskEstimateTime;
    }

    public void setTaskEstimateTime(Integer taskEstimateTime) {
        this.taskEstimateTime = taskEstimateTime;
    }

    public String getTaskUseState() {
        return taskUseState;
    }

    public void setTaskUseState(String taskUseState) {
        this.taskUseState = taskUseState == null ? null : taskUseState.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getMaxRunCount() {
        return maxRunCount;
    }

    public void setMaxRunCount(Integer maxRunCount) {
        this.maxRunCount = maxRunCount;
    }

    public Integer getTaskTimeoutTime() {
        return taskTimeoutTime;
    }

    public void setTaskTimeoutTime(Integer taskTimeoutTime) {
        this.taskTimeoutTime = taskTimeoutTime;
    }

    public String getTaskTimeoutTactic() {
        return taskTimeoutTactic;
    }

    public void setTaskTimeoutTactic(String taskTimeoutTactic) {
        this.taskTimeoutTactic = taskTimeoutTactic == null ? null : taskTimeoutTactic.trim();
    }

    public String getSubsDsCode() {
        return subsDsCode;
    }

    public void setSubsDsCode(String subsDsCode) {
        this.subsDsCode = subsDsCode == null ? null : subsDsCode.trim();
    }

    public String getTaskUseArea() {
        return taskUseArea;
    }

    public void setTaskUseArea(String taskUseArea) {
        this.taskUseArea = taskUseArea == null ? null : taskUseArea.trim();
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType == null ? null : pluginType.trim();
    }

    public Integer getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setMaxWaitTime(Integer maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }

    public Integer getCycleInteval() {
        return cycleInteval;
    }

    public void setCycleInteval(Integer cycleInteval) {
        this.cycleInteval = cycleInteval;
    }
}