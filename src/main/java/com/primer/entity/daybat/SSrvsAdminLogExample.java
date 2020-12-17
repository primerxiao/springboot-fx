package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SSrvsAdminLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSrvsAdminLogExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIsNull() {
            addCriterion("srvs_inst_id is null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIsNotNull() {
            addCriterion("srvs_inst_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdEqualTo(String value) {
            addCriterion("srvs_inst_id =", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotEqualTo(String value) {
            addCriterion("srvs_inst_id <>", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdGreaterThan(String value) {
            addCriterion("srvs_inst_id >", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_inst_id >=", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLessThan(String value) {
            addCriterion("srvs_inst_id <", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLessThanOrEqualTo(String value) {
            addCriterion("srvs_inst_id <=", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLike(String value) {
            addCriterion("srvs_inst_id like", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotLike(String value) {
            addCriterion("srvs_inst_id not like", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIn(List<String> values) {
            addCriterion("srvs_inst_id in", values, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotIn(List<String> values) {
            addCriterion("srvs_inst_id not in", values, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdBetween(String value1, String value2) {
            addCriterion("srvs_inst_id between", value1, value2, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotBetween(String value1, String value2) {
            addCriterion("srvs_inst_id not between", value1, value2, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionIsNull() {
            addCriterion("srvs_inst_action is null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionIsNotNull() {
            addCriterion("srvs_inst_action is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionEqualTo(String value) {
            addCriterion("srvs_inst_action =", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionNotEqualTo(String value) {
            addCriterion("srvs_inst_action <>", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionGreaterThan(String value) {
            addCriterion("srvs_inst_action >", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_inst_action >=", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionLessThan(String value) {
            addCriterion("srvs_inst_action <", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionLessThanOrEqualTo(String value) {
            addCriterion("srvs_inst_action <=", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionLike(String value) {
            addCriterion("srvs_inst_action like", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionNotLike(String value) {
            addCriterion("srvs_inst_action not like", value, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionIn(List<String> values) {
            addCriterion("srvs_inst_action in", values, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionNotIn(List<String> values) {
            addCriterion("srvs_inst_action not in", values, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionBetween(String value1, String value2) {
            addCriterion("srvs_inst_action between", value1, value2, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andSrvsInstActionNotBetween(String value1, String value2) {
            addCriterion("srvs_inst_action not between", value1, value2, "srvsInstAction");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNull() {
            addCriterion("action_time is null");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNotNull() {
            addCriterion("action_time is not null");
            return (Criteria) this;
        }

        public Criteria andActionTimeEqualTo(String value) {
            addCriterion("action_time =", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotEqualTo(String value) {
            addCriterion("action_time <>", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThan(String value) {
            addCriterion("action_time >", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("action_time >=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThan(String value) {
            addCriterion("action_time <", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThanOrEqualTo(String value) {
            addCriterion("action_time <=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLike(String value) {
            addCriterion("action_time like", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotLike(String value) {
            addCriterion("action_time not like", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeIn(List<String> values) {
            addCriterion("action_time in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotIn(List<String> values) {
            addCriterion("action_time not in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeBetween(String value1, String value2) {
            addCriterion("action_time between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotBetween(String value1, String value2) {
            addCriterion("action_time not between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionResultIsNull() {
            addCriterion("action_result is null");
            return (Criteria) this;
        }

        public Criteria andActionResultIsNotNull() {
            addCriterion("action_result is not null");
            return (Criteria) this;
        }

        public Criteria andActionResultEqualTo(String value) {
            addCriterion("action_result =", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultNotEqualTo(String value) {
            addCriterion("action_result <>", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultGreaterThan(String value) {
            addCriterion("action_result >", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultGreaterThanOrEqualTo(String value) {
            addCriterion("action_result >=", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultLessThan(String value) {
            addCriterion("action_result <", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultLessThanOrEqualTo(String value) {
            addCriterion("action_result <=", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultLike(String value) {
            addCriterion("action_result like", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultNotLike(String value) {
            addCriterion("action_result not like", value, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultIn(List<String> values) {
            addCriterion("action_result in", values, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultNotIn(List<String> values) {
            addCriterion("action_result not in", values, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultBetween(String value1, String value2) {
            addCriterion("action_result between", value1, value2, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionResultNotBetween(String value1, String value2) {
            addCriterion("action_result not between", value1, value2, "actionResult");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoIsNull() {
            addCriterion("action_detail_info is null");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoIsNotNull() {
            addCriterion("action_detail_info is not null");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoEqualTo(String value) {
            addCriterion("action_detail_info =", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoNotEqualTo(String value) {
            addCriterion("action_detail_info <>", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoGreaterThan(String value) {
            addCriterion("action_detail_info >", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("action_detail_info >=", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoLessThan(String value) {
            addCriterion("action_detail_info <", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("action_detail_info <=", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoLike(String value) {
            addCriterion("action_detail_info like", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoNotLike(String value) {
            addCriterion("action_detail_info not like", value, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoIn(List<String> values) {
            addCriterion("action_detail_info in", values, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoNotIn(List<String> values) {
            addCriterion("action_detail_info not in", values, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoBetween(String value1, String value2) {
            addCriterion("action_detail_info between", value1, value2, "actionDetailInfo");
            return (Criteria) this;
        }

        public Criteria andActionDetailInfoNotBetween(String value1, String value2) {
            addCriterion("action_detail_info not between", value1, value2, "actionDetailInfo");
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