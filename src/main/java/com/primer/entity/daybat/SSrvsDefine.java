package com.primer.entity.daybat;

/**
 * Table: s_srvs_define
 */
public class SSrvsDefine {
    /**
     * Column: srvs_code
     * Remark: 服务组件代码
     */
    private String srvsCode;

    /**
     * Column: srvs_name
     * Remark: 服务组件名称
     */
    private String srvsName;

    /**
     * Column: srvs_class
     * Remark: 服务实现类
     */
    private String srvsClass;

    /**
     * Column: srvs_desc
     * Remark: 服务描述
     */
    private String srvsDesc;

    /**
     * Column: srvs_type
     * Remark: 服务组件类型
     */
    private String srvsType;

    /**
     * Column: is_prvd_conf_page
     * Remark: 是否提供配置页面
     */
    private String isPrvdConfPage;

    /**
     * Column: is_prvd_mgr_page
     * Remark: 是否提供管理页面
     */
    private String isPrvdMgrPage;

    /**
     * Column: is_prvd_log
     * Remark: 是否提供服务日志
     */
    private String isPrvdLog;

    /**
     * Column: is_flux_control
     * Remark: 是否支持流量控制
     */
    private String isFluxControl;

    /**
     * Column: max_flux
     * Remark: 最大同时处理数
     */
    private Integer maxFlux;

    public String getSrvsCode() {
        return srvsCode;
    }

    public void setSrvsCode(String srvsCode) {
        this.srvsCode = srvsCode == null ? null : srvsCode.trim();
    }

    public String getSrvsName() {
        return srvsName;
    }

    public void setSrvsName(String srvsName) {
        this.srvsName = srvsName == null ? null : srvsName.trim();
    }

    public String getSrvsClass() {
        return srvsClass;
    }

    public void setSrvsClass(String srvsClass) {
        this.srvsClass = srvsClass == null ? null : srvsClass.trim();
    }

    public String getSrvsDesc() {
        return srvsDesc;
    }

    public void setSrvsDesc(String srvsDesc) {
        this.srvsDesc = srvsDesc == null ? null : srvsDesc.trim();
    }

    public String getSrvsType() {
        return srvsType;
    }

    public void setSrvsType(String srvsType) {
        this.srvsType = srvsType == null ? null : srvsType.trim();
    }

    public String getIsPrvdConfPage() {
        return isPrvdConfPage;
    }

    public void setIsPrvdConfPage(String isPrvdConfPage) {
        this.isPrvdConfPage = isPrvdConfPage == null ? null : isPrvdConfPage.trim();
    }

    public String getIsPrvdMgrPage() {
        return isPrvdMgrPage;
    }

    public void setIsPrvdMgrPage(String isPrvdMgrPage) {
        this.isPrvdMgrPage = isPrvdMgrPage == null ? null : isPrvdMgrPage.trim();
    }

    public String getIsPrvdLog() {
        return isPrvdLog;
    }

    public void setIsPrvdLog(String isPrvdLog) {
        this.isPrvdLog = isPrvdLog == null ? null : isPrvdLog.trim();
    }

    public String getIsFluxControl() {
        return isFluxControl;
    }

    public void setIsFluxControl(String isFluxControl) {
        this.isFluxControl = isFluxControl == null ? null : isFluxControl.trim();
    }

    public Integer getMaxFlux() {
        return maxFlux;
    }

    public void setMaxFlux(Integer maxFlux) {
        this.maxFlux = maxFlux;
    }
}