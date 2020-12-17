package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: s_srvs_called_log
 */
public class SSrvsCalledLog {
    /**
     * Column: serial_no
     * Remark: 流水号
     */
    private String serialNo;

    /**
     * Column: client_ip
     * Remark: 客户端ip地址
     */
    private String clientIp;

    /**
     * Column: client_userid
     * Remark: 客户端用户
     */
    private String clientUserid;

    /**
     * Column: srvs_inst_id
     * Remark: 服务组件实例标识
     */
    private String srvsInstId;

    /**
     * Column: srvs_log_type
     * Remark: 服务日志类型
     */
    private String srvsLogType;

    /**
     * Column: srvs_busi_code
     * Remark: 交易代码
     */
    private String srvsBusiCode;

    /**
     * Column: cost_time
     * Remark: 执行时长（秒）
     */
    private BigDecimal costTime;

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

    /**
     * Column: in_buffer
     * Remark: 输入数据
     */
    private String inBuffer;

    /**
     * Column: out_buffer
     * Remark: 输出数据
     */
    private String outBuffer;

    /**
     * Column: srvs_busi_result
     * Remark: 交易结果
     */
    private String srvsBusiResult;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getClientUserid() {
        return clientUserid;
    }

    public void setClientUserid(String clientUserid) {
        this.clientUserid = clientUserid == null ? null : clientUserid.trim();
    }

    public String getSrvsInstId() {
        return srvsInstId;
    }

    public void setSrvsInstId(String srvsInstId) {
        this.srvsInstId = srvsInstId == null ? null : srvsInstId.trim();
    }

    public String getSrvsLogType() {
        return srvsLogType;
    }

    public void setSrvsLogType(String srvsLogType) {
        this.srvsLogType = srvsLogType == null ? null : srvsLogType.trim();
    }

    public String getSrvsBusiCode() {
        return srvsBusiCode;
    }

    public void setSrvsBusiCode(String srvsBusiCode) {
        this.srvsBusiCode = srvsBusiCode == null ? null : srvsBusiCode.trim();
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
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

    public String getInBuffer() {
        return inBuffer;
    }

    public void setInBuffer(String inBuffer) {
        this.inBuffer = inBuffer == null ? null : inBuffer.trim();
    }

    public String getOutBuffer() {
        return outBuffer;
    }

    public void setOutBuffer(String outBuffer) {
        this.outBuffer = outBuffer == null ? null : outBuffer.trim();
    }

    public String getSrvsBusiResult() {
        return srvsBusiResult;
    }

    public void setSrvsBusiResult(String srvsBusiResult) {
        this.srvsBusiResult = srvsBusiResult == null ? null : srvsBusiResult.trim();
    }
}