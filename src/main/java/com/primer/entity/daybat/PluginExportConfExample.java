package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginExportConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginExportConfExample() {
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

        public Criteria andExportModeIsNull() {
            addCriterion("export_mode is null");
            return (Criteria) this;
        }

        public Criteria andExportModeIsNotNull() {
            addCriterion("export_mode is not null");
            return (Criteria) this;
        }

        public Criteria andExportModeEqualTo(String value) {
            addCriterion("export_mode =", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeNotEqualTo(String value) {
            addCriterion("export_mode <>", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeGreaterThan(String value) {
            addCriterion("export_mode >", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeGreaterThanOrEqualTo(String value) {
            addCriterion("export_mode >=", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeLessThan(String value) {
            addCriterion("export_mode <", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeLessThanOrEqualTo(String value) {
            addCriterion("export_mode <=", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeLike(String value) {
            addCriterion("export_mode like", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeNotLike(String value) {
            addCriterion("export_mode not like", value, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeIn(List<String> values) {
            addCriterion("export_mode in", values, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeNotIn(List<String> values) {
            addCriterion("export_mode not in", values, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeBetween(String value1, String value2) {
            addCriterion("export_mode between", value1, value2, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportModeNotBetween(String value1, String value2) {
            addCriterion("export_mode not between", value1, value2, "exportMode");
            return (Criteria) this;
        }

        public Criteria andExportTargetIsNull() {
            addCriterion("export_target is null");
            return (Criteria) this;
        }

        public Criteria andExportTargetIsNotNull() {
            addCriterion("export_target is not null");
            return (Criteria) this;
        }

        public Criteria andExportTargetEqualTo(String value) {
            addCriterion("export_target =", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetNotEqualTo(String value) {
            addCriterion("export_target <>", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetGreaterThan(String value) {
            addCriterion("export_target >", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetGreaterThanOrEqualTo(String value) {
            addCriterion("export_target >=", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetLessThan(String value) {
            addCriterion("export_target <", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetLessThanOrEqualTo(String value) {
            addCriterion("export_target <=", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetLike(String value) {
            addCriterion("export_target like", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetNotLike(String value) {
            addCriterion("export_target not like", value, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetIn(List<String> values) {
            addCriterion("export_target in", values, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetNotIn(List<String> values) {
            addCriterion("export_target not in", values, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetBetween(String value1, String value2) {
            addCriterion("export_target between", value1, value2, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportTargetNotBetween(String value1, String value2) {
            addCriterion("export_target not between", value1, value2, "exportTarget");
            return (Criteria) this;
        }

        public Criteria andExportToFileIsNull() {
            addCriterion("export_to_file is null");
            return (Criteria) this;
        }

        public Criteria andExportToFileIsNotNull() {
            addCriterion("export_to_file is not null");
            return (Criteria) this;
        }

        public Criteria andExportToFileEqualTo(String value) {
            addCriterion("export_to_file =", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileNotEqualTo(String value) {
            addCriterion("export_to_file <>", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileGreaterThan(String value) {
            addCriterion("export_to_file >", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileGreaterThanOrEqualTo(String value) {
            addCriterion("export_to_file >=", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileLessThan(String value) {
            addCriterion("export_to_file <", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileLessThanOrEqualTo(String value) {
            addCriterion("export_to_file <=", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileLike(String value) {
            addCriterion("export_to_file like", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileNotLike(String value) {
            addCriterion("export_to_file not like", value, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileIn(List<String> values) {
            addCriterion("export_to_file in", values, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileNotIn(List<String> values) {
            addCriterion("export_to_file not in", values, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileBetween(String value1, String value2) {
            addCriterion("export_to_file between", value1, value2, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andExportToFileNotBetween(String value1, String value2) {
            addCriterion("export_to_file not between", value1, value2, "exportToFile");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorIsNull() {
            addCriterion("field_separator is null");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorIsNotNull() {
            addCriterion("field_separator is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorEqualTo(String value) {
            addCriterion("field_separator =", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorNotEqualTo(String value) {
            addCriterion("field_separator <>", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorGreaterThan(String value) {
            addCriterion("field_separator >", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorGreaterThanOrEqualTo(String value) {
            addCriterion("field_separator >=", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorLessThan(String value) {
            addCriterion("field_separator <", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorLessThanOrEqualTo(String value) {
            addCriterion("field_separator <=", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorLike(String value) {
            addCriterion("field_separator like", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorNotLike(String value) {
            addCriterion("field_separator not like", value, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorIn(List<String> values) {
            addCriterion("field_separator in", values, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorNotIn(List<String> values) {
            addCriterion("field_separator not in", values, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorBetween(String value1, String value2) {
            addCriterion("field_separator between", value1, value2, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFieldSeparatorNotBetween(String value1, String value2) {
            addCriterion("field_separator not between", value1, value2, "fieldSeparator");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIsNull() {
            addCriterion("file_charset is null");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIsNotNull() {
            addCriterion("file_charset is not null");
            return (Criteria) this;
        }

        public Criteria andFileCharsetEqualTo(String value) {
            addCriterion("file_charset =", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotEqualTo(String value) {
            addCriterion("file_charset <>", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetGreaterThan(String value) {
            addCriterion("file_charset >", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("file_charset >=", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLessThan(String value) {
            addCriterion("file_charset <", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLessThanOrEqualTo(String value) {
            addCriterion("file_charset <=", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetLike(String value) {
            addCriterion("file_charset like", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotLike(String value) {
            addCriterion("file_charset not like", value, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetIn(List<String> values) {
            addCriterion("file_charset in", values, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotIn(List<String> values) {
            addCriterion("file_charset not in", values, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetBetween(String value1, String value2) {
            addCriterion("file_charset between", value1, value2, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andFileCharsetNotBetween(String value1, String value2) {
            addCriterion("file_charset not between", value1, value2, "fileCharset");
            return (Criteria) this;
        }

        public Criteria andIsOkFileIsNull() {
            addCriterion("is_ok_file is null");
            return (Criteria) this;
        }

        public Criteria andIsOkFileIsNotNull() {
            addCriterion("is_ok_file is not null");
            return (Criteria) this;
        }

        public Criteria andIsOkFileEqualTo(String value) {
            addCriterion("is_ok_file =", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileNotEqualTo(String value) {
            addCriterion("is_ok_file <>", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileGreaterThan(String value) {
            addCriterion("is_ok_file >", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileGreaterThanOrEqualTo(String value) {
            addCriterion("is_ok_file >=", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileLessThan(String value) {
            addCriterion("is_ok_file <", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileLessThanOrEqualTo(String value) {
            addCriterion("is_ok_file <=", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileLike(String value) {
            addCriterion("is_ok_file like", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileNotLike(String value) {
            addCriterion("is_ok_file not like", value, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileIn(List<String> values) {
            addCriterion("is_ok_file in", values, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileNotIn(List<String> values) {
            addCriterion("is_ok_file not in", values, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileBetween(String value1, String value2) {
            addCriterion("is_ok_file between", value1, value2, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andIsOkFileNotBetween(String value1, String value2) {
            addCriterion("is_ok_file not between", value1, value2, "isOkFile");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameIsNull() {
            addCriterion("ok_file_full_name is null");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameIsNotNull() {
            addCriterion("ok_file_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameEqualTo(String value) {
            addCriterion("ok_file_full_name =", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameNotEqualTo(String value) {
            addCriterion("ok_file_full_name <>", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameGreaterThan(String value) {
            addCriterion("ok_file_full_name >", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("ok_file_full_name >=", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameLessThan(String value) {
            addCriterion("ok_file_full_name <", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameLessThanOrEqualTo(String value) {
            addCriterion("ok_file_full_name <=", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameLike(String value) {
            addCriterion("ok_file_full_name like", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameNotLike(String value) {
            addCriterion("ok_file_full_name not like", value, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameIn(List<String> values) {
            addCriterion("ok_file_full_name in", values, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameNotIn(List<String> values) {
            addCriterion("ok_file_full_name not in", values, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameBetween(String value1, String value2) {
            addCriterion("ok_file_full_name between", value1, value2, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileFullNameNotBetween(String value1, String value2) {
            addCriterion("ok_file_full_name not between", value1, value2, "okFileFullName");
            return (Criteria) this;
        }

        public Criteria andOkFileContentIsNull() {
            addCriterion("ok_file_content is null");
            return (Criteria) this;
        }

        public Criteria andOkFileContentIsNotNull() {
            addCriterion("ok_file_content is not null");
            return (Criteria) this;
        }

        public Criteria andOkFileContentEqualTo(String value) {
            addCriterion("ok_file_content =", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentNotEqualTo(String value) {
            addCriterion("ok_file_content <>", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentGreaterThan(String value) {
            addCriterion("ok_file_content >", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentGreaterThanOrEqualTo(String value) {
            addCriterion("ok_file_content >=", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentLessThan(String value) {
            addCriterion("ok_file_content <", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentLessThanOrEqualTo(String value) {
            addCriterion("ok_file_content <=", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentLike(String value) {
            addCriterion("ok_file_content like", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentNotLike(String value) {
            addCriterion("ok_file_content not like", value, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentIn(List<String> values) {
            addCriterion("ok_file_content in", values, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentNotIn(List<String> values) {
            addCriterion("ok_file_content not in", values, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentBetween(String value1, String value2) {
            addCriterion("ok_file_content between", value1, value2, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andOkFileContentNotBetween(String value1, String value2) {
            addCriterion("ok_file_content not between", value1, value2, "okFileContent");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIsNull() {
            addCriterion("is_deal_empty_str is null");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIsNotNull() {
            addCriterion("is_deal_empty_str is not null");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrEqualTo(String value) {
            addCriterion("is_deal_empty_str =", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotEqualTo(String value) {
            addCriterion("is_deal_empty_str <>", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrGreaterThan(String value) {
            addCriterion("is_deal_empty_str >", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrGreaterThanOrEqualTo(String value) {
            addCriterion("is_deal_empty_str >=", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLessThan(String value) {
            addCriterion("is_deal_empty_str <", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLessThanOrEqualTo(String value) {
            addCriterion("is_deal_empty_str <=", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrLike(String value) {
            addCriterion("is_deal_empty_str like", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotLike(String value) {
            addCriterion("is_deal_empty_str not like", value, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrIn(List<String> values) {
            addCriterion("is_deal_empty_str in", values, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotIn(List<String> values) {
            addCriterion("is_deal_empty_str not in", values, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrBetween(String value1, String value2) {
            addCriterion("is_deal_empty_str between", value1, value2, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andIsDealEmptyStrNotBetween(String value1, String value2) {
            addCriterion("is_deal_empty_str not between", value1, value2, "isDealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIsNull() {
            addCriterion("deal_empty_str is null");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIsNotNull() {
            addCriterion("deal_empty_str is not null");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrEqualTo(String value) {
            addCriterion("deal_empty_str =", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotEqualTo(String value) {
            addCriterion("deal_empty_str <>", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrGreaterThan(String value) {
            addCriterion("deal_empty_str >", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrGreaterThanOrEqualTo(String value) {
            addCriterion("deal_empty_str >=", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLessThan(String value) {
            addCriterion("deal_empty_str <", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLessThanOrEqualTo(String value) {
            addCriterion("deal_empty_str <=", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrLike(String value) {
            addCriterion("deal_empty_str like", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotLike(String value) {
            addCriterion("deal_empty_str not like", value, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrIn(List<String> values) {
            addCriterion("deal_empty_str in", values, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotIn(List<String> values) {
            addCriterion("deal_empty_str not in", values, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrBetween(String value1, String value2) {
            addCriterion("deal_empty_str between", value1, value2, "dealEmptyStr");
            return (Criteria) this;
        }

        public Criteria andDealEmptyStrNotBetween(String value1, String value2) {
            addCriterion("deal_empty_str not between", value1, value2, "dealEmptyStr");
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