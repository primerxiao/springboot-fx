package com.primer.controller;

import com.primer.common.annotation.AppAutoConfig;
import com.primer.common.annotation.AppDictAnnotation;
import com.primer.entity.AppConfig;
import com.primer.entity.DbConfig;
import com.primer.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * app的主界面控制器
 *
 * @author HIFeng
 */
@Data
@EqualsAndHashCode(callSuper = false)
@FXMLController
public class MainController extends BaseController implements Initializable {

    @FXML
    public FlowPane flowPane;
    @FXML
    public MenuBar menuBar;
    @FXML
    public TabPane tabPane;
    @FXML
    public TableView<AppConfig> tableView = new TableView<>();
    @FXML
    public TableColumn<AppConfig, String> tableColumn1 = new TableColumn<>();
    @FXML
    public TableColumn<AppConfig, String> tableColumn2 = new TableColumn<>();
    @FXML
    public TableColumn<AppConfig, String> tableColumn3 = new TableColumn<>();
    @AppAutoConfig
    @FXML
    public TextField dbConfigName;
    @FXML
    public TextField dbConfigUrl;
    @FXML
    public Button delDbConfigBtn;
    @FXML
    public TextField dbConfigUserName;
    @FXML
    public TextField dbConfigPassword;
    @AppDictAnnotation(groupCode = "db_group")
    @FXML
    public ComboBox<String> dbConfigDriverClass;
    @FXML
    public Button addDbConfigBtn;
    @FXML
    public ProgressBar progressBar;
    @FXML
    public TableView<DbConfig> dbConfigTableView;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initAppConfig();
        //宽度、高度绑定为Pane宽度
//        menuBar.prefWidthProperty().bind(flowPane.widthProperty());
//        tabPane.prefWidthProperty().bind(flowPane.widthProperty());
//        progressBar.prefWidthProperty().bind(flowPane.widthProperty());
        //
        // tabPane.prefHeightProperty().bind(flowPane.heightProperty());
        //dbConfigTableView.prefWidthProperty().bind(tabPane.widthProperty());
        //list
        tableColumn1.setCellValueFactory(new PropertyValueFactory<>("configCode"));
        tableColumn2.setCellValueFactory(new PropertyValueFactory<>("configClass"));
        tableColumn3.setCellValueFactory(new PropertyValueFactory<>("configValue"));
        ObservableList<AppConfig> appConfigs = FXCollections.observableArrayList();
        appConfigs.addAll(appConfigDao.findAll());
        tableView.setItems(appConfigs);
        progressBar.setProgress(0.5);
    }

    public static void main(String[] args) {
        System.out.println(TextField.class.getName());
        System.out.println(TextArea.class.getSimpleName());
        System.out.println(ComboBox.class.getName());

    }

}