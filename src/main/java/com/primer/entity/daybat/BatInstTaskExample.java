package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BatInstTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BatInstTaskExample() {
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

        public Criteria andBatchOrderIsNull() {
            addCriterion("batch_order is null");
            return (Criteria) this;
        }

        public Criteria andBatchOrderIsNotNull() {
            addCriterion("batch_order is not null");
            return (Criteria) this;
        }

        public Criteria andBatchOrderEqualTo(Integer value) {
            addCriterion("batch_order =", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderNotEqualTo(Integer value) {
            addCriterion("batch_order <>", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderGreaterThan(Integer value) {
            addCriterion("batch_order >", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_order >=", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderLessThan(Integer value) {
            addCriterion("batch_order <", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderLessThanOrEqualTo(Integer value) {
            addCriterion("batch_order <=", value, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderIn(List<Integer> values) {
            addCriterion("batch_order in", values, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderNotIn(List<Integer> values) {
            addCriterion("batch_order not in", values, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderBetween(Integer value1, Integer value2) {
            addCriterion("batch_order between", value1, value2, "batchOrder");
            return (Criteria) this;
        }

        public Criteria andBatchOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_order not between", value1, value2, "batchOrder");
            return (Criteria) this;
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

        public Criteria andTaskRunStateIsNull() {
            addCriterion("task_run_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateIsNotNull() {
            addCriterion("task_run_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateEqualTo(String value) {
            addCriterion("task_run_state =", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateNotEqualTo(String value) {
            addCriterion("task_run_state <>", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateGreaterThan(String value) {
            addCriterion("task_run_state >", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_run_state >=", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateLessThan(String value) {
            addCriterion("task_run_state <", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateLessThanOrEqualTo(String value) {
            addCriterion("task_run_state <=", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateLike(String value) {
            addCriterion("task_run_state like", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateNotLike(String value) {
            addCriterion("task_run_state not like", value, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateIn(List<String> values) {
            addCriterion("task_run_state in", values, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateNotIn(List<String> values) {
            addCriterion("task_run_state not in", values, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateBetween(String value1, String value2) {
            addCriterion("task_run_state between", value1, value2, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskRunStateNotBetween(String value1, String value2) {
            addCriterion("task_run_state not between", value1, value2, "taskRunState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateIsNull() {
            addCriterion("task_intervene_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateIsNotNull() {
            addCriterion("task_intervene_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateEqualTo(String value) {
            addCriterion("task_intervene_state =", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateNotEqualTo(String value) {
            addCriterion("task_intervene_state <>", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateGreaterThan(String value) {
            addCriterion("task_intervene_state >", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_intervene_state >=", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateLessThan(String value) {
            addCriterion("task_intervene_state <", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateLessThanOrEqualTo(String value) {
            addCriterion("task_intervene_state <=", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateLike(String value) {
            addCriterion("task_intervene_state like", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateNotLike(String value) {
            addCriterion("task_intervene_state not like", value, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateIn(List<String> values) {
            addCriterion("task_intervene_state in", values, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateNotIn(List<String> values) {
            addCriterion("task_intervene_state not in", values, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateBetween(String value1, String value2) {
            addCriterion("task_intervene_state between", value1, value2, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andTaskInterveneStateNotBetween(String value1, String value2) {
            addCriterion("task_intervene_state not between", value1, value2, "taskInterveneState");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNull() {
            addCriterion("cost_time is null");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNotNull() {
            addCriterion("cost_time is not null");
            return (Criteria) this;
        }

        public Criteria andCostTimeEqualTo(BigDecimal value) {
            addCriterion("cost_time =", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotEqualTo(BigDecimal value) {
            addCriterion("cost_time <>", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThan(BigDecimal value) {
            addCriterion("cost_time >", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_time >=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThan(BigDecimal value) {
            addCriterion("cost_time <", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_time <=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeIn(List<BigDecimal> values) {
            addCriterion("cost_time in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotIn(List<BigDecimal> values) {
            addCriterion("cost_time not in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_time between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_time not between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andWarnCountIsNull() {
            addCriterion("warn_count is null");
            return (Criteria) this;
        }

        public Criteria andWarnCountIsNotNull() {
            addCriterion("warn_count is not null");
            return (Criteria) this;
        }

        public Criteria andWarnCountEqualTo(Integer value) {
            addCriterion("warn_count =", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotEqualTo(Integer value) {
            addCriterion("warn_count <>", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountGreaterThan(Integer value) {
            addCriterion("warn_count >", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_count >=", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountLessThan(Integer value) {
            addCriterion("warn_count <", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountLessThanOrEqualTo(Integer value) {
            addCriterion("warn_count <=", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountIn(List<Integer> values) {
            addCriterion("warn_count in", values, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotIn(List<Integer> values) {
            addCriterion("warn_count not in", values, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountBetween(Integer value1, Integer value2) {
            addCriterion("warn_count between", value1, value2, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_count not between", value1, value2, "warnCount");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoIsNull() {
            addCriterion("batch_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoIsNotNull() {
            addCriterion("batch_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoEqualTo(String value) {
            addCriterion("batch_serial_no =", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotEqualTo(String value) {
            addCriterion("batch_serial_no <>", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoGreaterThan(String value) {
            addCriterion("batch_serial_no >", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_serial_no >=", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLessThan(String value) {
            addCriterion("batch_serial_no <", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLessThanOrEqualTo(String value) {
            addCriterion("batch_serial_no <=", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoLike(String value) {
            addCriterion("batch_serial_no like", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotLike(String value) {
            addCriterion("batch_serial_no not like", value, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoIn(List<String> values) {
            addCriterion("batch_serial_no in", values, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotIn(List<String> values) {
            addCriterion("batch_serial_no not in", values, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoBetween(String value1, String value2) {
            addCriterion("batch_serial_no between", value1, value2, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andBatchSerialNoNotBetween(String value1, String value2) {
            addCriterion("batch_serial_no not between", value1, value2, "batchSerialNo");
            return (Criteria) this;
        }

        public Criteria andStateDescIsNull() {
            addCriterion("state_desc is null");
            return (Criteria) this;
        }

        public Criteria andStateDescIsNotNull() {
            addCriterion("state_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStateDescEqualTo(String value) {
            addCriterion("state_desc =", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotEqualTo(String value) {
            addCriterion("state_desc <>", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescGreaterThan(String value) {
            addCriterion("state_desc >", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescGreaterThanOrEqualTo(String value) {
            addCriterion("state_desc >=", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLessThan(String value) {
            addCriterion("state_desc <", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLessThanOrEqualTo(String value) {
            addCriterion("state_desc <=", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLike(String value) {
            addCriterion("state_desc like", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotLike(String value) {
            addCriterion("state_desc not like", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescIn(List<String> values) {
            addCriterion("state_desc in", values, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotIn(List<String> values) {
            addCriterion("state_desc not in", values, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescBetween(String value1, String value2) {
            addCriterion("state_desc between", value1, value2, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotBetween(String value1, String value2) {
            addCriterion("state_desc not between", value1, value2, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNull() {
            addCriterion("batch_date is null");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNotNull() {
            addCriterion("batch_date is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDateEqualTo(String value) {
            addCriterion("batch_date =", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotEqualTo(String value) {
            addCriterion("batch_date <>", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThan(String value) {
            addCriterion("batch_date >", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThanOrEqualTo(String value) {
            addCriterion("batch_date >=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThan(String value) {
            addCriterion("batch_date <", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThanOrEqualTo(String value) {
            addCriterion("batch_date <=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLike(String value) {
            addCriterion("batch_date like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotLike(String value) {
            addCriterion("batch_date not like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateIn(List<String> values) {
            addCriterion("batch_date in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotIn(List<String> values) {
            addCriterion("batch_date not in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateBetween(String value1, String value2) {
            addCriterion("batch_date between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotBetween(String value1, String value2) {
            addCriterion("batch_date not between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNull() {
            addCriterion("stage_name is null");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNotNull() {
            addCriterion("stage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStageNameEqualTo(String value) {
            addCriterion("stage_name =", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotEqualTo(String value) {
            addCriterion("stage_name <>", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThan(String value) {
            addCriterion("stage_name >", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("stage_name >=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThan(String value) {
            addCriterion("stage_name <", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThanOrEqualTo(String value) {
            addCriterion("stage_name <=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLike(String value) {
            addCriterion("stage_name like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotLike(String value) {
            addCriterion("stage_name not like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameIn(List<String> values) {
            addCriterion("stage_name in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotIn(List<String> values) {
            addCriterion("stage_name not in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameBetween(String value1, String value2) {
            addCriterion("stage_name between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotBetween(String value1, String value2) {
            addCriterion("stage_name not between", value1, value2, "stageName");
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