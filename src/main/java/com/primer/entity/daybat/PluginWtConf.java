package com.primer.entity.daybat;

/**
 * Table: plugin_wt_conf
 */
public class PluginWtConf {
    /**
     * Column: plugin_conf_id
     * Remark: 配置标识符
     */
    private String pluginConfId;

    /**
     * Column: check_inteval
     * Remark: 等待间隔
     */
    private Integer checkInteval;

    /**
     * Column: max_wait_time
     * Remark: 最长等待时间
     */
    private Integer maxWaitTime;

    /**
     * Column: wait_desc
     * Remark: 等待描述
     */
    private String waitDesc;

    public String getPluginConfId() {
        return pluginConfId;
    }

    public void setPluginConfId(String pluginConfId) {
        this.pluginConfId = pluginConfId == null ? null : pluginConfId.trim();
    }

    public Integer getCheckInteval() {
        return checkInteval;
    }

    public void setCheckInteval(Integer checkInteval) {
        this.checkInteval = checkInteval;
    }

    public Integer getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setMaxWaitTime(Integer maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }

    public String getWaitDesc() {
        return waitDesc;
    }

    public void setWaitDesc(String waitDesc) {
        this.waitDesc = waitDesc == null ? null : waitDesc.trim();
    }
}