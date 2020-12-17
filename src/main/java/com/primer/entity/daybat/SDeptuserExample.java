package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SDeptuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SDeptuserExample() {
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

        public Criteria andOrgannoIsNull() {
            addCriterion("organno is null");
            return (Criteria) this;
        }

        public Criteria andOrgannoIsNotNull() {
            addCriterion("organno is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannoEqualTo(String value) {
            addCriterion("organno =", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotEqualTo(String value) {
            addCriterion("organno <>", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoGreaterThan(String value) {
            addCriterion("organno >", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoGreaterThanOrEqualTo(String value) {
            addCriterion("organno >=", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLessThan(String value) {
            addCriterion("organno <", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLessThanOrEqualTo(String value) {
            addCriterion("organno <=", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLike(String value) {
            addCriterion("organno like", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotLike(String value) {
            addCriterion("organno not like", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoIn(List<String> values) {
            addCriterion("organno in", values, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotIn(List<String> values) {
            addCriterion("organno not in", values, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoBetween(String value1, String value2) {
            addCriterion("organno between", value1, value2, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotBetween(String value1, String value2) {
            addCriterion("organno not between", value1, value2, "organno");
            return (Criteria) this;
        }

        public Criteria andActornoIsNull() {
            addCriterion("actorno is null");
            return (Criteria) this;
        }

        public Criteria andActornoIsNotNull() {
            addCriterion("actorno is not null");
            return (Criteria) this;
        }

        public Criteria andActornoEqualTo(String value) {
            addCriterion("actorno =", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoNotEqualTo(String value) {
            addCriterion("actorno <>", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoGreaterThan(String value) {
            addCriterion("actorno >", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoGreaterThanOrEqualTo(String value) {
            addCriterion("actorno >=", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoLessThan(String value) {
            addCriterion("actorno <", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoLessThanOrEqualTo(String value) {
            addCriterion("actorno <=", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoLike(String value) {
            addCriterion("actorno like", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoNotLike(String value) {
            addCriterion("actorno not like", value, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoIn(List<String> values) {
            addCriterion("actorno in", values, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoNotIn(List<String> values) {
            addCriterion("actorno not in", values, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoBetween(String value1, String value2) {
            addCriterion("actorno between", value1, value2, "actorno");
            return (Criteria) this;
        }

        public Criteria andActornoNotBetween(String value1, String value2) {
            addCriterion("actorno not between", value1, value2, "actorno");
            return (Criteria) this;
        }

        public Criteria andDepnoIsNull() {
            addCriterion("depno is null");
            return (Criteria) this;
        }

        public Criteria andDepnoIsNotNull() {
            addCriterion("depno is not null");
            return (Criteria) this;
        }

        public Criteria andDepnoEqualTo(String value) {
            addCriterion("depno =", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoNotEqualTo(String value) {
            addCriterion("depno <>", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoGreaterThan(String value) {
            addCriterion("depno >", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoGreaterThanOrEqualTo(String value) {
            addCriterion("depno >=", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoLessThan(String value) {
            addCriterion("depno <", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoLessThanOrEqualTo(String value) {
            addCriterion("depno <=", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoLike(String value) {
            addCriterion("depno like", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoNotLike(String value) {
            addCriterion("depno not like", value, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoIn(List<String> values) {
            addCriterion("depno in", values, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoNotIn(List<String> values) {
            addCriterion("depno not in", values, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoBetween(String value1, String value2) {
            addCriterion("depno between", value1, value2, "depno");
            return (Criteria) this;
        }

        public Criteria andDepnoNotBetween(String value1, String value2) {
            addCriterion("depno not between", value1, value2, "depno");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(BigDecimal value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(BigDecimal value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(BigDecimal value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(BigDecimal value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<BigDecimal> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<BigDecimal> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgid like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgid not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
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