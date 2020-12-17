package com.primer.entity.daybat;

/**
 * Table: plugin_sc_func
 */
public class PluginScFunc {
    /**
     * Column: func_code
     * Remark: 指令/函数编号
     */
    private Integer funcCode;

    /**
     * Column: func_name
     * Remark: 指令/函数名称
     */
    private String funcName;

    public Integer getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(Integer funcCode) {
        this.funcCode = funcCode;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }
}