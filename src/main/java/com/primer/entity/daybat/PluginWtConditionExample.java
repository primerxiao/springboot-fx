package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginWtConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginWtConditionExample() {
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

        public Criteria andCheckItemNameIsNull() {
            addCriterion("check_item_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameIsNotNull() {
            addCriterion("check_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameEqualTo(String value) {
            addCriterion("check_item_name =", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotEqualTo(String value) {
            addCriterion("check_item_name <>", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameGreaterThan(String value) {
            addCriterion("check_item_name >", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_name >=", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLessThan(String value) {
            addCriterion("check_item_name <", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLessThanOrEqualTo(String value) {
            addCriterion("check_item_name <=", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLike(String value) {
            addCriterion("check_item_name like", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotLike(String value) {
            addCriterion("check_item_name not like", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameIn(List<String> values) {
            addCriterion("check_item_name in", values, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotIn(List<String> values) {
            addCriterion("check_item_name not in", values, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameBetween(String value1, String value2) {
            addCriterion("check_item_name between", value1, value2, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotBetween(String value1, String value2) {
            addCriterion("check_item_name not between", value1, value2, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlIsNull() {
            addCriterion("check_item_sql is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlIsNotNull() {
            addCriterion("check_item_sql is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlEqualTo(String value) {
            addCriterion("check_item_sql =", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlNotEqualTo(String value) {
            addCriterion("check_item_sql <>", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlGreaterThan(String value) {
            addCriterion("check_item_sql >", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_sql >=", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlLessThan(String value) {
            addCriterion("check_item_sql <", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlLessThanOrEqualTo(String value) {
            addCriterion("check_item_sql <=", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlLike(String value) {
            addCriterion("check_item_sql like", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlNotLike(String value) {
            addCriterion("check_item_sql not like", value, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlIn(List<String> values) {
            addCriterion("check_item_sql in", values, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlNotIn(List<String> values) {
            addCriterion("check_item_sql not in", values, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlBetween(String value1, String value2) {
            addCriterion("check_item_sql between", value1, value2, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckItemSqlNotBetween(String value1, String value2) {
            addCriterion("check_item_sql not between", value1, value2, "checkItemSql");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionIsNull() {
            addCriterion("check_suc_condition is null");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionIsNotNull() {
            addCriterion("check_suc_condition is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionEqualTo(String value) {
            addCriterion("check_suc_condition =", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionNotEqualTo(String value) {
            addCriterion("check_suc_condition <>", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionGreaterThan(String value) {
            addCriterion("check_suc_condition >", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionGreaterThanOrEqualTo(String value) {
            addCriterion("check_suc_condition >=", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionLessThan(String value) {
            addCriterion("check_suc_condition <", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionLessThanOrEqualTo(String value) {
            addCriterion("check_suc_condition <=", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionLike(String value) {
            addCriterion("check_suc_condition like", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionNotLike(String value) {
            addCriterion("check_suc_condition not like", value, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionIn(List<String> values) {
            addCriterion("check_suc_condition in", values, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionNotIn(List<String> values) {
            addCriterion("check_suc_condition not in", values, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionBetween(String value1, String value2) {
            addCriterion("check_suc_condition between", value1, value2, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andCheckSucConditionNotBetween(String value1, String value2) {
            addCriterion("check_suc_condition not between", value1, value2, "checkSucCondition");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("valid_date like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("valid_date not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("invalid_date is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("invalid_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(String value) {
            addCriterion("invalid_date =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(String value) {
            addCriterion("invalid_date <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(String value) {
            addCriterion("invalid_date >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(String value) {
            addCriterion("invalid_date >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(String value) {
            addCriterion("invalid_date <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(String value) {
            addCriterion("invalid_date <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLike(String value) {
            addCriterion("invalid_date like", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotLike(String value) {
            addCriterion("invalid_date not like", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<String> values) {
            addCriterion("invalid_date in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<String> values) {
            addCriterion("invalid_date not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(String value1, String value2) {
            addCriterion("invalid_date between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(String value1, String value2) {
            addCriterion("invalid_date not between", value1, value2, "invalidDate");
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