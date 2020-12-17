package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginLoadConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginLoadConfExample() {
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

        public Criteria andPluginConfIdIsNull() {
            addCriterion("plugin_conf_id is null");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdIsNotNull() {
            addCriterion("plugin_conf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdEqualTo(String value) {
            addCriterion("plugin_conf_id =", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotEqualTo(String value) {
            addCriterion("plugin_conf_id <>", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdGreaterThan(String value) {
            addCriterion("plugin_conf_id >", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_conf_id >=", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLessThan(String value) {
            addCriterion("plugin_conf_id <", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLessThanOrEqualTo(String value) {
            addCriterion("plugin_conf_id <=", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLike(String value) {
            addCriterion("plugin_conf_id like", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotLike(String value) {
            addCriterion("plugin_conf_id not like", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdIn(List<String> values) {
            addCriterion("plugin_conf_id in", values, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotIn(List<String> values) {
            addCriterion("plugin_conf_id not in", values, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdBetween(String value1, String value2) {
            addCriterion("plugin_conf_id between", value1, value2, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotBetween(String value1, String value2) {
            addCriterion("plugin_conf_id not between", value1, value2, "pluginConfId");
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

        public Criteria andFileRowFlagIsNull() {
            addCriterion("file_row_flag is null");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagIsNotNull() {
            addCriterion("file_row_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagEqualTo(String value) {
            addCriterion("file_row_flag =", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagNotEqualTo(String value) {
            addCriterion("file_row_flag <>", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagGreaterThan(String value) {
            addCriterion("file_row_flag >", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagGreaterThanOrEqualTo(String value) {
            addCriterion("file_row_flag >=", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagLessThan(String value) {
            addCriterion("file_row_flag <", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagLessThanOrEqualTo(String value) {
            addCriterion("file_row_flag <=", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagLike(String value) {
            addCriterion("file_row_flag like", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagNotLike(String value) {
            addCriterion("file_row_flag not like", value, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagIn(List<String> values) {
            addCriterion("file_row_flag in", values, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagNotIn(List<String> values) {
            addCriterion("file_row_flag not in", values, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagBetween(String value1, String value2) {
            addCriterion("file_row_flag between", value1, value2, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andFileRowFlagNotBetween(String value1, String value2) {
            addCriterion("file_row_flag not between", value1, value2, "fileRowFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagIsNull() {
            addCriterion("load_warn_flag is null");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagIsNotNull() {
            addCriterion("load_warn_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagEqualTo(String value) {
            addCriterion("load_warn_flag =", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagNotEqualTo(String value) {
            addCriterion("load_warn_flag <>", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagGreaterThan(String value) {
            addCriterion("load_warn_flag >", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagGreaterThanOrEqualTo(String value) {
            addCriterion("load_warn_flag >=", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagLessThan(String value) {
            addCriterion("load_warn_flag <", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagLessThanOrEqualTo(String value) {
            addCriterion("load_warn_flag <=", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagLike(String value) {
            addCriterion("load_warn_flag like", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagNotLike(String value) {
            addCriterion("load_warn_flag not like", value, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagIn(List<String> values) {
            addCriterion("load_warn_flag in", values, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagNotIn(List<String> values) {
            addCriterion("load_warn_flag not in", values, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagBetween(String value1, String value2) {
            addCriterion("load_warn_flag between", value1, value2, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andLoadWarnFlagNotBetween(String value1, String value2) {
            addCriterion("load_warn_flag not between", value1, value2, "loadWarnFlag");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodIsNull() {
            addCriterion("diff_comp_method is null");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodIsNotNull() {
            addCriterion("diff_comp_method is not null");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodEqualTo(String value) {
            addCriterion("diff_comp_method =", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodNotEqualTo(String value) {
            addCriterion("diff_comp_method <>", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodGreaterThan(String value) {
            addCriterion("diff_comp_method >", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodGreaterThanOrEqualTo(String value) {
            addCriterion("diff_comp_method >=", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodLessThan(String value) {
            addCriterion("diff_comp_method <", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodLessThanOrEqualTo(String value) {
            addCriterion("diff_comp_method <=", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodLike(String value) {
            addCriterion("diff_comp_method like", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodNotLike(String value) {
            addCriterion("diff_comp_method not like", value, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodIn(List<String> values) {
            addCriterion("diff_comp_method in", values, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodNotIn(List<String> values) {
            addCriterion("diff_comp_method not in", values, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodBetween(String value1, String value2) {
            addCriterion("diff_comp_method between", value1, value2, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andDiffCompMethodNotBetween(String value1, String value2) {
            addCriterion("diff_comp_method not between", value1, value2, "diffCompMethod");
            return (Criteria) this;
        }

        public Criteria andLimitPercentIsNull() {
            addCriterion("limit_percent is null");
            return (Criteria) this;
        }

        public Criteria andLimitPercentIsNotNull() {
            addCriterion("limit_percent is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPercentEqualTo(Integer value) {
            addCriterion("limit_percent =", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentNotEqualTo(Integer value) {
            addCriterion("limit_percent <>", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentGreaterThan(Integer value) {
            addCriterion("limit_percent >", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_percent >=", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentLessThan(Integer value) {
            addCriterion("limit_percent <", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentLessThanOrEqualTo(Integer value) {
            addCriterion("limit_percent <=", value, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentIn(List<Integer> values) {
            addCriterion("limit_percent in", values, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentNotIn(List<Integer> values) {
            addCriterion("limit_percent not in", values, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentBetween(Integer value1, Integer value2) {
            addCriterion("limit_percent between", value1, value2, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andLimitPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_percent not between", value1, value2, "limitPercent");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodIsNull() {
            addCriterion("diff_deal_method is null");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodIsNotNull() {
            addCriterion("diff_deal_method is not null");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodEqualTo(String value) {
            addCriterion("diff_deal_method =", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodNotEqualTo(String value) {
            addCriterion("diff_deal_method <>", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodGreaterThan(String value) {
            addCriterion("diff_deal_method >", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodGreaterThanOrEqualTo(String value) {
            addCriterion("diff_deal_method >=", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodLessThan(String value) {
            addCriterion("diff_deal_method <", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodLessThanOrEqualTo(String value) {
            addCriterion("diff_deal_method <=", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodLike(String value) {
            addCriterion("diff_deal_method like", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodNotLike(String value) {
            addCriterion("diff_deal_method not like", value, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodIn(List<String> values) {
            addCriterion("diff_deal_method in", values, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodNotIn(List<String> values) {
            addCriterion("diff_deal_method not in", values, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodBetween(String value1, String value2) {
            addCriterion("diff_deal_method between", value1, value2, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andDiffDealMethodNotBetween(String value1, String value2) {
            addCriterion("diff_deal_method not between", value1, value2, "diffDealMethod");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("last_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("last_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(String value) {
            addCriterion("last_modify_date =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(String value) {
            addCriterion("last_modify_date <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(String value) {
            addCriterion("last_modify_date >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_date >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(String value) {
            addCriterion("last_modify_date <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(String value) {
            addCriterion("last_modify_date <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLike(String value) {
            addCriterion("last_modify_date like", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotLike(String value) {
            addCriterion("last_modify_date not like", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<String> values) {
            addCriterion("last_modify_date in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<String> values) {
            addCriterion("last_modify_date not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(String value1, String value2) {
            addCriterion("last_modify_date between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(String value1, String value2) {
            addCriterion("last_modify_date not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andConfSortIsNull() {
            addCriterion("conf_sort is null");
            return (Criteria) this;
        }

        public Criteria andConfSortIsNotNull() {
            addCriterion("conf_sort is not null");
            return (Criteria) this;
        }

        public Criteria andConfSortEqualTo(Integer value) {
            addCriterion("conf_sort =", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotEqualTo(Integer value) {
            addCriterion("conf_sort <>", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortGreaterThan(Integer value) {
            addCriterion("conf_sort >", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("conf_sort >=", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortLessThan(Integer value) {
            addCriterion("conf_sort <", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortLessThanOrEqualTo(Integer value) {
            addCriterion("conf_sort <=", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortIn(List<Integer> values) {
            addCriterion("conf_sort in", values, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotIn(List<Integer> values) {
            addCriterion("conf_sort not in", values, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortBetween(Integer value1, Integer value2) {
            addCriterion("conf_sort between", value1, value2, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotBetween(Integer value1, Integer value2) {
            addCriterion("conf_sort not between", value1, value2, "confSort");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorIsNull() {
            addCriterion("load_separator is null");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorIsNotNull() {
            addCriterion("load_separator is not null");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorEqualTo(String value) {
            addCriterion("load_separator =", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorNotEqualTo(String value) {
            addCriterion("load_separator <>", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorGreaterThan(String value) {
            addCriterion("load_separator >", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorGreaterThanOrEqualTo(String value) {
            addCriterion("load_separator >=", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorLessThan(String value) {
            addCriterion("load_separator <", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorLessThanOrEqualTo(String value) {
            addCriterion("load_separator <=", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorLike(String value) {
            addCriterion("load_separator like", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorNotLike(String value) {
            addCriterion("load_separator not like", value, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorIn(List<String> values) {
            addCriterion("load_separator in", values, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorNotIn(List<String> values) {
            addCriterion("load_separator not in", values, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorBetween(String value1, String value2) {
            addCriterion("load_separator between", value1, value2, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andLoadSeparatorNotBetween(String value1, String value2) {
            addCriterion("load_separator not between", value1, value2, "loadSeparator");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlIsNull() {
            addCriterion("before_load_sql is null");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlIsNotNull() {
            addCriterion("before_load_sql is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlEqualTo(String value) {
            addCriterion("before_load_sql =", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlNotEqualTo(String value) {
            addCriterion("before_load_sql <>", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlGreaterThan(String value) {
            addCriterion("before_load_sql >", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlGreaterThanOrEqualTo(String value) {
            addCriterion("before_load_sql >=", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlLessThan(String value) {
            addCriterion("before_load_sql <", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlLessThanOrEqualTo(String value) {
            addCriterion("before_load_sql <=", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlLike(String value) {
            addCriterion("before_load_sql like", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlNotLike(String value) {
            addCriterion("before_load_sql not like", value, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlIn(List<String> values) {
            addCriterion("before_load_sql in", values, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlNotIn(List<String> values) {
            addCriterion("before_load_sql not in", values, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlBetween(String value1, String value2) {
            addCriterion("before_load_sql between", value1, value2, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andBeforeLoadSqlNotBetween(String value1, String value2) {
            addCriterion("before_load_sql not between", value1, value2, "beforeLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlIsNull() {
            addCriterion("after_load_sql is null");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlIsNotNull() {
            addCriterion("after_load_sql is not null");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlEqualTo(String value) {
            addCriterion("after_load_sql =", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlNotEqualTo(String value) {
            addCriterion("after_load_sql <>", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlGreaterThan(String value) {
            addCriterion("after_load_sql >", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlGreaterThanOrEqualTo(String value) {
            addCriterion("after_load_sql >=", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlLessThan(String value) {
            addCriterion("after_load_sql <", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlLessThanOrEqualTo(String value) {
            addCriterion("after_load_sql <=", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlLike(String value) {
            addCriterion("after_load_sql like", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlNotLike(String value) {
            addCriterion("after_load_sql not like", value, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlIn(List<String> values) {
            addCriterion("after_load_sql in", values, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlNotIn(List<String> values) {
            addCriterion("after_load_sql not in", values, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlBetween(String value1, String value2) {
            addCriterion("after_load_sql between", value1, value2, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andAfterLoadSqlNotBetween(String value1, String value2) {
            addCriterion("after_load_sql not between", value1, value2, "afterLoadSql");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIsNull() {
            addCriterion("file_charset is null");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIsNotNull() {
            addCriterion("file_charset is not null");
            return (Criteria) this;
        }

        public Criteria andFileCharsetEqualTo(String value) {
            addCriterion("file_charset =", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotEqualTo(String value) {
            addCriterion("file_charset <>", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetGreaterThan(String value) {
            addCriterion("file_charset >", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("file_charset >=", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLessThan(String value) {
            addCriterion("file_charset <", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLessThanOrEqualTo(String value) {
            addCriterion("file_charset <=", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLike(String value) {
            addCriterion("file_charset like", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotLike(String value) {
            addCriterion("file_charset not like", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIn(List<String> values) {
            addCriterion("file_charset in", values, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotIn(List<String> values) {
            addCriterion("file_charset not in", values, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetBetween(String value1, String value2) {
            addCriterion("file_charset between", value1, value2, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotBetween(String value1, String value2) {
            addCriterion("file_charset not between", value1, value2, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeIsNull() {
            addCriterion("load_buffer_size is null");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeIsNotNull() {
            addCriterion("load_buffer_size is not null");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeEqualTo(Integer value) {
            addCriterion("load_buffer_size =", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeNotEqualTo(Integer value) {
            addCriterion("load_buffer_size <>", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeGreaterThan(Integer value) {
            addCriterion("load_buffer_size >", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_buffer_size >=", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeLessThan(Integer value) {
            addCriterion("load_buffer_size <", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeLessThanOrEqualTo(Integer value) {
            addCriterion("load_buffer_size <=", value, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeIn(List<Integer> values) {
            addCriterion("load_buffer_size in", values, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeNotIn(List<Integer> values) {
            addCriterion("load_buffer_size not in", values, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeBetween(Integer value1, Integer value2) {
            addCriterion("load_buffer_size between", value1, value2, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadBufferSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("load_buffer_size not between", value1, value2, "loadBufferSize");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealIsNull() {
            addCriterion("load_faild_deal is null");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealIsNotNull() {
            addCriterion("load_faild_deal is not null");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealEqualTo(String value) {
            addCriterion("load_faild_deal =", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealNotEqualTo(String value) {
            addCriterion("load_faild_deal <>", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealGreaterThan(String value) {
            addCriterion("load_faild_deal >", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealGreaterThanOrEqualTo(String value) {
            addCriterion("load_faild_deal >=", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealLessThan(String value) {
            addCriterion("load_faild_deal <", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealLessThanOrEqualTo(String value) {
            addCriterion("load_faild_deal <=", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealLike(String value) {
            addCriterion("load_faild_deal like", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealNotLike(String value) {
            addCriterion("load_faild_deal not like", value, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealIn(List<String> values) {
            addCriterion("load_faild_deal in", values, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealNotIn(List<String> values) {
            addCriterion("load_faild_deal not in", values, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealBetween(String value1, String value2) {
            addCriterion("load_faild_deal between", value1, value2, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFaildDealNotBetween(String value1, String value2) {
            addCriterion("load_faild_deal not between", value1, value2, "loadFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsIsNull() {
            addCriterion("load_fields is null");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsIsNotNull() {
            addCriterion("load_fields is not null");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsEqualTo(String value) {
            addCriterion("load_fields =", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsNotEqualTo(String value) {
            addCriterion("load_fields <>", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsGreaterThan(String value) {
            addCriterion("load_fields >", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("load_fields >=", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsLessThan(String value) {
            addCriterion("load_fields <", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsLessThanOrEqualTo(String value) {
            addCriterion("load_fields <=", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsLike(String value) {
            addCriterion("load_fields like", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsNotLike(String value) {
            addCriterion("load_fields not like", value, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsIn(List<String> values) {
            addCriterion("load_fields in", values, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsNotIn(List<String> values) {
            addCriterion("load_fields not in", values, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsBetween(String value1, String value2) {
            addCriterion("load_fields between", value1, value2, "loadFields");
            return (Criteria) this;
        }

        public Criteria andLoadFieldsNotBetween(String value1, String value2) {
            addCriterion("load_fields not between", value1, value2, "loadFields");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlIsNull() {
            addCriterion("create_table_ddl is null");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlIsNotNull() {
            addCriterion("create_table_ddl is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlEqualTo(String value) {
            addCriterion("create_table_ddl =", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlNotEqualTo(String value) {
            addCriterion("create_table_ddl <>", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlGreaterThan(String value) {
            addCriterion("create_table_ddl >", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlGreaterThanOrEqualTo(String value) {
            addCriterion("create_table_ddl >=", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlLessThan(String value) {
            addCriterion("create_table_ddl <", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlLessThanOrEqualTo(String value) {
            addCriterion("create_table_ddl <=", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlLike(String value) {
            addCriterion("create_table_ddl like", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlNotLike(String value) {
            addCriterion("create_table_ddl not like", value, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlIn(List<String> values) {
            addCriterion("create_table_ddl in", values, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlNotIn(List<String> values) {
            addCriterion("create_table_ddl not in", values, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlBetween(String value1, String value2) {
            addCriterion("create_table_ddl between", value1, value2, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andCreateTableDdlNotBetween(String value1, String value2) {
            addCriterion("create_table_ddl not between", value1, value2, "createTableDdl");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIsNull() {
            addCriterion("is_deal_empty_str is null");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIsNotNull() {
            addCriterion("is_deal_empty_str is not null");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrEqualTo(String value) {
            addCriterion("is_deal_empty_str =", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotEqualTo(String value) {
            addCriterion("is_deal_empty_str <>", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrGreaterThan(String value) {
            addCriterion("is_deal_empty_str >", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrGreaterThanOrEqualTo(String value) {
            addCriterion("is_deal_empty_str >=", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLessThan(String value) {
            addCriterion("is_deal_empty_str <", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLessThanOrEqualTo(String value) {
            addCriterion("is_deal_empty_str <=", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLike(String value) {
            addCriterion("is_deal_empty_str like", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotLike(String value) {
            addCriterion("is_deal_empty_str not like", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIn(List<String> values) {
            addCriterion("is_deal_empty_str in", values, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotIn(List<String> values) {
            addCriterion("is_deal_empty_str not in", values, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrBetween(String value1, String value2) {
            addCriterion("is_deal_empty_str between", value1, value2, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotBetween(String value1, String value2) {
            addCriterion("is_deal_empty_str not between", value1, value2, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIsNull() {
            addCriterion("deal_empty_str is null");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIsNotNull() {
            addCriterion("deal_empty_str is not null");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrEqualTo(String value) {
            addCriterion("deal_empty_str =", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotEqualTo(String value) {
            addCriterion("deal_empty_str <>", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrGreaterThan(String value) {
            addCriterion("deal_empty_str >", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrGreaterThanOrEqualTo(String value) {
            addCriterion("deal_empty_str >=", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLessThan(String value) {
            addCriterion("deal_empty_str <", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLessThanOrEqualTo(String value) {
            addCriterion("deal_empty_str <=", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLike(String value) {
            addCriterion("deal_empty_str like", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotLike(String value) {
            addCriterion("deal_empty_str not like", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIn(List<String> values) {
            addCriterion("deal_empty_str in", values, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotIn(List<String> values) {
            addCriterion("deal_empty_str not in", values, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrBetween(String value1, String value2) {
            addCriterion("deal_empty_str between", value1, value2, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotBetween(String value1, String value2) {
            addCriterion("deal_empty_str not between", value1, value2, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineIsNull() {
            addCriterion("is_first_line is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineIsNotNull() {
            addCriterion("is_first_line is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineEqualTo(String value) {
            addCriterion("is_first_line =", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineNotEqualTo(String value) {
            addCriterion("is_first_line <>", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineGreaterThan(String value) {
            addCriterion("is_first_line >", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineGreaterThanOrEqualTo(String value) {
            addCriterion("is_first_line >=", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineLessThan(String value) {
            addCriterion("is_first_line <", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineLessThanOrEqualTo(String value) {
            addCriterion("is_first_line <=", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineLike(String value) {
            addCriterion("is_first_line like", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineNotLike(String value) {
            addCriterion("is_first_line not like", value, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineIn(List<String> values) {
            addCriterion("is_first_line in", values, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineNotIn(List<String> values) {
            addCriterion("is_first_line not in", values, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineBetween(String value1, String value2) {
            addCriterion("is_first_line between", value1, value2, "isFirstLine");
            return (Criteria) this;
        }

        public Criteria andIsFirstLineNotBetween(String value1, String value2) {
            addCriterion("is_first_line not between", value1, value2, "isFirstLine");
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