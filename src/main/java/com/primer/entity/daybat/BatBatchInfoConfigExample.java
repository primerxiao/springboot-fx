package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class BatBatchInfoConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BatBatchInfoConfigExample() {
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

        public Criteria andLaunchTypeIsNull() {
            addCriterion("launch_type is null");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeIsNotNull() {
            addCriterion("launch_type is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeEqualTo(String value) {
            addCriterion("launch_type =", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeNotEqualTo(String value) {
            addCriterion("launch_type <>", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeGreaterThan(String value) {
            addCriterion("launch_type >", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("launch_type >=", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeLessThan(String value) {
            addCriterion("launch_type <", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeLessThanOrEqualTo(String value) {
            addCriterion("launch_type <=", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeLike(String value) {
            addCriterion("launch_type like", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeNotLike(String value) {
            addCriterion("launch_type not like", value, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeIn(List<String> values) {
            addCriterion("launch_type in", values, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeNotIn(List<String> values) {
            addCriterion("launch_type not in", values, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeBetween(String value1, String value2) {
            addCriterion("launch_type between", value1, value2, "launchType");
            return (Criteria) this;
        }

        public Criteria andLaunchTypeNotBetween(String value1, String value2) {
            addCriterion("launch_type not between", value1, value2, "launchType");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueIsNull() {
            addCriterion("batch_cron_value is null");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueIsNotNull() {
            addCriterion("batch_cron_value is not null");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueEqualTo(String value) {
            addCriterion("batch_cron_value =", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueNotEqualTo(String value) {
            addCriterion("batch_cron_value <>", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueGreaterThan(String value) {
            addCriterion("batch_cron_value >", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueGreaterThanOrEqualTo(String value) {
            addCriterion("batch_cron_value >=", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueLessThan(String value) {
            addCriterion("batch_cron_value <", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueLessThanOrEqualTo(String value) {
            addCriterion("batch_cron_value <=", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueLike(String value) {
            addCriterion("batch_cron_value like", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueNotLike(String value) {
            addCriterion("batch_cron_value not like", value, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueIn(List<String> values) {
            addCriterion("batch_cron_value in", values, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueNotIn(List<String> values) {
            addCriterion("batch_cron_value not in", values, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueBetween(String value1, String value2) {
            addCriterion("batch_cron_value between", value1, value2, "batchCronValue");
            return (Criteria) this;
        }

        public Criteria andBatchCronValueNotBetween(String value1, String value2) {
            addCriterion("batch_cron_value not between", value1, value2, "batchCronValue");
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

        public Criteria andEquallyTaskAmountIsNull() {
            addCriterion("equally_task_amount is null");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountIsNotNull() {
            addCriterion("equally_task_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountEqualTo(Integer value) {
            addCriterion("equally_task_amount =", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountNotEqualTo(Integer value) {
            addCriterion("equally_task_amount <>", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountGreaterThan(Integer value) {
            addCriterion("equally_task_amount >", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("equally_task_amount >=", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountLessThan(Integer value) {
            addCriterion("equally_task_amount <", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountLessThanOrEqualTo(Integer value) {
            addCriterion("equally_task_amount <=", value, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountIn(List<Integer> values) {
            addCriterion("equally_task_amount in", values, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountNotIn(List<Integer> values) {
            addCriterion("equally_task_amount not in", values, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountBetween(Integer value1, Integer value2) {
            addCriterion("equally_task_amount between", value1, value2, "equallyTaskAmount");
            return (Criteria) this;
        }

        public Criteria andEquallyTaskAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("equally_task_amount not between", value1, value2, "equallyTaskAmount");
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

        public Criteria andIsRunAgainIsNull() {
            addCriterion("is_run_again is null");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainIsNotNull() {
            addCriterion("is_run_again is not null");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainEqualTo(String value) {
            addCriterion("is_run_again =", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainNotEqualTo(String value) {
            addCriterion("is_run_again <>", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainGreaterThan(String value) {
            addCriterion("is_run_again >", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainGreaterThanOrEqualTo(String value) {
            addCriterion("is_run_again >=", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainLessThan(String value) {
            addCriterion("is_run_again <", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainLessThanOrEqualTo(String value) {
            addCriterion("is_run_again <=", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainLike(String value) {
            addCriterion("is_run_again like", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainNotLike(String value) {
            addCriterion("is_run_again not like", value, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainIn(List<String> values) {
            addCriterion("is_run_again in", values, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainNotIn(List<String> values) {
            addCriterion("is_run_again not in", values, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainBetween(String value1, String value2) {
            addCriterion("is_run_again between", value1, value2, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andIsRunAgainNotBetween(String value1, String value2) {
            addCriterion("is_run_again not between", value1, value2, "isRunAgain");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
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