package com.primer.controller;

import com.primer.MainApplication;
import com.primer.common.Constanst;
import com.primer.common.annotation.AppConfigAnnotation;
import com.primer.common.util.AlertUtils;
import com.primer.dao.GitlabMilestoneDao;
import com.primer.dao.GitlabMilestoneXhsDao;
import com.primer.dao.GitlabProjectConfigDao;
import com.primer.bean.CommitInfo;
import com.primer.entity.GitlabMilestone;
import com.primer.entity.GitlabMilestoneXhs;
import com.primer.entity.GitlabProjectConfig;
import com.primer.jfxsupport.FXMLController;
import com.primer.view.RemineView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.util.StringConverter;
import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * app的主界面控制器
 *
 * @author HIFeng
 */
@Data
@FXMLController
public class VersionHelperController extends AppConfigController implements Initializable {
    @FXML
    @AppConfigAnnotation
    public TextField gitAccount;
    @FXML
    @AppConfigAnnotation
    public TextField gitPassword;
    @FXML
    @AppConfigAnnotation
    public TextField remindAccount;
    @FXML
    @AppConfigAnnotation
    public TextField remindPassword;
    @FXML
    @AppConfigAnnotation
    public TextField sourceBranch;
    @FXML
    @AppConfigAnnotation
    public TextField targetBranch;
    @FXML
    public Label tip;
    @FXML
    @AppConfigAnnotation
    public TextField startDate;
    @FXML
    @AppConfigAnnotation
    public TextField endDate;
    @FXML
    @AppConfigAnnotation
    public ChoiceBox<GitlabMilestone> mileStone;
    @FXML
    @AppConfigAnnotation
    public TextField remineCnName;


    @Value("${remine.login-url}")
    private String remineLoginUrl;

    @Value("${remine.issues-new-url}")
    private String newIssuesUrl;

    @Value("${gitlab.url}")
    private String gitlabUrl;

    @Autowired
    private GitlabProjectConfigDao gitlabProjectConfigDao;

    @Autowired
    private GitlabMilestoneDao gitlabMilestoneDao;

