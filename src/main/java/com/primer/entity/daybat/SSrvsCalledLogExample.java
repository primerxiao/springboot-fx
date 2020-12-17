package com.primer.entity.daybat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SSrvsCalledLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSrvsCalledLogExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientUseridIsNull() {
            addCriterion("client_userid is null");
            return (Criteria) this;
        }

        public Criteria andClientUseridIsNotNull() {
            addCriterion("client_userid is not null");
            return (Criteria) this;
        }

        public Criteria andClientUseridEqualTo(String value) {
            addCriterion("client_userid =", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridNotEqualTo(String value) {
            addCriterion("client_userid <>", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridGreaterThan(String value) {
            addCriterion("client_userid >", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridGreaterThanOrEqualTo(String value) {
            addCriterion("client_userid >=", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridLessThan(String value) {
            addCriterion("client_userid <", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridLessThanOrEqualTo(String value) {
            addCriterion("client_userid <=", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridLike(String value) {
            addCriterion("client_userid like", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridNotLike(String value) {
            addCriterion("client_userid not like", value, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridIn(List<String> values) {
            addCriterion("client_userid in", values, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridNotIn(List<String> values) {
            addCriterion("client_userid not in", values, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridBetween(String value1, String value2) {
            addCriterion("client_userid between", value1, value2, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andClientUseridNotBetween(String value1, String value2) {
            addCriterion("client_userid not between", value1, value2, "clientUserid");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIsNull() {
            addCriterion("srvs_inst_id is null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIsNotNull() {
            addCriterion("srvs_inst_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdEqualTo(String value) {
            addCriterion("srvs_inst_id =", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotEqualTo(String value) {
            addCriterion("srvs_inst_id <>", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdGreaterThan(String value) {
            addCriterion("srvs_inst_id >", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_inst_id >=", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLessThan(String value) {
            addCriterion("srvs_inst_id <", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLessThanOrEqualTo(String value) {
            addCriterion("srvs_inst_id <=", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdLike(String value) {
            addCriterion("srvs_inst_id like", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotLike(String value) {
            addCriterion("srvs_inst_id not like", value, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdIn(List<String> values) {
            addCriterion("srvs_inst_id in", values, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotIn(List<String> values) {
            addCriterion("srvs_inst_id not in", values, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdBetween(String value1, String value2) {
            addCriterion("srvs_inst_id between", value1, value2, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsInstIdNotBetween(String value1, String value2) {
            addCriterion("srvs_inst_id not between", value1, value2, "srvsInstId");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeIsNull() {
            addCriterion("srvs_log_type is null");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeIsNotNull() {
            addCriterion("srvs_log_type is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeEqualTo(String value) {
            addCriterion("srvs_log_type =", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeNotEqualTo(String value) {
            addCriterion("srvs_log_type <>", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeGreaterThan(String value) {
            addCriterion("srvs_log_type >", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_log_type >=", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeLessThan(String value) {
            addCriterion("srvs_log_type <", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeLessThanOrEqualTo(String value) {
            addCriterion("srvs_log_type <=", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeLike(String value) {
            addCriterion("srvs_log_type like", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeNotLike(String value) {
            addCriterion("srvs_log_type not like", value, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeIn(List<String> values) {
            addCriterion("srvs_log_type in", values, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeNotIn(List<String> values) {
            addCriterion("srvs_log_type not in", values, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeBetween(String value1, String value2) {
            addCriterion("srvs_log_type between", value1, value2, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsLogTypeNotBetween(String value1, String value2) {
            addCriterion("srvs_log_type not between", value1, value2, "srvsLogType");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeIsNull() {
            addCriterion("srvs_busi_code is null");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeIsNotNull() {
            addCriterion("srvs_busi_code is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeEqualTo(String value) {
            addCriterion("srvs_busi_code =", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeNotEqualTo(String value) {
            addCriterion("srvs_busi_code <>", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeGreaterThan(String value) {
            addCriterion("srvs_busi_code >", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_busi_code >=", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeLessThan(String value) {
            addCriterion("srvs_busi_code <", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("srvs_busi_code <=", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeLike(String value) {
            addCriterion("srvs_busi_code like", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeNotLike(String value) {
            addCriterion("srvs_busi_code not like", value, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeIn(List<String> values) {
            addCriterion("srvs_busi_code in", values, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeNotIn(List<String> values) {
            addCriterion("srvs_busi_code not in", values, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeBetween(String value1, String value2) {
            addCriterion("srvs_busi_code between", value1, value2, "srvsBusiCode");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiCodeNotBetween(String value1, String value2) {
            addCriterion("srvs_busi_code not between", value1, value2, "srvsBusiCode");
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

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(String value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(String value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(String value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(String value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(String value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(String value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLike(String value) {
            addCriterion("stop_time like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotLike(String value) {
            addCriterion("stop_time not like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<String> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<String> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(String value1, String value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(String value1, String value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andInBufferIsNull() {
            addCriterion("in_buffer is null");
            return (Criteria) this;
        }

        public Criteria andInBufferIsNotNull() {
            addCriterion("in_buffer is not null");
            return (Criteria) this;
        }

        public Criteria andInBufferEqualTo(String value) {
            addCriterion("in_buffer =", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferNotEqualTo(String value) {
            addCriterion("in_buffer <>", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferGreaterThan(String value) {
            addCriterion("in_buffer >", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferGreaterThanOrEqualTo(String value) {
            addCriterion("in_buffer >=", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferLessThan(String value) {
            addCriterion("in_buffer <", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferLessThanOrEqualTo(String value) {
            addCriterion("in_buffer <=", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferLike(String value) {
            addCriterion("in_buffer like", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferNotLike(String value) {
            addCriterion("in_buffer not like", value, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferIn(List<String> values) {
            addCriterion("in_buffer in", values, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferNotIn(List<String> values) {
            addCriterion("in_buffer not in", values, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferBetween(String value1, String value2) {
            addCriterion("in_buffer between", value1, value2, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andInBufferNotBetween(String value1, String value2) {
            addCriterion("in_buffer not between", value1, value2, "inBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferIsNull() {
            addCriterion("out_buffer is null");
            return (Criteria) this;
        }

        public Criteria andOutBufferIsNotNull() {
            addCriterion("out_buffer is not null");
            return (Criteria) this;
        }

        public Criteria andOutBufferEqualTo(String value) {
            addCriterion("out_buffer =", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferNotEqualTo(String value) {
            addCriterion("out_buffer <>", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferGreaterThan(String value) {
            addCriterion("out_buffer >", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferGreaterThanOrEqualTo(String value) {
            addCriterion("out_buffer >=", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferLessThan(String value) {
            addCriterion("out_buffer <", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferLessThanOrEqualTo(String value) {
            addCriterion("out_buffer <=", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferLike(String value) {
            addCriterion("out_buffer like", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferNotLike(String value) {
            addCriterion("out_buffer not like", value, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferIn(List<String> values) {
            addCriterion("out_buffer in", values, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferNotIn(List<String> values) {
            addCriterion("out_buffer not in", values, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferBetween(String value1, String value2) {
            addCriterion("out_buffer between", value1, value2, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andOutBufferNotBetween(String value1, String value2) {
            addCriterion("out_buffer not between", value1, value2, "outBuffer");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultIsNull() {
            addCriterion("srvs_busi_result is null");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultIsNotNull() {
            addCriterion("srvs_busi_result is not null");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultEqualTo(String value) {
            addCriterion("srvs_busi_result =", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultNotEqualTo(String value) {
            addCriterion("srvs_busi_result <>", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultGreaterThan(String value) {
            addCriterion("srvs_busi_result >", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultGreaterThanOrEqualTo(String value) {
            addCriterion("srvs_busi_result >=", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultLessThan(String value) {
            addCriterion("srvs_busi_result <", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultLessThanOrEqualTo(String value) {
            addCriterion("srvs_busi_result <=", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultLike(String value) {
            addCriterion("srvs_busi_result like", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultNotLike(String value) {
            addCriterion("srvs_busi_result not like", value, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultIn(List<String> values) {
            addCriterion("srvs_busi_result in", values, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultNotIn(List<String> values) {
            addCriterion("srvs_busi_result not in", values, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultBetween(String value1, String value2) {
            addCriterion("srvs_busi_result between", value1, value2, "srvsBusiResult");
            return (Criteria) this;
        }

        public Criteria andSrvsBusiResultNotBetween(String value1, String value2) {
            addCriterion("srvs_busi_result not between", value1, value2, "srvsBusiResult");
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