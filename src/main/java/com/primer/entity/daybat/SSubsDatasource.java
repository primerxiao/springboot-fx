package com.primer.entity.daybat;

/**
 * Table: s_subs_datasource
 */
public class SSubsDatasource {
    /**
     * Column: subs_code
     * Remark: 子系统代码
     */
    private String subsCode;

    /**
     * Column: subs_ds_code
     * Remark: 子系统数据源代码
     */
    private String subsDsCode;

    /**
     * Column: subs_ds_name
     * Remark: 子系统数据源名称
     */
    private String subsDsName;

    /**
     * Column: ds_conn_str
     * Remark: 数据源-连接字符串
     */
    private String dsConnStr;

    /**
     * Column: ds_user_id
     * Remark: 数据源-用户名
     */
    private String dsUserId;

    /**
     * Column: ds_user_pwd
     * Remark: 数据源-用户密码
     */
    private String dsUserPwd;

    /**
     * Column: ds_schema_name
     * Remark: 数据源-模式
     */
    private String dsSchemaName;

    /**
     * Column: ds_db_name
     * Remark: 数据源-数据库名
     */
    private String dsDbName;

    /**
     * Column: subs_ds_type
     * Remark: 子系统数据源类型
     */
    private String subsDsType;

    public String getSubsCode() {
        return subsCode;
    }

    public void setSubsCode(String subsCode) {
        this.subsCode = subsCode == null ? null : subsCode.trim();
    }

    public String getSubsDsCode() {
        return subsDsCode;
    }

    public void setSubsDsCode(String subsDsCode) {
        this.subsDsCode = subsDsCode == null ? null : subsDsCode.trim();
    }

    public String getSubsDsName() {
        return subsDsName;
    }

    public void setSubsDsName(String subsDsName) {
        this.subsDsName = subsDsName == null ? null : subsDsName.trim();
    }

    public String getDsConnStr() {
        return dsConnStr;
    }

    public void setDsConnStr(String dsConnStr) {
        this.dsConnStr = dsConnStr == null ? null : dsConnStr.trim();
    }

    public String getDsUserId() {
        return dsUserId;
    }

    public void setDsUserId(String dsUserId) {
        this.dsUserId = dsUserId == null ? null : dsUserId.trim();
    }

    public String getDsUserPwd() {
        return dsUserPwd;
    }

    public void setDsUserPwd(String dsUserPwd) {
        this.dsUserPwd = dsUserPwd == null ? null : dsUserPwd.trim();
    }

    public String getDsSchemaName() {
        return dsSchemaName;
    }

    public void setDsSchemaName(String dsSchemaName) {
        this.dsSchemaName = dsSchemaName == null ? null : dsSchemaName.trim();
    }

    public String getDsDbName() {
        return dsDbName;
    }

    public void setDsDbName(String dsDbName) {
        this.dsDbName = dsDbName == null ? null : dsDbName.trim();
    }

    public String getSubsDsType() {
        return subsDsType;
    }

    public void setSubsDsType(String subsDsType) {
        this.subsDsType = subsDsType == null ? null : subsDsType.trim();
    }
}