    @Autowired
    private GitlabMilestoneXhsDao gitlabMilestoneXhsDao;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //设置milestone
        mileStone.getItems().addAll(gitlabMilestoneDao.findAll());
        mileStone.converterProperty().set(new StringConverter<GitlabMilestone>() {
            @Override
            public String toString(GitlabMilestone object) {
                return object.getName();
            }

            @Override
            public GitlabMilestone fromString(String string) {
                return null;
            }
        });
        //初始化程序配置
        initAppConfig(this);
    }

    /**
     * 保存界面配置
     *
     * @param actionEvent
     * @throws Exception
     */
    @FXML
    public void saveConfig(ActionEvent actionEvent) throws Exception {
        try {
            tip.setText("");
            saveAppConfig();
            tip.setText("配置保存成功");
        } catch (Exception e) {
            AlertUtils.alertError(e.getMessage());
        }
    }

    /**
     * 提交remind
     *
     * @param actionEvent 动作
     */
    @FXML
    public void commitRemind(ActionEvent actionEvent) throws GitLabApiException, ParseException {
        try {
            //判断数据是否存在
            if (Constanst.commitInfos.isEmpty() && Constanst.commitSqlFile.isEmpty()) {
                throw new Exception("数据不能为为空，请先检查数据");
            }
            //打开webview加载remine页面进行操作
            MainApplication.showInitialView(RemineView.class);
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtils.alertError(e.getMessage());
        }
    }

    /**
     * 校验必输参数
     *
     * @throws Exception
     */
    private void checkParam() throws Exception {
        if (StringUtils.isEmpty(gitAccount.getText())) {
            throw new Exception("亲，git账号不能为空呢！");
        }
        if (StringUtils.isEmpty(gitPassword.getText())) {
            throw new Exception("亲，git密码不能为空呢！");
        }
        if (StringUtils.isEmpty(remindAccount.getText())) {
            throw new Exception("亲，remine账号不能为空呢！");
        }
        if (StringUtils.isEmpty(remindPassword.getText())) {
            throw new Exception("亲，remine密码不能为空呢！");
        }
        if (StringUtils.isEmpty(sourceBranch.getText())) {
            throw new Exception("亲，源分支不能为空呢！");
        }
        if (StringUtils.isEmpty(targetBranch.getText())) {
            throw new Exception("亲，目标分支不能为空呢！");
        }

        GitlabMilestone selectedItem = mileStone.getSelectionModel().getSelectedItem();

        if (Objects.isNull(selectedItem)) {
            throw new Exception("亲，milestone不能为空呢！");
        }

    }

    public void setCommitInfo(GitLabApi gitLabApi) throws GitLabApiException, ParseException {
        //获取配置的项目
        List<GitlabProjectConfig> gitlabProjectConfigs = gitlabProjectConfigDao.findAll();
        for (GitlabProjectConfig gitlabProjectConfig : gitlabProjectConfigs) {
            List<Commit> commits = gitLabApi.getCommitsApi().getCommits(
                    gitlabProjectConfig.getProjectId(),
                    sourceBranch.getText(),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate.getText()),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endDate.getText()));
            if (commits.isEmpty()) {
                continue;
            }
            //如果是脚本工程
            if ("sql-script".equals(gitlabProjectConfig.getProjectName())) {
                for (Commit commit : commits) {
                    if (gitAccount.getText().equals(commit.getCommitterName())) {
                        List<Diff> diffs = gitLabApi.getCommitsApi().getDiff(gitlabProjectConfig.getProjectId(), commit.getId());
                        for (Diff diff : diffs) {
                            if (!Constanst.commitSqlFile.contains(diff.getOldPath())) {
                                Constanst.commitSqlFile.add(diff.getOldPath());
                            }
                            if (!Constanst.commitSqlFile.contains(diff.getNewPath())) {
                                Constanst.commitSqlFile.add(diff.getNewPath());
                            }
                        }
                    }
                }
                continue;
            }
            //其它工程
            CommitInfo commitInfo = new CommitInfo();
            commitInfo.setCommitFiles(new ArrayList<>());
            commitInfo.setCommitMessages(new ArrayList<>());
            commitInfo.setCommits(new ArrayList<>());
            //设置项目信息
            commitInfo.setGitlabProjectConfig(gitlabProjectConfig);
            for (Commit commit : commits) {
                if (gitAccount.getText().equals(commit.getCommitterName())) {
                    String message = commit.getMessage();
                    if (message.startsWith("Merge")) {
                        continue;
                    }
                    //设置提交信息
                    if (!commitInfo.getCommitMessages().contains(message)) {
                        commitInfo.getCommitMessages().add(message);
                    }
                    //设置提交文件清单
                    List<Diff> diffs = gitLabApi.getCommitsApi().getDiff(gitlabProjectConfig.getProjectId(), commit.getId());
                    for (Diff diff : diffs) {
                        if (!commitInfo.getCommitFiles().contains(diff.getOldPath())) {
                            commitInfo.getCommitFiles().add(diff.getOldPath());
                        }
                        if (!commitInfo.getCommitFiles().contains(diff.getNewPath())) {
                            commitInfo.getCommitFiles().add(diff.getNewPath());
                        }
                    }
                }

            }
            if (!commitInfo.getCommitFiles().isEmpty()) {
                Constanst.commitInfos.add(commitInfo);
            }
        }
    }

    /**
     * 提交gitlab请求
     *
     * @param actionEvent 动作
     */
    @FXML
    public void createMrRequest(ActionEvent actionEvent) throws GitLabApiException {

        GitLabApi gitLabApi = GitLabApi.oauth2Login("http://10.139.6.26:7077/", gitAccount.getText(), gitPassword.getText());
        //setCommitInfo(gitLabApi);
        //如果数据为空不做处理
        if (Constanst.commitInfos.isEmpty()) {
            tip.setText("数据为空");
            return;
        }
        ArrayList<String> messages = new ArrayList<>();
        for (CommitInfo commitInfo : Constanst.commitInfos) {
            //提交合并请求
            messages.add("开始处理模块[" + commitInfo.getGitlabProjectConfig().getProjectName() + "]代码合并-----------");
            try {
                gitLabApi.getMergeRequestApi().createMergeRequest(
                        commitInfo.getGitlabProjectConfig().getProjectId(),
                        sourceBranch.getText(),
                        targetBranch.getText(),
                        gitAccount.getText() + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
                        commitInfo.getCommitMessages().stream().collect(Collectors.joining("/r/n")),
                        163,
                        Integer.valueOf(commitInfo.getGitlabProjectConfig().getProjectId()),
                        new String[]{}, getMileStoneId(mileStone.getSelectionModel().getSelectedItem().getId(), Integer.valueOf(commitInfo.getGitlabProjectConfig().getProjectId())), false, false
                );
                messages.add("模块[" + commitInfo.getGitlabProjectConfig().getProjectName() + "]代码合并成功");
            } catch (GitLabApiException e) {
                e.printStackTrace();
                messages.add("模块[" + commitInfo.getGitlabProjectConfig().getProjectName() + "]代码合并失败：" + e.getMessage());
            }
            continue;
        }
        AlertUtils.alertInfo(messages);
        gitLabApi.close();
    }

    private Integer getMileStoneId(Integer mileStoneId, Integer projectId) {

        if (9999 == mileStoneId) {
            GitlabMilestoneXhs gitlabMilestoneXhs = new GitlabMilestoneXhs();
            gitlabMilestoneXhs.setProjectId(projectId);
            GitlabMilestoneXhs gitlabMilestoneXhsByProjectId = gitlabMilestoneXhsDao.findByProjectId(projectId);
            if (!Objects.isNull(gitlabMilestoneXhs)) {
                return gitlabMilestoneXhsByProjectId.getId();
            }
        }
        return mileStoneId;
    }


    @FXML
    public void loadCommitInfo(ActionEvent actionEvent) {
        try {
            tip.setText("");
            checkParam();
            //必输信息校验
            checkParam();
            //登陆gitlab
            GitLabApi gitLabApi = GitLabApi.oauth2Login(gitlabUrl, gitAccount.getText(), gitPassword.getText());
            //清除数据
            Constanst.commitSqlFile.clear();
            Constanst.commitInfos.clear();
            //获取提交信息
            setCommitInfo(gitLabApi);
            tip.setText("加载数据成功");
            if (Constanst.dataIsEmpty()) {
                tip.setText("加载的数据为空");
            }
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtils.alertError("错误：" + e.getMessage());
        }
    }

    @FXML
    public void showCommitInfo(ActionEvent actionEvent) throws IOException {
        if (Constanst.dataIsEmpty()) {
            AlertUtils.alertInfo("数据为空");
            return;
        }
        FileWriter fileWriter = null;
        try {
            if (new File("/temp.txt").exists()) {
                new File("/temp.txt").delete();
                new File("/temp.txt").createNewFile();
            }
            fileWriter = new FileWriter(new File("/temp.txt"));
            if (!Constanst.commitInfos.isEmpty() || !Constanst.commitSqlFile.isEmpty()) {
                for (CommitInfo commitInfo : Constanst.commitInfos) {
                    fileWriter.write("\n");
                    fileWriter.write("模块:" + commitInfo.getGitlabProjectConfig().getProjectName() + "   涉及文件变动数量为：" + commitInfo.getCommitFiles().size());
                    for (String commitFile : commitInfo.getCommitFiles()) {
                        fileWriter.write("\n");
                        fileWriter.write("  " + commitFile);
                    }
                }
                fileWriter.write("\n");
                fileWriter.write("\n");
                fileWriter.write("脚本涉及文件变动数为：" + Constanst.commitSqlFile.size());
                for (String s : Constanst.commitSqlFile) {
                    fileWriter.write("\n");
                    fileWriter.write("  " + s);
                }

            }
            fileWriter.write("\n");
            fileWriter.write("\n");
            fileWriter.write("remine表格源码\n");
            fileWriter.write(RemineViewController.getNewDescript());
            fileWriter.flush();
            Desktop.getDesktop().open(new File("/temp.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            AlertUtils.alertError(e.getMessage());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }

    @FXML
    public void setTimeLast30m(ActionEvent actionEvent) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime pre30m = now.plusMinutes(-30);
        startDate.setText(pre30m.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        endDate.setText(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @FXML
    public void setTimeLast3H(ActionEvent actionEvent) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime pre30m = now.plusHours(-3);
        startDate.setText(pre30m.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        endDate.setText(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @FXML
    public void setPsdBranch(ActionEvent actionEvent) {
        sourceBranch.setText("BasicBranch-mr-PSD");
        targetBranch.setText("BasicBranch-sit-PSD");
        for (GitlabMilestone item : mileStone.getItems()) {
            if (item.getId().intValue() == 7) {
                mileStone.getSelectionModel().select(item);
            }
        }
    }

    @FXML
    public void setYedBranch(ActionEvent actionEvent) {
        sourceBranch.setText("BasicBranch-mr-BasicFn");
        targetBranch.setText("BasicBranch-sit-BasicFn");
        for (GitlabMilestone item : mileStone.getItems()) {
            if (item.getId().intValue() == 26) {
                mileStone.getSelectionModel().select(item);
            }
        }
    }

    public void test() throws GitLabApiException {
        GitLabApi gitLabApi = GitLabApi.oauth2Login(gitlabUrl, gitAccount.getText(), gitPassword.getText());
        gitLabApi.getCommitsApi().cherryPickCommit("", "", "");
    }


    @FXML
    public void updateMilestone(ActionEvent actionEvent) {
        GitLabApi gitLabApi = null;
        try {
            if (gitAccount.getText().isEmpty()) {
                throw new Exception("git账号不能为空");
            }
            if (gitPassword.getText().isEmpty()) {
                throw new Exception("git密码不能为空");
            }

            gitLabApi = GitLabApi.oauth2Login(gitlabUrl, gitAccount.getText().trim(), gitPassword.getText().trim());
            List<Group> groups = gitLabApi.getGroupApi().getGroups();
            if (groups != null && !groups.isEmpty()) {
                gitlabMilestoneDao.deleteAll();
            }
            for (Group group : groups) {
                List<Milestone> groupMilestones = gitLabApi.getMilestonesApi().getGroupMilestones(group.getId());
                groupMilestones.sort(Comparator.comparing(Milestone::getId));
                for (Milestone groupMilestone : groupMilestones) {
                    gitlabMilestoneDao.saveAndFlush(new GitlabMilestone(groupMilestone.getId(), groupMilestone.getTitle()));
                }
                gitlabMilestoneDao.saveAndFlush(new GitlabMilestone(9999, "新核心"));

            }
            AlertUtils.alertInfo("更新数据成功，请重启应用程序");
        } catch (Exception e) {
            AlertUtils.alertError("错误：" + e.getMessage());
        } finally {
            if (gitLabApi != null) {
                gitLabApi.close();
            }
        }
    }
}