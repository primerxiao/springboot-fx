package com.primer.gui.uicomponents.loghelper;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.primer.common.annotation.FXMLController;
import com.primer.gui.main.AppBaseController;
import com.primer.entity.LogFileList;
import com.primer.entity.SysProject;
import com.primer.entity.SysServer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import lombok.Data;
import lombok.SneakyThrows;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * app的主界面控制器
 *
 * @author HIFeng
 */
@Data
@FXMLController
public class LogHelperController extends AppBaseController implements Initializable {

    @FXML
    public ListView<SysProject> projectListView;
    @FXML
    public ListView<SysServer> serverListView;
    @FXML
    public ListView<LogFileList> logListView;
    @FXML
    public JFXTextField searchText;
    @FXML
    public JFXButton searchBtn;
    @FXML
    public JFXTextArea logTextArea;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //-----项目
        projectListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        projectListView.setCellFactory(param -> new ListCell<SysProject>(){
            @Override
            protected void updateItem(SysProject item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item.getName() == null) {
                    setText(null);
                } else{
                    setText(item.getName());
                }
            }
        });

        List<SysProject> sysProjects = sysProjectRepository.findAll();
        if (!sysProjects.isEmpty()) {
            projectListView.getItems().addAll(sysProjects);
        }
        //-----服务器
        serverListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        serverListView.setCellFactory(param -> new ListCell<SysServer>(){
            @Override
            protected void updateItem(SysServer item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item.getName() == null) {
                    setText(null);
                } else{
                    setText(item.getName());
                }
            }
        });
        //-----日志
        logListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        logListView.setCellFactory(param -> new ListCell<LogFileList>(){
            @Override
            protected void updateItem(LogFileList item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item.getName() == null) {
                    setText(null);
                } else{
                    setText(item.getName());
                }
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
            saveAppConfig();
    }

    @FXML
    public void search(ActionEvent actionEvent) {

    }
}