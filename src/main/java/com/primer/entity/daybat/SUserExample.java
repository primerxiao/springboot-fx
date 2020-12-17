package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SUserExample() {
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

        public Criteria andEnnameIsNull() {
            addCriterion("enname is null");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNotNull() {
            addCriterion("enname is not null");
            return (Criteria) this;
        }

        public Criteria andEnnameEqualTo(String value) {
            addCriterion("enname =", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotEqualTo(String value) {
            addCriterion("enname <>", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThan(String value) {
            addCriterion("enname >", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("enname >=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThan(String value) {
            addCriterion("enname <", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThanOrEqualTo(String value) {
            addCriterion("enname <=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLike(String value) {
            addCriterion("enname like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotLike(String value) {
            addCriterion("enname not like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameIn(List<String> values) {
            addCriterion("enname in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotIn(List<String> values) {
            addCriterion("enname not in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameBetween(String value1, String value2) {
            addCriterion("enname between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotBetween(String value1, String value2) {
            addCriterion("enname not between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andActornameIsNull() {
            addCriterion("actorname is null");
            return (Criteria) this;
        }

        public Criteria andActornameIsNotNull() {
            addCriterion("actorname is not null");
            return (Criteria) this;
        }

        public Criteria andActornameEqualTo(String value) {
            addCriterion("actorname =", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotEqualTo(String value) {
            addCriterion("actorname <>", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameGreaterThan(String value) {
            addCriterion("actorname >", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameGreaterThanOrEqualTo(String value) {
            addCriterion("actorname >=", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLessThan(String value) {
            addCriterion("actorname <", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLessThanOrEqualTo(String value) {
            addCriterion("actorname <=", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameLike(String value) {
            addCriterion("actorname like", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotLike(String value) {
            addCriterion("actorname not like", value, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameIn(List<String> values) {
            addCriterion("actorname in", values, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotIn(List<String> values) {
            addCriterion("actorname not in", values, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameBetween(String value1, String value2) {
            addCriterion("actorname between", value1, value2, "actorname");
            return (Criteria) this;
        }

        public Criteria andActornameNotBetween(String value1, String value2) {
            addCriterion("actorname not between", value1, value2, "actorname");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startdate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startdate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaIsNull() {
            addCriterion("passwvalda is null");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaIsNotNull() {
            addCriterion("passwvalda is not null");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaEqualTo(String value) {
            addCriterion("passwvalda =", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaNotEqualTo(String value) {
            addCriterion("passwvalda <>", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaGreaterThan(String value) {
            addCriterion("passwvalda >", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaGreaterThanOrEqualTo(String value) {
            addCriterion("passwvalda >=", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaLessThan(String value) {
            addCriterion("passwvalda <", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaLessThanOrEqualTo(String value) {
            addCriterion("passwvalda <=", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaLike(String value) {
            addCriterion("passwvalda like", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaNotLike(String value) {
            addCriterion("passwvalda not like", value, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaIn(List<String> values) {
            addCriterion("passwvalda in", values, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaNotIn(List<String> values) {
            addCriterion("passwvalda not in", values, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaBetween(String value1, String value2) {
            addCriterion("passwvalda between", value1, value2, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andPasswvaldaNotBetween(String value1, String value2) {
            addCriterion("passwvalda not between", value1, value2, "passwvalda");
            return (Criteria) this;
        }

        public Criteria andFiredateIsNull() {
            addCriterion("firedate is null");
            return (Criteria) this;
        }

        public Criteria andFiredateIsNotNull() {
            addCriterion("firedate is not null");
            return (Criteria) this;
        }

        public Criteria andFiredateEqualTo(String value) {
            addCriterion("firedate =", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateNotEqualTo(String value) {
            addCriterion("firedate <>", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateGreaterThan(String value) {
            addCriterion("firedate >", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateGreaterThanOrEqualTo(String value) {
            addCriterion("firedate >=", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateLessThan(String value) {
            addCriterion("firedate <", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateLessThanOrEqualTo(String value) {
            addCriterion("firedate <=", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateLike(String value) {
            addCriterion("firedate like", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateNotLike(String value) {
            addCriterion("firedate not like", value, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateIn(List<String> values) {
            addCriterion("firedate in", values, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateNotIn(List<String> values) {
            addCriterion("firedate not in", values, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateBetween(String value1, String value2) {
            addCriterion("firedate between", value1, value2, "firedate");
            return (Criteria) this;
        }

        public Criteria andFiredateNotBetween(String value1, String value2) {
            addCriterion("firedate not between", value1, value2, "firedate");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("telnum is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("telnum is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(String value) {
            addCriterion("telnum =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(String value) {
            addCriterion("telnum <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(String value) {
            addCriterion("telnum >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("telnum >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(String value) {
            addCriterion("telnum <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(String value) {
            addCriterion("telnum <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLike(String value) {
            addCriterion("telnum like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotLike(String value) {
            addCriterion("telnum not like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<String> values) {
            addCriterion("telnum in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<String> values) {
            addCriterion("telnum not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(String value1, String value2) {
            addCriterion("telnum between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(String value1, String value2) {
            addCriterion("telnum not between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idcardno is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idcardno is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idcardno =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idcardno <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idcardno >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idcardno >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idcardno <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idcardno <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idcardno like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idcardno not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idcardno in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idcardno not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idcardno between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idcardno not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andAllowopersysIsNull() {
            addCriterion("allowopersys is null");
            return (Criteria) this;
        }

        public Criteria andAllowopersysIsNotNull() {
            addCriterion("allowopersys is not null");
            return (Criteria) this;
        }

        public Criteria andAllowopersysEqualTo(String value) {
            addCriterion("allowopersys =", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysNotEqualTo(String value) {
            addCriterion("allowopersys <>", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysGreaterThan(String value) {
            addCriterion("allowopersys >", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysGreaterThanOrEqualTo(String value) {
            addCriterion("allowopersys >=", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysLessThan(String value) {
            addCriterion("allowopersys <", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysLessThanOrEqualTo(String value) {
            addCriterion("allowopersys <=", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysLike(String value) {
            addCriterion("allowopersys like", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysNotLike(String value) {
            addCriterion("allowopersys not like", value, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysIn(List<String> values) {
            addCriterion("allowopersys in", values, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysNotIn(List<String> values) {
            addCriterion("allowopersys not in", values, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysBetween(String value1, String value2) {
            addCriterion("allowopersys between", value1, value2, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andAllowopersysNotBetween(String value1, String value2) {
            addCriterion("allowopersys not between", value1, value2, "allowopersys");
            return (Criteria) this;
        }

        public Criteria andLastlogdatIsNull() {
            addCriterion("lastlogdat is null");
            return (Criteria) this;
        }

        public Criteria andLastlogdatIsNotNull() {
            addCriterion("lastlogdat is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogdatEqualTo(String value) {
            addCriterion("lastlogdat =", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatNotEqualTo(String value) {
            addCriterion("lastlogdat <>", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatGreaterThan(String value) {
            addCriterion("lastlogdat >", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatGreaterThanOrEqualTo(String value) {
            addCriterion("lastlogdat >=", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatLessThan(String value) {
            addCriterion("lastlogdat <", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatLessThanOrEqualTo(String value) {
            addCriterion("lastlogdat <=", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatLike(String value) {
            addCriterion("lastlogdat like", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatNotLike(String value) {
            addCriterion("lastlogdat not like", value, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatIn(List<String> values) {
            addCriterion("lastlogdat in", values, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatNotIn(List<String> values) {
            addCriterion("lastlogdat not in", values, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatBetween(String value1, String value2) {
            addCriterion("lastlogdat between", value1, value2, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andLastlogdatNotBetween(String value1, String value2) {
            addCriterion("lastlogdat not between", value1, value2, "lastlogdat");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(String value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(String value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(String value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(String value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(String value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLike(String value) {
            addCriterion("creattime like", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotLike(String value) {
            addCriterion("creattime not like", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<String> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<String> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(String value1, String value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(String value1, String value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andUsermailIsNull() {
            addCriterion("usermail is null");
            return (Criteria) this;
        }

        public Criteria andUsermailIsNotNull() {
            addCriterion("usermail is not null");
            return (Criteria) this;
        }

        public Criteria andUsermailEqualTo(String value) {
            addCriterion("usermail =", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotEqualTo(String value) {
            addCriterion("usermail <>", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThan(String value) {
            addCriterion("usermail >", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThanOrEqualTo(String value) {
            addCriterion("usermail >=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThan(String value) {
            addCriterion("usermail <", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThanOrEqualTo(String value) {
            addCriterion("usermail <=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLike(String value) {
            addCriterion("usermail like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotLike(String value) {
            addCriterion("usermail not like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailIn(List<String> values) {
            addCriterion("usermail in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotIn(List<String> values) {
            addCriterion("usermail not in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailBetween(String value1, String value2) {
            addCriterion("usermail between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotBetween(String value1, String value2) {
            addCriterion("usermail not between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumIsNull() {
            addCriterion("wrongpinnum is null");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumIsNotNull() {
            addCriterion("wrongpinnum is not null");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumEqualTo(BigDecimal value) {
            addCriterion("wrongpinnum =", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumNotEqualTo(BigDecimal value) {
            addCriterion("wrongpinnum <>", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumGreaterThan(BigDecimal value) {
            addCriterion("wrongpinnum >", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wrongpinnum >=", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumLessThan(BigDecimal value) {
            addCriterion("wrongpinnum <", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wrongpinnum <=", value, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumIn(List<BigDecimal> values) {
            addCriterion("wrongpinnum in", values, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumNotIn(List<BigDecimal> values) {
            addCriterion("wrongpinnum not in", values, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wrongpinnum between", value1, value2, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andWrongpinnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wrongpinnum not between", value1, value2, "wrongpinnum");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("isadmin is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("isadmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(String value) {
            addCriterion("isadmin =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(String value) {
            addCriterion("isadmin <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(String value) {
            addCriterion("isadmin >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(String value) {
            addCriterion("isadmin >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(String value) {
            addCriterion("isadmin <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(String value) {
            addCriterion("isadmin <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLike(String value) {
            addCriterion("isadmin like", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotLike(String value) {
            addCriterion("isadmin not like", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<String> values) {
            addCriterion("isadmin in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<String> values) {
            addCriterion("isadmin not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(String value1, String value2) {
            addCriterion("isadmin between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(String value1, String value2) {
            addCriterion("isadmin not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIpmaskIsNull() {
            addCriterion("ipmask is null");
            return (Criteria) this;
        }

        public Criteria andIpmaskIsNotNull() {
            addCriterion("ipmask is not null");
            return (Criteria) this;
        }

        public Criteria andIpmaskEqualTo(String value) {
            addCriterion("ipmask =", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskNotEqualTo(String value) {
            addCriterion("ipmask <>", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskGreaterThan(String value) {
            addCriterion("ipmask >", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskGreaterThanOrEqualTo(String value) {
            addCriterion("ipmask >=", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskLessThan(String value) {
            addCriterion("ipmask <", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskLessThanOrEqualTo(String value) {
            addCriterion("ipmask <=", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskLike(String value) {
            addCriterion("ipmask like", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskNotLike(String value) {
            addCriterion("ipmask not like", value, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskIn(List<String> values) {
            addCriterion("ipmask in", values, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskNotIn(List<String> values) {
            addCriterion("ipmask not in", values, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskBetween(String value1, String value2) {
            addCriterion("ipmask between", value1, value2, "ipmask");
            return (Criteria) this;
        }

        public Criteria andIpmaskNotBetween(String value1, String value2) {
            addCriterion("ipmask not between", value1, value2, "ipmask");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(BigDecimal value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(BigDecimal value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(BigDecimal value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(BigDecimal value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<BigDecimal> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<BigDecimal> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
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

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("`rank` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`rank` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("`rank` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("`rank` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("`rank` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("`rank` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("`rank` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("`rank` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("`rank` like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("`rank` not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("`rank` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("`rank` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("`rank` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("`rank` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andParentactornoIsNull() {
            addCriterion("parentactorno is null");
            return (Criteria) this;
        }

        public Criteria andParentactornoIsNotNull() {
            addCriterion("parentactorno is not null");
            return (Criteria) this;
        }

        public Criteria andParentactornoEqualTo(String value) {
            addCriterion("parentactorno =", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoNotEqualTo(String value) {
            addCriterion("parentactorno <>", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoGreaterThan(String value) {
            addCriterion("parentactorno >", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoGreaterThanOrEqualTo(String value) {
            addCriterion("parentactorno >=", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoLessThan(String value) {
            addCriterion("parentactorno <", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoLessThanOrEqualTo(String value) {
            addCriterion("parentactorno <=", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoLike(String value) {
            addCriterion("parentactorno like", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoNotLike(String value) {
            addCriterion("parentactorno not like", value, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoIn(List<String> values) {
            addCriterion("parentactorno in", values, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoNotIn(List<String> values) {
            addCriterion("parentactorno not in", values, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoBetween(String value1, String value2) {
            addCriterion("parentactorno between", value1, value2, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andParentactornoNotBetween(String value1, String value2) {
            addCriterion("parentactorno not between", value1, value2, "parentactorno");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowIsNull() {
            addCriterion("is_priority_show is null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowIsNotNull() {
            addCriterion("is_priority_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowEqualTo(String value) {
            addCriterion("is_priority_show =", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowNotEqualTo(String value) {
            addCriterion("is_priority_show <>", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowGreaterThan(String value) {
            addCriterion("is_priority_show >", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowGreaterThanOrEqualTo(String value) {
            addCriterion("is_priority_show >=", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowLessThan(String value) {
            addCriterion("is_priority_show <", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowLessThanOrEqualTo(String value) {
            addCriterion("is_priority_show <=", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowLike(String value) {
            addCriterion("is_priority_show like", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowNotLike(String value) {
            addCriterion("is_priority_show not like", value, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowIn(List<String> values) {
            addCriterion("is_priority_show in", values, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowNotIn(List<String> values) {
            addCriterion("is_priority_show not in", values, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowBetween(String value1, String value2) {
            addCriterion("is_priority_show between", value1, value2, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIsPriorityShowNotBetween(String value1, String value2) {
            addCriterion("is_priority_show not between", value1, value2, "isPriorityShow");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfIsNull() {
            addCriterion("if_together_wf is null");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfIsNotNull() {
            addCriterion("if_together_wf is not null");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfEqualTo(String value) {
            addCriterion("if_together_wf =", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfNotEqualTo(String value) {
            addCriterion("if_together_wf <>", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfGreaterThan(String value) {
            addCriterion("if_together_wf >", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfGreaterThanOrEqualTo(String value) {
            addCriterion("if_together_wf >=", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfLessThan(String value) {
            addCriterion("if_together_wf <", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfLessThanOrEqualTo(String value) {
            addCriterion("if_together_wf <=", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfLike(String value) {
            addCriterion("if_together_wf like", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfNotLike(String value) {
            addCriterion("if_together_wf not like", value, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfIn(List<String> values) {
            addCriterion("if_together_wf in", values, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfNotIn(List<String> values) {
            addCriterion("if_together_wf not in", values, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfBetween(String value1, String value2) {
            addCriterion("if_together_wf between", value1, value2, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andIfTogetherWfNotBetween(String value1, String value2) {
            addCriterion("if_together_wf not between", value1, value2, "ifTogetherWf");
            return (Criteria) this;
        }

        public Criteria andOpModelIsNull() {
            addCriterion("op_model is null");
            return (Criteria) this;
        }

        public Criteria andOpModelIsNotNull() {
            addCriterion("op_model is not null");
            return (Criteria) this;
        }

        public Criteria andOpModelEqualTo(String value) {
            addCriterion("op_model =", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelNotEqualTo(String value) {
            addCriterion("op_model <>", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelGreaterThan(String value) {
            addCriterion("op_model >", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelGreaterThanOrEqualTo(String value) {
            addCriterion("op_model >=", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelLessThan(String value) {
            addCriterion("op_model <", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelLessThanOrEqualTo(String value) {
            addCriterion("op_model <=", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelLike(String value) {
            addCriterion("op_model like", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelNotLike(String value) {
            addCriterion("op_model not like", value, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelIn(List<String> values) {
            addCriterion("op_model in", values, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelNotIn(List<String> values) {
            addCriterion("op_model not in", values, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelBetween(String value1, String value2) {
            addCriterion("op_model between", value1, value2, "opModel");
            return (Criteria) this;
        }

        public Criteria andOpModelNotBetween(String value1, String value2) {
            addCriterion("op_model not between", value1, value2, "opModel");
            return (Criteria) this;
        }

        public Criteria andMobNumIsNull() {
            addCriterion("mob_num is null");
            return (Criteria) this;
        }

        public Criteria andMobNumIsNotNull() {
            addCriterion("mob_num is not null");
            return (Criteria) this;
        }

        public Criteria andMobNumEqualTo(String value) {
            addCriterion("mob_num =", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumNotEqualTo(String value) {
            addCriterion("mob_num <>", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumGreaterThan(String value) {
            addCriterion("mob_num >", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumGreaterThanOrEqualTo(String value) {
            addCriterion("mob_num >=", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumLessThan(String value) {
            addCriterion("mob_num <", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumLessThanOrEqualTo(String value) {
            addCriterion("mob_num <=", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumLike(String value) {
            addCriterion("mob_num like", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumNotLike(String value) {
            addCriterion("mob_num not like", value, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumIn(List<String> values) {
            addCriterion("mob_num in", values, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumNotIn(List<String> values) {
            addCriterion("mob_num not in", values, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumBetween(String value1, String value2) {
            addCriterion("mob_num between", value1, value2, "mobNum");
            return (Criteria) this;
        }

        public Criteria andMobNumNotBetween(String value1, String value2) {
            addCriterion("mob_num not between", value1, value2, "mobNum");
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