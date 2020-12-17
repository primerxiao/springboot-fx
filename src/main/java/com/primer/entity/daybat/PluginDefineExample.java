package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginDefineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginDefineExample() {
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

        public Criteria andPluginIdIsNull() {
            addCriterion("plugin_id is null");
            return (Criteria) this;
        }

        public Criteria andPluginIdIsNotNull() {
            addCriterion("plugin_id is not null");
            return (Criteria) this;
        }

        public Criteria andPluginIdEqualTo(Integer value) {
            addCriterion("plugin_id =", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotEqualTo(Integer value) {
            addCriterion("plugin_id <>", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThan(Integer value) {
            addCriterion("plugin_id >", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plugin_id >=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThan(Integer value) {
            addCriterion("plugin_id <", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThanOrEqualTo(Integer value) {
            addCriterion("plugin_id <=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdIn(List<Integer> values) {
            addCriterion("plugin_id in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotIn(List<Integer> values) {
            addCriterion("plugin_id not in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdBetween(Integer value1, Integer value2) {
            addCriterion("plugin_id between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plugin_id not between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginNameIsNull() {
            addCriterion("plugin_name is null");
            return (Criteria) this;
        }

        public Criteria andPluginNameIsNotNull() {
            addCriterion("plugin_name is not null");
            return (Criteria) this;
        }

        public Criteria andPluginNameEqualTo(String value) {
            addCriterion("plugin_name =", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotEqualTo(String value) {
            addCriterion("plugin_name <>", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameGreaterThan(String value) {
            addCriterion("plugin_name >", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_name >=", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLessThan(String value) {
            addCriterion("plugin_name <", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLessThanOrEqualTo(String value) {
            addCriterion("plugin_name <=", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLike(String value) {
            addCriterion("plugin_name like", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotLike(String value) {
            addCriterion("plugin_name not like", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameIn(List<String> values) {
            addCriterion("plugin_name in", values, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotIn(List<String> values) {
            addCriterion("plugin_name not in", values, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameBetween(String value1, String value2) {
            addCriterion("plugin_name between", value1, value2, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotBetween(String value1, String value2) {
            addCriterion("plugin_name not between", value1, value2, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginClassIsNull() {
            addCriterion("plugin_class is null");
            return (Criteria) this;
        }

        public Criteria andPluginClassIsNotNull() {
            addCriterion("plugin_class is not null");
            return (Criteria) this;
        }

        public Criteria andPluginClassEqualTo(String value) {
            addCriterion("plugin_class =", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassNotEqualTo(String value) {
            addCriterion("plugin_class <>", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassGreaterThan(String value) {
            addCriterion("plugin_class >", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_class >=", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassLessThan(String value) {
            addCriterion("plugin_class <", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassLessThanOrEqualTo(String value) {
            addCriterion("plugin_class <=", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassLike(String value) {
            addCriterion("plugin_class like", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassNotLike(String value) {
            addCriterion("plugin_class not like", value, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassIn(List<String> values) {
            addCriterion("plugin_class in", values, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassNotIn(List<String> values) {
            addCriterion("plugin_class not in", values, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassBetween(String value1, String value2) {
            addCriterion("plugin_class between", value1, value2, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginClassNotBetween(String value1, String value2) {
            addCriterion("plugin_class not between", value1, value2, "pluginClass");
            return (Criteria) this;
        }

        public Criteria andPluginDescIsNull() {
            addCriterion("plugin_desc is null");
            return (Criteria) this;
        }

        public Criteria andPluginDescIsNotNull() {
            addCriterion("plugin_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPluginDescEqualTo(String value) {
            addCriterion("plugin_desc =", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescNotEqualTo(String value) {
            addCriterion("plugin_desc <>", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescGreaterThan(String value) {
            addCriterion("plugin_desc >", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_desc >=", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescLessThan(String value) {
            addCriterion("plugin_desc <", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescLessThanOrEqualTo(String value) {
            addCriterion("plugin_desc <=", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescLike(String value) {
            addCriterion("plugin_desc like", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescNotLike(String value) {
            addCriterion("plugin_desc not like", value, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescIn(List<String> values) {
            addCriterion("plugin_desc in", values, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescNotIn(List<String> values) {
            addCriterion("plugin_desc not in", values, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescBetween(String value1, String value2) {
            addCriterion("plugin_desc between", value1, value2, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andPluginDescNotBetween(String value1, String value2) {
            addCriterion("plugin_desc not between", value1, value2, "pluginDesc");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarIsNull() {
            addCriterion("need_other_ds_var is null");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarIsNotNull() {
            addCriterion("need_other_ds_var is not null");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarEqualTo(String value) {
            addCriterion("need_other_ds_var =", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarNotEqualTo(String value) {
            addCriterion("need_other_ds_var <>", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarGreaterThan(String value) {
            addCriterion("need_other_ds_var >", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarGreaterThanOrEqualTo(String value) {
            addCriterion("need_other_ds_var >=", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarLessThan(String value) {
            addCriterion("need_other_ds_var <", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarLessThanOrEqualTo(String value) {
            addCriterion("need_other_ds_var <=", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarLike(String value) {
            addCriterion("need_other_ds_var like", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarNotLike(String value) {
            addCriterion("need_other_ds_var not like", value, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarIn(List<String> values) {
            addCriterion("need_other_ds_var in", values, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarNotIn(List<String> values) {
            addCriterion("need_other_ds_var not in", values, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarBetween(String value1, String value2) {
            addCriterion("need_other_ds_var between", value1, value2, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andNeedOtherDsVarNotBetween(String value1, String value2) {
            addCriterion("need_other_ds_var not between", value1, value2, "needOtherDsVar");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlIsNull() {
            addCriterion("plugin_config_url is null");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlIsNotNull() {
            addCriterion("plugin_config_url is not null");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlEqualTo(String value) {
            addCriterion("plugin_config_url =", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlNotEqualTo(String value) {
            addCriterion("plugin_config_url <>", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlGreaterThan(String value) {
            addCriterion("plugin_config_url >", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_config_url >=", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlLessThan(String value) {
            addCriterion("plugin_config_url <", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlLessThanOrEqualTo(String value) {
            addCriterion("plugin_config_url <=", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlLike(String value) {
            addCriterion("plugin_config_url like", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlNotLike(String value) {
            addCriterion("plugin_config_url not like", value, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlIn(List<String> values) {
            addCriterion("plugin_config_url in", values, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlNotIn(List<String> values) {
            addCriterion("plugin_config_url not in", values, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlBetween(String value1, String value2) {
            addCriterion("plugin_config_url between", value1, value2, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginConfigUrlNotBetween(String value1, String value2) {
            addCriterion("plugin_config_url not between", value1, value2, "pluginConfigUrl");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogIsNull() {
            addCriterion("plugin_catalog is null");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogIsNotNull() {
            addCriterion("plugin_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogEqualTo(String value) {
            addCriterion("plugin_catalog =", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogNotEqualTo(String value) {
            addCriterion("plugin_catalog <>", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogGreaterThan(String value) {
            addCriterion("plugin_catalog >", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_catalog >=", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogLessThan(String value) {
            addCriterion("plugin_catalog <", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogLessThanOrEqualTo(String value) {
            addCriterion("plugin_catalog <=", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogLike(String value) {
            addCriterion("plugin_catalog like", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogNotLike(String value) {
            addCriterion("plugin_catalog not like", value, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogIn(List<String> values) {
            addCriterion("plugin_catalog in", values, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogNotIn(List<String> values) {
            addCriterion("plugin_catalog not in", values, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogBetween(String value1, String value2) {
            addCriterion("plugin_catalog between", value1, value2, "pluginCatalog");
            return (Criteria) this;
        }

        public Criteria andPluginCatalogNotBetween(String value1, String value2) {
            addCriterion("plugin_catalog not between", value1, value2, "pluginCatalog");
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