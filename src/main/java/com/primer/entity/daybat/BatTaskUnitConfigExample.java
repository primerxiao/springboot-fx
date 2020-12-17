package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class BatTaskUnitConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BatTaskUnitConfigExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdIsNull() {
            addCriterion("previous_task_id is null");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdIsNotNull() {
            addCriterion("previous_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdEqualTo(String value) {
            addCriterion("previous_task_id =", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdNotEqualTo(String value) {
            addCriterion("previous_task_id <>", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdGreaterThan(String value) {
            addCriterion("previous_task_id >", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("previous_task_id >=", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdLessThan(String value) {
            addCriterion("previous_task_id <", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdLessThanOrEqualTo(String value) {
            addCriterion("previous_task_id <=", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdLike(String value) {
            addCriterion("previous_task_id like", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdNotLike(String value) {
            addCriterion("previous_task_id not like", value, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdIn(List<String> values) {
            addCriterion("previous_task_id in", values, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdNotIn(List<String> values) {
            addCriterion("previous_task_id not in", values, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdBetween(String value1, String value2) {
            addCriterion("previous_task_id between", value1, value2, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andPreviousTaskIdNotBetween(String value1, String value2) {
            addCriterion("previous_task_id not between", value1, value2, "previousTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andStageIdIsNull() {
            addCriterion("stage_id is null");
            return (Criteria) this;
        }

        public Criteria andStageIdIsNotNull() {
            addCriterion("stage_id is not null");
            return (Criteria) this;
        }

        public Criteria andStageIdEqualTo(String value) {
            addCriterion("stage_id =", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotEqualTo(String value) {
            addCriterion("stage_id <>", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThan(String value) {
            addCriterion("stage_id >", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThanOrEqualTo(String value) {
            addCriterion("stage_id >=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThan(String value) {
            addCriterion("stage_id <", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThanOrEqualTo(String value) {
            addCriterion("stage_id <=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLike(String value) {
            addCriterion("stage_id like", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotLike(String value) {
            addCriterion("stage_id not like", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdIn(List<String> values) {
            addCriterion("stage_id in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotIn(List<String> values) {
            addCriterion("stage_id not in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdBetween(String value1, String value2) {
            addCriterion("stage_id between", value1, value2, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotBetween(String value1, String value2) {
            addCriterion("stage_id not between", value1, value2, "stageId");
            return (Criteria) this;
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

        public Criteria andPluginSourceTypeIsNull() {
            addCriterion("plugin_source_type is null");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeIsNotNull() {
            addCriterion("plugin_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeEqualTo(String value) {
            addCriterion("plugin_source_type =", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeNotEqualTo(String value) {
            addCriterion("plugin_source_type <>", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeGreaterThan(String value) {
            addCriterion("plugin_source_type >", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_source_type >=", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeLessThan(String value) {
            addCriterion("plugin_source_type <", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("plugin_source_type <=", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeLike(String value) {
            addCriterion("plugin_source_type like", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeNotLike(String value) {
            addCriterion("plugin_source_type not like", value, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeIn(List<String> values) {
            addCriterion("plugin_source_type in", values, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeNotIn(List<String> values) {
            addCriterion("plugin_source_type not in", values, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeBetween(String value1, String value2) {
            addCriterion("plugin_source_type between", value1, value2, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginSourceTypeNotBetween(String value1, String value2) {
            addCriterion("plugin_source_type not between", value1, value2, "pluginSourceType");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagIsNull() {
            addCriterion("plugin_para_flag is null");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagIsNotNull() {
            addCriterion("plugin_para_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagEqualTo(String value) {
            addCriterion("plugin_para_flag =", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagNotEqualTo(String value) {
            addCriterion("plugin_para_flag <>", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagGreaterThan(String value) {
            addCriterion("plugin_para_flag >", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_para_flag >=", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagLessThan(String value) {
            addCriterion("plugin_para_flag <", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagLessThanOrEqualTo(String value) {
            addCriterion("plugin_para_flag <=", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagLike(String value) {
            addCriterion("plugin_para_flag like", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagNotLike(String value) {
            addCriterion("plugin_para_flag not like", value, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagIn(List<String> values) {
            addCriterion("plugin_para_flag in", values, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagNotIn(List<String> values) {
            addCriterion("plugin_para_flag not in", values, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagBetween(String value1, String value2) {
            addCriterion("plugin_para_flag between", value1, value2, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andPluginParaFlagNotBetween(String value1, String value2) {
            addCriterion("plugin_para_flag not between", value1, value2, "pluginParaFlag");
            return (Criteria) this;
        }

        public Criteria andTaskPriIsNull() {
            addCriterion("task_pri is null");
            return (Criteria) this;
        }

        public Criteria andTaskPriIsNotNull() {
            addCriterion("task_pri is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPriEqualTo(String value) {
            addCriterion("task_pri =", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriNotEqualTo(String value) {
            addCriterion("task_pri <>", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriGreaterThan(String value) {
            addCriterion("task_pri >", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriGreaterThanOrEqualTo(String value) {
            addCriterion("task_pri >=", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriLessThan(String value) {
            addCriterion("task_pri <", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriLessThanOrEqualTo(String value) {
            addCriterion("task_pri <=", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriLike(String value) {
            addCriterion("task_pri like", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriNotLike(String value) {
            addCriterion("task_pri not like", value, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriIn(List<String> values) {
            addCriterion("task_pri in", values, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriNotIn(List<String> values) {
            addCriterion("task_pri not in", values, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriBetween(String value1, String value2) {
            addCriterion("task_pri between", value1, value2, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskPriNotBetween(String value1, String value2) {
            addCriterion("task_pri not between", value1, value2, "taskPri");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeIsNull() {
            addCriterion("task_run_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeIsNotNull() {
            addCriterion("task_run_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeEqualTo(String value) {
            addCriterion("task_run_type =", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeNotEqualTo(String value) {
            addCriterion("task_run_type <>", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeGreaterThan(String value) {
            addCriterion("task_run_type >", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_run_type >=", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeLessThan(String value) {
            addCriterion("task_run_type <", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeLessThanOrEqualTo(String value) {
            addCriterion("task_run_type <=", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeLike(String value) {
            addCriterion("task_run_type like", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeNotLike(String value) {
            addCriterion("task_run_type not like", value, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeIn(List<String> values) {
            addCriterion("task_run_type in", values, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeNotIn(List<String> values) {
            addCriterion("task_run_type not in", values, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeBetween(String value1, String value2) {
            addCriterion("task_run_type between", value1, value2, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskRunTypeNotBetween(String value1, String value2) {
            addCriterion("task_run_type not between", value1, value2, "taskRunType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeIsNull() {
            addCriterion("task_cycle_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeIsNotNull() {
            addCriterion("task_cycle_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeEqualTo(String value) {
            addCriterion("task_cycle_type =", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeNotEqualTo(String value) {
            addCriterion("task_cycle_type <>", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeGreaterThan(String value) {
            addCriterion("task_cycle_type >", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_cycle_type >=", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeLessThan(String value) {
            addCriterion("task_cycle_type <", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("task_cycle_type <=", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeLike(String value) {
            addCriterion("task_cycle_type like", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeNotLike(String value) {
            addCriterion("task_cycle_type not like", value, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeIn(List<String> values) {
            addCriterion("task_cycle_type in", values, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeNotIn(List<String> values) {
            addCriterion("task_cycle_type not in", values, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeBetween(String value1, String value2) {
            addCriterion("task_cycle_type between", value1, value2, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCycleTypeNotBetween(String value1, String value2) {
            addCriterion("task_cycle_type not between", value1, value2, "taskCycleType");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueIsNull() {
            addCriterion("task_cron_value is null");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueIsNotNull() {
            addCriterion("task_cron_value is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueEqualTo(String value) {
            addCriterion("task_cron_value =", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueNotEqualTo(String value) {
            addCriterion("task_cron_value <>", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueGreaterThan(String value) {
            addCriterion("task_cron_value >", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueGreaterThanOrEqualTo(String value) {
            addCriterion("task_cron_value >=", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueLessThan(String value) {
            addCriterion("task_cron_value <", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueLessThanOrEqualTo(String value) {
            addCriterion("task_cron_value <=", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueLike(String value) {
            addCriterion("task_cron_value like", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueNotLike(String value) {
            addCriterion("task_cron_value not like", value, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueIn(List<String> values) {
            addCriterion("task_cron_value in", values, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueNotIn(List<String> values) {
            addCriterion("task_cron_value not in", values, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueBetween(String value1, String value2) {
            addCriterion("task_cron_value between", value1, value2, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskCronValueNotBetween(String value1, String value2) {
            addCriterion("task_cron_value not between", value1, value2, "taskCronValue");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeIsNull() {
            addCriterion("task_delay_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeIsNotNull() {
            addCriterion("task_delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeEqualTo(Integer value) {
            addCriterion("task_delay_time =", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeNotEqualTo(Integer value) {
            addCriterion("task_delay_time <>", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeGreaterThan(Integer value) {
            addCriterion("task_delay_time >", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_delay_time >=", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeLessThan(Integer value) {
            addCriterion("task_delay_time <", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("task_delay_time <=", value, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeIn(List<Integer> values) {
            addCriterion("task_delay_time in", values, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeNotIn(List<Integer> values) {
            addCriterion("task_delay_time not in", values, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeBetween(Integer value1, Integer value2) {
            addCriterion("task_delay_time between", value1, value2, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskDelayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_delay_time not between", value1, value2, "taskDelayTime");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticIsNull() {
            addCriterion("task_skip_tactic is null");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticIsNotNull() {
            addCriterion("task_skip_tactic is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticEqualTo(String value) {
            addCriterion("task_skip_tactic =", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticNotEqualTo(String value) {
            addCriterion("task_skip_tactic <>", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticGreaterThan(String value) {
            addCriterion("task_skip_tactic >", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticGreaterThanOrEqualTo(String value) {
            addCriterion("task_skip_tactic >=", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticLessThan(String value) {
            addCriterion("task_skip_tactic <", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticLessThanOrEqualTo(String value) {
            addCriterion("task_skip_tactic <=", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticLike(String value) {
            addCriterion("task_skip_tactic like", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticNotLike(String value) {
            addCriterion("task_skip_tactic not like", value, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticIn(List<String> values) {
            addCriterion("task_skip_tactic in", values, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticNotIn(List<String> values) {
            addCriterion("task_skip_tactic not in", values, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticBetween(String value1, String value2) {
            addCriterion("task_skip_tactic between", value1, value2, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andTaskSkipTacticNotBetween(String value1, String value2) {
            addCriterion("task_skip_tactic not between", value1, value2, "taskSkipTactic");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceIsNull() {
            addCriterion("again_run_space is null");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceIsNotNull() {
            addCriterion("again_run_space is not null");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceEqualTo(Integer value) {
            addCriterion("again_run_space =", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceNotEqualTo(Integer value) {
            addCriterion("again_run_space <>", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceGreaterThan(Integer value) {
            addCriterion("again_run_space >", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("again_run_space >=", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceLessThan(Integer value) {
            addCriterion("again_run_space <", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("again_run_space <=", value, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceIn(List<Integer> values) {
            addCriterion("again_run_space in", values, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceNotIn(List<Integer> values) {
            addCriterion("again_run_space not in", values, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceBetween(Integer value1, Integer value2) {
            addCriterion("again_run_space between", value1, value2, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andAgainRunSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("again_run_space not between", value1, value2, "againRunSpace");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeIsNull() {
            addCriterion("task_estimate_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeIsNotNull() {
            addCriterion("task_estimate_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeEqualTo(Integer value) {
            addCriterion("task_estimate_time =", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeNotEqualTo(Integer value) {
            addCriterion("task_estimate_time <>", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeGreaterThan(Integer value) {
            addCriterion("task_estimate_time >", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_estimate_time >=", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeLessThan(Integer value) {
            addCriterion("task_estimate_time <", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("task_estimate_time <=", value, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeIn(List<Integer> values) {
            addCriterion("task_estimate_time in", values, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeNotIn(List<Integer> values) {
            addCriterion("task_estimate_time not in", values, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeBetween(Integer value1, Integer value2) {
            addCriterion("task_estimate_time between", value1, value2, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskEstimateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_estimate_time not between", value1, value2, "taskEstimateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateIsNull() {
            addCriterion("task_use_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateIsNotNull() {
            addCriterion("task_use_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateEqualTo(String value) {
            addCriterion("task_use_state =", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateNotEqualTo(String value) {
            addCriterion("task_use_state <>", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateGreaterThan(String value) {
            addCriterion("task_use_state >", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_use_state >=", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateLessThan(String value) {
            addCriterion("task_use_state <", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateLessThanOrEqualTo(String value) {
            addCriterion("task_use_state <=", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateLike(String value) {
            addCriterion("task_use_state like", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateNotLike(String value) {
            addCriterion("task_use_state not like", value, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateIn(List<String> values) {
            addCriterion("task_use_state in", values, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateNotIn(List<String> values) {
            addCriterion("task_use_state not in", values, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateBetween(String value1, String value2) {
            addCriterion("task_use_state between", value1, value2, "taskUseState");
            return (Criteria) this;
        }

        public Criteria andTaskUseStateNotBetween(String value1, String value2) {
            addCriterion("task_use_state not between", value1, value2, "taskUseState");
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

        public Criteria andMaxRunCountIsNull() {
            addCriterion("max_run_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountIsNotNull() {
            addCriterion("max_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountEqualTo(Integer value) {
            addCriterion("max_run_count =", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountNotEqualTo(Integer value) {
            addCriterion("max_run_count <>", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountGreaterThan(Integer value) {
            addCriterion("max_run_count >", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_run_count >=", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountLessThan(Integer value) {
            addCriterion("max_run_count <", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_run_count <=", value, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountIn(List<Integer> values) {
            addCriterion("max_run_count in", values, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountNotIn(List<Integer> values) {
            addCriterion("max_run_count not in", values, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountBetween(Integer value1, Integer value2) {
            addCriterion("max_run_count between", value1, value2, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andMaxRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_run_count not between", value1, value2, "maxRunCount");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeIsNull() {
            addCriterion("task_timeout_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeIsNotNull() {
            addCriterion("task_timeout_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeEqualTo(Integer value) {
            addCriterion("task_timeout_time =", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeNotEqualTo(Integer value) {
            addCriterion("task_timeout_time <>", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeGreaterThan(Integer value) {
            addCriterion("task_timeout_time >", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_timeout_time >=", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeLessThan(Integer value) {
            addCriterion("task_timeout_time <", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeLessThanOrEqualTo(Integer value) {
            addCriterion("task_timeout_time <=", value, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeIn(List<Integer> values) {
            addCriterion("task_timeout_time in", values, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeNotIn(List<Integer> values) {
            addCriterion("task_timeout_time not in", values, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeBetween(Integer value1, Integer value2) {
            addCriterion("task_timeout_time between", value1, value2, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_timeout_time not between", value1, value2, "taskTimeoutTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticIsNull() {
            addCriterion("task_timeout_tactic is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticIsNotNull() {
            addCriterion("task_timeout_tactic is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticEqualTo(String value) {
            addCriterion("task_timeout_tactic =", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticNotEqualTo(String value) {
            addCriterion("task_timeout_tactic <>", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticGreaterThan(String value) {
            addCriterion("task_timeout_tactic >", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticGreaterThanOrEqualTo(String value) {
            addCriterion("task_timeout_tactic >=", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticLessThan(String value) {
            addCriterion("task_timeout_tactic <", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticLessThanOrEqualTo(String value) {
            addCriterion("task_timeout_tactic <=", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticLike(String value) {
            addCriterion("task_timeout_tactic like", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticNotLike(String value) {
            addCriterion("task_timeout_tactic not like", value, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticIn(List<String> values) {
            addCriterion("task_timeout_tactic in", values, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticNotIn(List<String> values) {
            addCriterion("task_timeout_tactic not in", values, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticBetween(String value1, String value2) {
            addCriterion("task_timeout_tactic between", value1, value2, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutTacticNotBetween(String value1, String value2) {
            addCriterion("task_timeout_tactic not between", value1, value2, "taskTimeoutTactic");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeIsNull() {
            addCriterion("subs_ds_code is null");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeIsNotNull() {
            addCriterion("subs_ds_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeEqualTo(String value) {
            addCriterion("subs_ds_code =", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeNotEqualTo(String value) {
            addCriterion("subs_ds_code <>", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeGreaterThan(String value) {
            addCriterion("subs_ds_code >", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subs_ds_code >=", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeLessThan(String value) {
            addCriterion("subs_ds_code <", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeLessThanOrEqualTo(String value) {
            addCriterion("subs_ds_code <=", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeLike(String value) {
            addCriterion("subs_ds_code like", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeNotLike(String value) {
            addCriterion("subs_ds_code not like", value, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeIn(List<String> values) {
            addCriterion("subs_ds_code in", values, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeNotIn(List<String> values) {
            addCriterion("subs_ds_code not in", values, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeBetween(String value1, String value2) {
            addCriterion("subs_ds_code between", value1, value2, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andSubsDsCodeNotBetween(String value1, String value2) {
            addCriterion("subs_ds_code not between", value1, value2, "subsDsCode");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaIsNull() {
            addCriterion("task_use_area is null");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaIsNotNull() {
            addCriterion("task_use_area is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaEqualTo(String value) {
            addCriterion("task_use_area =", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaNotEqualTo(String value) {
            addCriterion("task_use_area <>", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaGreaterThan(String value) {
            addCriterion("task_use_area >", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("task_use_area >=", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaLessThan(String value) {
            addCriterion("task_use_area <", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaLessThanOrEqualTo(String value) {
            addCriterion("task_use_area <=", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaLike(String value) {
            addCriterion("task_use_area like", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaNotLike(String value) {
            addCriterion("task_use_area not like", value, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaIn(List<String> values) {
            addCriterion("task_use_area in", values, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaNotIn(List<String> values) {
            addCriterion("task_use_area not in", values, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaBetween(String value1, String value2) {
            addCriterion("task_use_area between", value1, value2, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andTaskUseAreaNotBetween(String value1, String value2) {
            addCriterion("task_use_area not between", value1, value2, "taskUseArea");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNull() {
            addCriterion("plugin_type is null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNotNull() {
            addCriterion("plugin_type is not null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeEqualTo(String value) {
            addCriterion("plugin_type =", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotEqualTo(String value) {
            addCriterion("plugin_type <>", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThan(String value) {
            addCriterion("plugin_type >", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_type >=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThan(String value) {
            addCriterion("plugin_type <", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThanOrEqualTo(String value) {
            addCriterion("plugin_type <=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLike(String value) {
            addCriterion("plugin_type like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotLike(String value) {
            addCriterion("plugin_type not like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIn(List<String> values) {
            addCriterion("plugin_type in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotIn(List<String> values) {
            addCriterion("plugin_type not in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeBetween(String value1, String value2) {
            addCriterion("plugin_type between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotBetween(String value1, String value2) {
            addCriterion("plugin_type not between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIsNull() {
            addCriterion("max_wait_time is null");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIsNotNull() {
            addCriterion("max_wait_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeEqualTo(Integer value) {
            addCriterion("max_wait_time =", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotEqualTo(Integer value) {
            addCriterion("max_wait_time <>", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeGreaterThan(Integer value) {
            addCriterion("max_wait_time >", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_wait_time >=", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeLessThan(Integer value) {
            addCriterion("max_wait_time <", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("max_wait_time <=", value, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeIn(List<Integer> values) {
            addCriterion("max_wait_time in", values, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotIn(List<Integer> values) {
            addCriterion("max_wait_time not in", values, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeBetween(Integer value1, Integer value2) {
            addCriterion("max_wait_time between", value1, value2, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andMaxWaitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_wait_time not between", value1, value2, "maxWaitTime");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalIsNull() {
            addCriterion("cycle_inteval is null");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalIsNotNull() {
            addCriterion("cycle_inteval is not null");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalEqualTo(Integer value) {
            addCriterion("cycle_inteval =", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalNotEqualTo(Integer value) {
            addCriterion("cycle_inteval <>", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalGreaterThan(Integer value) {
            addCriterion("cycle_inteval >", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_inteval >=", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalLessThan(Integer value) {
            addCriterion("cycle_inteval <", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_inteval <=", value, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalIn(List<Integer> values) {
            addCriterion("cycle_inteval in", values, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalNotIn(List<Integer> values) {
            addCriterion("cycle_inteval not in", values, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalBetween(Integer value1, Integer value2) {
            addCriterion("cycle_inteval between", value1, value2, "cycleInteval");
            return (Criteria) this;
        }

        public Criteria andCycleIntevalNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_inteval not between", value1, value2, "cycleInteval");
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