package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SSubsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSubsInfoExample() {
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

        public Criteria andSubsCodeIsNull() {
            addCriterion("subs_code is null");
            return (Criteria) this;
        }

        public Criteria andSubsCodeIsNotNull() {
            addCriterion("subs_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubsCodeEqualTo(String value) {
            addCriterion("subs_code =", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotEqualTo(String value) {
            addCriterion("subs_code <>", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeGreaterThan(String value) {
            addCriterion("subs_code >", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subs_code >=", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLessThan(String value) {
            addCriterion("subs_code <", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLessThanOrEqualTo(String value) {
            addCriterion("subs_code <=", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLike(String value) {
            addCriterion("subs_code like", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotLike(String value) {
            addCriterion("subs_code not like", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeIn(List<String> values) {
            addCriterion("subs_code in", values, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotIn(List<String> values) {
            addCriterion("subs_code not in", values, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeBetween(String value1, String value2) {
            addCriterion("subs_code between", value1, value2, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotBetween(String value1, String value2) {
            addCriterion("subs_code not between", value1, value2, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsNameIsNull() {
            addCriterion("subs_name is null");
            return (Criteria) this;
        }

        public Criteria andSubsNameIsNotNull() {
            addCriterion("subs_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubsNameEqualTo(String value) {
            addCriterion("subs_name =", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotEqualTo(String value) {
            addCriterion("subs_name <>", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameGreaterThan(String value) {
            addCriterion("subs_name >", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameGreaterThanOrEqualTo(String value) {
            addCriterion("subs_name >=", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLessThan(String value) {
            addCriterion("subs_name <", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLessThanOrEqualTo(String value) {
            addCriterion("subs_name <=", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLike(String value) {
            addCriterion("subs_name like", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotLike(String value) {
            addCriterion("subs_name not like", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameIn(List<String> values) {
            addCriterion("subs_name in", values, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotIn(List<String> values) {
            addCriterion("subs_name not in", values, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameBetween(String value1, String value2) {
            addCriterion("subs_name between", value1, value2, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotBetween(String value1, String value2) {
            addCriterion("subs_name not between", value1, value2, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateIsNull() {
            addCriterion("subs_data_date is null");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateIsNotNull() {
            addCriterion("subs_data_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateEqualTo(String value) {
            addCriterion("subs_data_date =", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateNotEqualTo(String value) {
            addCriterion("subs_data_date <>", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateGreaterThan(String value) {
            addCriterion("subs_data_date >", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("subs_data_date >=", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateLessThan(String value) {
            addCriterion("subs_data_date <", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateLessThanOrEqualTo(String value) {
            addCriterion("subs_data_date <=", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateLike(String value) {
            addCriterion("subs_data_date like", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateNotLike(String value) {
            addCriterion("subs_data_date not like", value, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateIn(List<String> values) {
            addCriterion("subs_data_date in", values, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateNotIn(List<String> values) {
            addCriterion("subs_data_date not in", values, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateBetween(String value1, String value2) {
            addCriterion("subs_data_date between", value1, value2, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsDataDateNotBetween(String value1, String value2) {
            addCriterion("subs_data_date not between", value1, value2, "subsDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateIsNull() {
            addCriterion("subs_last_data_date is null");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateIsNotNull() {
            addCriterion("subs_last_data_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateEqualTo(String value) {
            addCriterion("subs_last_data_date =", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateNotEqualTo(String value) {
            addCriterion("subs_last_data_date <>", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateGreaterThan(String value) {
            addCriterion("subs_last_data_date >", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("subs_last_data_date >=", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateLessThan(String value) {
            addCriterion("subs_last_data_date <", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateLessThanOrEqualTo(String value) {
            addCriterion("subs_last_data_date <=", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateLike(String value) {
            addCriterion("subs_last_data_date like", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateNotLike(String value) {
            addCriterion("subs_last_data_date not like", value, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateIn(List<String> values) {
            addCriterion("subs_last_data_date in", values, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateNotIn(List<String> values) {
            addCriterion("subs_last_data_date not in", values, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateBetween(String value1, String value2) {
            addCriterion("subs_last_data_date between", value1, value2, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLastDataDateNotBetween(String value1, String value2) {
            addCriterion("subs_last_data_date not between", value1, value2, "subsLastDataDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateIsNull() {
            addCriterion("subs_load_date is null");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateIsNotNull() {
            addCriterion("subs_load_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateEqualTo(String value) {
            addCriterion("subs_load_date =", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateNotEqualTo(String value) {
            addCriterion("subs_load_date <>", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateGreaterThan(String value) {
            addCriterion("subs_load_date >", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateGreaterThanOrEqualTo(String value) {
            addCriterion("subs_load_date >=", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateLessThan(String value) {
            addCriterion("subs_load_date <", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateLessThanOrEqualTo(String value) {
            addCriterion("subs_load_date <=", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateLike(String value) {
            addCriterion("subs_load_date like", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateNotLike(String value) {
            addCriterion("subs_load_date not like", value, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateIn(List<String> values) {
            addCriterion("subs_load_date in", values, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateNotIn(List<String> values) {
            addCriterion("subs_load_date not in", values, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateBetween(String value1, String value2) {
            addCriterion("subs_load_date between", value1, value2, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsLoadDateNotBetween(String value1, String value2) {
            addCriterion("subs_load_date not between", value1, value2, "subsLoadDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateIsNull() {
            addCriterion("subs_bat_date is null");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateIsNotNull() {
            addCriterion("subs_bat_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateEqualTo(String value) {
            addCriterion("subs_bat_date =", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateNotEqualTo(String value) {
            addCriterion("subs_bat_date <>", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateGreaterThan(String value) {
            addCriterion("subs_bat_date >", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateGreaterThanOrEqualTo(String value) {
            addCriterion("subs_bat_date >=", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateLessThan(String value) {
            addCriterion("subs_bat_date <", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateLessThanOrEqualTo(String value) {
            addCriterion("subs_bat_date <=", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateLike(String value) {
            addCriterion("subs_bat_date like", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateNotLike(String value) {
            addCriterion("subs_bat_date not like", value, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateIn(List<String> values) {
            addCriterion("subs_bat_date in", values, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateNotIn(List<String> values) {
            addCriterion("subs_bat_date not in", values, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateBetween(String value1, String value2) {
            addCriterion("subs_bat_date between", value1, value2, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andSubsBatDateNotBetween(String value1, String value2) {
            addCriterion("subs_bat_date not between", value1, value2, "subsBatDate");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixIsNull() {
            addCriterion("batch_id_prefix is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixIsNotNull() {
            addCriterion("batch_id_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixEqualTo(String value) {
            addCriterion("batch_id_prefix =", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixNotEqualTo(String value) {
            addCriterion("batch_id_prefix <>", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixGreaterThan(String value) {
            addCriterion("batch_id_prefix >", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id_prefix >=", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixLessThan(String value) {
            addCriterion("batch_id_prefix <", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixLessThanOrEqualTo(String value) {
            addCriterion("batch_id_prefix <=", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixLike(String value) {
            addCriterion("batch_id_prefix like", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixNotLike(String value) {
            addCriterion("batch_id_prefix not like", value, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixIn(List<String> values) {
            addCriterion("batch_id_prefix in", values, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixNotIn(List<String> values) {
            addCriterion("batch_id_prefix not in", values, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixBetween(String value1, String value2) {
            addCriterion("batch_id_prefix between", value1, value2, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andBatchIdPrefixNotBetween(String value1, String value2) {
            addCriterion("batch_id_prefix not between", value1, value2, "batchIdPrefix");
            return (Criteria) this;
        }

        public Criteria andRsvDateIsNull() {
            addCriterion("rsv_date is null");
            return (Criteria) this;
        }

        public Criteria andRsvDateIsNotNull() {
            addCriterion("rsv_date is not null");
            return (Criteria) this;
        }

        public Criteria andRsvDateEqualTo(String value) {
            addCriterion("rsv_date =", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateNotEqualTo(String value) {
            addCriterion("rsv_date <>", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateGreaterThan(String value) {
            addCriterion("rsv_date >", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateGreaterThanOrEqualTo(String value) {
            addCriterion("rsv_date >=", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateLessThan(String value) {
            addCriterion("rsv_date <", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateLessThanOrEqualTo(String value) {
            addCriterion("rsv_date <=", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateLike(String value) {
            addCriterion("rsv_date like", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateNotLike(String value) {
            addCriterion("rsv_date not like", value, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateIn(List<String> values) {
            addCriterion("rsv_date in", values, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateNotIn(List<String> values) {
            addCriterion("rsv_date not in", values, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateBetween(String value1, String value2) {
            addCriterion("rsv_date between", value1, value2, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvDateNotBetween(String value1, String value2) {
            addCriterion("rsv_date not between", value1, value2, "rsvDate");
            return (Criteria) this;
        }

        public Criteria andRsvStateIsNull() {
            addCriterion("rsv_state is null");
            return (Criteria) this;
        }

        public Criteria andRsvStateIsNotNull() {
            addCriterion("rsv_state is not null");
            return (Criteria) this;
        }

        public Criteria andRsvStateEqualTo(String value) {
            addCriterion("rsv_state =", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateNotEqualTo(String value) {
            addCriterion("rsv_state <>", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateGreaterThan(String value) {
            addCriterion("rsv_state >", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateGreaterThanOrEqualTo(String value) {
            addCriterion("rsv_state >=", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateLessThan(String value) {
            addCriterion("rsv_state <", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateLessThanOrEqualTo(String value) {
            addCriterion("rsv_state <=", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateLike(String value) {
            addCriterion("rsv_state like", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateNotLike(String value) {
            addCriterion("rsv_state not like", value, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateIn(List<String> values) {
            addCriterion("rsv_state in", values, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateNotIn(List<String> values) {
            addCriterion("rsv_state not in", values, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateBetween(String value1, String value2) {
            addCriterion("rsv_state between", value1, value2, "rsvState");
            return (Criteria) this;
        }

        public Criteria andRsvStateNotBetween(String value1, String value2) {
            addCriterion("rsv_state not between", value1, value2, "rsvState");
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