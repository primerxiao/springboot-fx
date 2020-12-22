package com.primer.gui.uicomponents.batch;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import com.primer.common.database.DataSourceManager;
import com.primer.common.database.DataToSql;
import com.primer.common.annotation.FXMLController;
import com.primer.common.util.AlertUtils;
import com.primer.repository.DataExportConfigRepository;
import com.primer.repository.DataSourceConfigRepository;
import com.primer.entity.DataExportConfig;
import com.primer.entity.DataSourceConfig;
import com.primer.entity.DataSourceConfigPK;
import com.primer.entity.daybat.BatBatchInfoConfig;
import com.primer.entity.daybat.BatInstTask;
import com.primer.entity.daybat.PluginLoadConf;
import com.primer.entity.daybat.SSubsInfo;
import com.primer.service.BatchService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Stream;

@FXMLController
public class BatchHelperController implements Initializable {

    @FXML
    public AnchorPane ctt;
    @FXML
    public Button extractSqlBtn;
    @FXML
    public Button clearBtn;
    @FXML
    public ListView envList;
    @FXML
    public ListView batchList;
    @FXML
    public TextArea console;
    @FXML
    public Button updateBathDate;
    @FXML
    public Button runBatch;
    @FXML
    public DatePicker batchDate;
    @FXML
    public BorderPane borderPane;
    @FXML
    public AnchorPane right;
    @FXML
    public MenuItem menuZxbsCheckTool;


    private String currentDataSourceKey;

    @FXML
    public WebView webView;

    @Autowired
    private DataSourceConfigRepository dataSourceConfigRepository;

    @Autowired
    private DataExportConfigRepository dataExportConfigRepository;

    @Autowired
    private BatchService batchService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //自适应
        //right.prefWidthProperty().bind(borderPane.widthProperty());
        //webView.prefWidthProperty().bind(right.widthProperty());

        //openWebView();
        //获取数据库配置
        console.appendText("\r\n获取数据库配置");
        List<DataSourceConfig> dataSourceConfigs = dataSourceConfigRepository.findAll();
        if (!dataSourceConfigs.isEmpty()) {
            envList.getItems().clear();
            ObservableList<Text> texts = FXCollections.observableArrayList();
            for (DataSourceConfig dataSourceConfig : dataSourceConfigs) {
                Text text = new Text(dataSourceConfig.getIp() + "  " + dataSourceConfig.getRemark());
                text.setOnMouseClicked(e -> {
                    //生成数据源 key=ip+dbname
                    currentDataSourceKey = dataSourceConfig.getIp() + "&&" + dataSourceConfig.getDataName();
                    if (!DataSourceManager.dataSourceMap.containsKey(currentDataSourceKey)) {
                        console.appendText("\r\n生成数据源");
                        DruidDataSource dataSource = DataSourceManager.createDataSource(dataSourceConfig.getIp(), dataSourceConfig.getPort(), dataSourceConfig.getDataName(), dataSourceConfig.getUserName(), dataSourceConfig.getPassword());
                        if (dataSource != null && !dataSource.isClosed()) {
                            DataSourceManager.addDataSource(currentDataSourceKey, dataSource);
                        }
                    }
                    this.batchList.getItems().clear();
                    loadBatchAndTimer(currentDataSourceKey);
                });
                texts.add(text);
            }
            envList.setItems(texts);
        }
        extractSqlBtn.setOnMouseClicked(e -> {
            try {
                setExtractSql();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        WebEngine engine = webView.getEngine();
        engine.getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == Worker.State.SUCCEEDED) {
                if (engine.getLocation().contains("login.html")) {
                    engine.executeScript("document.getElementById('userId').value='srvadmin'");
                    engine.executeScript("document.getElementById('password').value='srvadmin'");
                    engine.executeScript("doLoginCheck()");
                    engine.load("http://" + curip + ":8080/smcenter/page/smcenter.console/BatchMonitor.html?batchId=" + curbatchId);
                }
            }
        });

