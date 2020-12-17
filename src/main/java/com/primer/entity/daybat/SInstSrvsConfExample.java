package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SInstSrvsConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SInstSrvsConfExample() {
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

        public Criteria andSrvsCodeIsNull() {
            addCriterion("srvs_code is null");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeIsNotNull() {
            addCriterion("srvs_code is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeEqualTo(String value) {
            addCriterion("srvs_code =", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeNotEqualTo(String value) {
            addCriterion("srvs_code <>", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeGreaterThan(String value) {
            addCriterion("srvs_code >", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_code >=", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeLessThan(String value) {
            addCriterion("srvs_code <", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeLessThanOrEqualTo(String value) {
            addCriterion("srvs_code <=", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeLike(String value) {
            addCriterion("srvs_code like", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeNotLike(String value) {
            addCriterion("srvs_code not like", value, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeIn(List<String> values) {
            addCriterion("srvs_code in", values, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeNotIn(List<String> values) {
            addCriterion("srvs_code not in", values, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeBetween(String value1, String value2) {
            addCriterion("srvs_code between", value1, value2, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSrvsCodeNotBetween(String value1, String value2) {
            addCriterion("srvs_code not between", value1, value2, "srvsCode");
            return (Criteria) this;
        }

        public Criteria andSysInstIdIsNull() {
            addCriterion("sys_inst_id is null");
            return (Criteria) this;
        }

        public Criteria andSysInstIdIsNotNull() {
            addCriterion("sys_inst_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysInstIdEqualTo(String value) {
            addCriterion("sys_inst_id =", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdNotEqualTo(String value) {
            addCriterion("sys_inst_id <>", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdGreaterThan(String value) {
            addCriterion("sys_inst_id >", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_inst_id >=", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdLessThan(String value) {
            addCriterion("sys_inst_id <", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdLessThanOrEqualTo(String value) {
            addCriterion("sys_inst_id <=", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdLike(String value) {
            addCriterion("sys_inst_id like", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdNotLike(String value) {
            addCriterion("sys_inst_id not like", value, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdIn(List<String> values) {
            addCriterion("sys_inst_id in", values, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdNotIn(List<String> values) {
            addCriterion("sys_inst_id not in", values, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdBetween(String value1, String value2) {
            addCriterion("sys_inst_id between", value1, value2, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andSysInstIdNotBetween(String value1, String value2) {
            addCriterion("sys_inst_id not between", value1, value2, "sysInstId");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceIsNull() {
            addCriterion("is_allow_service is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceIsNotNull() {
            addCriterion("is_allow_service is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceEqualTo(String value) {
            addCriterion("is_allow_service =", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceNotEqualTo(String value) {
            addCriterion("is_allow_service <>", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceGreaterThan(String value) {
            addCriterion("is_allow_service >", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceGreaterThanOrEqualTo(String value) {
            addCriterion("is_allow_service >=", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceLessThan(String value) {
            addCriterion("is_allow_service <", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceLessThanOrEqualTo(String value) {
            addCriterion("is_allow_service <=", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceLike(String value) {
            addCriterion("is_allow_service like", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceNotLike(String value) {
            addCriterion("is_allow_service not like", value, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceIn(List<String> values) {
            addCriterion("is_allow_service in", values, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceNotIn(List<String> values) {
            addCriterion("is_allow_service not in", values, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceBetween(String value1, String value2) {
            addCriterion("is_allow_service between", value1, value2, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andIsAllowServiceNotBetween(String value1, String value2) {
            addCriterion("is_allow_service not between", value1, value2, "isAllowService");
            return (Criteria) this;
        }

        public Criteria andRsvFlagIsNull() {
            addCriterion("rsv_flag is null");
            return (Criteria) this;
        }

        public Criteria andRsvFlagIsNotNull() {
            addCriterion("rsv_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRsvFlagEqualTo(String value) {
            addCriterion("rsv_flag =", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagNotEqualTo(String value) {
            addCriterion("rsv_flag <>", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagGreaterThan(String value) {
            addCriterion("rsv_flag >", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagGreaterThanOrEqualTo(String value) {
            addCriterion("rsv_flag >=", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagLessThan(String value) {
            addCriterion("rsv_flag <", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagLessThanOrEqualTo(String value) {
            addCriterion("rsv_flag <=", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagLike(String value) {
            addCriterion("rsv_flag like", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagNotLike(String value) {
            addCriterion("rsv_flag not like", value, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagIn(List<String> values) {
            addCriterion("rsv_flag in", values, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagNotIn(List<String> values) {
            addCriterion("rsv_flag not in", values, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagBetween(String value1, String value2) {
            addCriterion("rsv_flag between", value1, value2, "rsvFlag");
            return (Criteria) this;
        }

        public Criteria andRsvFlagNotBetween(String value1, String value2) {
            addCriterion("rsv_flag not between", value1, value2, "rsvFlag");
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