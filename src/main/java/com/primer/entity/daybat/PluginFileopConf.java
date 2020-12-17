package com.primer.entity.daybat;

/**
 * Table: plugin_fileop_conf
 */
public class PluginFileopConf {
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
     * Column: file_op
     * Remark: 文件操作
     */
    private String fileOp;

    /**
     * Column: op_cycle_day
     * Remark: 操作周期
     */
    private Integer opCycleDay;

    /**
     * Column: last_op_date
     * Remark: 上次操作日期
     */
    private String lastOpDate;

    /**
     * Column: last_modify_date
     * Remark: 最后更新日期
     */
    private String lastModifyDate;

    /**
     * Column: distance_day
     * Remark: 目标距离(天)
     */
    private Integer distanceDay;

    /**
     * Column: file_target
     * Remark: 目标文件
     */
    private String fileTarget;

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

    public String getFileOp() {
        return fileOp;
    }

    public void setFileOp(String fileOp) {
        this.fileOp = fileOp == null ? null : fileOp.trim();
    }

    public Integer getOpCycleDay() {
        return opCycleDay;
    }

    public void setOpCycleDay(Integer opCycleDay) {
        this.opCycleDay = opCycleDay;
    }

    public String getLastOpDate() {
        return lastOpDate;
    }

    public void setLastOpDate(String lastOpDate) {
        this.lastOpDate = lastOpDate == null ? null : lastOpDate.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }

    public Integer getDistanceDay() {
        return distanceDay;
    }

    public void setDistanceDay(Integer distanceDay) {
        this.distanceDay = distanceDay;
    }

    public String getFileTarget() {
        return fileTarget;
    }

    public void setFileTarget(String fileTarget) {
        this.fileTarget = fileTarget == null ? null : fileTarget.trim();
    }
}