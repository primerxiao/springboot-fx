package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginJobConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginJobConfExample() {
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

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeIsNull() {
            addCriterion("sql_purpose is null");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeIsNotNull() {
            addCriterion("sql_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeEqualTo(String value) {
            addCriterion("sql_purpose =", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeNotEqualTo(String value) {
            addCriterion("sql_purpose <>", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeGreaterThan(String value) {
            addCriterion("sql_purpose >", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("sql_purpose >=", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeLessThan(String value) {
            addCriterion("sql_purpose <", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeLessThanOrEqualTo(String value) {
            addCriterion("sql_purpose <=", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeLike(String value) {
            addCriterion("sql_purpose like", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeNotLike(String value) {
            addCriterion("sql_purpose not like", value, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeIn(List<String> values) {
            addCriterion("sql_purpose in", values, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeNotIn(List<String> values) {
            addCriterion("sql_purpose not in", values, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeBetween(String value1, String value2) {
            addCriterion("sql_purpose between", value1, value2, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlPurposeNotBetween(String value1, String value2) {
            addCriterion("sql_purpose not between", value1, value2, "sqlPurpose");
            return (Criteria) this;
        }

        public Criteria andSqlContentIsNull() {
            addCriterion("sql_content is null");
            return (Criteria) this;
        }

        public Criteria andSqlContentIsNotNull() {
            addCriterion("sql_content is not null");
            return (Criteria) this;
        }

        public Criteria andSqlContentEqualTo(String value) {
            addCriterion("sql_content =", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentNotEqualTo(String value) {
            addCriterion("sql_content <>", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentGreaterThan(String value) {
            addCriterion("sql_content >", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentGreaterThanOrEqualTo(String value) {
            addCriterion("sql_content >=", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentLessThan(String value) {
            addCriterion("sql_content <", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentLessThanOrEqualTo(String value) {
            addCriterion("sql_content <=", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentLike(String value) {
            addCriterion("sql_content like", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentNotLike(String value) {
            addCriterion("sql_content not like", value, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentIn(List<String> values) {
            addCriterion("sql_content in", values, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentNotIn(List<String> values) {
            addCriterion("sql_content not in", values, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentBetween(String value1, String value2) {
            addCriterion("sql_content between", value1, value2, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andSqlContentNotBetween(String value1, String value2) {
            addCriterion("sql_content not between", value1, value2, "sqlContent");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdIsNull() {
            addCriterion("param_group_id is null");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdIsNotNull() {
            addCriterion("param_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdEqualTo(String value) {
            addCriterion("param_group_id =", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotEqualTo(String value) {
            addCriterion("param_group_id <>", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdGreaterThan(String value) {
            addCriterion("param_group_id >", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("param_group_id >=", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLessThan(String value) {
            addCriterion("param_group_id <", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLessThanOrEqualTo(String value) {
            addCriterion("param_group_id <=", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdLike(String value) {
            addCriterion("param_group_id like", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotLike(String value) {
            addCriterion("param_group_id not like", value, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdIn(List<String> values) {
            addCriterion("param_group_id in", values, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotIn(List<String> values) {
            addCriterion("param_group_id not in", values, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdBetween(String value1, String value2) {
            addCriterion("param_group_id between", value1, value2, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andParamGroupIdNotBetween(String value1, String value2) {
            addCriterion("param_group_id not between", value1, value2, "paramGroupId");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealIsNull() {
            addCriterion("job_faild_deal is null");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealIsNotNull() {
            addCriterion("job_faild_deal is not null");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealEqualTo(String value) {
            addCriterion("job_faild_deal =", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealNotEqualTo(String value) {
            addCriterion("job_faild_deal <>", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealGreaterThan(String value) {
            addCriterion("job_faild_deal >", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealGreaterThanOrEqualTo(String value) {
            addCriterion("job_faild_deal >=", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealLessThan(String value) {
            addCriterion("job_faild_deal <", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealLessThanOrEqualTo(String value) {
            addCriterion("job_faild_deal <=", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealLike(String value) {
            addCriterion("job_faild_deal like", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealNotLike(String value) {
            addCriterion("job_faild_deal not like", value, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealIn(List<String> values) {
            addCriterion("job_faild_deal in", values, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealNotIn(List<String> values) {
            addCriterion("job_faild_deal not in", values, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealBetween(String value1, String value2) {
            addCriterion("job_faild_deal between", value1, value2, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andJobFaildDealNotBetween(String value1, String value2) {
            addCriterion("job_faild_deal not between", value1, value2, "jobFaildDeal");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("last_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("last_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(String value) {
            addCriterion("last_modify_date =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(String value) {
            addCriterion("last_modify_date <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(String value) {
            addCriterion("last_modify_date >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_date >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(String value) {
            addCriterion("last_modify_date <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(String value) {
            addCriterion("last_modify_date <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLike(String value) {
            addCriterion("last_modify_date like", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotLike(String value) {
            addCriterion("last_modify_date not like", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<String> values) {
            addCriterion("last_modify_date in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<String> values) {
            addCriterion("last_modify_date not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(String value1, String value2) {
            addCriterion("last_modify_date between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(String value1, String value2) {
            addCriterion("last_modify_date not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andJobImplementIsNull() {
            addCriterion("job_implement is null");
            return (Criteria) this;
        }

        public Criteria andJobImplementIsNotNull() {
            addCriterion("job_implement is not null");
            return (Criteria) this;
        }

        public Criteria andJobImplementEqualTo(String value) {
            addCriterion("job_implement =", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementNotEqualTo(String value) {
            addCriterion("job_implement <>", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementGreaterThan(String value) {
            addCriterion("job_implement >", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementGreaterThanOrEqualTo(String value) {
            addCriterion("job_implement >=", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementLessThan(String value) {
            addCriterion("job_implement <", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementLessThanOrEqualTo(String value) {
            addCriterion("job_implement <=", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementLike(String value) {
            addCriterion("job_implement like", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementNotLike(String value) {
            addCriterion("job_implement not like", value, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementIn(List<String> values) {
            addCriterion("job_implement in", values, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementNotIn(List<String> values) {
            addCriterion("job_implement not in", values, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementBetween(String value1, String value2) {
            addCriterion("job_implement between", value1, value2, "jobImplement");
            return (Criteria) this;
        }

        public Criteria andJobImplementNotBetween(String value1, String value2) {
            addCriterion("job_implement not between", value1, value2, "jobImplement");
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