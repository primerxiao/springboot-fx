package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_srvs_cron_his
 */
public class SSrvsCronHis {
    /**
     * Column: record_id
     * Remark: 记录id
     */
    private String recordId;

    /**
     * Column: job_code
     * Remark: 定时作业编号
     */
    private String jobCode;

    /**
     * Column: job_desc
     * Remark: 定时作业描述
     */
    private String jobDesc;

    /**
     * Column: state
     * Remark: 状态
     */
    private Integer state;

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
     * Remark: 耗时(秒)
     */
    private BigDecimal costTime;

    /**
     * Column: agent_id
     * Remark: 代理节点标识
     */
    private String agentId;

    /**
     * Column: result_desc
     * Remark: 结果描述
     */
    private String resultDesc;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc == null ? null : resultDesc.trim();
    }
}