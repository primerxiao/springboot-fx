package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginExcelConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginExcelConfExample() {
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

        public Criteria andExcelOperTypeIsNull() {
            addCriterion("excel_oper_type is null");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeIsNotNull() {
            addCriterion("excel_oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeEqualTo(String value) {
            addCriterion("excel_oper_type =", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeNotEqualTo(String value) {
            addCriterion("excel_oper_type <>", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeGreaterThan(String value) {
            addCriterion("excel_oper_type >", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("excel_oper_type >=", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeLessThan(String value) {
            addCriterion("excel_oper_type <", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeLessThanOrEqualTo(String value) {
            addCriterion("excel_oper_type <=", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeLike(String value) {
            addCriterion("excel_oper_type like", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeNotLike(String value) {
            addCriterion("excel_oper_type not like", value, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeIn(List<String> values) {
            addCriterion("excel_oper_type in", values, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeNotIn(List<String> values) {
            addCriterion("excel_oper_type not in", values, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeBetween(String value1, String value2) {
            addCriterion("excel_oper_type between", value1, value2, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andExcelOperTypeNotBetween(String value1, String value2) {
            addCriterion("excel_oper_type not between", value1, value2, "excelOperType");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueIsNull() {
            addCriterion("param_key_value is null");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueIsNotNull() {
            addCriterion("param_key_value is not null");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueEqualTo(String value) {
            addCriterion("param_key_value =", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueNotEqualTo(String value) {
            addCriterion("param_key_value <>", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueGreaterThan(String value) {
            addCriterion("param_key_value >", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_key_value >=", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueLessThan(String value) {
            addCriterion("param_key_value <", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueLessThanOrEqualTo(String value) {
            addCriterion("param_key_value <=", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueLike(String value) {
            addCriterion("param_key_value like", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueNotLike(String value) {
            addCriterion("param_key_value not like", value, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueIn(List<String> values) {
            addCriterion("param_key_value in", values, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueNotIn(List<String> values) {
            addCriterion("param_key_value not in", values, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueBetween(String value1, String value2) {
            addCriterion("param_key_value between", value1, value2, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andParamKeyValueNotBetween(String value1, String value2) {
            addCriterion("param_key_value not between", value1, value2, "paramKeyValue");
            return (Criteria) this;
        }

        public Criteria andConfigureFileIsNull() {
            addCriterion("configure_file is null");
            return (Criteria) this;
        }

        public Criteria andConfigureFileIsNotNull() {
            addCriterion("configure_file is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureFileEqualTo(String value) {
            addCriterion("configure_file =", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileNotEqualTo(String value) {
            addCriterion("configure_file <>", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileGreaterThan(String value) {
            addCriterion("configure_file >", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileGreaterThanOrEqualTo(String value) {
            addCriterion("configure_file >=", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileLessThan(String value) {
            addCriterion("configure_file <", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileLessThanOrEqualTo(String value) {
            addCriterion("configure_file <=", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileLike(String value) {
            addCriterion("configure_file like", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileNotLike(String value) {
            addCriterion("configure_file not like", value, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileIn(List<String> values) {
            addCriterion("configure_file in", values, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileNotIn(List<String> values) {
            addCriterion("configure_file not in", values, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileBetween(String value1, String value2) {
            addCriterion("configure_file between", value1, value2, "configureFile");
            return (Criteria) this;
        }

        public Criteria andConfigureFileNotBetween(String value1, String value2) {
            addCriterion("configure_file not between", value1, value2, "configureFile");
            return (Criteria) this;
        }

        public Criteria andFaildDealIsNull() {
            addCriterion("faild_deal is null");
            return (Criteria) this;
        }

        public Criteria andFaildDealIsNotNull() {
            addCriterion("faild_deal is not null");
            return (Criteria) this;
        }

        public Criteria andFaildDealEqualTo(String value) {
            addCriterion("faild_deal =", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealNotEqualTo(String value) {
            addCriterion("faild_deal <>", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealGreaterThan(String value) {
            addCriterion("faild_deal >", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealGreaterThanOrEqualTo(String value) {
            addCriterion("faild_deal >=", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealLessThan(String value) {
            addCriterion("faild_deal <", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealLessThanOrEqualTo(String value) {
            addCriterion("faild_deal <=", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealLike(String value) {
            addCriterion("faild_deal like", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealNotLike(String value) {
            addCriterion("faild_deal not like", value, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealIn(List<String> values) {
            addCriterion("faild_deal in", values, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealNotIn(List<String> values) {
            addCriterion("faild_deal not in", values, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealBetween(String value1, String value2) {
            addCriterion("faild_deal between", value1, value2, "faildDeal");
            return (Criteria) this;
        }

        public Criteria andFaildDealNotBetween(String value1, String value2) {
            addCriterion("faild_deal not between", value1, value2, "faildDeal");
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