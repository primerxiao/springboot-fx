package com.primer.entity.daybat;

/**
 * Table: bat_batch_stage_config
 */
public class BatBatchStageConfig {
    /**
     * Column: stage_id
     * Remark: 阶段编号
     */
    private String stageId;

    /**
     * Column: batch_id
     * Remark: 批次标识
     */
    private String batchId;

    /**
     * Column: stage_name
     * Remark: 阶段名称
     */
    private String stageName;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId == null ? null : stageId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}