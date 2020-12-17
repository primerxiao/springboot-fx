package com.primer.service;


import java.sql.SQLException;
import java.util.List;

public interface BatchService {

    /**
     * 查询结果集为list
     * @param dataSourceKey 数据源key
     * @param sql 查询语句
     * @param clasz 数据类型
     * @return list
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    List list(String dataSourceKey, String sql, Class clasz) throws SQLException, IllegalAccessException, InstantiationException;

    Object queryOne(String dataSourceKey, String sql, Class clasz) throws SQLException, IllegalAccessException, InstantiationException;

    /**
     * 执行删除语句
     * @param dataSourceKey 数据源
     * @param sql 删除语句
     * @throws SQLException
     */
    int delete(String dataSourceKey, String sql) throws SQLException;

    /**
     * 执行更新语句
     * @param dataSourceKey 数据源
     * @param sql 更新语句
     * @return
     */
    int update(String dataSourceKey, String sql) throws SQLException;

}
