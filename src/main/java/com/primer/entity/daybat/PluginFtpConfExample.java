package com.primer.entity.daybat;

import java.util.ArrayList;
import java.util.List;

public class PluginFtpConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PluginFtpConfExample() {
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

        public Criteria andSftpServerIpIsNull() {
            addCriterion("sftp_server_ip is null");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpIsNotNull() {
            addCriterion("sftp_server_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpEqualTo(String value) {
            addCriterion("sftp_server_ip =", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpNotEqualTo(String value) {
            addCriterion("sftp_server_ip <>", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpGreaterThan(String value) {
            addCriterion("sftp_server_ip >", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("sftp_server_ip >=", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpLessThan(String value) {
            addCriterion("sftp_server_ip <", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpLessThanOrEqualTo(String value) {
            addCriterion("sftp_server_ip <=", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpLike(String value) {
            addCriterion("sftp_server_ip like", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpNotLike(String value) {
            addCriterion("sftp_server_ip not like", value, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpIn(List<String> values) {
            addCriterion("sftp_server_ip in", values, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpNotIn(List<String> values) {
            addCriterion("sftp_server_ip not in", values, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpBetween(String value1, String value2) {
            addCriterion("sftp_server_ip between", value1, value2, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andSftpServerIpNotBetween(String value1, String value2) {
            addCriterion("sftp_server_ip not between", value1, value2, "sftpServerIp");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortIsNull() {
            addCriterion("ftp_server_port is null");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortIsNotNull() {
            addCriterion("ftp_server_port is not null");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortEqualTo(Integer value) {
            addCriterion("ftp_server_port =", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortNotEqualTo(Integer value) {
            addCriterion("ftp_server_port <>", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortGreaterThan(Integer value) {
            addCriterion("ftp_server_port >", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftp_server_port >=", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortLessThan(Integer value) {
            addCriterion("ftp_server_port <", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortLessThanOrEqualTo(Integer value) {
            addCriterion("ftp_server_port <=", value, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortIn(List<Integer> values) {
            addCriterion("ftp_server_port in", values, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortNotIn(List<Integer> values) {
            addCriterion("ftp_server_port not in", values, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortBetween(Integer value1, Integer value2) {
            addCriterion("ftp_server_port between", value1, value2, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerPortNotBetween(Integer value1, Integer value2) {
            addCriterion("ftp_server_port not between", value1, value2, "ftpServerPort");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserIsNull() {
            addCriterion("ftp_server_user is null");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserIsNotNull() {
            addCriterion("ftp_server_user is not null");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserEqualTo(String value) {
            addCriterion("ftp_server_user =", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserNotEqualTo(String value) {
            addCriterion("ftp_server_user <>", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserGreaterThan(String value) {
            addCriterion("ftp_server_user >", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_server_user >=", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserLessThan(String value) {
            addCriterion("ftp_server_user <", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserLessThanOrEqualTo(String value) {
            addCriterion("ftp_server_user <=", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserLike(String value) {
            addCriterion("ftp_server_user like", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserNotLike(String value) {
            addCriterion("ftp_server_user not like", value, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserIn(List<String> values) {
            addCriterion("ftp_server_user in", values, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserNotIn(List<String> values) {
            addCriterion("ftp_server_user not in", values, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserBetween(String value1, String value2) {
            addCriterion("ftp_server_user between", value1, value2, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerUserNotBetween(String value1, String value2) {
            addCriterion("ftp_server_user not between", value1, value2, "ftpServerUser");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdIsNull() {
            addCriterion("ftp_server_pwd is null");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdIsNotNull() {
            addCriterion("ftp_server_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdEqualTo(String value) {
            addCriterion("ftp_server_pwd =", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdNotEqualTo(String value) {
            addCriterion("ftp_server_pwd <>", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdGreaterThan(String value) {
            addCriterion("ftp_server_pwd >", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_server_pwd >=", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdLessThan(String value) {
            addCriterion("ftp_server_pwd <", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdLessThanOrEqualTo(String value) {
            addCriterion("ftp_server_pwd <=", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdLike(String value) {
            addCriterion("ftp_server_pwd like", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdNotLike(String value) {
            addCriterion("ftp_server_pwd not like", value, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdIn(List<String> values) {
            addCriterion("ftp_server_pwd in", values, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdNotIn(List<String> values) {
            addCriterion("ftp_server_pwd not in", values, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdBetween(String value1, String value2) {
            addCriterion("ftp_server_pwd between", value1, value2, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andFtpServerPwdNotBetween(String value1, String value2) {
            addCriterion("ftp_server_pwd not between", value1, value2, "ftpServerPwd");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIsNull() {
            addCriterion("load_type is null");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIsNotNull() {
            addCriterion("load_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoadTypeEqualTo(String value) {
            addCriterion("load_type =", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotEqualTo(String value) {
            addCriterion("load_type <>", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeGreaterThan(String value) {
            addCriterion("load_type >", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("load_type >=", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeLessThan(String value) {
            addCriterion("load_type <", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeLessThanOrEqualTo(String value) {
            addCriterion("load_type <=", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeLike(String value) {
            addCriterion("load_type like", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotLike(String value) {
            addCriterion("load_type not like", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIn(List<String> values) {
            addCriterion("load_type in", values, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotIn(List<String> values) {
            addCriterion("load_type not in", values, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeBetween(String value1, String value2) {
            addCriterion("load_type between", value1, value2, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotBetween(String value1, String value2) {
            addCriterion("load_type not between", value1, value2, "loadType");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameIsNull() {
            addCriterion("remote_file_name is null");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameIsNotNull() {
            addCriterion("remote_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameEqualTo(String value) {
            addCriterion("remote_file_name =", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameNotEqualTo(String value) {
            addCriterion("remote_file_name <>", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameGreaterThan(String value) {
            addCriterion("remote_file_name >", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("remote_file_name >=", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameLessThan(String value) {
            addCriterion("remote_file_name <", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameLessThanOrEqualTo(String value) {
            addCriterion("remote_file_name <=", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameLike(String value) {
            addCriterion("remote_file_name like", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameNotLike(String value) {
            addCriterion("remote_file_name not like", value, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameIn(List<String> values) {
            addCriterion("remote_file_name in", values, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameNotIn(List<String> values) {
            addCriterion("remote_file_name not in", values, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameBetween(String value1, String value2) {
            addCriterion("remote_file_name between", value1, value2, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andRemoteFileNameNotBetween(String value1, String value2) {
            addCriterion("remote_file_name not between", value1, value2, "remoteFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameIsNull() {
            addCriterion("local_file_name is null");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameIsNotNull() {
            addCriterion("local_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameEqualTo(String value) {
            addCriterion("local_file_name =", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameNotEqualTo(String value) {
            addCriterion("local_file_name <>", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameGreaterThan(String value) {
            addCriterion("local_file_name >", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("local_file_name >=", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameLessThan(String value) {
            addCriterion("local_file_name <", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameLessThanOrEqualTo(String value) {
            addCriterion("local_file_name <=", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameLike(String value) {
            addCriterion("local_file_name like", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameNotLike(String value) {
            addCriterion("local_file_name not like", value, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameIn(List<String> values) {
            addCriterion("local_file_name in", values, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameNotIn(List<String> values) {
            addCriterion("local_file_name not in", values, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameBetween(String value1, String value2) {
            addCriterion("local_file_name between", value1, value2, "localFileName");
            return (Criteria) this;
        }

        public Criteria andLocalFileNameNotBetween(String value1, String value2) {
            addCriterion("local_file_name not between", value1, value2, "localFileName");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathIsNull() {
            addCriterion("ftp_file_path is null");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathIsNotNull() {
            addCriterion("ftp_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathEqualTo(String value) {
            addCriterion("ftp_file_path =", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathNotEqualTo(String value) {
            addCriterion("ftp_file_path <>", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathGreaterThan(String value) {
            addCriterion("ftp_file_path >", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_file_path >=", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathLessThan(String value) {
            addCriterion("ftp_file_path <", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathLessThanOrEqualTo(String value) {
            addCriterion("ftp_file_path <=", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathLike(String value) {
            addCriterion("ftp_file_path like", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathNotLike(String value) {
            addCriterion("ftp_file_path not like", value, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathIn(List<String> values) {
            addCriterion("ftp_file_path in", values, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathNotIn(List<String> values) {
            addCriterion("ftp_file_path not in", values, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathBetween(String value1, String value2) {
            addCriterion("ftp_file_path between", value1, value2, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andFtpFilePathNotBetween(String value1, String value2) {
            addCriterion("ftp_file_path not between", value1, value2, "ftpFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathIsNull() {
            addCriterion("local_file_path is null");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathIsNotNull() {
            addCriterion("local_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathEqualTo(String value) {
            addCriterion("local_file_path =", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathNotEqualTo(String value) {
            addCriterion("local_file_path <>", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathGreaterThan(String value) {
            addCriterion("local_file_path >", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("local_file_path >=", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathLessThan(String value) {
            addCriterion("local_file_path <", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathLessThanOrEqualTo(String value) {
            addCriterion("local_file_path <=", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathLike(String value) {
            addCriterion("local_file_path like", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathNotLike(String value) {
            addCriterion("local_file_path not like", value, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathIn(List<String> values) {
            addCriterion("local_file_path in", values, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathNotIn(List<String> values) {
            addCriterion("local_file_path not in", values, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathBetween(String value1, String value2) {
            addCriterion("local_file_path between", value1, value2, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andLocalFilePathNotBetween(String value1, String value2) {
            addCriterion("local_file_path not between", value1, value2, "localFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckExistIsNull() {
            addCriterion("check_exist is null");
            return (Criteria) this;
        }

        public Criteria andCheckExistIsNotNull() {
            addCriterion("check_exist is not null");
            return (Criteria) this;
        }

        public Criteria andCheckExistEqualTo(String value) {
            addCriterion("check_exist =", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistNotEqualTo(String value) {
            addCriterion("check_exist <>", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistGreaterThan(String value) {
            addCriterion("check_exist >", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistGreaterThanOrEqualTo(String value) {
            addCriterion("check_exist >=", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistLessThan(String value) {
            addCriterion("check_exist <", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistLessThanOrEqualTo(String value) {
            addCriterion("check_exist <=", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistLike(String value) {
            addCriterion("check_exist like", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistNotLike(String value) {
            addCriterion("check_exist not like", value, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistIn(List<String> values) {
            addCriterion("check_exist in", values, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistNotIn(List<String> values) {
            addCriterion("check_exist not in", values, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistBetween(String value1, String value2) {
            addCriterion("check_exist between", value1, value2, "checkExist");
            return (Criteria) this;
        }

        public Criteria andCheckExistNotBetween(String value1, String value2) {
            addCriterion("check_exist not between", value1, value2, "checkExist");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(String value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(String value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(String value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(String value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(String value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLike(String value) {
            addCriterion("server_type like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotLike(String value) {
            addCriterion("server_type not like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<String> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<String> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(String value1, String value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(String value1, String value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
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