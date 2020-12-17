package com.primer.entity.daybat;

/**
 * Table: plugin_ftp_conf
 */
public class PluginFtpConf {
    /**
     * Column: plugin_conf_id
     * Remark: 配置标识符
     */
    private String pluginConfId;

    /**
     * Column: conf_sort
     * Remark: 配置顺序
     */
    private Integer confSort;

    /**
     * Column: sftp_server_ip
     * Remark: 地址
     */
    private String sftpServerIp;

    /**
     * Column: ftp_server_port
     * Remark: 端口
     */
    private Integer ftpServerPort;

    /**
     * Column: ftp_server_user
     * Remark: 用户名
     */
    private String ftpServerUser;

    /**
     * Column: ftp_server_pwd
     * Remark: 密码
     */
    private String ftpServerPwd;

    /**
     * Column: load_type
     * Remark: 操作类型
     */
    private String loadType;

    /**
     * Column: remote_file_name
     * Remark: 服务器文件名称
     */
    private String remoteFileName;

    /**
     * Column: local_file_name
     * Remark: 本地文件名称
     */
    private String localFileName;

    /**
     * Column: ftp_file_path
     * Remark: 服务器文件路径
     */
    private String ftpFilePath;

    /**
     * Column: local_file_path
     * Remark: 本地路径
     */
    private String localFilePath;

    /**
     * Column: check_exist
     * Remark: 是否需要检查文件存在
     */
    private String checkExist;

    /**
     * Column: server_type
     */
    private String serverType;

    public String getPluginConfId() {
        return pluginConfId;
    }

    public void setPluginConfId(String pluginConfId) {
        this.pluginConfId = pluginConfId == null ? null : pluginConfId.trim();
    }

    public Integer getConfSort() {
        return confSort;
    }

    public void setConfSort(Integer confSort) {
        this.confSort = confSort;
    }

    public String getSftpServerIp() {
        return sftpServerIp;
    }

    public void setSftpServerIp(String sftpServerIp) {
        this.sftpServerIp = sftpServerIp == null ? null : sftpServerIp.trim();
    }

    public Integer getFtpServerPort() {
        return ftpServerPort;
    }

    public void setFtpServerPort(Integer ftpServerPort) {
        this.ftpServerPort = ftpServerPort;
    }

    public String getFtpServerUser() {
        return ftpServerUser;
    }

    public void setFtpServerUser(String ftpServerUser) {
        this.ftpServerUser = ftpServerUser == null ? null : ftpServerUser.trim();
    }

    public String getFtpServerPwd() {
        return ftpServerPwd;
    }

    public void setFtpServerPwd(String ftpServerPwd) {
        this.ftpServerPwd = ftpServerPwd == null ? null : ftpServerPwd.trim();
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType == null ? null : loadType.trim();
    }

    public String getRemoteFileName() {
        return remoteFileName;
    }

    public void setRemoteFileName(String remoteFileName) {
        this.remoteFileName = remoteFileName == null ? null : remoteFileName.trim();
    }

    public String getLocalFileName() {
        return localFileName;
    }

    public void setLocalFileName(String localFileName) {
        this.localFileName = localFileName == null ? null : localFileName.trim();
    }

    public String getFtpFilePath() {
        return ftpFilePath;
    }

    public void setFtpFilePath(String ftpFilePath) {
        this.ftpFilePath = ftpFilePath == null ? null : ftpFilePath.trim();
    }

    public String getLocalFilePath() {
        return localFilePath;
    }

    public void setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath == null ? null : localFilePath.trim();
    }

    public String getCheckExist() {
        return checkExist;
    }

    public void setCheckExist(String checkExist) {
        this.checkExist = checkExist == null ? null : checkExist.trim();
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType == null ? null : serverType.trim();
    }
}