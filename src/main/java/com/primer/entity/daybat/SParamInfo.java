package com.primer.entity.daybat;

/**
 * Table: s_param_info
 */
public class SParamInfo {
    /**
     * Column: param_code
     * Remark: 参数代码
     */
    private String paramCode;

    /**
     * Column: param_name
     * Remark: 参数名称
     */
    private String paramName;

    /**
     * Column: param_value
     * Remark: 参数值
     */
    private String paramValue;

    /**
     * Column: param_scope
     * Remark: 参数使用范围
     */
    private String paramScope;

    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: plugin_id
     * Remark: 应用插件id
     */
    private Integer pluginId;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode == null ? null : paramCode.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamScope() {
        return paramScope;
    }

    public void setParamScope(String paramScope) {
        this.paramScope = paramScope == null ? null : paramScope.trim();
    }

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}