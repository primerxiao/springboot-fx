package com.primer.entity.daybat;

/**
 * Table: plugin_sysupd_conf
 */
public class PluginSysupdConf {
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
     * Column: sysupd_action
     * Remark: 系统信息更新动作
     */
    private String sysupdAction;

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

    public String getSysupdAction() {
        return sysupdAction;
    }

    public void setSysupdAction(String sysupdAction) {
        this.sysupdAction = sysupdAction == null ? null : sysupdAction.trim();
    }
}