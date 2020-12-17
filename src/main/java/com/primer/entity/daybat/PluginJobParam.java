package com.primer.entity.daybat;

/**
 * Table: plugin_job_param
 */
public class PluginJobParam {
    /**
     * Column: param_group_id
     * Remark: 参数组标识
     */
    private String paramGroupId;

    /**
     * Column: job_param_name
     * Remark: 作业参数名称
     */
    private String jobParamName;

    /**
     * Column: job_param_value
     * Remark: 作业参数值
     */
    private String jobParamValue;

    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId == null ? null : paramGroupId.trim();
    }

    public String getJobParamName() {
        return jobParamName;
    }

    public void setJobParamName(String jobParamName) {
        this.jobParamName = jobParamName == null ? null : jobParamName.trim();
    }

    public String getJobParamValue() {
        return jobParamValue;
    }

    public void setJobParamValue(String jobParamValue) {
        this.jobParamValue = jobParamValue == null ? null : jobParamValue.trim();
    }
}