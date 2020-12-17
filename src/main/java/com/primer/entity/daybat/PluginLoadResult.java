package com.primer.entity.daybat;

import java.math.BigDecimal;

/**
 * Table: plugin_load_result
 */
public class PluginLoadResult {
    /**
     * Column: batch_serial_no
     * Remark: 批次流水号
     */
    private String batchSerialNo;

    /**
     * Column: table_name
     * Remark: 数据库表名
     */
    private String tableName;

    /**
     * Column: batch_date
     * Remark: 批次日期
     */
    private String batchDate;

    /**
     * Column: table_cnname
     * Remark: 表中文名称
     */
    private String tableCnname;

    /**
     * Column: table_type
     * Remark: 数据表类型
     */
    private String tableType;

    /**
     * Column: up_sysname
     * Remark: 供数系统名称
     */
    private String upSysname;

    /**
     * Column: table_load_mode
     * Remark: 数据装载方式
     */
    private String tableLoadMode;

    /**
     * Column: load_from_file
     * Remark: 文件路径
     */
    private String loadFromFile;

    /**
     * Column: file_size
     * Remark: 文件大小
     */
    private BigDecimal fileSize;

    /**
     * Column: start_time
     * Remark: 启动时间
     */
    private String startTime;

    /**
     * Column: end_time
     * Remark: 结束时间
     */
    private String endTime;

    /**
     * Column: cost_time
     * Remark: 运行时长
     */
    private BigDecimal costTime;

    /**
     * Column: read_rows
     * Remark: 读入条数
     */
    private Integer readRows;

    /**
     * Column: load_rows
     * Remark: 装入条数
     */
    private Integer loadRows;

    /**
     * Column: reject_rows
     * Remark: 拒绝条数
     */
    private Integer rejectRows;

    /**
     * Column: remark
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: load_result
     * Remark: 导数结果
     */
    private String loadResult;

    /**
     * Column: batch_id
     * Remark: 批次标识
     */
    private String batchId;

    public String getBatchSerialNo() {
        return batchSerialNo;
    }

    public void setBatchSerialNo(String batchSerialNo) {
        this.batchSerialNo = batchSerialNo == null ? null : batchSerialNo.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate == null ? null : batchDate.trim();
    }

    public String getTableCnname() {
        return tableCnname;
    }

    public void setTableCnname(String tableCnname) {
        this.tableCnname = tableCnname == null ? null : tableCnname.trim();
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType == null ? null : tableType.trim();
    }

    public String getUpSysname() {
        return upSysname;
    }

    public void setUpSysname(String upSysname) {
        this.upSysname = upSysname == null ? null : upSysname.trim();
    }

    public String getTableLoadMode() {
        return tableLoadMode;
    }

    public void setTableLoadMode(String tableLoadMode) {
        this.tableLoadMode = tableLoadMode == null ? null : tableLoadMode.trim();
    }

    public String getLoadFromFile() {
        return loadFromFile;
    }

    public void setLoadFromFile(String loadFromFile) {
        this.loadFromFile = loadFromFile == null ? null : loadFromFile.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public Integer getReadRows() {
        return readRows;
    }

    public void setReadRows(Integer readRows) {
        this.readRows = readRows;
    }

    public Integer getLoadRows() {
        return loadRows;
    }

    public void setLoadRows(Integer loadRows) {
        this.loadRows = loadRows;
    }

    public Integer getRejectRows() {
        return rejectRows;
    }

    public void setRejectRows(Integer rejectRows) {
        this.rejectRows = rejectRows;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLoadResult() {
        return loadResult;
    }

    public void setLoadResult(String loadResult) {
        this.loadResult = loadResult == null ? null : loadResult.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }
}