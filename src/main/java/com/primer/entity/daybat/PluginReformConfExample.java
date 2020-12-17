package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginReformConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginReformConfExample() {
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

        public Criteria andReformTableSchemaIsNull() {
            addCriterion("reform_table_schema is null");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaIsNotNull() {
            addCriterion("reform_table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaEqualTo(String value) {
            addCriterion("reform_table_schema =", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaNotEqualTo(String value) {
            addCriterion("reform_table_schema <>", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaGreaterThan(String value) {
            addCriterion("reform_table_schema >", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("reform_table_schema >=", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaLessThan(String value) {
            addCriterion("reform_table_schema <", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("reform_table_schema <=", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaLike(String value) {
            addCriterion("reform_table_schema like", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaNotLike(String value) {
            addCriterion("reform_table_schema not like", value, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaIn(List<String> values) {
            addCriterion("reform_table_schema in", values, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaNotIn(List<String> values) {
            addCriterion("reform_table_schema not in", values, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaBetween(String value1, String value2) {
            addCriterion("reform_table_schema between", value1, value2, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableSchemaNotBetween(String value1, String value2) {
            addCriterion("reform_table_schema not between", value1, value2, "reformTableSchema");
            return (Criteria) this;
        }

        public Criteria andReformTableNameIsNull() {
            addCriterion("reform_table_name is null");
            return (Criteria) this;
        }

        public Criteria andReformTableNameIsNotNull() {
            addCriterion("reform_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andReformTableNameEqualTo(String value) {
            addCriterion("reform_table_name =", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameNotEqualTo(String value) {
            addCriterion("reform_table_name <>", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameGreaterThan(String value) {
            addCriterion("reform_table_name >", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("reform_table_name >=", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameLessThan(String value) {
            addCriterion("reform_table_name <", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameLessThanOrEqualTo(String value) {
            addCriterion("reform_table_name <=", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameLike(String value) {
            addCriterion("reform_table_name like", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameNotLike(String value) {
            addCriterion("reform_table_name not like", value, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameIn(List<String> values) {
            addCriterion("reform_table_name in", values, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameNotIn(List<String> values) {
            addCriterion("reform_table_name not in", values, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameBetween(String value1, String value2) {
            addCriterion("reform_table_name between", value1, value2, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformTableNameNotBetween(String value1, String value2) {
            addCriterion("reform_table_name not between", value1, value2, "reformTableName");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdIsNull() {
            addCriterion("reform_group_id is null");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdIsNotNull() {
            addCriterion("reform_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdEqualTo(String value) {
            addCriterion("reform_group_id =", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdNotEqualTo(String value) {
            addCriterion("reform_group_id <>", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdGreaterThan(String value) {
            addCriterion("reform_group_id >", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("reform_group_id >=", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdLessThan(String value) {
            addCriterion("reform_group_id <", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdLessThanOrEqualTo(String value) {
            addCriterion("reform_group_id <=", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdLike(String value) {
            addCriterion("reform_group_id like", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdNotLike(String value) {
            addCriterion("reform_group_id not like", value, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdIn(List<String> values) {
            addCriterion("reform_group_id in", values, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdNotIn(List<String> values) {
            addCriterion("reform_group_id not in", values, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdBetween(String value1, String value2) {
            addCriterion("reform_group_id between", value1, value2, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformGroupIdNotBetween(String value1, String value2) {
            addCriterion("reform_group_id not between", value1, value2, "reformGroupId");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayIsNull() {
            addCriterion("reform_cycle_day is null");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayIsNotNull() {
            addCriterion("reform_cycle_day is not null");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayEqualTo(Integer value) {
            addCriterion("reform_cycle_day =", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayNotEqualTo(Integer value) {
            addCriterion("reform_cycle_day <>", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayGreaterThan(Integer value) {
            addCriterion("reform_cycle_day >", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("reform_cycle_day >=", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayLessThan(Integer value) {
            addCriterion("reform_cycle_day <", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayLessThanOrEqualTo(Integer value) {
            addCriterion("reform_cycle_day <=", value, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayIn(List<Integer> values) {
            addCriterion("reform_cycle_day in", values, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayNotIn(List<Integer> values) {
            addCriterion("reform_cycle_day not in", values, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayBetween(Integer value1, Integer value2) {
            addCriterion("reform_cycle_day between", value1, value2, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andReformCycleDayNotBetween(Integer value1, Integer value2) {
            addCriterion("reform_cycle_day not between", value1, value2, "reformCycleDay");
            return (Criteria) this;
        }

        public Criteria andLastReformDateIsNull() {
            addCriterion("last_reform_date is null");
            return (Criteria) this;
        }

        public Criteria andLastReformDateIsNotNull() {
            addCriterion("last_reform_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastReformDateEqualTo(String value) {
            addCriterion("last_reform_date =", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateNotEqualTo(String value) {
            addCriterion("last_reform_date <>", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateGreaterThan(String value) {
            addCriterion("last_reform_date >", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_reform_date >=", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateLessThan(String value) {
            addCriterion("last_reform_date <", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateLessThanOrEqualTo(String value) {
            addCriterion("last_reform_date <=", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateLike(String value) {
            addCriterion("last_reform_date like", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateNotLike(String value) {
            addCriterion("last_reform_date not like", value, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateIn(List<String> values) {
            addCriterion("last_reform_date in", values, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateNotIn(List<String> values) {
            addCriterion("last_reform_date not in", values, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateBetween(String value1, String value2) {
            addCriterion("last_reform_date between", value1, value2, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andLastReformDateNotBetween(String value1, String value2) {
            addCriterion("last_reform_date not between", value1, value2, "lastReformDate");
            return (Criteria) this;
        }

        public Criteria andRsvOptionIsNull() {
            addCriterion("rsv_option is null");
            return (Criteria) this;
        }

        public Criteria andRsvOptionIsNotNull() {
            addCriterion("rsv_option is not null");
            return (Criteria) this;
        }

        public Criteria andRsvOptionEqualTo(String value) {
            addCriterion("rsv_option =", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionNotEqualTo(String value) {
            addCriterion("rsv_option <>", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionGreaterThan(String value) {
            addCriterion("rsv_option >", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionGreaterThanOrEqualTo(String value) {
            addCriterion("rsv_option >=", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionLessThan(String value) {
            addCriterion("rsv_option <", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionLessThanOrEqualTo(String value) {
            addCriterion("rsv_option <=", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionLike(String value) {
            addCriterion("rsv_option like", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionNotLike(String value) {
            addCriterion("rsv_option not like", value, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionIn(List<String> values) {
            addCriterion("rsv_option in", values, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionNotIn(List<String> values) {
            addCriterion("rsv_option not in", values, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionBetween(String value1, String value2) {
            addCriterion("rsv_option between", value1, value2, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andRsvOptionNotBetween(String value1, String value2) {
            addCriterion("rsv_option not between", value1, value2, "rsvOption");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("valid_date like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("valid_date not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("invalid_date is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("invalid_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(String value) {
            addCriterion("invalid_date =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(String value) {
            addCriterion("invalid_date <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(String value) {
            addCriterion("invalid_date >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(String value) {
            addCriterion("invalid_date >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(String value) {
            addCriterion("invalid_date <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(String value) {
            addCriterion("invalid_date <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLike(String value) {
            addCriterion("invalid_date like", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotLike(String value) {
            addCriterion("invalid_date not like", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<String> values) {
            addCriterion("invalid_date in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<String> values) {
            addCriterion("invalid_date not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(String value1, String value2) {
            addCriterion("invalid_date between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(String value1, String value2) {
            addCriterion("invalid_date not between", value1, value2, "invalidDate");
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