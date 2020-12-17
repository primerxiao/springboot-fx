package com.primer.entity.daybat;

/**
 * Table: plugin_sc_conf
 */
public class PluginScConf {
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
     * Column: sc_desc
     * Remark: 转存清数描述
     */
    private String scDesc;

    /**
     * Column: func_code
     * Remark: 指令/函数编号
     */
    private Integer funcCode;

    /**
     * Column: check_faild_deal
     * Remark: 检查失败处理方式
     */
    private String checkFaildDeal;

    /**
     * Column: func_params
     * Remark: 指令/函数参数
     */
    private String funcParams;

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

    public String getScDesc() {
        return scDesc;
    }

    public void setScDesc(String scDesc) {
        this.scDesc = scDesc == null ? null : scDesc.trim();
    }

    public Integer getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(Integer funcCode) {
        this.funcCode = funcCode;
    }

    public String getCheckFaildDeal() {
        return checkFaildDeal;
    }

    public void setCheckFaildDeal(String checkFaildDeal) {
        this.checkFaildDeal = checkFaildDeal == null ? null : checkFaildDeal.trim();
    }

    public String getFuncParams() {
        return funcParams;
    }

    public void setFuncParams(String funcParams) {
        this.funcParams = funcParams == null ? null : funcParams.trim();
    }
}