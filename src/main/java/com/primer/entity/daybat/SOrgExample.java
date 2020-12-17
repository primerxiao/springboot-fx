package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SOrgExample() {
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

        public Criteria andSuporgannoIsNull() {
            addCriterion("suporganno is null");
            return (Criteria) this;
        }

        public Criteria andSuporgannoIsNotNull() {
            addCriterion("suporganno is not null");
            return (Criteria) this;
        }

        public Criteria andSuporgannoEqualTo(String value) {
            addCriterion("suporganno =", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoNotEqualTo(String value) {
            addCriterion("suporganno <>", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoGreaterThan(String value) {
            addCriterion("suporganno >", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoGreaterThanOrEqualTo(String value) {
            addCriterion("suporganno >=", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoLessThan(String value) {
            addCriterion("suporganno <", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoLessThanOrEqualTo(String value) {
            addCriterion("suporganno <=", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoLike(String value) {
            addCriterion("suporganno like", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoNotLike(String value) {
            addCriterion("suporganno not like", value, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoIn(List<String> values) {
            addCriterion("suporganno in", values, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoNotIn(List<String> values) {
            addCriterion("suporganno not in", values, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoBetween(String value1, String value2) {
            addCriterion("suporganno between", value1, value2, "suporganno");
            return (Criteria) this;
        }

        public Criteria andSuporgannoNotBetween(String value1, String value2) {
            addCriterion("suporganno not between", value1, value2, "suporganno");
            return (Criteria) this;
        }

        public Criteria andLocateIsNull() {
            addCriterion("locate is null");
            return (Criteria) this;
        }

        public Criteria andLocateIsNotNull() {
            addCriterion("locate is not null");
            return (Criteria) this;
        }

        public Criteria andLocateEqualTo(String value) {
            addCriterion("locate =", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotEqualTo(String value) {
            addCriterion("locate <>", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThan(String value) {
            addCriterion("locate >", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThanOrEqualTo(String value) {
            addCriterion("locate >=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThan(String value) {
            addCriterion("locate <", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThanOrEqualTo(String value) {
            addCriterion("locate <=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLike(String value) {
            addCriterion("locate like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotLike(String value) {
            addCriterion("locate not like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateIn(List<String> values) {
            addCriterion("locate in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotIn(List<String> values) {
            addCriterion("locate not in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateBetween(String value1, String value2) {
            addCriterion("locate between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotBetween(String value1, String value2) {
            addCriterion("locate not between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNull() {
            addCriterion("organname is null");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNotNull() {
            addCriterion("organname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannameEqualTo(String value) {
            addCriterion("organname =", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotEqualTo(String value) {
            addCriterion("organname <>", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThan(String value) {
            addCriterion("organname >", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThanOrEqualTo(String value) {
            addCriterion("organname >=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThan(String value) {
            addCriterion("organname <", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThanOrEqualTo(String value) {
            addCriterion("organname <=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLike(String value) {
            addCriterion("organname like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotLike(String value) {
            addCriterion("organname not like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameIn(List<String> values) {
            addCriterion("organname in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotIn(List<String> values) {
            addCriterion("organname not in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameBetween(String value1, String value2) {
            addCriterion("organname between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotBetween(String value1, String value2) {
            addCriterion("organname not between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrganshortformIsNull() {
            addCriterion("organshortform is null");
            return (Criteria) this;
        }

        public Criteria andOrganshortformIsNotNull() {
            addCriterion("organshortform is not null");
            return (Criteria) this;
        }

        public Criteria andOrganshortformEqualTo(String value) {
            addCriterion("organshortform =", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformNotEqualTo(String value) {
            addCriterion("organshortform <>", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformGreaterThan(String value) {
            addCriterion("organshortform >", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformGreaterThanOrEqualTo(String value) {
            addCriterion("organshortform >=", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformLessThan(String value) {
            addCriterion("organshortform <", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformLessThanOrEqualTo(String value) {
            addCriterion("organshortform <=", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformLike(String value) {
            addCriterion("organshortform like", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformNotLike(String value) {
            addCriterion("organshortform not like", value, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformIn(List<String> values) {
            addCriterion("organshortform in", values, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformNotIn(List<String> values) {
            addCriterion("organshortform not in", values, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformBetween(String value1, String value2) {
            addCriterion("organshortform between", value1, value2, "organshortform");
            return (Criteria) this;
        }

        public Criteria andOrganshortformNotBetween(String value1, String value2) {
            addCriterion("organshortform not between", value1, value2, "organshortform");
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

        public Criteria andDistnoIsNull() {
            addCriterion("distno is null");
            return (Criteria) this;
        }

        public Criteria andDistnoIsNotNull() {
            addCriterion("distno is not null");
            return (Criteria) this;
        }

        public Criteria andDistnoEqualTo(String value) {
            addCriterion("distno =", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoNotEqualTo(String value) {
            addCriterion("distno <>", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoGreaterThan(String value) {
            addCriterion("distno >", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoGreaterThanOrEqualTo(String value) {
            addCriterion("distno >=", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoLessThan(String value) {
            addCriterion("distno <", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoLessThanOrEqualTo(String value) {
            addCriterion("distno <=", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoLike(String value) {
            addCriterion("distno like", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoNotLike(String value) {
            addCriterion("distno not like", value, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoIn(List<String> values) {
            addCriterion("distno in", values, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoNotIn(List<String> values) {
            addCriterion("distno not in", values, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoBetween(String value1, String value2) {
            addCriterion("distno between", value1, value2, "distno");
            return (Criteria) this;
        }

        public Criteria andDistnoNotBetween(String value1, String value2) {
            addCriterion("distno not between", value1, value2, "distno");
            return (Criteria) this;
        }

        public Criteria andLaunchdateIsNull() {
            addCriterion("launchdate is null");
            return (Criteria) this;
        }

        public Criteria andLaunchdateIsNotNull() {
            addCriterion("launchdate is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchdateEqualTo(String value) {
            addCriterion("launchdate =", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotEqualTo(String value) {
            addCriterion("launchdate <>", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateGreaterThan(String value) {
            addCriterion("launchdate >", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateGreaterThanOrEqualTo(String value) {
            addCriterion("launchdate >=", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateLessThan(String value) {
            addCriterion("launchdate <", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateLessThanOrEqualTo(String value) {
            addCriterion("launchdate <=", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateLike(String value) {
            addCriterion("launchdate like", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotLike(String value) {
            addCriterion("launchdate not like", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateIn(List<String> values) {
            addCriterion("launchdate in", values, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotIn(List<String> values) {
            addCriterion("launchdate not in", values, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateBetween(String value1, String value2) {
            addCriterion("launchdate between", value1, value2, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotBetween(String value1, String value2) {
            addCriterion("launchdate not between", value1, value2, "launchdate");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIsNull() {
            addCriterion("organlevel is null");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIsNotNull() {
            addCriterion("organlevel is not null");
            return (Criteria) this;
        }

        public Criteria andOrganlevelEqualTo(BigDecimal value) {
            addCriterion("organlevel =", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotEqualTo(BigDecimal value) {
            addCriterion("organlevel <>", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelGreaterThan(BigDecimal value) {
            addCriterion("organlevel >", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("organlevel >=", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelLessThan(BigDecimal value) {
            addCriterion("organlevel <", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("organlevel <=", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIn(List<BigDecimal> values) {
            addCriterion("organlevel in", values, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotIn(List<BigDecimal> values) {
            addCriterion("organlevel not in", values, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("organlevel between", value1, value2, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("organlevel not between", value1, value2, "organlevel");
            return (Criteria) this;
        }

        public Criteria andFincodeIsNull() {
            addCriterion("fincode is null");
            return (Criteria) this;
        }

        public Criteria andFincodeIsNotNull() {
            addCriterion("fincode is not null");
            return (Criteria) this;
        }

        public Criteria andFincodeEqualTo(String value) {
            addCriterion("fincode =", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeNotEqualTo(String value) {
            addCriterion("fincode <>", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeGreaterThan(String value) {
            addCriterion("fincode >", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeGreaterThanOrEqualTo(String value) {
            addCriterion("fincode >=", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeLessThan(String value) {
            addCriterion("fincode <", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeLessThanOrEqualTo(String value) {
            addCriterion("fincode <=", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeLike(String value) {
            addCriterion("fincode like", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeNotLike(String value) {
            addCriterion("fincode not like", value, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeIn(List<String> values) {
            addCriterion("fincode in", values, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeNotIn(List<String> values) {
            addCriterion("fincode not in", values, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeBetween(String value1, String value2) {
            addCriterion("fincode between", value1, value2, "fincode");
            return (Criteria) this;
        }

        public Criteria andFincodeNotBetween(String value1, String value2) {
            addCriterion("fincode not between", value1, value2, "fincode");
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

        public Criteria andOrganchiefIsNull() {
            addCriterion("organchief is null");
            return (Criteria) this;
        }

        public Criteria andOrganchiefIsNotNull() {
            addCriterion("organchief is not null");
            return (Criteria) this;
        }

        public Criteria andOrganchiefEqualTo(String value) {
            addCriterion("organchief =", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefNotEqualTo(String value) {
            addCriterion("organchief <>", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefGreaterThan(String value) {
            addCriterion("organchief >", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefGreaterThanOrEqualTo(String value) {
            addCriterion("organchief >=", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefLessThan(String value) {
            addCriterion("organchief <", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefLessThanOrEqualTo(String value) {
            addCriterion("organchief <=", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefLike(String value) {
            addCriterion("organchief like", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefNotLike(String value) {
            addCriterion("organchief not like", value, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefIn(List<String> values) {
            addCriterion("organchief in", values, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefNotIn(List<String> values) {
            addCriterion("organchief not in", values, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefBetween(String value1, String value2) {
            addCriterion("organchief between", value1, value2, "organchief");
            return (Criteria) this;
        }

        public Criteria andOrganchiefNotBetween(String value1, String value2) {
            addCriterion("organchief not between", value1, value2, "organchief");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andControlIsNull() {
            addCriterion("control is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("control is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("control =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("control <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("control >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("control >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("control <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("control <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("control like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("control not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("control in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("control not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("control between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("control not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoIsNull() {
            addCriterion("arti_organno is null");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoIsNotNull() {
            addCriterion("arti_organno is not null");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoEqualTo(String value) {
            addCriterion("arti_organno =", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoNotEqualTo(String value) {
            addCriterion("arti_organno <>", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoGreaterThan(String value) {
            addCriterion("arti_organno >", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoGreaterThanOrEqualTo(String value) {
            addCriterion("arti_organno >=", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoLessThan(String value) {
            addCriterion("arti_organno <", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoLessThanOrEqualTo(String value) {
            addCriterion("arti_organno <=", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoLike(String value) {
            addCriterion("arti_organno like", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoNotLike(String value) {
            addCriterion("arti_organno not like", value, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoIn(List<String> values) {
            addCriterion("arti_organno in", values, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoNotIn(List<String> values) {
            addCriterion("arti_organno not in", values, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoBetween(String value1, String value2) {
            addCriterion("arti_organno between", value1, value2, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andArtiOrgannoNotBetween(String value1, String value2) {
            addCriterion("arti_organno not between", value1, value2, "artiOrganno");
            return (Criteria) this;
        }

        public Criteria andDistnameIsNull() {
            addCriterion("distname is null");
            return (Criteria) this;
        }

        public Criteria andDistnameIsNotNull() {
            addCriterion("distname is not null");
            return (Criteria) this;
        }

        public Criteria andDistnameEqualTo(String value) {
            addCriterion("distname =", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameNotEqualTo(String value) {
            addCriterion("distname <>", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameGreaterThan(String value) {
            addCriterion("distname >", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameGreaterThanOrEqualTo(String value) {
            addCriterion("distname >=", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameLessThan(String value) {
            addCriterion("distname <", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameLessThanOrEqualTo(String value) {
            addCriterion("distname <=", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameLike(String value) {
            addCriterion("distname like", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameNotLike(String value) {
            addCriterion("distname not like", value, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameIn(List<String> values) {
            addCriterion("distname in", values, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameNotIn(List<String> values) {
            addCriterion("distname not in", values, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameBetween(String value1, String value2) {
            addCriterion("distname between", value1, value2, "distname");
            return (Criteria) this;
        }

        public Criteria andDistnameNotBetween(String value1, String value2) {
            addCriterion("distname not between", value1, value2, "distname");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeIsNull() {
            addCriterion("area_dev_cate_type is null");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeIsNotNull() {
            addCriterion("area_dev_cate_type is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeEqualTo(String value) {
            addCriterion("area_dev_cate_type =", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeNotEqualTo(String value) {
            addCriterion("area_dev_cate_type <>", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeGreaterThan(String value) {
            addCriterion("area_dev_cate_type >", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("area_dev_cate_type >=", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeLessThan(String value) {
            addCriterion("area_dev_cate_type <", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeLessThanOrEqualTo(String value) {
            addCriterion("area_dev_cate_type <=", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeLike(String value) {
            addCriterion("area_dev_cate_type like", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeNotLike(String value) {
            addCriterion("area_dev_cate_type not like", value, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeIn(List<String> values) {
            addCriterion("area_dev_cate_type in", values, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeNotIn(List<String> values) {
            addCriterion("area_dev_cate_type not in", values, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeBetween(String value1, String value2) {
            addCriterion("area_dev_cate_type between", value1, value2, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andAreaDevCateTypeNotBetween(String value1, String value2) {
            addCriterion("area_dev_cate_type not between", value1, value2, "areaDevCateType");
            return (Criteria) this;
        }

        public Criteria andIsMarketingIsNull() {
            addCriterion("is_marketing is null");
            return (Criteria) this;
        }

        public Criteria andIsMarketingIsNotNull() {
            addCriterion("is_marketing is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarketingEqualTo(String value) {
            addCriterion("is_marketing =", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingNotEqualTo(String value) {
            addCriterion("is_marketing <>", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingGreaterThan(String value) {
            addCriterion("is_marketing >", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingGreaterThanOrEqualTo(String value) {
            addCriterion("is_marketing >=", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingLessThan(String value) {
            addCriterion("is_marketing <", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingLessThanOrEqualTo(String value) {
            addCriterion("is_marketing <=", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingLike(String value) {
            addCriterion("is_marketing like", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingNotLike(String value) {
            addCriterion("is_marketing not like", value, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingIn(List<String> values) {
            addCriterion("is_marketing in", values, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingNotIn(List<String> values) {
            addCriterion("is_marketing not in", values, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingBetween(String value1, String value2) {
            addCriterion("is_marketing between", value1, value2, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andIsMarketingNotBetween(String value1, String value2) {
            addCriterion("is_marketing not between", value1, value2, "isMarketing");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoIsNull() {
            addCriterion("busiorganno is null");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoIsNotNull() {
            addCriterion("busiorganno is not null");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoEqualTo(String value) {
            addCriterion("busiorganno =", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoNotEqualTo(String value) {
            addCriterion("busiorganno <>", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoGreaterThan(String value) {
            addCriterion("busiorganno >", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoGreaterThanOrEqualTo(String value) {
            addCriterion("busiorganno >=", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoLessThan(String value) {
            addCriterion("busiorganno <", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoLessThanOrEqualTo(String value) {
            addCriterion("busiorganno <=", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoLike(String value) {
            addCriterion("busiorganno like", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoNotLike(String value) {
            addCriterion("busiorganno not like", value, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoIn(List<String> values) {
            addCriterion("busiorganno in", values, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoNotIn(List<String> values) {
            addCriterion("busiorganno not in", values, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoBetween(String value1, String value2) {
            addCriterion("busiorganno between", value1, value2, "busiorganno");
            return (Criteria) this;
        }

        public Criteria andBusiorgannoNotBetween(String value1, String value2) {
            addCriterion("busiorganno not between", value1, value2, "busiorganno");
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