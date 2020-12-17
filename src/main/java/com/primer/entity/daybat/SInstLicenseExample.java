package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SInstLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SInstLicenseExample() {
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

        public Criteria andHostNameIsNull() {
            addCriterion("host_name is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("host_name is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("host_name =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("host_name <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("host_name >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("host_name >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("host_name <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("host_name <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("host_name like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("host_name not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("host_name in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("host_name not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("host_name between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("host_name not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andWebPortIsNull() {
            addCriterion("web_port is null");
            return (Criteria) this;
        }

        public Criteria andWebPortIsNotNull() {
            addCriterion("web_port is not null");
            return (Criteria) this;
        }

        public Criteria andWebPortEqualTo(String value) {
            addCriterion("web_port =", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortNotEqualTo(String value) {
            addCriterion("web_port <>", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortGreaterThan(String value) {
            addCriterion("web_port >", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortGreaterThanOrEqualTo(String value) {
            addCriterion("web_port >=", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortLessThan(String value) {
            addCriterion("web_port <", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortLessThanOrEqualTo(String value) {
            addCriterion("web_port <=", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortLike(String value) {
            addCriterion("web_port like", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortNotLike(String value) {
            addCriterion("web_port not like", value, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortIn(List<String> values) {
            addCriterion("web_port in", values, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortNotIn(List<String> values) {
            addCriterion("web_port not in", values, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortBetween(String value1, String value2) {
            addCriterion("web_port between", value1, value2, "webPort");
            return (Criteria) this;
        }

        public Criteria andWebPortNotBetween(String value1, String value2) {
            addCriterion("web_port not between", value1, value2, "webPort");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("sys_name =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("sys_name <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("sys_name >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_name >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("sys_name <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("sys_name <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("sys_name like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("sys_name not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("sys_name in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("sys_name not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("sys_name between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("sys_name not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andAuthTargetIsNull() {
            addCriterion("auth_target is null");
            return (Criteria) this;
        }

        public Criteria andAuthTargetIsNotNull() {
            addCriterion("auth_target is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTargetEqualTo(String value) {
            addCriterion("auth_target =", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetNotEqualTo(String value) {
            addCriterion("auth_target <>", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetGreaterThan(String value) {
            addCriterion("auth_target >", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetGreaterThanOrEqualTo(String value) {
            addCriterion("auth_target >=", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetLessThan(String value) {
            addCriterion("auth_target <", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetLessThanOrEqualTo(String value) {
            addCriterion("auth_target <=", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetLike(String value) {
            addCriterion("auth_target like", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetNotLike(String value) {
            addCriterion("auth_target not like", value, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetIn(List<String> values) {
            addCriterion("auth_target in", values, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetNotIn(List<String> values) {
            addCriterion("auth_target not in", values, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetBetween(String value1, String value2) {
            addCriterion("auth_target between", value1, value2, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthTargetNotBetween(String value1, String value2) {
            addCriterion("auth_target not between", value1, value2, "authTarget");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateIsNull() {
            addCriterion("auth_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateIsNotNull() {
            addCriterion("auth_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateEqualTo(String value) {
            addCriterion("auth_begin_date =", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateNotEqualTo(String value) {
            addCriterion("auth_begin_date <>", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateGreaterThan(String value) {
            addCriterion("auth_begin_date >", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateGreaterThanOrEqualTo(String value) {
            addCriterion("auth_begin_date >=", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateLessThan(String value) {
            addCriterion("auth_begin_date <", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateLessThanOrEqualTo(String value) {
            addCriterion("auth_begin_date <=", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateLike(String value) {
            addCriterion("auth_begin_date like", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateNotLike(String value) {
            addCriterion("auth_begin_date not like", value, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateIn(List<String> values) {
            addCriterion("auth_begin_date in", values, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateNotIn(List<String> values) {
            addCriterion("auth_begin_date not in", values, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateBetween(String value1, String value2) {
            addCriterion("auth_begin_date between", value1, value2, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthBeginDateNotBetween(String value1, String value2) {
            addCriterion("auth_begin_date not between", value1, value2, "authBeginDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateIsNull() {
            addCriterion("auth_end_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateIsNotNull() {
            addCriterion("auth_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateEqualTo(String value) {
            addCriterion("auth_end_date =", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateNotEqualTo(String value) {
            addCriterion("auth_end_date <>", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateGreaterThan(String value) {
            addCriterion("auth_end_date >", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("auth_end_date >=", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateLessThan(String value) {
            addCriterion("auth_end_date <", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateLessThanOrEqualTo(String value) {
            addCriterion("auth_end_date <=", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateLike(String value) {
            addCriterion("auth_end_date like", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateNotLike(String value) {
            addCriterion("auth_end_date not like", value, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateIn(List<String> values) {
            addCriterion("auth_end_date in", values, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateNotIn(List<String> values) {
            addCriterion("auth_end_date not in", values, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateBetween(String value1, String value2) {
            addCriterion("auth_end_date between", value1, value2, "authEndDate");
            return (Criteria) this;
        }

        public Criteria andAuthEndDateNotBetween(String value1, String value2) {
            addCriterion("auth_end_date not between", value1, value2, "authEndDate");
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