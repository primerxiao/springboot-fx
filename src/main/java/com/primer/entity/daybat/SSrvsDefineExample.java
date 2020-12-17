package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SSrvsDefineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSrvsDefineExample() {
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

        public Criteria andSrvsNameIsNull() {
            addCriterion("srvs_name is null");
            return (Criteria) this;
        }

        public Criteria andSrvsNameIsNotNull() {
            addCriterion("srvs_name is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsNameEqualTo(String value) {
            addCriterion("srvs_name =", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameNotEqualTo(String value) {
            addCriterion("srvs_name <>", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameGreaterThan(String value) {
            addCriterion("srvs_name >", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_name >=", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameLessThan(String value) {
            addCriterion("srvs_name <", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameLessThanOrEqualTo(String value) {
            addCriterion("srvs_name <=", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameLike(String value) {
            addCriterion("srvs_name like", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameNotLike(String value) {
            addCriterion("srvs_name not like", value, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameIn(List<String> values) {
            addCriterion("srvs_name in", values, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameNotIn(List<String> values) {
            addCriterion("srvs_name not in", values, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameBetween(String value1, String value2) {
            addCriterion("srvs_name between", value1, value2, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsNameNotBetween(String value1, String value2) {
            addCriterion("srvs_name not between", value1, value2, "srvsName");
            return (Criteria) this;
        }

        public Criteria andSrvsClassIsNull() {
            addCriterion("srvs_class is null");
            return (Criteria) this;
        }

        public Criteria andSrvsClassIsNotNull() {
            addCriterion("srvs_class is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsClassEqualTo(String value) {
            addCriterion("srvs_class =", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassNotEqualTo(String value) {
            addCriterion("srvs_class <>", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassGreaterThan(String value) {
            addCriterion("srvs_class >", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_class >=", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassLessThan(String value) {
            addCriterion("srvs_class <", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassLessThanOrEqualTo(String value) {
            addCriterion("srvs_class <=", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassLike(String value) {
            addCriterion("srvs_class like", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassNotLike(String value) {
            addCriterion("srvs_class not like", value, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassIn(List<String> values) {
            addCriterion("srvs_class in", values, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassNotIn(List<String> values) {
            addCriterion("srvs_class not in", values, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassBetween(String value1, String value2) {
            addCriterion("srvs_class between", value1, value2, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsClassNotBetween(String value1, String value2) {
            addCriterion("srvs_class not between", value1, value2, "srvsClass");
            return (Criteria) this;
        }

        public Criteria andSrvsDescIsNull() {
            addCriterion("srvs_desc is null");
            return (Criteria) this;
        }

        public Criteria andSrvsDescIsNotNull() {
            addCriterion("srvs_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsDescEqualTo(String value) {
            addCriterion("srvs_desc =", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescNotEqualTo(String value) {
            addCriterion("srvs_desc <>", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescGreaterThan(String value) {
            addCriterion("srvs_desc >", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_desc >=", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescLessThan(String value) {
            addCriterion("srvs_desc <", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescLessThanOrEqualTo(String value) {
            addCriterion("srvs_desc <=", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescLike(String value) {
            addCriterion("srvs_desc like", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescNotLike(String value) {
            addCriterion("srvs_desc not like", value, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescIn(List<String> values) {
            addCriterion("srvs_desc in", values, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescNotIn(List<String> values) {
            addCriterion("srvs_desc not in", values, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescBetween(String value1, String value2) {
            addCriterion("srvs_desc between", value1, value2, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsDescNotBetween(String value1, String value2) {
            addCriterion("srvs_desc not between", value1, value2, "srvsDesc");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeIsNull() {
            addCriterion("srvs_type is null");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeIsNotNull() {
            addCriterion("srvs_type is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeEqualTo(String value) {
            addCriterion("srvs_type =", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeNotEqualTo(String value) {
            addCriterion("srvs_type <>", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeGreaterThan(String value) {
            addCriterion("srvs_type >", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_type >=", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeLessThan(String value) {
            addCriterion("srvs_type <", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeLessThanOrEqualTo(String value) {
            addCriterion("srvs_type <=", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeLike(String value) {
            addCriterion("srvs_type like", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeNotLike(String value) {
            addCriterion("srvs_type not like", value, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeIn(List<String> values) {
            addCriterion("srvs_type in", values, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeNotIn(List<String> values) {
            addCriterion("srvs_type not in", values, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeBetween(String value1, String value2) {
            addCriterion("srvs_type between", value1, value2, "srvsType");
            return (Criteria) this;
        }

        public Criteria andSrvsTypeNotBetween(String value1, String value2) {
            addCriterion("srvs_type not between", value1, value2, "srvsType");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageIsNull() {
            addCriterion("is_prvd_conf_page is null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageIsNotNull() {
            addCriterion("is_prvd_conf_page is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageEqualTo(String value) {
            addCriterion("is_prvd_conf_page =", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageNotEqualTo(String value) {
            addCriterion("is_prvd_conf_page <>", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageGreaterThan(String value) {
            addCriterion("is_prvd_conf_page >", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageGreaterThanOrEqualTo(String value) {
            addCriterion("is_prvd_conf_page >=", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageLessThan(String value) {
            addCriterion("is_prvd_conf_page <", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageLessThanOrEqualTo(String value) {
            addCriterion("is_prvd_conf_page <=", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageLike(String value) {
            addCriterion("is_prvd_conf_page like", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageNotLike(String value) {
            addCriterion("is_prvd_conf_page not like", value, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageIn(List<String> values) {
            addCriterion("is_prvd_conf_page in", values, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageNotIn(List<String> values) {
            addCriterion("is_prvd_conf_page not in", values, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageBetween(String value1, String value2) {
            addCriterion("is_prvd_conf_page between", value1, value2, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdConfPageNotBetween(String value1, String value2) {
            addCriterion("is_prvd_conf_page not between", value1, value2, "isPrvdConfPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageIsNull() {
            addCriterion("is_prvd_mgr_page is null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageIsNotNull() {
            addCriterion("is_prvd_mgr_page is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageEqualTo(String value) {
            addCriterion("is_prvd_mgr_page =", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageNotEqualTo(String value) {
            addCriterion("is_prvd_mgr_page <>", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageGreaterThan(String value) {
            addCriterion("is_prvd_mgr_page >", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageGreaterThanOrEqualTo(String value) {
            addCriterion("is_prvd_mgr_page >=", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageLessThan(String value) {
            addCriterion("is_prvd_mgr_page <", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageLessThanOrEqualTo(String value) {
            addCriterion("is_prvd_mgr_page <=", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageLike(String value) {
            addCriterion("is_prvd_mgr_page like", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageNotLike(String value) {
            addCriterion("is_prvd_mgr_page not like", value, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageIn(List<String> values) {
            addCriterion("is_prvd_mgr_page in", values, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageNotIn(List<String> values) {
            addCriterion("is_prvd_mgr_page not in", values, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageBetween(String value1, String value2) {
            addCriterion("is_prvd_mgr_page between", value1, value2, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdMgrPageNotBetween(String value1, String value2) {
            addCriterion("is_prvd_mgr_page not between", value1, value2, "isPrvdMgrPage");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogIsNull() {
            addCriterion("is_prvd_log is null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogIsNotNull() {
            addCriterion("is_prvd_log is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogEqualTo(String value) {
            addCriterion("is_prvd_log =", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogNotEqualTo(String value) {
            addCriterion("is_prvd_log <>", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogGreaterThan(String value) {
            addCriterion("is_prvd_log >", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogGreaterThanOrEqualTo(String value) {
            addCriterion("is_prvd_log >=", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogLessThan(String value) {
            addCriterion("is_prvd_log <", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogLessThanOrEqualTo(String value) {
            addCriterion("is_prvd_log <=", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogLike(String value) {
            addCriterion("is_prvd_log like", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogNotLike(String value) {
            addCriterion("is_prvd_log not like", value, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogIn(List<String> values) {
            addCriterion("is_prvd_log in", values, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogNotIn(List<String> values) {
            addCriterion("is_prvd_log not in", values, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogBetween(String value1, String value2) {
            addCriterion("is_prvd_log between", value1, value2, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsPrvdLogNotBetween(String value1, String value2) {
            addCriterion("is_prvd_log not between", value1, value2, "isPrvdLog");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlIsNull() {
            addCriterion("is_flux_control is null");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlIsNotNull() {
            addCriterion("is_flux_control is not null");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlEqualTo(String value) {
            addCriterion("is_flux_control =", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlNotEqualTo(String value) {
            addCriterion("is_flux_control <>", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlGreaterThan(String value) {
            addCriterion("is_flux_control >", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlGreaterThanOrEqualTo(String value) {
            addCriterion("is_flux_control >=", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlLessThan(String value) {
            addCriterion("is_flux_control <", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlLessThanOrEqualTo(String value) {
            addCriterion("is_flux_control <=", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlLike(String value) {
            addCriterion("is_flux_control like", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlNotLike(String value) {
            addCriterion("is_flux_control not like", value, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlIn(List<String> values) {
            addCriterion("is_flux_control in", values, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlNotIn(List<String> values) {
            addCriterion("is_flux_control not in", values, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlBetween(String value1, String value2) {
            addCriterion("is_flux_control between", value1, value2, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andIsFluxControlNotBetween(String value1, String value2) {
            addCriterion("is_flux_control not between", value1, value2, "isFluxControl");
            return (Criteria) this;
        }

        public Criteria andMaxFluxIsNull() {
            addCriterion("max_flux is null");
            return (Criteria) this;
        }

        public Criteria andMaxFluxIsNotNull() {
            addCriterion("max_flux is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFluxEqualTo(Integer value) {
            addCriterion("max_flux =", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxNotEqualTo(Integer value) {
            addCriterion("max_flux <>", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxGreaterThan(Integer value) {
            addCriterion("max_flux >", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_flux >=", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxLessThan(Integer value) {
            addCriterion("max_flux <", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxLessThanOrEqualTo(Integer value) {
            addCriterion("max_flux <=", value, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxIn(List<Integer> values) {
            addCriterion("max_flux in", values, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxNotIn(List<Integer> values) {
            addCriterion("max_flux not in", values, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxBetween(Integer value1, Integer value2) {
            addCriterion("max_flux between", value1, value2, "maxFlux");
            return (Criteria) this;
        }

        public Criteria andMaxFluxNotBetween(Integer value1, Integer value2) {
            addCriterion("max_flux not between", value1, value2, "maxFlux");
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