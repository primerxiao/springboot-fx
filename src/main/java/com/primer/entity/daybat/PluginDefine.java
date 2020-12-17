package com.primer.entity.daybat;

/**
 * Table: plugin_define
 */
public class PluginDefine {
    /**
     * Column: plugin_id
     * Remark: 应用插件id
     */
    private Integer pluginId;

    /**
     * Column: plugin_name
     * Remark: 应用插件名称
     */
    private String pluginName;

    /**
     * Column: plugin_class
     * Remark: 应用插件实现类
     */
    private String pluginClass;

    /**
     * Column: plugin_desc
     * Remark: 应用插件描述
     */
    private String pluginDesc;

    /**
     * Column: need_other_ds_var
     * Remark: 是否需要其它数据源变量
     */
    private String needOtherDsVar;

    /**
     * Column: plugin_config_url
     * Remark: 应用插件配置地址
     */
    private String pluginConfigUrl;

    /**
     * Column: plugin_catalog
     * Remark: 应用插件分类
     */
    private String pluginCatalog;

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    public String getPluginClass() {
        return pluginClass;
    }

    public void setPluginClass(String pluginClass) {
        this.pluginClass = pluginClass == null ? null : pluginClass.trim();
    }

    public String getPluginDesc() {
        return pluginDesc;
    }

    public void setPluginDesc(String pluginDesc) {
        this.pluginDesc = pluginDesc == null ? null : pluginDesc.trim();
    }

    public String getNeedOtherDsVar() {
        return needOtherDsVar;
    }

    public void setNeedOtherDsVar(String needOtherDsVar) {
        this.needOtherDsVar = needOtherDsVar == null ? null : needOtherDsVar.trim();
    }

    public String getPluginConfigUrl() {
        return pluginConfigUrl;
    }

    public void setPluginConfigUrl(String pluginConfigUrl) {
        this.pluginConfigUrl = pluginConfigUrl == null ? null : pluginConfigUrl.trim();
    }

    public String getPluginCatalog() {
        return pluginCatalog;
    }

    public void setPluginCatalog(String pluginCatalog) {
        this.pluginCatalog = pluginCatalog == null ? null : pluginCatalog.trim();
    }
}