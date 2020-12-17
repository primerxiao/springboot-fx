package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginJobParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginJobParamExample() {
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

        public Criteria andParamGroupIdIsNull() {
            addCriterion("param_group_id is null");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdIsNotNull() {
            addCriterion("param_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdEqualTo(String value) {
            addCriterion("param_group_id =", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotEqualTo(String value) {
            addCriterion("param_group_id <>", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdGreaterThan(String value) {
            addCriterion("param_group_id >", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("param_group_id >=", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLessThan(String value) {
            addCriterion("param_group_id <", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLessThanOrEqualTo(String value) {
            addCriterion("param_group_id <=", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLike(String value) {
            addCriterion("param_group_id like", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotLike(String value) {
            addCriterion("param_group_id not like", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdIn(List<String> values) {
            addCriterion("param_group_id in", values, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotIn(List<String> values) {
            addCriterion("param_group_id not in", values, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdBetween(String value1, String value2) {
            addCriterion("param_group_id between", value1, value2, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotBetween(String value1, String value2) {
            addCriterion("param_group_id not between", value1, value2, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andJobParamNameIsNull() {
            addCriterion("job_param_name is null");
            return (Criteria) this;
        }

        public Criteria andJobParamNameIsNotNull() {
            addCriterion("job_param_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobParamNameEqualTo(String value) {
            addCriterion("job_param_name =", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameNotEqualTo(String value) {
            addCriterion("job_param_name <>", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameGreaterThan(String value) {
            addCriterion("job_param_name >", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_param_name >=", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameLessThan(String value) {
            addCriterion("job_param_name <", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameLessThanOrEqualTo(String value) {
            addCriterion("job_param_name <=", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameLike(String value) {
            addCriterion("job_param_name like", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameNotLike(String value) {
            addCriterion("job_param_name not like", value, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameIn(List<String> values) {
            addCriterion("job_param_name in", values, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameNotIn(List<String> values) {
            addCriterion("job_param_name not in", values, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameBetween(String value1, String value2) {
            addCriterion("job_param_name between", value1, value2, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamNameNotBetween(String value1, String value2) {
            addCriterion("job_param_name not between", value1, value2, "jobParamName");
            return (Criteria) this;
        }

        public Criteria andJobParamValueIsNull() {
            addCriterion("job_param_value is null");
            return (Criteria) this;
        }

        public Criteria andJobParamValueIsNotNull() {
            addCriterion("job_param_value is not null");
            return (Criteria) this;
        }

        public Criteria andJobParamValueEqualTo(String value) {
            addCriterion("job_param_value =", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueNotEqualTo(String value) {
            addCriterion("job_param_value <>", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueGreaterThan(String value) {
            addCriterion("job_param_value >", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("job_param_value >=", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueLessThan(String value) {
            addCriterion("job_param_value <", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueLessThanOrEqualTo(String value) {
            addCriterion("job_param_value <=", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueLike(String value) {
            addCriterion("job_param_value like", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueNotLike(String value) {
            addCriterion("job_param_value not like", value, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueIn(List<String> values) {
            addCriterion("job_param_value in", values, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueNotIn(List<String> values) {
            addCriterion("job_param_value not in", values, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueBetween(String value1, String value2) {
            addCriterion("job_param_value between", value1, value2, "jobParamValue");
            return (Criteria) this;
        }

        public Criteria andJobParamValueNotBetween(String value1, String value2) {
            addCriterion("job_param_value not between", value1, value2, "jobParamValue");
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