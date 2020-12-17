package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginWtConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginWtConfExample() {
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

        public Criteria andCheckIntevalIsNull() {
            addCriterion("check_inteval is null");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalIsNotNull() {
            addCriterion("check_inteval is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalEqualTo(Integer value) {
            addCriterion("check_inteval =", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalNotEqualTo(Integer value) {
            addCriterion("check_inteval <>", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalGreaterThan(Integer value) {
            addCriterion("check_inteval >", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_inteval >=", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalLessThan(Integer value) {
            addCriterion("check_inteval <", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalLessThanOrEqualTo(Integer value) {
            addCriterion("check_inteval <=", value, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalIn(List<Integer> values) {
            addCriterion("check_inteval in", values, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalNotIn(List<Integer> values) {
            addCriterion("check_inteval not in", values, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalBetween(Integer value1, Integer value2) {
            addCriterion("check_inteval between", value1, value2, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andCheckIntevalNotBetween(Integer value1, Integer value2) {
            addCriterion("check_inteval not between", value1, value2, "checkInteval");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIsNull() {
            addCriterion("max_wait_time is null");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIsNotNull() {
            addCriterion("max_wait_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeEqualTo(Integer value) {
            addCriterion("max_wait_time =", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotEqualTo(Integer value) {
            addCriterion("max_wait_time <>", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeGreaterThan(Integer value) {
            addCriterion("max_wait_time >", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_wait_time >=", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeLessThan(Integer value) {
            addCriterion("max_wait_time <", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("max_wait_time <=", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIn(List<Integer> values) {
            addCriterion("max_wait_time in", values, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotIn(List<Integer> values) {
            addCriterion("max_wait_time not in", values, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeBetween(Integer value1, Integer value2) {
            addCriterion("max_wait_time between", value1, value2, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_wait_time not between", value1, value2, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaitDescIsNull() {
            addCriterion("wait_desc is null");
            return (Criteria) this;
        }

        public Criteria andWaitDescIsNotNull() {
            addCriterion("wait_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWaitDescEqualTo(String value) {
            addCriterion("wait_desc =", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescNotEqualTo(String value) {
            addCriterion("wait_desc <>", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescGreaterThan(String value) {
            addCriterion("wait_desc >", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescGreaterThanOrEqualTo(String value) {
            addCriterion("wait_desc >=", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescLessThan(String value) {
            addCriterion("wait_desc <", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescLessThanOrEqualTo(String value) {
            addCriterion("wait_desc <=", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescLike(String value) {
            addCriterion("wait_desc like", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescNotLike(String value) {
            addCriterion("wait_desc not like", value, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescIn(List<String> values) {
            addCriterion("wait_desc in", values, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescNotIn(List<String> values) {
            addCriterion("wait_desc not in", values, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescBetween(String value1, String value2) {
            addCriterion("wait_desc between", value1, value2, "waitDesc");
            return (Criteria) this;
        }

        public Criteria andWaitDescNotBetween(String value1, String value2) {
            addCriterion("wait_desc not between", value1, value2, "waitDesc");
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