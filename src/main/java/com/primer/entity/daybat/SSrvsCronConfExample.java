package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SSrvsCronConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSrvsCronConfExample() {
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

        public Criteria andJobCodeIsNull() {
            addCriterion("job_code is null");
            return (Criteria) this;
        }

        public Criteria andJobCodeIsNotNull() {
            addCriterion("job_code is not null");
            return (Criteria) this;
        }

        public Criteria andJobCodeEqualTo(String value) {
            addCriterion("job_code =", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotEqualTo(String value) {
            addCriterion("job_code <>", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThan(String value) {
            addCriterion("job_code >", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThanOrEqualTo(String value) {
            addCriterion("job_code >=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThan(String value) {
            addCriterion("job_code <", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThanOrEqualTo(String value) {
            addCriterion("job_code <=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLike(String value) {
            addCriterion("job_code like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotLike(String value) {
            addCriterion("job_code not like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeIn(List<String> values) {
            addCriterion("job_code in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotIn(List<String> values) {
            addCriterion("job_code not in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeBetween(String value1, String value2) {
            addCriterion("job_code between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotBetween(String value1, String value2) {
            addCriterion("job_code not between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNull() {
            addCriterion("job_desc is null");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNotNull() {
            addCriterion("job_desc is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescEqualTo(String value) {
            addCriterion("job_desc =", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotEqualTo(String value) {
            addCriterion("job_desc <>", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThan(String value) {
            addCriterion("job_desc >", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThanOrEqualTo(String value) {
            addCriterion("job_desc >=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThan(String value) {
            addCriterion("job_desc <", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThanOrEqualTo(String value) {
            addCriterion("job_desc <=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLike(String value) {
            addCriterion("job_desc like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotLike(String value) {
            addCriterion("job_desc not like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescIn(List<String> values) {
            addCriterion("job_desc in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotIn(List<String> values) {
            addCriterion("job_desc not in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescBetween(String value1, String value2) {
            addCriterion("job_desc between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotBetween(String value1, String value2) {
            addCriterion("job_desc not between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeIsNull() {
            addCriterion("job_class_type is null");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeIsNotNull() {
            addCriterion("job_class_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeEqualTo(String value) {
            addCriterion("job_class_type =", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeNotEqualTo(String value) {
            addCriterion("job_class_type <>", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeGreaterThan(String value) {
            addCriterion("job_class_type >", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job_class_type >=", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeLessThan(String value) {
            addCriterion("job_class_type <", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeLessThanOrEqualTo(String value) {
            addCriterion("job_class_type <=", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeLike(String value) {
            addCriterion("job_class_type like", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeNotLike(String value) {
            addCriterion("job_class_type not like", value, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeIn(List<String> values) {
            addCriterion("job_class_type in", values, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeNotIn(List<String> values) {
            addCriterion("job_class_type not in", values, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeBetween(String value1, String value2) {
            addCriterion("job_class_type between", value1, value2, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassTypeNotBetween(String value1, String value2) {
            addCriterion("job_class_type not between", value1, value2, "jobClassType");
            return (Criteria) this;
        }

        public Criteria andJobClassIsNull() {
            addCriterion("job_class is null");
            return (Criteria) this;
        }

        public Criteria andJobClassIsNotNull() {
            addCriterion("job_class is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassEqualTo(String value) {
            addCriterion("job_class =", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotEqualTo(String value) {
            addCriterion("job_class <>", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThan(String value) {
            addCriterion("job_class >", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThanOrEqualTo(String value) {
            addCriterion("job_class >=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThan(String value) {
            addCriterion("job_class <", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThanOrEqualTo(String value) {
            addCriterion("job_class <=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLike(String value) {
            addCriterion("job_class like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotLike(String value) {
            addCriterion("job_class not like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassIn(List<String> values) {
            addCriterion("job_class in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotIn(List<String> values) {
            addCriterion("job_class not in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassBetween(String value1, String value2) {
            addCriterion("job_class between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotBetween(String value1, String value2) {
            addCriterion("job_class not between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobMethodIsNull() {
            addCriterion("job_method is null");
            return (Criteria) this;
        }

        public Criteria andJobMethodIsNotNull() {
            addCriterion("job_method is not null");
            return (Criteria) this;
        }

        public Criteria andJobMethodEqualTo(String value) {
            addCriterion("job_method =", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotEqualTo(String value) {
            addCriterion("job_method <>", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodGreaterThan(String value) {
            addCriterion("job_method >", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodGreaterThanOrEqualTo(String value) {
            addCriterion("job_method >=", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLessThan(String value) {
            addCriterion("job_method <", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLessThanOrEqualTo(String value) {
            addCriterion("job_method <=", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLike(String value) {
            addCriterion("job_method like", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotLike(String value) {
            addCriterion("job_method not like", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodIn(List<String> values) {
            addCriterion("job_method in", values, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotIn(List<String> values) {
            addCriterion("job_method not in", values, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodBetween(String value1, String value2) {
            addCriterion("job_method between", value1, value2, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotBetween(String value1, String value2) {
            addCriterion("job_method not between", value1, value2, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNull() {
            addCriterion("service_version is null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNotNull() {
            addCriterion("service_version is not null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionEqualTo(String value) {
            addCriterion("service_version =", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotEqualTo(String value) {
            addCriterion("service_version <>", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThan(String value) {
            addCriterion("service_version >", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("service_version >=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThan(String value) {
            addCriterion("service_version <", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThanOrEqualTo(String value) {
            addCriterion("service_version <=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLike(String value) {
            addCriterion("service_version like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotLike(String value) {
            addCriterion("service_version not like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIn(List<String> values) {
            addCriterion("service_version in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotIn(List<String> values) {
            addCriterion("service_version not in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionBetween(String value1, String value2) {
            addCriterion("service_version between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotBetween(String value1, String value2) {
            addCriterion("service_version not between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIsNull() {
            addCriterion("service_group is null");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIsNotNull() {
            addCriterion("service_group is not null");
            return (Criteria) this;
        }

        public Criteria andServiceGroupEqualTo(String value) {
            addCriterion("service_group =", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotEqualTo(String value) {
            addCriterion("service_group <>", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupGreaterThan(String value) {
            addCriterion("service_group >", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupGreaterThanOrEqualTo(String value) {
            addCriterion("service_group >=", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLessThan(String value) {
            addCriterion("service_group <", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLessThanOrEqualTo(String value) {
            addCriterion("service_group <=", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLike(String value) {
            addCriterion("service_group like", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotLike(String value) {
            addCriterion("service_group not like", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIn(List<String> values) {
            addCriterion("service_group in", values, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotIn(List<String> values) {
            addCriterion("service_group not in", values, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupBetween(String value1, String value2) {
            addCriterion("service_group between", value1, value2, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotBetween(String value1, String value2) {
            addCriterion("service_group not between", value1, value2, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutIsNull() {
            addCriterion("service_timeout is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutIsNotNull() {
            addCriterion("service_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutEqualTo(Integer value) {
            addCriterion("service_timeout =", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutNotEqualTo(Integer value) {
            addCriterion("service_timeout <>", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutGreaterThan(Integer value) {
            addCriterion("service_timeout >", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_timeout >=", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutLessThan(Integer value) {
            addCriterion("service_timeout <", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("service_timeout <=", value, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutIn(List<Integer> values) {
            addCriterion("service_timeout in", values, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutNotIn(List<Integer> values) {
            addCriterion("service_timeout not in", values, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("service_timeout between", value1, value2, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andServiceTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("service_timeout not between", value1, value2, "serviceTimeout");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNull() {
            addCriterion("cron_expression is null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNotNull() {
            addCriterion("cron_expression is not null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionEqualTo(String value) {
            addCriterion("cron_expression =", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotEqualTo(String value) {
            addCriterion("cron_expression <>", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThan(String value) {
            addCriterion("cron_expression >", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("cron_expression >=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThan(String value) {
            addCriterion("cron_expression <", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("cron_expression <=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLike(String value) {
            addCriterion("cron_expression like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotLike(String value) {
            addCriterion("cron_expression not like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIn(List<String> values) {
            addCriterion("cron_expression in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotIn(List<String> values) {
            addCriterion("cron_expression not in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionBetween(String value1, String value2) {
            addCriterion("cron_expression between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotBetween(String value1, String value2) {
            addCriterion("cron_expression not between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andAgainTimeIsNull() {
            addCriterion("again_time is null");
            return (Criteria) this;
        }

        public Criteria andAgainTimeIsNotNull() {
            addCriterion("again_time is not null");
            return (Criteria) this;
        }

        public Criteria andAgainTimeEqualTo(Integer value) {
            addCriterion("again_time =", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotEqualTo(Integer value) {
            addCriterion("again_time <>", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeGreaterThan(Integer value) {
            addCriterion("again_time >", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("again_time >=", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeLessThan(Integer value) {
            addCriterion("again_time <", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeLessThanOrEqualTo(Integer value) {
            addCriterion("again_time <=", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeIn(List<Integer> values) {
            addCriterion("again_time in", values, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotIn(List<Integer> values) {
            addCriterion("again_time not in", values, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeBetween(Integer value1, Integer value2) {
            addCriterion("again_time between", value1, value2, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("again_time not between", value1, value2, "againTime");
            return (Criteria) this;
        }

        public Criteria andRetrySecondIsNull() {
            addCriterion("retry_second is null");
            return (Criteria) this;
        }

        public Criteria andRetrySecondIsNotNull() {
            addCriterion("retry_second is not null");
            return (Criteria) this;
        }

        public Criteria andRetrySecondEqualTo(Integer value) {
            addCriterion("retry_second =", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondNotEqualTo(Integer value) {
            addCriterion("retry_second <>", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondGreaterThan(Integer value) {
            addCriterion("retry_second >", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("retry_second >=", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondLessThan(Integer value) {
            addCriterion("retry_second <", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondLessThanOrEqualTo(Integer value) {
            addCriterion("retry_second <=", value, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondIn(List<Integer> values) {
            addCriterion("retry_second in", values, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondNotIn(List<Integer> values) {
            addCriterion("retry_second not in", values, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondBetween(Integer value1, Integer value2) {
            addCriterion("retry_second between", value1, value2, "retrySecond");
            return (Criteria) this;
        }

        public Criteria andRetrySecondNotBetween(Integer value1, Integer value2) {
            addCriterion("retry_second not between", value1, value2, "retrySecond");
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
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