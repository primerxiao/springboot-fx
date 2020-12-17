package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BatInstBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BatInstBatchExample() {
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

        public Criteria andBatchNameIsNull() {
            addCriterion("batch_name is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("batch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("batch_name =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("batch_name <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("batch_name >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("batch_name >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("batch_name <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("batch_name <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("batch_name like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("batch_name not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("batch_name in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("batch_name not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("batch_name between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("batch_name not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchStateIsNull() {
            addCriterion("batch_state is null");
            return (Criteria) this;
        }

        public Criteria andBatchStateIsNotNull() {
            addCriterion("batch_state is not null");
            return (Criteria) this;
        }

        public Criteria andBatchStateEqualTo(String value) {
            addCriterion("batch_state =", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateNotEqualTo(String value) {
            addCriterion("batch_state <>", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateGreaterThan(String value) {
            addCriterion("batch_state >", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateGreaterThanOrEqualTo(String value) {
            addCriterion("batch_state >=", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateLessThan(String value) {
            addCriterion("batch_state <", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateLessThanOrEqualTo(String value) {
            addCriterion("batch_state <=", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateLike(String value) {
            addCriterion("batch_state like", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateNotLike(String value) {
            addCriterion("batch_state not like", value, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateIn(List<String> values) {
            addCriterion("batch_state in", values, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateNotIn(List<String> values) {
            addCriterion("batch_state not in", values, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateBetween(String value1, String value2) {
            addCriterion("batch_state between", value1, value2, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchStateNotBetween(String value1, String value2) {
            addCriterion("batch_state not between", value1, value2, "batchState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateIsNull() {
            addCriterion("batch_intervene_state is null");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateIsNotNull() {
            addCriterion("batch_intervene_state is not null");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateEqualTo(String value) {
            addCriterion("batch_intervene_state =", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateNotEqualTo(String value) {
            addCriterion("batch_intervene_state <>", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateGreaterThan(String value) {
            addCriterion("batch_intervene_state >", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateGreaterThanOrEqualTo(String value) {
            addCriterion("batch_intervene_state >=", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateLessThan(String value) {
            addCriterion("batch_intervene_state <", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateLessThanOrEqualTo(String value) {
            addCriterion("batch_intervene_state <=", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateLike(String value) {
            addCriterion("batch_intervene_state like", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateNotLike(String value) {
            addCriterion("batch_intervene_state not like", value, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateIn(List<String> values) {
            addCriterion("batch_intervene_state in", values, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateNotIn(List<String> values) {
            addCriterion("batch_intervene_state not in", values, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateBetween(String value1, String value2) {
            addCriterion("batch_intervene_state between", value1, value2, "batchInterveneState");
            return (Criteria) this;
        }

        public Criteria andBatchInterveneStateNotBetween(String value1, String value2) {
            addCriterion("batch_intervene_state not between", value1, value2, "batchInterveneState");
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

        public Criteria andNeedRunCountIsNull() {
            addCriterion("need_run_count is null");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountIsNotNull() {
            addCriterion("need_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountEqualTo(Integer value) {
            addCriterion("need_run_count =", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountNotEqualTo(Integer value) {
            addCriterion("need_run_count <>", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountGreaterThan(Integer value) {
            addCriterion("need_run_count >", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_run_count >=", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountLessThan(Integer value) {
            addCriterion("need_run_count <", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("need_run_count <=", value, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountIn(List<Integer> values) {
            addCriterion("need_run_count in", values, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountNotIn(List<Integer> values) {
            addCriterion("need_run_count not in", values, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountBetween(Integer value1, Integer value2) {
            addCriterion("need_run_count between", value1, value2, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andNeedRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("need_run_count not between", value1, value2, "needRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountIsNull() {
            addCriterion("exist_run_count is null");
            return (Criteria) this;
        }

        public Criteria andExistRunCountIsNotNull() {
            addCriterion("exist_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andExistRunCountEqualTo(Integer value) {
            addCriterion("exist_run_count =", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountNotEqualTo(Integer value) {
            addCriterion("exist_run_count <>", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountGreaterThan(Integer value) {
            addCriterion("exist_run_count >", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("exist_run_count >=", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountLessThan(Integer value) {
            addCriterion("exist_run_count <", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("exist_run_count <=", value, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountIn(List<Integer> values) {
            addCriterion("exist_run_count in", values, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountNotIn(List<Integer> values) {
            addCriterion("exist_run_count not in", values, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountBetween(Integer value1, Integer value2) {
            addCriterion("exist_run_count between", value1, value2, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andExistRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("exist_run_count not between", value1, value2, "existRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountIsNull() {
            addCriterion("not_run_count is null");
            return (Criteria) this;
        }

        public Criteria andNotRunCountIsNotNull() {
            addCriterion("not_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andNotRunCountEqualTo(Integer value) {
            addCriterion("not_run_count =", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountNotEqualTo(Integer value) {
            addCriterion("not_run_count <>", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountGreaterThan(Integer value) {
            addCriterion("not_run_count >", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_run_count >=", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountLessThan(Integer value) {
            addCriterion("not_run_count <", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("not_run_count <=", value, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountIn(List<Integer> values) {
            addCriterion("not_run_count in", values, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountNotIn(List<Integer> values) {
            addCriterion("not_run_count not in", values, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountBetween(Integer value1, Integer value2) {
            addCriterion("not_run_count between", value1, value2, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andNotRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("not_run_count not between", value1, value2, "notRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountIsNull() {
            addCriterion("succeed_run_count is null");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountIsNotNull() {
            addCriterion("succeed_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountEqualTo(Integer value) {
            addCriterion("succeed_run_count =", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountNotEqualTo(Integer value) {
            addCriterion("succeed_run_count <>", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountGreaterThan(Integer value) {
            addCriterion("succeed_run_count >", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succeed_run_count >=", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountLessThan(Integer value) {
            addCriterion("succeed_run_count <", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("succeed_run_count <=", value, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountIn(List<Integer> values) {
            addCriterion("succeed_run_count in", values, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountNotIn(List<Integer> values) {
            addCriterion("succeed_run_count not in", values, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountBetween(Integer value1, Integer value2) {
            addCriterion("succeed_run_count between", value1, value2, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andSucceedRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succeed_run_count not between", value1, value2, "succeedRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountIsNull() {
            addCriterion("faild_run_count is null");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountIsNotNull() {
            addCriterion("faild_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountEqualTo(Integer value) {
            addCriterion("faild_run_count =", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountNotEqualTo(Integer value) {
            addCriterion("faild_run_count <>", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountGreaterThan(Integer value) {
            addCriterion("faild_run_count >", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("faild_run_count >=", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountLessThan(Integer value) {
            addCriterion("faild_run_count <", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("faild_run_count <=", value, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountIn(List<Integer> values) {
            addCriterion("faild_run_count in", values, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountNotIn(List<Integer> values) {
            addCriterion("faild_run_count not in", values, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountBetween(Integer value1, Integer value2) {
            addCriterion("faild_run_count between", value1, value2, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andFaildRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("faild_run_count not between", value1, value2, "faildRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountIsNull() {
            addCriterion("warn_run_count is null");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountIsNotNull() {
            addCriterion("warn_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountEqualTo(Integer value) {
            addCriterion("warn_run_count =", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountNotEqualTo(Integer value) {
            addCriterion("warn_run_count <>", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountGreaterThan(Integer value) {
            addCriterion("warn_run_count >", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_run_count >=", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountLessThan(Integer value) {
            addCriterion("warn_run_count <", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("warn_run_count <=", value, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountIn(List<Integer> values) {
            addCriterion("warn_run_count in", values, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountNotIn(List<Integer> values) {
            addCriterion("warn_run_count not in", values, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountBetween(Integer value1, Integer value2) {
            addCriterion("warn_run_count between", value1, value2, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andWarnRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_run_count not between", value1, value2, "warnRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountIsNull() {
            addCriterion("skip_run_count is null");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountIsNotNull() {
            addCriterion("skip_run_count is not null");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountEqualTo(Integer value) {
            addCriterion("skip_run_count =", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountNotEqualTo(Integer value) {
            addCriterion("skip_run_count <>", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountGreaterThan(Integer value) {
            addCriterion("skip_run_count >", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("skip_run_count >=", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountLessThan(Integer value) {
            addCriterion("skip_run_count <", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("skip_run_count <=", value, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountIn(List<Integer> values) {
            addCriterion("skip_run_count in", values, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountNotIn(List<Integer> values) {
            addCriterion("skip_run_count not in", values, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountBetween(Integer value1, Integer value2) {
            addCriterion("skip_run_count between", value1, value2, "skipRunCount");
            return (Criteria) this;
        }

        public Criteria andSkipRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("skip_run_count not between", value1, value2, "skipRunCount");
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

        public Criteria andSubsCodeIsNull() {
            addCriterion("subs_code is null");
            return (Criteria) this;
        }

        public Criteria andSubsCodeIsNotNull() {
            addCriterion("subs_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubsCodeEqualTo(String value) {
            addCriterion("subs_code =", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotEqualTo(String value) {
            addCriterion("subs_code <>", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeGreaterThan(String value) {
            addCriterion("subs_code >", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subs_code >=", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLessThan(String value) {
            addCriterion("subs_code <", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLessThanOrEqualTo(String value) {
            addCriterion("subs_code <=", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeLike(String value) {
            addCriterion("subs_code like", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotLike(String value) {
            addCriterion("subs_code not like", value, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeIn(List<String> values) {
            addCriterion("subs_code in", values, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotIn(List<String> values) {
            addCriterion("subs_code not in", values, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeBetween(String value1, String value2) {
            addCriterion("subs_code between", value1, value2, "subsCode");
            return (Criteria) this;
        }

        public Criteria andSubsCodeNotBetween(String value1, String value2) {
            addCriterion("subs_code not between", value1, value2, "subsCode");
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