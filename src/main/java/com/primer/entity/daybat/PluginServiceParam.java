package com.primer.entity.daybat;

/**
 * Table: plugin_service_param
 */
public class PluginServiceParam {
    /**
     * Column: param_group_id
     * Remark: 参数组标识
     */
    private String paramGroupId;

    /**
     * Column: service_param_name
     * Remark: 服务参数名称
     */
    private String serviceParamName;

    /**
     * Column: service_param_type
     * Remark: 服务参数类型
     */
    private String serviceParamType;

    /**
     * Column: service_param_value
     * Remark: 服务参数值
     */
    private String serviceParamValue;

    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId == null ? null : paramGroupId.trim();
    }

    public String getServiceParamName() {
        return serviceParamName;
    }

    public void setServiceParamName(String serviceParamName) {
        this.serviceParamName = serviceParamName == null ? null : serviceParamName.trim();
    }

    public String getServiceParamType() {
        return serviceParamType;
    }

    public void setServiceParamType(String serviceParamType) {
        this.serviceParamType = serviceParamType == null ? null : serviceParamType.trim();
    }

    public String getServiceParamValue() {
        return serviceParamValue;
    }

    public void setServiceParamValue(String serviceParamValue) {
        this.serviceParamValue = serviceParamValue == null ? null : serviceParamValue.trim();
    }
}