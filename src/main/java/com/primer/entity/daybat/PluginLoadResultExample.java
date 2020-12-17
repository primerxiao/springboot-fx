package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PluginLoadResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginLoadResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBatchSerialNoIsNull() {
            addCriterion("batch_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoIsNotNull() {
            addCriterion("batch_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoEqualTo(String value) {
            addCriterion("batch_serial_no =", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotEqualTo(String value) {
            addCriterion("batch_serial_no <>", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoGreaterThan(String value) {
            addCriterion("batch_serial_no >", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_serial_no >=", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLessThan(String value) {
            addCriterion("batch_serial_no <", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLessThanOrEqualTo(String value) {
            addCriterion("batch_serial_no <=", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLike(String value) {
            addCriterion("batch_serial_no like", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotLike(String value) {
            addCriterion("batch_serial_no not like", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoIn(List<String> values) {
            addCriterion("batch_serial_no in", values, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotIn(List<String> values) {
            addCriterion("batch_serial_no not in", values, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoBetween(String value1, String value2) {
            addCriterion("batch_serial_no between", value1, value2, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotBetween(String value1, String value2) {
            addCriterion("batch_serial_no not between", value1, value2, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("`table_name` is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("`table_name` is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("`table_name` =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("`table_name` <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("`table_name` >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("`table_name` >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("`table_name` <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("`table_name` <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("`table_name` like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("`table_name` not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("`table_name` in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("`table_name` not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("`table_name` between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("`table_name` not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNull() {
            addCriterion("batch_date is null");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNotNull() {
            addCriterion("batch_date is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDateEqualTo(String value) {
            addCriterion("batch_date =", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotEqualTo(String value) {
            addCriterion("batch_date <>", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThan(String value) {
            addCriterion("batch_date >", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThanOrEqualTo(String value) {
            addCriterion("batch_date >=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThan(String value) {
            addCriterion("batch_date <", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThanOrEqualTo(String value) {
            addCriterion("batch_date <=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLike(String value) {
            addCriterion("batch_date like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotLike(String value) {
            addCriterion("batch_date not like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateIn(List<String> values) {
            addCriterion("batch_date in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotIn(List<String> values) {
            addCriterion("batch_date not in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateBetween(String value1, String value2) {
            addCriterion("batch_date between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotBetween(String value1, String value2) {
            addCriterion("batch_date not between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andTableCnnameIsNull() {
            addCriterion("table_cnname is null");
            return (Criteria) this;
        }

        public Criteria andTableCnnameIsNotNull() {
            addCriterion("table_cnname is not null");
            return (Criteria) this;
        }

        public Criteria andTableCnnameEqualTo(String value) {
            addCriterion("table_cnname =", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameNotEqualTo(String value) {
            addCriterion("table_cnname <>", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameGreaterThan(String value) {
            addCriterion("table_cnname >", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("table_cnname >=", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameLessThan(String value) {
            addCriterion("table_cnname <", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameLessThanOrEqualTo(String value) {
            addCriterion("table_cnname <=", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameLike(String value) {
            addCriterion("table_cnname like", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameNotLike(String value) {
            addCriterion("table_cnname not like", value, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameIn(List<String> values) {
            addCriterion("table_cnname in", values, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameNotIn(List<String> values) {
            addCriterion("table_cnname not in", values, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameBetween(String value1, String value2) {
            addCriterion("table_cnname between", value1, value2, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableCnnameNotBetween(String value1, String value2) {
            addCriterion("table_cnname not between", value1, value2, "tableCnname");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("table_type is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("table_type is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(String value) {
            addCriterion("table_type =", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(String value) {
            addCriterion("table_type <>", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(String value) {
            addCriterion("table_type >", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("table_type >=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(String value) {
            addCriterion("table_type <", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(String value) {
            addCriterion("table_type <=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLike(String value) {
            addCriterion("table_type like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotLike(String value) {
            addCriterion("table_type not like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<String> values) {
            addCriterion("table_type in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<String> values) {
            addCriterion("table_type not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(String value1, String value2) {
            addCriterion("table_type between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(String value1, String value2) {
            addCriterion("table_type not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andUpSysnameIsNull() {
            addCriterion("up_sysname is null");
            return (Criteria) this;
        }

        public Criteria andUpSysnameIsNotNull() {
            addCriterion("up_sysname is not null");
            return (Criteria) this;
        }

        public Criteria andUpSysnameEqualTo(String value) {
            addCriterion("up_sysname =", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameNotEqualTo(String value) {
            addCriterion("up_sysname <>", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameGreaterThan(String value) {
            addCriterion("up_sysname >", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("up_sysname >=", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameLessThan(String value) {
            addCriterion("up_sysname <", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameLessThanOrEqualTo(String value) {
            addCriterion("up_sysname <=", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameLike(String value) {
            addCriterion("up_sysname like", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameNotLike(String value) {
            addCriterion("up_sysname not like", value, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameIn(List<String> values) {
            addCriterion("up_sysname in", values, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameNotIn(List<String> values) {
            addCriterion("up_sysname not in", values, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameBetween(String value1, String value2) {
            addCriterion("up_sysname between", value1, value2, "upSysname");
            return (Criteria) this;
        }

        public Criteria andUpSysnameNotBetween(String value1, String value2) {
            addCriterion("up_sysname not between", value1, value2, "upSysname");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeIsNull() {
            addCriterion("table_load_mode is null");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeIsNotNull() {
            addCriterion("table_load_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeEqualTo(String value) {
            addCriterion("table_load_mode =", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeNotEqualTo(String value) {
            addCriterion("table_load_mode <>", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeGreaterThan(String value) {
            addCriterion("table_load_mode >", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeGreaterThanOrEqualTo(String value) {
            addCriterion("table_load_mode >=", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeLessThan(String value) {
            addCriterion("table_load_mode <", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeLessThanOrEqualTo(String value) {
            addCriterion("table_load_mode <=", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeLike(String value) {
            addCriterion("table_load_mode like", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeNotLike(String value) {
            addCriterion("table_load_mode not like", value, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeIn(List<String> values) {
            addCriterion("table_load_mode in", values, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeNotIn(List<String> values) {
            addCriterion("table_load_mode not in", values, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeBetween(String value1, String value2) {
            addCriterion("table_load_mode between", value1, value2, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andTableLoadModeNotBetween(String value1, String value2) {
            addCriterion("table_load_mode not between", value1, value2, "tableLoadMode");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileIsNull() {
            addCriterion("load_from_file is null");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileIsNotNull() {
            addCriterion("load_from_file is not null");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileEqualTo(String value) {
            addCriterion("load_from_file =", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileNotEqualTo(String value) {
            addCriterion("load_from_file <>", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileGreaterThan(String value) {
            addCriterion("load_from_file >", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileGreaterThanOrEqualTo(String value) {
            addCriterion("load_from_file >=", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileLessThan(String value) {
            addCriterion("load_from_file <", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileLessThanOrEqualTo(String value) {
            addCriterion("load_from_file <=", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileLike(String value) {
            addCriterion("load_from_file like", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileNotLike(String value) {
            addCriterion("load_from_file not like", value, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileIn(List<String> values) {
            addCriterion("load_from_file in", values, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileNotIn(List<String> values) {
            addCriterion("load_from_file not in", values, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileBetween(String value1, String value2) {
            addCriterion("load_from_file between", value1, value2, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andLoadFromFileNotBetween(String value1, String value2) {
            addCriterion("load_from_file not between", value1, value2, "loadFromFile");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(BigDecimal value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(BigDecimal value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(BigDecimal value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(BigDecimal value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<BigDecimal> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<BigDecimal> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNull() {
            addCriterion("cost_time is null");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNotNull() {
            addCriterion("cost_time is not null");
            return (Criteria) this;
        }

        public Criteria andCostTimeEqualTo(BigDecimal value) {
            addCriterion("cost_time =", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotEqualTo(BigDecimal value) {
            addCriterion("cost_time <>", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThan(BigDecimal value) {
            addCriterion("cost_time >", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_time >=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThan(BigDecimal value) {
            addCriterion("cost_time <", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_time <=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeIn(List<BigDecimal> values) {
            addCriterion("cost_time in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotIn(List<BigDecimal> values) {
            addCriterion("cost_time not in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_time between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_time not between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andReadRowsIsNull() {
            addCriterion("read_rows is null");
            return (Criteria) this;
        }

        public Criteria andReadRowsIsNotNull() {
            addCriterion("read_rows is not null");
            return (Criteria) this;
        }

        public Criteria andReadRowsEqualTo(Integer value) {
            addCriterion("read_rows =", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsNotEqualTo(Integer value) {
            addCriterion("read_rows <>", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsGreaterThan(Integer value) {
            addCriterion("read_rows >", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_rows >=", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsLessThan(Integer value) {
            addCriterion("read_rows <", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsLessThanOrEqualTo(Integer value) {
            addCriterion("read_rows <=", value, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsIn(List<Integer> values) {
            addCriterion("read_rows in", values, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsNotIn(List<Integer> values) {
            addCriterion("read_rows not in", values, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsBetween(Integer value1, Integer value2) {
            addCriterion("read_rows between", value1, value2, "readRows");
            return (Criteria) this;
        }

        public Criteria andReadRowsNotBetween(Integer value1, Integer value2) {
            addCriterion("read_rows not between", value1, value2, "readRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsIsNull() {
            addCriterion("load_rows is null");
            return (Criteria) this;
        }

        public Criteria andLoadRowsIsNotNull() {
            addCriterion("load_rows is not null");
            return (Criteria) this;
        }

        public Criteria andLoadRowsEqualTo(Integer value) {
            addCriterion("load_rows =", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsNotEqualTo(Integer value) {
            addCriterion("load_rows <>", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsGreaterThan(Integer value) {
            addCriterion("load_rows >", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_rows >=", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsLessThan(Integer value) {
            addCriterion("load_rows <", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsLessThanOrEqualTo(Integer value) {
            addCriterion("load_rows <=", value, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsIn(List<Integer> values) {
            addCriterion("load_rows in", values, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsNotIn(List<Integer> values) {
            addCriterion("load_rows not in", values, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsBetween(Integer value1, Integer value2) {
            addCriterion("load_rows between", value1, value2, "loadRows");
            return (Criteria) this;
        }

        public Criteria andLoadRowsNotBetween(Integer value1, Integer value2) {
            addCriterion("load_rows not between", value1, value2, "loadRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsIsNull() {
            addCriterion("reject_rows is null");
            return (Criteria) this;
        }

        public Criteria andRejectRowsIsNotNull() {
            addCriterion("reject_rows is not null");
            return (Criteria) this;
        }

        public Criteria andRejectRowsEqualTo(Integer value) {
            addCriterion("reject_rows =", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsNotEqualTo(Integer value) {
            addCriterion("reject_rows <>", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsGreaterThan(Integer value) {
            addCriterion("reject_rows >", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reject_rows >=", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsLessThan(Integer value) {
            addCriterion("reject_rows <", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsLessThanOrEqualTo(Integer value) {
            addCriterion("reject_rows <=", value, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsIn(List<Integer> values) {
            addCriterion("reject_rows in", values, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsNotIn(List<Integer> values) {
            addCriterion("reject_rows not in", values, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsBetween(Integer value1, Integer value2) {
            addCriterion("reject_rows between", value1, value2, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRejectRowsNotBetween(Integer value1, Integer value2) {
            addCriterion("reject_rows not between", value1, value2, "rejectRows");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLoadResultIsNull() {
            addCriterion("load_result is null");
            return (Criteria) this;
        }

        public Criteria andLoadResultIsNotNull() {
            addCriterion("load_result is not null");
            return (Criteria) this;
        }

        public Criteria andLoadResultEqualTo(String value) {
            addCriterion("load_result =", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultNotEqualTo(String value) {
            addCriterion("load_result <>", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultGreaterThan(String value) {
            addCriterion("load_result >", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultGreaterThanOrEqualTo(String value) {
            addCriterion("load_result >=", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultLessThan(String value) {
            addCriterion("load_result <", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultLessThanOrEqualTo(String value) {
            addCriterion("load_result <=", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultLike(String value) {
            addCriterion("load_result like", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultNotLike(String value) {
            addCriterion("load_result not like", value, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultIn(List<String> values) {
            addCriterion("load_result in", values, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultNotIn(List<String> values) {
            addCriterion("load_result not in", values, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultBetween(String value1, String value2) {
            addCriterion("load_result between", value1, value2, "loadResult");
            return (Criteria) this;
        }

        public Criteria andLoadResultNotBetween(String value1, String value2) {
            addCriterion("load_result not between", value1, value2, "loadResult");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}