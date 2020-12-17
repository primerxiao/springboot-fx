package com.primer.entity.daybat;

/**
 * Table: s_agent_info
 */
public class SAgentInfo {
    /**
     * Column: agent_id
     * Remark: 代理节点标识
     */
    private String agentId;

    /**
     * Column: agent_name
     * Remark: 代理节点名称
     */
    private String agentName;

    /**
     * Column: agent_state
     * Remark: 代理节点状态
     */
    private String agentState;

    /**
     * Column: agent_url
     * Remark: 代理节点地址
     */
    private String agentUrl;

    /**
     * Column: start_time
     * Remark: 启动时间
     */
    private String startTime;

    /**
     * Column: stop_time
     * Remark: 停止时间
     */
    private String stopTime;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState == null ? null : agentState.trim();
    }

    public String getAgentUrl() {
        return agentUrl;
    }

    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl == null ? null : agentUrl.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime == null ? null : stopTime.trim();
    }
}