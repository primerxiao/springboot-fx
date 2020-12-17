package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class BatTaskLocaleConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BatTaskLocaleConfigExample() {
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

        public Criteria andLocaleIdIsNull() {
            addCriterion("locale_id is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIdIsNotNull() {
            addCriterion("locale_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleIdEqualTo(String value) {
            addCriterion("locale_id =", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdNotEqualTo(String value) {
            addCriterion("locale_id <>", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdGreaterThan(String value) {
            addCriterion("locale_id >", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("locale_id >=", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdLessThan(String value) {
            addCriterion("locale_id <", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdLessThanOrEqualTo(String value) {
            addCriterion("locale_id <=", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdLike(String value) {
            addCriterion("locale_id like", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdNotLike(String value) {
            addCriterion("locale_id not like", value, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdIn(List<String> values) {
            addCriterion("locale_id in", values, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdNotIn(List<String> values) {
            addCriterion("locale_id not in", values, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdBetween(String value1, String value2) {
            addCriterion("locale_id between", value1, value2, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleIdNotBetween(String value1, String value2) {
            addCriterion("locale_id not between", value1, value2, "localeId");
            return (Criteria) this;
        }

        public Criteria andLocaleNameIsNull() {
            addCriterion("locale_name is null");
            return (Criteria) this;
        }

        public Criteria andLocaleNameIsNotNull() {
            addCriterion("locale_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleNameEqualTo(String value) {
            addCriterion("locale_name =", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameNotEqualTo(String value) {
            addCriterion("locale_name <>", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameGreaterThan(String value) {
            addCriterion("locale_name >", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("locale_name >=", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameLessThan(String value) {
            addCriterion("locale_name <", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameLessThanOrEqualTo(String value) {
            addCriterion("locale_name <=", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameLike(String value) {
            addCriterion("locale_name like", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameNotLike(String value) {
            addCriterion("locale_name not like", value, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameIn(List<String> values) {
            addCriterion("locale_name in", values, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameNotIn(List<String> values) {
            addCriterion("locale_name not in", values, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameBetween(String value1, String value2) {
            addCriterion("locale_name between", value1, value2, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleNameNotBetween(String value1, String value2) {
            addCriterion("locale_name not between", value1, value2, "localeName");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeIsNull() {
            addCriterion("locale_type is null");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeIsNotNull() {
            addCriterion("locale_type is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeEqualTo(String value) {
            addCriterion("locale_type =", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeNotEqualTo(String value) {
            addCriterion("locale_type <>", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeGreaterThan(String value) {
            addCriterion("locale_type >", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("locale_type >=", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeLessThan(String value) {
            addCriterion("locale_type <", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeLessThanOrEqualTo(String value) {
            addCriterion("locale_type <=", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeLike(String value) {
            addCriterion("locale_type like", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeNotLike(String value) {
            addCriterion("locale_type not like", value, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeIn(List<String> values) {
            addCriterion("locale_type in", values, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeNotIn(List<String> values) {
            addCriterion("locale_type not in", values, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeBetween(String value1, String value2) {
            addCriterion("locale_type between", value1, value2, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleTypeNotBetween(String value1, String value2) {
            addCriterion("locale_type not between", value1, value2, "localeType");
            return (Criteria) this;
        }

        public Criteria andLocaleIpIsNull() {
            addCriterion("locale_ip is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIpIsNotNull() {
            addCriterion("locale_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleIpEqualTo(String value) {
            addCriterion("locale_ip =", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpNotEqualTo(String value) {
            addCriterion("locale_ip <>", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpGreaterThan(String value) {
            addCriterion("locale_ip >", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpGreaterThanOrEqualTo(String value) {
            addCriterion("locale_ip >=", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpLessThan(String value) {
            addCriterion("locale_ip <", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpLessThanOrEqualTo(String value) {
            addCriterion("locale_ip <=", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpLike(String value) {
            addCriterion("locale_ip like", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpNotLike(String value) {
            addCriterion("locale_ip not like", value, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpIn(List<String> values) {
            addCriterion("locale_ip in", values, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpNotIn(List<String> values) {
            addCriterion("locale_ip not in", values, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpBetween(String value1, String value2) {
            addCriterion("locale_ip between", value1, value2, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIpNotBetween(String value1, String value2) {
            addCriterion("locale_ip not between", value1, value2, "localeIp");
            return (Criteria) this;
        }

        public Criteria andLocalePortIsNull() {
            addCriterion("locale_port is null");
            return (Criteria) this;
        }

        public Criteria andLocalePortIsNotNull() {
            addCriterion("locale_port is not null");
            return (Criteria) this;
        }

        public Criteria andLocalePortEqualTo(String value) {
            addCriterion("locale_port =", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortNotEqualTo(String value) {
            addCriterion("locale_port <>", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortGreaterThan(String value) {
            addCriterion("locale_port >", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortGreaterThanOrEqualTo(String value) {
            addCriterion("locale_port >=", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortLessThan(String value) {
            addCriterion("locale_port <", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortLessThanOrEqualTo(String value) {
            addCriterion("locale_port <=", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortLike(String value) {
            addCriterion("locale_port like", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortNotLike(String value) {
            addCriterion("locale_port not like", value, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortIn(List<String> values) {
            addCriterion("locale_port in", values, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortNotIn(List<String> values) {
            addCriterion("locale_port not in", values, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortBetween(String value1, String value2) {
            addCriterion("locale_port between", value1, value2, "localePort");
            return (Criteria) this;
        }

        public Criteria andLocalePortNotBetween(String value1, String value2) {
            addCriterion("locale_port not between", value1, value2, "localePort");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(String value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(String value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(String value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(String value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLike(String value) {
            addCriterion("login_type like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotLike(String value) {
            addCriterion("login_type not like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<String> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<String> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(String value1, String value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(String value1, String value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNull() {
            addCriterion("login_user is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNotNull() {
            addCriterion("login_user is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserEqualTo(String value) {
            addCriterion("login_user =", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotEqualTo(String value) {
            addCriterion("login_user <>", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThan(String value) {
            addCriterion("login_user >", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThanOrEqualTo(String value) {
            addCriterion("login_user >=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThan(String value) {
            addCriterion("login_user <", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThanOrEqualTo(String value) {
            addCriterion("login_user <=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLike(String value) {
            addCriterion("login_user like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotLike(String value) {
            addCriterion("login_user not like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserIn(List<String> values) {
            addCriterion("login_user in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotIn(List<String> values) {
            addCriterion("login_user not in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserBetween(String value1, String value2) {
            addCriterion("login_user between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotBetween(String value1, String value2) {
            addCriterion("login_user not between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
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