        String java_tool_options = System.getenv("JAVA_TOOL_OPTIONS");
        if (org.apache.commons.lang3.StringUtils.isEmpty(java_tool_options) || !java_tool_options.contains("-Dfile.encoding=UTF-8")) {
            AlertUtils.alertInfo("监测到您没有配置key为【JAVA_TOOL_OPTIONS】值为【-Dfile.encoding=UTF-8】的环境变量，缺少该变量会导致查看批次日志中文乱码！！！建议您配置该变量");
        }
    }

    private void loadBatchAndTimer(String key) {
        //加载批次数据 和 定时器数据
        try {
            console.appendText("\r\n加载批次数据");
            List<BatBatchInfoConfig> list = batchService.list(key, "select * from bat_batch_info_config", BatBatchInfoConfig.class);
            final ObservableList items = batchList.getItems();
            items.clear();
            for (BatBatchInfoConfig batBatchInfoConfig : list) {
                Text batchText = new Text(batBatchInfoConfig.getBatchId() + "  " + batBatchInfoConfig.getBatchName());
                batchText.setOnMouseClicked(event -> {
                    //loadStageAndTask(key,batBatchInfoConfig);
                    setBatchDateValue(batBatchInfoConfig.getBatchId());
                });
                items.add(batchText);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            console.appendText("\r\n" + ex.getLocalizedMessage());
        }
    }
/*    private void loadStageAndTask(String key,BatBatchInfoConfig batBatchInfoConfig) {
        try {
            appentConsole("加载批次任务数据");
            List<BatBatchStageConfig> list = batchService.list(key, "select * from bat_batch_stage_config where batch_id='"+batBatchInfoConfig.getBatchId()+"'", BatBatchStageConfig.class);

            TreeItem batchItem = new TreeItem<>();
            batchItem.setValue(batBatchInfoConfig.getBatchId());
            for (BatBatchStageConfig batBatchStageConfig : list) {
                TreeItem<String> stageItem = new TreeItem<>();
                stageItem.setValue(batBatchStageConfig.getStageId() + "_" + batBatchStageConfig.getStageName());
                //根据批次id和场景查询出任务id
                final List<BatTaskUnitConfig> batTaskUnitConfigs = batchService.list(key, "select *\n" +
                        "from bat_task_unit_config where batch_id='" + batBatchInfoConfig.getBatchId() + "' and stage_id='" + batBatchStageConfig.getStageId() + "'", BatTaskUnitConfig.class);
                for (BatTaskUnitConfig batTaskUnitConfig : batTaskUnitConfigs) {
                    TreeItem<String> taskItem = new TreeItem<>();
                    taskItem.setValue(batTaskUnitConfig.getTaskId() + "_" + batTaskUnitConfig.getTaskName());
                    stageItem.getChildren().add(taskItem);
                }
                batchItem.getChildren().add(stageItem);
            }
            taskTreeView = new TreeView<>(batchItem);
        } catch (Exception ex) {
            ex.printStackTrace();
            console.appendText("\r\n" + ex.getLocalizedMessage());
        }
    }*/

    public void setExtractSql() throws ClassNotFoundException {
        Text envText = (Text) envList.getSelectionModel().getSelectedItem();
        console.clear();
        console.appendText("###该批次从" + envText.getText().replace("  ", ":") + "导出！！！");
        console.appendText("\r\nuse efp_daybat;");
        //获取批次id
        Text selectedItem1 = (Text) batchList.getSelectionModel().getSelectedItem();
        String batchId = selectedItem1.getText().split("  ")[0];
        //查询导出配置
        List<DataExportConfig> list = this.dataExportConfigRepository.findAll();

        for (DataExportConfig dataExportConfig : list) {
            console.appendText("\r\n" + dataExportConfig.getRemark());
            Class<?> aClass = Class.forName(dataExportConfig.getClassName());
            try {
                List dataList = batchService.list(this.currentDataSourceKey, dataExportConfig.getQueryStatement().replace("@batch_id", "'" + batchId + "'"), aClass);
                if (dataExportConfig.getClassName().equals("com.primer.entity.daybat.PluginLoadConf")) {
                    for (Object o : dataList) {
                        PluginLoadConf pluginLoadConf = (PluginLoadConf) o;
                        final String loadSeparator = pluginLoadConf.getLoadSeparator();
                        if (com.google.common.base.Strings.isNullOrEmpty(loadSeparator)) {
                            pluginLoadConf.setLoadSeparator("\u0002");
                        }
                    }
                }
                DataToSql dataToSql = new DataToSql();
                dataToSql.setDataClass(aClass);
                dataToSql.setDataList(dataList);
                List<String> insertSqls = dataToSql.createInsertSqls();
                for (String insertSql : insertSqls) {
                    if (Strings.isNotEmpty(insertSql)) {
                        console.appendText("\r\n" + insertSql);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

        }

    }

    public void clear(ActionEvent actionEvent) {
        try {
            console.clear();
            console.appendText("\r\n");
            //获取批次id
            ObservableList<Text> selectedItems = batchList.getSelectionModel().getSelectedItems();
            for (Text selectedItem : selectedItems) {
                String batchId = selectedItem.getText().split("  ")[0];
                String sql1 = "DELETE from bat_inst_task WHERE batch_id  ='" + batchId + "'";
                String sql2 = "DELETE from bat_inst_batch WHERE batch_id  ='" + batchId + "'";
                int delete1 = batchService.delete(currentDataSourceKey, sql1);
                console.appendText("\r\n" + sql1);
                console.appendText("\r\n删除数据条数为：" + delete1);
                int delete2 = batchService.delete(currentDataSourceKey, sql2);
                console.appendText("\r\n" + sql2);
                console.appendText("\r\n删除数据条数为：" + delete2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            console.appendText("\r\n" + e.getMessage());
            console.appendText(e.getLocalizedMessage());
        }
    }

    private void appentConsole(String msg) {
        console.appendText("\r\n");
        console.appendText(msg);
    }

    private String getSmcenterIp() {
        Text envText = (Text) envList.getSelectionModel().getSelectedItem();
        String envIp = envText.getText().split("  ")[0];
        DataSourceConfigPK dataSourceConfigKey = new DataSourceConfigPK();
        dataSourceConfigKey.setDataName("efp_daybat");
        dataSourceConfigKey.setIp(envIp);
        DataSourceConfig dataSourceConfig = dataSourceConfigRepository.findById(dataSourceConfigKey).orElse(null);
        return dataSourceConfig.getSmcenterIp();
    }

    public void runBatch(ActionEvent actionEvent) {
        console.clear();
        //获取批次id
        Text selectedItem1 = (Text) batchList.getSelectionModel().getSelectedItem();
        String batchId = selectedItem1.getText().split("  ")[0];
        if (StringUtils.isEmpty(batchId)) {
            appentConsole("请选择一个批次任务再操作");
            return;
        }
        appentConsole("获取到的批次任务为：" + batchId);
        //获取批次系统ip地址
        String smcenterIp = getSmcenterIp();
        appentConsole("获取到的批次系统ip地址为：" + smcenterIp);
        try {
            //定义公共cookie
            BasicCookieStore basicCookieStore = new BasicCookieStore();
            basicCookieStore.clear();
            //登陆系统
            appentConsole("登陆状态：");
            String loginUrl = "http://" + smcenterIp + ":8080/smcenter/api/oauth/token";
            HttpPost loginHttpPost = new HttpPost(loginUrl);
            loginHttpPost.setEntity(new StringEntity("{\n" +
                    "\t\"usercode\":\"srvadmin\",\n" +
                    "\t\"password\":\"srvadmin\"\n" +
                    "}"));
            ArrayList<Header> headers = Lists.newArrayList();
            headers.add(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"));
            HttpClient httpClient = HttpClients.custom().setDefaultHeaders(headers).setDefaultCookieStore(basicCookieStore).build();
            HttpResponse loginResponse = httpClient.execute(loginHttpPost);
            appentConsole(EntityUtils.toString(loginResponse.getEntity()));
            //获取token
            String ssottp = "";
            for (Cookie cookie : basicCookieStore.getCookies()) {
                if (cookie.getName().equals("ssottp")) {
                    ssottp = cookie.getValue();
                }
            }
            //发送执行批次运行的接口
            appentConsole("批次运行状态：");
            String runBatchUrl = "http://" + smcenterIp + ":8080/smcenter/api/bat/batch/info/action/?batchId=" + batchId + "&batchAction=run&_=" + ssottp;
            HttpGet httpGet = new HttpGet(runBatchUrl);
            HttpResponse runBatchResponse = httpClient.execute(httpGet);
            appentConsole(EntityUtils.toString(runBatchResponse.getEntity()));
            appentConsole("");
            appentConsole("");
            appentConsole("");
            updateWebView(smcenterIp, batchId);

        } catch (IOException e) {
            e.printStackTrace();
            appentConsole("发送异常：");
            appentConsole(e.getMessage());
        }

    }

    private void setBatchDateValue(String curbatchId) {
        //根据batchid查询当前的系统配置
        String sql = "select * " +
                "from s_subs_info where subs_code=(select subs_code from bat_batch_info_config where batch_id='" + curbatchId + "');";

        SSubsInfo sSubsInfo = null;
        try {
            sSubsInfo = (SSubsInfo) batchService.queryOne(currentDataSourceKey, sql, SSubsInfo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        if (!Objects.isNull(sSubsInfo)) {
            batchDate.setValue(LocalDate.parse(sSubsInfo.getSubsDataDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }
    }

    public void updateBatchDate(ActionEvent actionEvent) throws IllegalAccessException, SQLException, InstantiationException {
        console.clear();
        //获取配置的时间
        LocalDate targetBatchDate = batchDate.getValue();
        if (Objects.isNull(targetBatchDate)) {
            appentConsole("配置时间不能为空");
            return;
        }
        //获取批次id
        Text selectedItem1 = (Text) batchList.getSelectionModel().getSelectedItem();
        String batchId = selectedItem1.getText().split("  ")[0];
        if (StringUtils.isEmpty(batchId)) {
            appentConsole("请选择一个批次任务再操作");
            return;
        }
        appentConsole("获取到的批次任务为：" + batchId);
        //根据批次获取时间系统配置
        SSubsInfo sSubsInfo = (SSubsInfo) batchService.queryOne(currentDataSourceKey, "select *\n" +
                "from s_subs_info\n" +
                "where subs_code = (\n" +
                "    select subs_code\n" +
                "    from bat_batch_info_config\n" +
                "    where batch_id = '" + batchId + "')", SSubsInfo.class);

        if (Objects.isNull(sSubsInfo)) {
            appentConsole("获取到的数据为空");
            return;
        }
        //设置批次时间
        final int update = batchService.update(currentDataSourceKey, "update s_subs_info\n" +
                "set subs_data_date='" + targetBatchDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "',\n" +
                "    subs_last_data_date='" + targetBatchDate.plusDays(-1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "',\n" +
                "    subs_load_date='" + targetBatchDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "',\n" +
                "    subs_bat_date='" + targetBatchDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "'\n" +
                "where subs_code = '" + sSubsInfo.getSubsCode() + "'");
        appentConsole("更新成功,变更数据条数为：" + update);
        appentConsole("变更前批次时间：" + sSubsInfo.getSubsDataDate() + " 变更后批次时间：" + targetBatchDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        appentConsole("变更前批次上一日期时间：" + sSubsInfo.getSubsLastDataDate() + " 变更后批次时间：" + targetBatchDate.plusDays(-1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    @FXML
    public void openWebView() {
        console.clear();
        //获取批次id
        Text selectedItem1 = (Text) batchList.getSelectionModel().getSelectedItem();
        String batchId = selectedItem1.getText().split("  ")[0];
        if (StringUtils.isEmpty(batchId)) {
            appentConsole("请选择一个批次任务再操作");
            return;
        }
        appentConsole("获取到的批次任务为：" + batchId);
        //获取批次系统ip地址
        String smcenterIp = getSmcenterIp();
        appentConsole("获取到的批次系统ip地址为：" + smcenterIp);
        updateWebView(smcenterIp, batchId);
    }

    public String curip;
    public String curbatchId;

    public void updateWebView(String ip, String batchId) {
        curip = ip;
        curbatchId = batchId;
        webView.getEngine().load("http://" + curip + ":8080/smcenter/page/smcenter.console/BatchMonitor.html?batchId=" + curbatchId);
    }

    public void getBatchLog(String batchId, String ip) throws IOException, IllegalAccessException, SQLException, InstantiationException {
        //获取批次目前的时间
        SSubsInfo sSubsInfo = (SSubsInfo) batchService.queryOne(currentDataSourceKey, "select * from s_subs_info where subs_code=(select subs_code from bat_batch_info_config where batch_id='" + batchId + "');", SSubsInfo.class);
        String subsDate = sSubsInfo.getSubsDataDate();
        //计算出日志的日期
        String sql = "select t.*\n" +
                "from bat_inst_task t join bat_task_unit_config c on t.task_id=c.task_id where c.plugin_id='1001' and c.batch_id='" + batchId + "' and t.task_run_state='6';";
        List<BatInstTask> batInstTasks = batchService.list(currentDataSourceKey, sql, BatInstTask.class);
        if (batInstTasks != null && !batInstTasks.isEmpty()) {
            subsDate = LocalDate.parse(subsDate, DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusDays(-batInstTasks.size()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
        Connection connection = null;
        Session session = null;
        Writer fileWriter = null;
        try {
            //登陆服务器
            appentConsole("开始登陆服务器：" + ip);
            connection = new Connection(ip, 22);
            connection.connect();
            boolean ocmuserLoginFlag = connection.authenticateWithPassword("ocmuser", "Ocmuser12#$");
            if (!ocmuserLoginFlag) {
                appentConsole("登陆服务器失败");
                return;
            }

            appentConsole("");
            appentConsole("");
            appentConsole("开始读取批次运行日志文件：");
            appentConsole("/home/ocmuser/apps/smcenter-middle/logs/"
                    + batchId
                    + LocalDate.parse(
                    subsDate,
                    DateTimeFormatter.ofPattern("yyyy-MM-dd")
            ).plusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"))
                    + "1.log");
            //读取指定路径的文件
            session = connection.openSession();
            //设置编码
            //根据批次id和批次时间封装日志文件路径 时间为批次时间+1的8位格式
            session.execCommand("export LC_CTYPE=zh_cn.GB2312;" + "cat -n /home/ocmuser/apps/smcenter-middle/logs/"
                    + batchId
                    + LocalDate.parse(
                    subsDate,
                    DateTimeFormatter.ofPattern("yyyy-MM-dd")
            ).plusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"))
                    + "1.log");
            StreamGobbler streamGobbler = new StreamGobbler(session.getStdout());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamGobbler));
            Stream<String> lines = bufferedReader.lines();
            appentConsole("读取批次运行日志文件结束");

            File tempLogFile = new File("./temp.txt");
            if (!tempLogFile.exists()) {
                tempLogFile.createNewFile();
            }
            if (!tempLogFile.canWrite()) {
                appentConsole("请先关闭上次打开的日志文件");
                return;
            }
            fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempLogFile), StandardCharsets.UTF_8));

            Writer finalFileWriter = fileWriter;
            lines.forEach(s -> {
                try {
                    finalFileWriter.write(s);
                    finalFileWriter.write("\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.flush();
            if (tempLogFile.length() < 1) {
                appentConsole("读取到批次运行日志文件数据为空！！！");
                return;
            }
            Desktop.getDesktop().open(tempLogFile);
            //打开文件
            //lines.forEach(s->appentConsole(s));
/*            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    appentConsole(line);
                } else {
                    break;
                }
            }*/
            bufferedReader.close();
        } catch (Exception e) {
            appentConsole("发生异常：");
            appentConsole(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }

    @FXML
    public void getBatchLog(ActionEvent actionEvent) {
        console.clear();
        //获取批次id
        Text selectedItem1 = (Text) batchList.getSelectionModel().getSelectedItem();
        String batchId = selectedItem1.getText().split("  ")[0];
        if (StringUtils.isEmpty(batchId)) {
            appentConsole("请选择一个批次任务再操作");
            return;
        }
        appentConsole("获取到的批次任务为：" + batchId);
        //获取批次系统ip地址
        String smcenterIp = getSmcenterIp();
        appentConsole("获取到的批次系统ip地址为：" + smcenterIp);
        try {
            getBatchLog(batchId, smcenterIp);
        } catch (Exception e) {
            e.printStackTrace();
            appentConsole("错误：");
            appentConsole(e.getMessage());
        }


    }

    public String getCurrentDataSourceKey() {
        return currentDataSourceKey;
    }
}