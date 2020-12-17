package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SAutocodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SAutocodeExample() {
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

        public Criteria andAtypeIsNull() {
            addCriterion("atype is null");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNotNull() {
            addCriterion("atype is not null");
            return (Criteria) this;
        }

        public Criteria andAtypeEqualTo(String value) {
            addCriterion("atype =", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotEqualTo(String value) {
            addCriterion("atype <>", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThan(String value) {
            addCriterion("atype >", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThanOrEqualTo(String value) {
            addCriterion("atype >=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThan(String value) {
            addCriterion("atype <", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThanOrEqualTo(String value) {
            addCriterion("atype <=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLike(String value) {
            addCriterion("atype like", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotLike(String value) {
            addCriterion("atype not like", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeIn(List<String> values) {
            addCriterion("atype in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotIn(List<String> values) {
            addCriterion("atype not in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeBetween(String value1, String value2) {
            addCriterion("atype between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotBetween(String value1, String value2) {
            addCriterion("atype not between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("`owner` is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("`owner` is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("`owner` =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("`owner` <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("`owner` >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("`owner` >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("`owner` <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("`owner` <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("`owner` like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("`owner` not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("`owner` in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("`owner` not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("`owner` between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("`owner` not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andInitcycleIsNull() {
            addCriterion("initcycle is null");
            return (Criteria) this;
        }

        public Criteria andInitcycleIsNotNull() {
            addCriterion("initcycle is not null");
            return (Criteria) this;
        }

        public Criteria andInitcycleEqualTo(String value) {
            addCriterion("initcycle =", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleNotEqualTo(String value) {
            addCriterion("initcycle <>", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleGreaterThan(String value) {
            addCriterion("initcycle >", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleGreaterThanOrEqualTo(String value) {
            addCriterion("initcycle >=", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleLessThan(String value) {
            addCriterion("initcycle <", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleLessThanOrEqualTo(String value) {
            addCriterion("initcycle <=", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleLike(String value) {
            addCriterion("initcycle like", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleNotLike(String value) {
            addCriterion("initcycle not like", value, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleIn(List<String> values) {
            addCriterion("initcycle in", values, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleNotIn(List<String> values) {
            addCriterion("initcycle not in", values, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleBetween(String value1, String value2) {
            addCriterion("initcycle between", value1, value2, "initcycle");
            return (Criteria) this;
        }

        public Criteria andInitcycleNotBetween(String value1, String value2) {
            addCriterion("initcycle not between", value1, value2, "initcycle");
            return (Criteria) this;
        }

        public Criteria andCurSernumIsNull() {
            addCriterion("cur_sernum is null");
            return (Criteria) this;
        }

        public Criteria andCurSernumIsNotNull() {
            addCriterion("cur_sernum is not null");
            return (Criteria) this;
        }

        public Criteria andCurSernumEqualTo(String value) {
            addCriterion("cur_sernum =", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumNotEqualTo(String value) {
            addCriterion("cur_sernum <>", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumGreaterThan(String value) {
            addCriterion("cur_sernum >", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumGreaterThanOrEqualTo(String value) {
            addCriterion("cur_sernum >=", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumLessThan(String value) {
            addCriterion("cur_sernum <", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumLessThanOrEqualTo(String value) {
            addCriterion("cur_sernum <=", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumLike(String value) {
            addCriterion("cur_sernum like", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumNotLike(String value) {
            addCriterion("cur_sernum not like", value, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumIn(List<String> values) {
            addCriterion("cur_sernum in", values, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumNotIn(List<String> values) {
            addCriterion("cur_sernum not in", values, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumBetween(String value1, String value2) {
            addCriterion("cur_sernum between", value1, value2, "curSernum");
            return (Criteria) this;
        }

        public Criteria andCurSernumNotBetween(String value1, String value2) {
            addCriterion("cur_sernum not between", value1, value2, "curSernum");
            return (Criteria) this;
        }

        public Criteria andZeroFlgIsNull() {
            addCriterion("zero_flg is null");
            return (Criteria) this;
        }

        public Criteria andZeroFlgIsNotNull() {
            addCriterion("zero_flg is not null");
            return (Criteria) this;
        }

        public Criteria andZeroFlgEqualTo(String value) {
            addCriterion("zero_flg =", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgNotEqualTo(String value) {
            addCriterion("zero_flg <>", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgGreaterThan(String value) {
            addCriterion("zero_flg >", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgGreaterThanOrEqualTo(String value) {
            addCriterion("zero_flg >=", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgLessThan(String value) {
            addCriterion("zero_flg <", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgLessThanOrEqualTo(String value) {
            addCriterion("zero_flg <=", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgLike(String value) {
            addCriterion("zero_flg like", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgNotLike(String value) {
            addCriterion("zero_flg not like", value, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgIn(List<String> values) {
            addCriterion("zero_flg in", values, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgNotIn(List<String> values) {
            addCriterion("zero_flg not in", values, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgBetween(String value1, String value2) {
            addCriterion("zero_flg between", value1, value2, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andZeroFlgNotBetween(String value1, String value2) {
            addCriterion("zero_flg not between", value1, value2, "zeroFlg");
            return (Criteria) this;
        }

        public Criteria andCurDateIsNull() {
            addCriterion("cur_date is null");
            return (Criteria) this;
        }

        public Criteria andCurDateIsNotNull() {
            addCriterion("cur_date is not null");
            return (Criteria) this;
        }

        public Criteria andCurDateEqualTo(String value) {
            addCriterion("cur_date =", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotEqualTo(String value) {
            addCriterion("cur_date <>", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateGreaterThan(String value) {
            addCriterion("cur_date >", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateGreaterThanOrEqualTo(String value) {
            addCriterion("cur_date >=", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLessThan(String value) {
            addCriterion("cur_date <", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLessThanOrEqualTo(String value) {
            addCriterion("cur_date <=", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLike(String value) {
            addCriterion("cur_date like", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotLike(String value) {
            addCriterion("cur_date not like", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateIn(List<String> values) {
            addCriterion("cur_date in", values, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotIn(List<String> values) {
            addCriterion("cur_date not in", values, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateBetween(String value1, String value2) {
            addCriterion("cur_date between", value1, value2, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotBetween(String value1, String value2) {
            addCriterion("cur_date not between", value1, value2, "curDate");
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