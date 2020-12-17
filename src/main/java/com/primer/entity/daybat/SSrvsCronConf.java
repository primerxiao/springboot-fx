package com.primer.entity.daybat;

/**
 * Table: s_srvs_cron_conf
 */
public class SSrvsCronConf {
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
     * Column: job_class_type
     * Remark: 作业类类型
     */
    private String jobClassType;

    /**
     * Column: job_class
     * Remark: 作业实现类
     */
    private String jobClass;

    /**
     * Column: job_method
     * Remark: 作业类方法
     */
    private String jobMethod;

    /**
     * Column: service_version
     */
    private String serviceVersion;

    /**
     * Column: service_group
     */
    private String serviceGroup;

    /**
     * Column: service_timeout
     */
    private Integer serviceTimeout;

    /**
     * Column: cron_expression
     * Remark: cron表达式
     */
    private String cronExpression;

    /**
     * Column: again_time
     * Remark: 失败重试次数
     */
    private Integer againTime;

    /**
     * Column: retry_second
     * Remark: 重试间隔秒数
     */
    private Integer retrySecond;

    /**
     * Column: agent_id
     * Remark: 代理节点标识
     */
    private String agentId;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: service_id
     * Remark: dubbo接口服务serviceId
     */
    private String serviceId;

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

    public String getJobClassType() {
        return jobClassType;
    }

    public void setJobClassType(String jobClassType) {
        this.jobClassType = jobClassType == null ? null : jobClassType.trim();
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass == null ? null : jobClass.trim();
    }

    public String getJobMethod() {
        return jobMethod;
    }

    public void setJobMethod(String jobMethod) {
        this.jobMethod = jobMethod == null ? null : jobMethod.trim();
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion == null ? null : serviceVersion.trim();
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup == null ? null : serviceGroup.trim();
    }

    public Integer getServiceTimeout() {
        return serviceTimeout;
    }

    public void setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public Integer getAgainTime() {
        return againTime;
    }

    public void setAgainTime(Integer againTime) {
        this.againTime = againTime;
    }

    public Integer getRetrySecond() {
        return retrySecond;
    }

    public void setRetrySecond(Integer retrySecond) {
        this.retrySecond = retrySecond;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }
}