package com.primer.entity.daybat;

/**
 * Table: plugin_service_conf
 */
public class PluginServiceConf {
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
     * Column: service_id
     * Remark: 服务ID
     */
    private String serviceId;

    /**
     * Column: service_name
     * Remark: 服务名称
     */
    private String serviceName;

    /**
     * Column: service_interface
     * Remark: 服务接口类
     */
    private String serviceInterface;

    /**
     * Column: service_method
     * Remark: 服务实现方法
     */
    private String serviceMethod;

    /**
     * Column: return_type
     * Remark: 方法返回类型
     */
    private String returnType;

    /**
     * Column: param_group_id
     * Remark: 参数组标识
     */
    private String paramGroupId;

    /**
     * Column: version
     * Remark: 服务版本
     */
    private String version;

    /**
     * Column: service_group
     * Remark: 服务组别
     */
    private String serviceGroup;

    /**
     * Column: timeout
     * Remark: 调用超时时间
     */
    private Integer timeout;

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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getServiceInterface() {
        return serviceInterface;
    }

    public void setServiceInterface(String serviceInterface) {
        this.serviceInterface = serviceInterface == null ? null : serviceInterface.trim();
    }

    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod == null ? null : serviceMethod.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId == null ? null : paramGroupId.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup == null ? null : serviceGroup.trim();
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}