package com.primer.common.database;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DataSourceManager {

    public static Map<String, DruidDataSource> dataSourceMap;

    static {
        dataSourceMap = new HashMap<>();
    }

    /**
     * 添加数据源
     *
     * @param key
     * @param druidDataSource
     */
    public static void addDataSource(String key, DruidDataSource druidDataSource) {
        if (druidDataSource == null) {
            return;
        }
        if (dataSourceMap.containsKey(key)) {
            druidDataSource.close();
            return;
        }
        dataSourceMap.put(key, druidDataSource);
    }

    /**
     * 移除数据源
     *
     * @param key
     */
    public static void removeDataSource(String key) {
        dataSourceMap.remove(key);
    }

    /**
     * 创建一个数据源
     *
     * @param ip       数据库ip
     * @param port     数据库端口
     * @param dataName 数据库名
     * @param userName 用户名
     * @param password 密码
     */
    public static DruidDataSource createDataSource(String ip, String port, String dataName, String userName, String password) {
        final String join = String.join("", "jdbc:mysql://", ip, ":", port, "/", dataName, "?characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&allowMultiQueries=true");
        System.out.println(join);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(join);
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setInitialSize(2);
        dataSource.setLoginTimeout(10);
        return dataSource;
    }

    /**
     * 根据数据源key获取连接
     * @param key
     * @return 连接
     * @throws SQLException
     */
    public static DruidPooledConnection getConnection(String key) throws SQLException {
        if (!dataSourceMap.containsKey(key)) {
            return null;
        }
        return dataSourceMap.get(key).getConnection();
    }

    public static DruidDataSource getDataSource(String key) {
        if (!dataSourceMap.containsKey(key)) {
            return null;
        }
        return dataSourceMap.get(key);
    }



}
