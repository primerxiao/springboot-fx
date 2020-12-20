package com.primer.gui.uicomponents.versionelper;

import com.primer.common.constant.GitCommitCacheDate;
import com.primer.common.annotation.FXMLController;
import com.primer.common.util.AlertUtils;
import com.primer.entity.GitlabMilestone;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

/**
 * app的主界面控制器
 *
 * @author HIFeng
 */
@Data
@FXMLController
public class RemineController implements Initializable {

    @FXML
    public AnchorPane anchorPane;

    @FXML
    public WebView webView;

    @Value("${remine.login-url}")
    private String remineLoginUrl;

    @Value("${remine.issues-new-url}")
    private String newIssuesUrl;

    @Autowired
    private VersionHelperController versionHelperController;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        webView.prefWidthProperty().bind(anchorPane.widthProperty());
        webView.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
            if (webView.getEngine().getLoadWorker().getState() == Worker.State.RUNNING) {
                return;
            }
            //登陆界面
            if (Worker.State.SUCCEEDED == newValue && Worker.State.RUNNING == oldValue) {
                if (webView.getEngine().getLocation().contains("/redmine/login")) {
                    webView.getEngine().executeScript("$('#username').val('" + versionHelperController.remindAccount.getText() + "');");
                    webView.getEngine().executeScript("$('#password').val('" + versionHelperController.remindPassword.getText() + "');");
                    webView.getEngine().executeScript("$('#login-submit').click();");
                }
            }

        });

    }

    public static int stage = 0;

    @FXML
    public void loginRemine(ActionEvent actionEvent) {
        WebEngine engine = webView.getEngine();
        engine.load(remineLoginUrl);
        stage = 1;

    }

    @FXML
    public void fillIssuesContent(ActionEvent actionEvent) {
        try {
            if (!webView.getEngine().getLocation().contains("issues/new")) {
                AlertUtils.alertError("请先手动打开新建任务页面");
                return;
            }
            String newDescript = getNewDescript();
            if (StringUtils.isEmpty(newDescript)) {
                AlertUtils.alertError("数据为空");
                return;
            }
            System.out.println(newDescript);
            //设置标题$('#issue_subject').val('sfadsf')
            GitlabMilestone gitlabMilestone = versionHelperController.mileStone.getSelectionModel().getSelectedItem();
            webView.getEngine().executeScript("$('#issue_subject').val('" + gitlabMilestone.getName() + "发版-" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + "-" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) + "-" + versionHelperController.remineCnName.getText() + "');");
            //设置内容$EDITORUI.edui1.editor.setContent('<p>adfafdsad1</p>');
            webView.getEngine().executeScript("$EDITORUI.edui1.editor.setContent(\"" + newDescript.replaceAll("\n", "") + "\");");
            //设置跟踪$('#issue_tracker_id').val('59').trigger('change');
            webView.getEngine().executeScript("$('#issue_tracker_id').val('59').trigger('change');");
            //指派给$('#issue_assigned_to_id').val('382')
            webView.getEngine().executeScript("$('#issue_assigned_to_id').val('382');");
            //工作类型$('#issue_custom_field_values_120').val('部门内部工作').trigger('change');
            webView.getEngine().executeScript("$('#issue_custom_field_values_120').val('部门内部工作').trigger('change');");
            //设置时间$('#issue_start_date').val('2020-08-13')
            webView.getEngine().executeScript("$('#issue_start_date').val('" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "')");
            //设置目标版本
            if (gitlabMilestone.getId().intValue() == 7) {
                webView.getEngine().executeScript("$('#issue_fixed_version_id').val('38').trigger('change')");
            }
            if (gitlabMilestone.getId().intValue() == 26) {
                webView.getEngine().executeScript("$('#issue_fixed_version_id').val('113').trigger('change')");
            }
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtils.alertError(e);
        }
    }

    public static String getNewDescript() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<table border='1' cellspacing='0'");
        stringBuilder.append("style='border-collapse:collapse; border:0.5pt solid #000000; height:398px; width:686.27pt'>");
        stringBuilder.append("<tbody>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td colspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:27.00pt; text-align:left; vertical-align:middle; white-space:nowrap; width:244.50pt'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
        stringBuilder.append("style='font-family:宋体'>修改说明（bug编号）</span></span></span></td>");
        stringBuilder.append("<td style='height:27.00pt; vertical-align:middle; white-space:normal; width:441.75pt'><span");
        stringBuilder.append("style='font-size:11pt'><span style='color:#000000'><span style='font-family:宋体'>");
        String descStr = "";
        for (CommitInfo gitCommitInfo : GitCommitCacheDate.commitInfos) {
            for (String s : gitCommitInfo.getCommitMessages()) {
                if (descStr.contains(s)) {
                    continue;
                }
                descStr = descStr + s + "<br/>";
            }
        }
        stringBuilder.append(descStr.replaceAll("\"", ""));
        stringBuilder.append("</span></span></span>");
        stringBuilder.append("</td>");
        stringBuilder.append("</tr>");
        for (int i = 0; i < GitCommitCacheDate.commitInfos.size(); i++) {
            if (i == 0) {
                stringBuilder.append("<tr>");
                stringBuilder.append("<td rowspan='" + GitCommitCacheDate.commitInfos.size() + "'");
                stringBuilder.append("style='background-color:#92d050; height:27.00pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
                stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
                stringBuilder.append("style='font-family:宋体'>代码清单</span></span></span></td>");
                stringBuilder.append("<td style='background-color:#c5d9f1; height:27.00pt; vertical-align:middle; white-space:nowrap'><span");
                stringBuilder.append("style='font-size:11pt'><span style='color:#000000'><span");
                stringBuilder.append("style='font-family:宋体'>" + GitCommitCacheDate.commitInfos.get(i).getGitlabProjectConfig().getProjectName() + "</span></span></span></td>");
                stringBuilder.append("<td style='height:27.00pt; vertical-align:middle; white-space:normal; width:441.75pt'><span");
                stringBuilder.append("style='font-size:11pt'><span style='color:#000000'><span style='font-family:宋体'>");
                for (String s : GitCommitCacheDate.commitInfos.get(i).getCommitFiles()) {
                    stringBuilder.append(s + "<br>");
                }
                stringBuilder.append("</span></span></span>");
                stringBuilder.append("</td>");
                stringBuilder.append("</tr>");

            } else {
                stringBuilder.append("<tr>");
                stringBuilder.append("<td style='background-color:#c5d9f1; height:42.00pt; vertical-align:middle; white-space:nowrap'><span");
                stringBuilder.append("style='font-size:11pt'><span style='color:#000000'><span");
                stringBuilder.append("style='font-family:宋体'>" + GitCommitCacheDate.commitInfos.get(i).getGitlabProjectConfig().getProjectName() + "</span></span></span></td>");
                stringBuilder.append("<td style='height:42.00pt; vertical-align:middle; white-space:normal; width:441.75pt'><span");
                stringBuilder.append("style='font-size:11pt'><span style='color:#000000'><span style='font-family:宋体'>");
                for (String s : GitCommitCacheDate.commitInfos.get(i).getCommitFiles()) {
                    stringBuilder.append(s + "<br>");
                }
                stringBuilder.append("</span></span></span>");
                stringBuilder.append("</td>");
                stringBuilder.append("</tr>");
            }
        }

        stringBuilder.append("<tr>");
        stringBuilder.append("<td rowspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span style='font-family:宋体'>新增第三方依赖</span></span></span>");
        stringBuilder.append("</td>");
        stringBuilder.append("<td style='background-color:#c5d9f1; height:13.50pt; vertical-align:middle; white-space:nowrap'><br></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td style='background-color:#c5d9f1; height:13.50pt; vertical-align:middle; white-space:nowrap'><br></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td colspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
        stringBuilder.append("style='font-family:宋体'>新增私服</span></span></span></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td rowspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
        stringBuilder.append("style='font-family:宋体'>配置文件</span></span></span></td>");
        stringBuilder.append("<td style='background-color:#c5d9f1; height:13.50pt; vertical-align:middle; white-space:nowrap'><br></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td style='background-color:#c5d9f1; height:13.50pt; vertical-align:middle; white-space:nowrap'><br></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");

        //脚本
        stringBuilder.append("<tr>");
        stringBuilder.append("<td colspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
        stringBuilder.append("style='font-family:宋体'>脚本</span></span></span></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'>");
        for (String sqlFile : GitCommitCacheDate.commitSqlFile) {
            stringBuilder.append(sqlFile + "<br>");
        }
        stringBuilder.append("</td>");
        stringBuilder.append("</tr>");

        stringBuilder.append("<tr>");
        stringBuilder.append("<td colspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span");
        stringBuilder.append("style='font-family:宋体'>脚本执行顺序和其他说明</span></span></span></td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("<tr>");
        stringBuilder.append("<td colspan='2'");
        stringBuilder.append("style='background-color:#92d050; height:13.50pt; text-align:left; vertical-align:middle; white-space:nowrap'>");
        stringBuilder.append("<span style='font-size:11pt'><span style='color:#000000'><span style='font-family:宋体'>版本jar包地址</span></span></span>");
        stringBuilder.append("</td>");
        stringBuilder.append("<td style='height:13.50pt; vertical-align:middle; white-space:normal; width:441.75pt'><br><br></td>");
        stringBuilder.append("</tr>");
        stringBuilder.append("</tbody>");
        stringBuilder.append("</table>");

        return stringBuilder.toString();
    }

    @FXML
    public void newAction(ActionEvent actionEvent) {
        webView.getEngine().load(newIssuesUrl);
    }
}