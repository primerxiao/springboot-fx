package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginScConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginScConfExample() {
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

        public Criteria andPluginConfIdIsNull() {
            addCriterion("plugin_conf_id is null");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdIsNotNull() {
            addCriterion("plugin_conf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdEqualTo(String value) {
            addCriterion("plugin_conf_id =", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotEqualTo(String value) {
            addCriterion("plugin_conf_id <>", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdGreaterThan(String value) {
            addCriterion("plugin_conf_id >", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_conf_id >=", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLessThan(String value) {
            addCriterion("plugin_conf_id <", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLessThanOrEqualTo(String value) {
            addCriterion("plugin_conf_id <=", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdLike(String value) {
            addCriterion("plugin_conf_id like", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotLike(String value) {
            addCriterion("plugin_conf_id not like", value, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdIn(List<String> values) {
            addCriterion("plugin_conf_id in", values, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotIn(List<String> values) {
            addCriterion("plugin_conf_id not in", values, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdBetween(String value1, String value2) {
            addCriterion("plugin_conf_id between", value1, value2, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andPluginConfIdNotBetween(String value1, String value2) {
            addCriterion("plugin_conf_id not between", value1, value2, "pluginConfId");
            return (Criteria) this;
        }

        public Criteria andConfSortIsNull() {
            addCriterion("conf_sort is null");
            return (Criteria) this;
        }

        public Criteria andConfSortIsNotNull() {
            addCriterion("conf_sort is not null");
            return (Criteria) this;
        }

        public Criteria andConfSortEqualTo(Integer value) {
            addCriterion("conf_sort =", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotEqualTo(Integer value) {
            addCriterion("conf_sort <>", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortGreaterThan(Integer value) {
            addCriterion("conf_sort >", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("conf_sort >=", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortLessThan(Integer value) {
            addCriterion("conf_sort <", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortLessThanOrEqualTo(Integer value) {
            addCriterion("conf_sort <=", value, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortIn(List<Integer> values) {
            addCriterion("conf_sort in", values, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotIn(List<Integer> values) {
            addCriterion("conf_sort not in", values, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortBetween(Integer value1, Integer value2) {
            addCriterion("conf_sort between", value1, value2, "confSort");
            return (Criteria) this;
        }

        public Criteria andConfSortNotBetween(Integer value1, Integer value2) {
            addCriterion("conf_sort not between", value1, value2, "confSort");
            return (Criteria) this;
        }

        public Criteria andScDescIsNull() {
            addCriterion("sc_desc is null");
            return (Criteria) this;
        }

        public Criteria andScDescIsNotNull() {
            addCriterion("sc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andScDescEqualTo(String value) {
            addCriterion("sc_desc =", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescNotEqualTo(String value) {
            addCriterion("sc_desc <>", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescGreaterThan(String value) {
            addCriterion("sc_desc >", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescGreaterThanOrEqualTo(String value) {
            addCriterion("sc_desc >=", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescLessThan(String value) {
            addCriterion("sc_desc <", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescLessThanOrEqualTo(String value) {
            addCriterion("sc_desc <=", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescLike(String value) {
            addCriterion("sc_desc like", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescNotLike(String value) {
            addCriterion("sc_desc not like", value, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescIn(List<String> values) {
            addCriterion("sc_desc in", values, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescNotIn(List<String> values) {
            addCriterion("sc_desc not in", values, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescBetween(String value1, String value2) {
            addCriterion("sc_desc between", value1, value2, "scDesc");
            return (Criteria) this;
        }

        public Criteria andScDescNotBetween(String value1, String value2) {
            addCriterion("sc_desc not between", value1, value2, "scDesc");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIsNull() {
            addCriterion("func_code is null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIsNotNull() {
            addCriterion("func_code is not null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeEqualTo(Integer value) {
            addCriterion("func_code =", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotEqualTo(Integer value) {
            addCriterion("func_code <>", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThan(Integer value) {
            addCriterion("func_code >", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("func_code >=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThan(Integer value) {
            addCriterion("func_code <", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThanOrEqualTo(Integer value) {
            addCriterion("func_code <=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIn(List<Integer> values) {
            addCriterion("func_code in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotIn(List<Integer> values) {
            addCriterion("func_code not in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeBetween(Integer value1, Integer value2) {
            addCriterion("func_code between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("func_code not between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealIsNull() {
            addCriterion("check_faild_deal is null");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealIsNotNull() {
            addCriterion("check_faild_deal is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealEqualTo(String value) {
            addCriterion("check_faild_deal =", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealNotEqualTo(String value) {
            addCriterion("check_faild_deal <>", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealGreaterThan(String value) {
            addCriterion("check_faild_deal >", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealGreaterThanOrEqualTo(String value) {
            addCriterion("check_faild_deal >=", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealLessThan(String value) {
            addCriterion("check_faild_deal <", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealLessThanOrEqualTo(String value) {
            addCriterion("check_faild_deal <=", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealLike(String value) {
            addCriterion("check_faild_deal like", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealNotLike(String value) {
            addCriterion("check_faild_deal not like", value, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealIn(List<String> values) {
            addCriterion("check_faild_deal in", values, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealNotIn(List<String> values) {
            addCriterion("check_faild_deal not in", values, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealBetween(String value1, String value2) {
            addCriterion("check_faild_deal between", value1, value2, "checkFaildDeal");
            return (Criteria) this;
        }

        public Criteria andCheckFaildDealNotBetween(String value1, String value2) {
            addCriterion("check_faild_deal not between", value1, value2, "checkFaildDeal");
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