package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PubSysInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PubSysInfoExample() {
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

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("sys_id like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("sys_id not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
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

        public Criteria andHeadofficeIsNull() {
            addCriterion("headoffice is null");
            return (Criteria) this;
        }

        public Criteria andHeadofficeIsNotNull() {
            addCriterion("headoffice is not null");
            return (Criteria) this;
        }

        public Criteria andHeadofficeEqualTo(String value) {
            addCriterion("headoffice =", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeNotEqualTo(String value) {
            addCriterion("headoffice <>", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeGreaterThan(String value) {
            addCriterion("headoffice >", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeGreaterThanOrEqualTo(String value) {
            addCriterion("headoffice >=", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeLessThan(String value) {
            addCriterion("headoffice <", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeLessThanOrEqualTo(String value) {
            addCriterion("headoffice <=", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeLike(String value) {
            addCriterion("headoffice like", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeNotLike(String value) {
            addCriterion("headoffice not like", value, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeIn(List<String> values) {
            addCriterion("headoffice in", values, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeNotIn(List<String> values) {
            addCriterion("headoffice not in", values, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeBetween(String value1, String value2) {
            addCriterion("headoffice between", value1, value2, "headoffice");
            return (Criteria) this;
        }

        public Criteria andHeadofficeNotBetween(String value1, String value2) {
            addCriterion("headoffice not between", value1, value2, "headoffice");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(String value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(String value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(String value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(String value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(String value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(String value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLike(String value) {
            addCriterion("progress like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotLike(String value) {
            addCriterion("progress not like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<String> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<String> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(String value1, String value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(String value1, String value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andOpendayIsNull() {
            addCriterion("openday is null");
            return (Criteria) this;
        }

        public Criteria andOpendayIsNotNull() {
            addCriterion("openday is not null");
            return (Criteria) this;
        }

        public Criteria andOpendayEqualTo(String value) {
            addCriterion("openday =", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayNotEqualTo(String value) {
            addCriterion("openday <>", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayGreaterThan(String value) {
            addCriterion("openday >", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayGreaterThanOrEqualTo(String value) {
            addCriterion("openday >=", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayLessThan(String value) {
            addCriterion("openday <", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayLessThanOrEqualTo(String value) {
            addCriterion("openday <=", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayLike(String value) {
            addCriterion("openday like", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayNotLike(String value) {
            addCriterion("openday not like", value, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayIn(List<String> values) {
            addCriterion("openday in", values, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayNotIn(List<String> values) {
            addCriterion("openday not in", values, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayBetween(String value1, String value2) {
            addCriterion("openday between", value1, value2, "openday");
            return (Criteria) this;
        }

        public Criteria andOpendayNotBetween(String value1, String value2) {
            addCriterion("openday not between", value1, value2, "openday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayIsNull() {
            addCriterion("last_openday is null");
            return (Criteria) this;
        }

        public Criteria andLastOpendayIsNotNull() {
            addCriterion("last_openday is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpendayEqualTo(String value) {
            addCriterion("last_openday =", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayNotEqualTo(String value) {
            addCriterion("last_openday <>", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayGreaterThan(String value) {
            addCriterion("last_openday >", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayGreaterThanOrEqualTo(String value) {
            addCriterion("last_openday >=", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayLessThan(String value) {
            addCriterion("last_openday <", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayLessThanOrEqualTo(String value) {
            addCriterion("last_openday <=", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayLike(String value) {
            addCriterion("last_openday like", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayNotLike(String value) {
            addCriterion("last_openday not like", value, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayIn(List<String> values) {
            addCriterion("last_openday in", values, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayNotIn(List<String> values) {
            addCriterion("last_openday not in", values, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayBetween(String value1, String value2) {
            addCriterion("last_openday between", value1, value2, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andLastOpendayNotBetween(String value1, String value2) {
            addCriterion("last_openday not between", value1, value2, "lastOpenday");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIsNull() {
            addCriterion("effectivedays is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIsNotNull() {
            addCriterion("effectivedays is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysEqualTo(BigDecimal value) {
            addCriterion("effectivedays =", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotEqualTo(BigDecimal value) {
            addCriterion("effectivedays <>", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThan(BigDecimal value) {
            addCriterion("effectivedays >", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effectivedays >=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThan(BigDecimal value) {
            addCriterion("effectivedays <", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effectivedays <=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIn(List<BigDecimal> values) {
            addCriterion("effectivedays in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotIn(List<BigDecimal> values) {
            addCriterion("effectivedays not in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effectivedays between", value1, value2, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effectivedays not between", value1, value2, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNull() {
            addCriterion("sys_status is null");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNotNull() {
            addCriterion("sys_status is not null");
            return (Criteria) this;
        }

        public Criteria andSysStatusEqualTo(String value) {
            addCriterion("sys_status =", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotEqualTo(String value) {
            addCriterion("sys_status <>", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThan(String value) {
            addCriterion("sys_status >", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sys_status >=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThan(String value) {
            addCriterion("sys_status <", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThanOrEqualTo(String value) {
            addCriterion("sys_status <=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLike(String value) {
            addCriterion("sys_status like", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotLike(String value) {
            addCriterion("sys_status not like", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusIn(List<String> values) {
            addCriterion("sys_status in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotIn(List<String> values) {
            addCriterion("sys_status not in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusBetween(String value1, String value2) {
            addCriterion("sys_status between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotBetween(String value1, String value2) {
            addCriterion("sys_status not between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andLoginmodeIsNull() {
            addCriterion("loginmode is null");
            return (Criteria) this;
        }

        public Criteria andLoginmodeIsNotNull() {
            addCriterion("loginmode is not null");
            return (Criteria) this;
        }

        public Criteria andLoginmodeEqualTo(String value) {
            addCriterion("loginmode =", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeNotEqualTo(String value) {
            addCriterion("loginmode <>", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeGreaterThan(String value) {
            addCriterion("loginmode >", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeGreaterThanOrEqualTo(String value) {
            addCriterion("loginmode >=", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeLessThan(String value) {
            addCriterion("loginmode <", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeLessThanOrEqualTo(String value) {
            addCriterion("loginmode <=", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeLike(String value) {
            addCriterion("loginmode like", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeNotLike(String value) {
            addCriterion("loginmode not like", value, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeIn(List<String> values) {
            addCriterion("loginmode in", values, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeNotIn(List<String> values) {
            addCriterion("loginmode not in", values, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeBetween(String value1, String value2) {
            addCriterion("loginmode between", value1, value2, "loginmode");
            return (Criteria) this;
        }

        public Criteria andLoginmodeNotBetween(String value1, String value2) {
            addCriterion("loginmode not between", value1, value2, "loginmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeIsNull() {
            addCriterion("slmode is null");
            return (Criteria) this;
        }

        public Criteria andSlmodeIsNotNull() {
            addCriterion("slmode is not null");
            return (Criteria) this;
        }

        public Criteria andSlmodeEqualTo(String value) {
            addCriterion("slmode =", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeNotEqualTo(String value) {
            addCriterion("slmode <>", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeGreaterThan(String value) {
            addCriterion("slmode >", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeGreaterThanOrEqualTo(String value) {
            addCriterion("slmode >=", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeLessThan(String value) {
            addCriterion("slmode <", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeLessThanOrEqualTo(String value) {
            addCriterion("slmode <=", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeLike(String value) {
            addCriterion("slmode like", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeNotLike(String value) {
            addCriterion("slmode not like", value, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeIn(List<String> values) {
            addCriterion("slmode in", values, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeNotIn(List<String> values) {
            addCriterion("slmode not in", values, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeBetween(String value1, String value2) {
            addCriterion("slmode between", value1, value2, "slmode");
            return (Criteria) this;
        }

        public Criteria andSlmodeNotBetween(String value1, String value2) {
            addCriterion("slmode not between", value1, value2, "slmode");
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