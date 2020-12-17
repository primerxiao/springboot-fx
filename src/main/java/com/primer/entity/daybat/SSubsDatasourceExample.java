package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class SSubsDatasourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public SSubsDatasourceExample() {
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

        public Criteria andSubsDsNameIsNull() {
            addCriterion("subs_ds_name is null");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameIsNotNull() {
            addCriterion("subs_ds_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameEqualTo(String value) {
            addCriterion("subs_ds_name =", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameNotEqualTo(String value) {
            addCriterion("subs_ds_name <>", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameGreaterThan(String value) {
            addCriterion("subs_ds_name >", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameGreaterThanOrEqualTo(String value) {
            addCriterion("subs_ds_name >=", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameLessThan(String value) {
            addCriterion("subs_ds_name <", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameLessThanOrEqualTo(String value) {
            addCriterion("subs_ds_name <=", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameLike(String value) {
            addCriterion("subs_ds_name like", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameNotLike(String value) {
            addCriterion("subs_ds_name not like", value, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameIn(List<String> values) {
            addCriterion("subs_ds_name in", values, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameNotIn(List<String> values) {
            addCriterion("subs_ds_name not in", values, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameBetween(String value1, String value2) {
            addCriterion("subs_ds_name between", value1, value2, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andSubsDsNameNotBetween(String value1, String value2) {
            addCriterion("subs_ds_name not between", value1, value2, "subsDsName");
            return (Criteria) this;
        }

        public Criteria andDsConnStrIsNull() {
            addCriterion("ds_conn_str is null");
            return (Criteria) this;
        }

        public Criteria andDsConnStrIsNotNull() {
            addCriterion("ds_conn_str is not null");
            return (Criteria) this;
        }

        public Criteria andDsConnStrEqualTo(String value) {
            addCriterion("ds_conn_str =", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrNotEqualTo(String value) {
            addCriterion("ds_conn_str <>", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrGreaterThan(String value) {
            addCriterion("ds_conn_str >", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrGreaterThanOrEqualTo(String value) {
            addCriterion("ds_conn_str >=", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrLessThan(String value) {
            addCriterion("ds_conn_str <", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrLessThanOrEqualTo(String value) {
            addCriterion("ds_conn_str <=", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrLike(String value) {
            addCriterion("ds_conn_str like", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrNotLike(String value) {
            addCriterion("ds_conn_str not like", value, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrIn(List<String> values) {
            addCriterion("ds_conn_str in", values, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrNotIn(List<String> values) {
            addCriterion("ds_conn_str not in", values, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrBetween(String value1, String value2) {
            addCriterion("ds_conn_str between", value1, value2, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsConnStrNotBetween(String value1, String value2) {
            addCriterion("ds_conn_str not between", value1, value2, "dsConnStr");
            return (Criteria) this;
        }

        public Criteria andDsUserIdIsNull() {
            addCriterion("ds_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDsUserIdIsNotNull() {
            addCriterion("ds_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDsUserIdEqualTo(String value) {
            addCriterion("ds_user_id =", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdNotEqualTo(String value) {
            addCriterion("ds_user_id <>", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdGreaterThan(String value) {
            addCriterion("ds_user_id >", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ds_user_id >=", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdLessThan(String value) {
            addCriterion("ds_user_id <", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdLessThanOrEqualTo(String value) {
            addCriterion("ds_user_id <=", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdLike(String value) {
            addCriterion("ds_user_id like", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdNotLike(String value) {
            addCriterion("ds_user_id not like", value, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdIn(List<String> values) {
            addCriterion("ds_user_id in", values, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdNotIn(List<String> values) {
            addCriterion("ds_user_id not in", values, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdBetween(String value1, String value2) {
            addCriterion("ds_user_id between", value1, value2, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserIdNotBetween(String value1, String value2) {
            addCriterion("ds_user_id not between", value1, value2, "dsUserId");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdIsNull() {
            addCriterion("ds_user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdIsNotNull() {
            addCriterion("ds_user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdEqualTo(String value) {
            addCriterion("ds_user_pwd =", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdNotEqualTo(String value) {
            addCriterion("ds_user_pwd <>", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdGreaterThan(String value) {
            addCriterion("ds_user_pwd >", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ds_user_pwd >=", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdLessThan(String value) {
            addCriterion("ds_user_pwd <", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdLessThanOrEqualTo(String value) {
            addCriterion("ds_user_pwd <=", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdLike(String value) {
            addCriterion("ds_user_pwd like", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdNotLike(String value) {
            addCriterion("ds_user_pwd not like", value, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdIn(List<String> values) {
            addCriterion("ds_user_pwd in", values, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdNotIn(List<String> values) {
            addCriterion("ds_user_pwd not in", values, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdBetween(String value1, String value2) {
            addCriterion("ds_user_pwd between", value1, value2, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsUserPwdNotBetween(String value1, String value2) {
            addCriterion("ds_user_pwd not between", value1, value2, "dsUserPwd");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameIsNull() {
            addCriterion("ds_schema_name is null");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameIsNotNull() {
            addCriterion("ds_schema_name is not null");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameEqualTo(String value) {
            addCriterion("ds_schema_name =", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameNotEqualTo(String value) {
            addCriterion("ds_schema_name <>", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameGreaterThan(String value) {
            addCriterion("ds_schema_name >", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("ds_schema_name >=", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameLessThan(String value) {
            addCriterion("ds_schema_name <", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameLessThanOrEqualTo(String value) {
            addCriterion("ds_schema_name <=", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameLike(String value) {
            addCriterion("ds_schema_name like", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameNotLike(String value) {
            addCriterion("ds_schema_name not like", value, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameIn(List<String> values) {
            addCriterion("ds_schema_name in", values, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameNotIn(List<String> values) {
            addCriterion("ds_schema_name not in", values, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameBetween(String value1, String value2) {
            addCriterion("ds_schema_name between", value1, value2, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsSchemaNameNotBetween(String value1, String value2) {
            addCriterion("ds_schema_name not between", value1, value2, "dsSchemaName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameIsNull() {
            addCriterion("ds_db_name is null");
            return (Criteria) this;
        }

        public Criteria andDsDbNameIsNotNull() {
            addCriterion("ds_db_name is not null");
            return (Criteria) this;
        }

        public Criteria andDsDbNameEqualTo(String value) {
            addCriterion("ds_db_name =", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameNotEqualTo(String value) {
            addCriterion("ds_db_name <>", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameGreaterThan(String value) {
            addCriterion("ds_db_name >", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameGreaterThanOrEqualTo(String value) {
            addCriterion("ds_db_name >=", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameLessThan(String value) {
            addCriterion("ds_db_name <", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameLessThanOrEqualTo(String value) {
            addCriterion("ds_db_name <=", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameLike(String value) {
            addCriterion("ds_db_name like", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameNotLike(String value) {
            addCriterion("ds_db_name not like", value, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameIn(List<String> values) {
            addCriterion("ds_db_name in", values, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameNotIn(List<String> values) {
            addCriterion("ds_db_name not in", values, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameBetween(String value1, String value2) {
            addCriterion("ds_db_name between", value1, value2, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andDsDbNameNotBetween(String value1, String value2) {
            addCriterion("ds_db_name not between", value1, value2, "dsDbName");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeIsNull() {
            addCriterion("subs_ds_type is null");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeIsNotNull() {
            addCriterion("subs_ds_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeEqualTo(String value) {
            addCriterion("subs_ds_type =", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeNotEqualTo(String value) {
            addCriterion("subs_ds_type <>", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeGreaterThan(String value) {
            addCriterion("subs_ds_type >", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("subs_ds_type >=", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeLessThan(String value) {
            addCriterion("subs_ds_type <", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeLessThanOrEqualTo(String value) {
            addCriterion("subs_ds_type <=", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeLike(String value) {
            addCriterion("subs_ds_type like", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeNotLike(String value) {
            addCriterion("subs_ds_type not like", value, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeIn(List<String> values) {
            addCriterion("subs_ds_type in", values, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeNotIn(List<String> values) {
            addCriterion("subs_ds_type not in", values, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeBetween(String value1, String value2) {
            addCriterion("subs_ds_type between", value1, value2, "subsDsType");
            return (Criteria) this;
        }

        public Criteria andSubsDsTypeNotBetween(String value1, String value2) {
            addCriterion("subs_ds_type not between", value1, value2, "subsDsType");
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