package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginFileopConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginFileopConfExample() {
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

        public Criteria andFileOpIsNull() {
            addCriterion("file_op is null");
            return (Criteria) this;
        }

        public Criteria andFileOpIsNotNull() {
            addCriterion("file_op is not null");
            return (Criteria) this;
        }

        public Criteria andFileOpEqualTo(String value) {
            addCriterion("file_op =", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpNotEqualTo(String value) {
            addCriterion("file_op <>", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpGreaterThan(String value) {
            addCriterion("file_op >", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpGreaterThanOrEqualTo(String value) {
            addCriterion("file_op >=", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpLessThan(String value) {
            addCriterion("file_op <", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpLessThanOrEqualTo(String value) {
            addCriterion("file_op <=", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpLike(String value) {
            addCriterion("file_op like", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpNotLike(String value) {
            addCriterion("file_op not like", value, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpIn(List<String> values) {
            addCriterion("file_op in", values, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpNotIn(List<String> values) {
            addCriterion("file_op not in", values, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpBetween(String value1, String value2) {
            addCriterion("file_op between", value1, value2, "fileOp");
            return (Criteria) this;
        }

        public Criteria andFileOpNotBetween(String value1, String value2) {
            addCriterion("file_op not between", value1, value2, "fileOp");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayIsNull() {
            addCriterion("op_cycle_day is null");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayIsNotNull() {
            addCriterion("op_cycle_day is not null");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayEqualTo(Integer value) {
            addCriterion("op_cycle_day =", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayNotEqualTo(Integer value) {
            addCriterion("op_cycle_day <>", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayGreaterThan(Integer value) {
            addCriterion("op_cycle_day >", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_cycle_day >=", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayLessThan(Integer value) {
            addCriterion("op_cycle_day <", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayLessThanOrEqualTo(Integer value) {
            addCriterion("op_cycle_day <=", value, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayIn(List<Integer> values) {
            addCriterion("op_cycle_day in", values, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayNotIn(List<Integer> values) {
            addCriterion("op_cycle_day not in", values, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayBetween(Integer value1, Integer value2) {
            addCriterion("op_cycle_day between", value1, value2, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andOpCycleDayNotBetween(Integer value1, Integer value2) {
            addCriterion("op_cycle_day not between", value1, value2, "opCycleDay");
            return (Criteria) this;
        }

        public Criteria andLastOpDateIsNull() {
            addCriterion("last_op_date is null");
            return (Criteria) this;
        }

        public Criteria andLastOpDateIsNotNull() {
            addCriterion("last_op_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpDateEqualTo(String value) {
            addCriterion("last_op_date =", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateNotEqualTo(String value) {
            addCriterion("last_op_date <>", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateGreaterThan(String value) {
            addCriterion("last_op_date >", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_op_date >=", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateLessThan(String value) {
            addCriterion("last_op_date <", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateLessThanOrEqualTo(String value) {
            addCriterion("last_op_date <=", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateLike(String value) {
            addCriterion("last_op_date like", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateNotLike(String value) {
            addCriterion("last_op_date not like", value, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateIn(List<String> values) {
            addCriterion("last_op_date in", values, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateNotIn(List<String> values) {
            addCriterion("last_op_date not in", values, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateBetween(String value1, String value2) {
            addCriterion("last_op_date between", value1, value2, "lastOpDate");
            return (Criteria) this;
        }

        public Criteria andLastOpDateNotBetween(String value1, String value2) {
            addCriterion("last_op_date not between", value1, value2, "lastOpDate");
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

        public Criteria andDistanceDayIsNull() {
            addCriterion("distance_day is null");
            return (Criteria) this;
        }

        public Criteria andDistanceDayIsNotNull() {
            addCriterion("distance_day is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceDayEqualTo(Integer value) {
            addCriterion("distance_day =", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayNotEqualTo(Integer value) {
            addCriterion("distance_day <>", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayGreaterThan(Integer value) {
            addCriterion("distance_day >", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance_day >=", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayLessThan(Integer value) {
            addCriterion("distance_day <", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayLessThanOrEqualTo(Integer value) {
            addCriterion("distance_day <=", value, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayIn(List<Integer> values) {
            addCriterion("distance_day in", values, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayNotIn(List<Integer> values) {
            addCriterion("distance_day not in", values, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayBetween(Integer value1, Integer value2) {
            addCriterion("distance_day between", value1, value2, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andDistanceDayNotBetween(Integer value1, Integer value2) {
            addCriterion("distance_day not between", value1, value2, "distanceDay");
            return (Criteria) this;
        }

        public Criteria andFileTargetIsNull() {
            addCriterion("file_target is null");
            return (Criteria) this;
        }

        public Criteria andFileTargetIsNotNull() {
            addCriterion("file_target is not null");
            return (Criteria) this;
        }

        public Criteria andFileTargetEqualTo(String value) {
            addCriterion("file_target =", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetNotEqualTo(String value) {
            addCriterion("file_target <>", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetGreaterThan(String value) {
            addCriterion("file_target >", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetGreaterThanOrEqualTo(String value) {
            addCriterion("file_target >=", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetLessThan(String value) {
            addCriterion("file_target <", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetLessThanOrEqualTo(String value) {
            addCriterion("file_target <=", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetLike(String value) {
            addCriterion("file_target like", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetNotLike(String value) {
            addCriterion("file_target not like", value, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetIn(List<String> values) {
            addCriterion("file_target in", values, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetNotIn(List<String> values) {
            addCriterion("file_target not in", values, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetBetween(String value1, String value2) {
            addCriterion("file_target between", value1, value2, "fileTarget");
            return (Criteria) this;
        }

        public Criteria andFileTargetNotBetween(String value1, String value2) {
            addCriterion("file_target not between", value1, value2, "fileTarget");
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