package com.primer.entity.daybat;

/**
 * Table: plugin_job_conf
 */
public class PluginJobConf {
    /**
     * Column: plugin_conf_id
     * Remark: 配置标识符
     */
    private String pluginConfId;

    /**
     * Column: conf_sort
     * Remark: 配置顺序
     */
    private Integer confSort;

    /**
     * Column: job_name
     * Remark: 作业名称
     */
    private String jobName;

    /**
     * Column: sql_purpose
     * Remark: sql脚本用途
     */
    private String sqlPurpose;

    /**
     * Column: sql_content
     * Remark: sql脚本
     */
    private String sqlContent;

    /**
     * Column: param_group_id
     * Remark: 参数组标识
     */
    private String paramGroupId;

    /**
     * Column: job_faild_deal
     * Remark: 作业失败处理方式
     */
    private String jobFaildDeal;

    /**
     * Column: last_modify_date
     * Remark: 最后更新日期
     */
    private String lastModifyDate;

    /**
     * Column: job_implement
     * Remark: 作业实现
     */
    private String jobImplement;

    public String getPluginConfId() {
        return pluginConfId;
    }

    public void setPluginConfId(String pluginConfId) {
        this.pluginConfId = pluginConfId == null ? null : pluginConfId.trim();
    }

    public Integer getConfSort() {
        return confSort;
    }

    public void setConfSort(Integer confSort) {
        this.confSort = confSort;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getSqlPurpose() {
        return sqlPurpose;
    }

    public void setSqlPurpose(String sqlPurpose) {
        this.sqlPurpose = sqlPurpose == null ? null : sqlPurpose.trim();
    }

    public String getSqlContent() {
        return sqlContent;
    }

    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent == null ? null : sqlContent.trim();
    }

    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId == null ? null : paramGroupId.trim();
    }

    public String getJobFaildDeal() {
        return jobFaildDeal;
    }

    public void setJobFaildDeal(String jobFaildDeal) {
        this.jobFaildDeal = jobFaildDeal == null ? null : jobFaildDeal.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }

    public String getJobImplement() {
        return jobImplement;
    }

    public void setJobImplement(String jobImplement) {
        this.jobImplement = jobImplement == null ? null : jobImplement.trim();
    }
}