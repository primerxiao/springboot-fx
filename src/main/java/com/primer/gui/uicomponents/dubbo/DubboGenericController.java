package com.primer.gui.uicomponents.dubbo;

import com.alibaba.fastjson.JSONObject;
import com.jfoenix.controls.*;
import com.primer.common.annotation.AutoConfig;
import com.primer.common.annotation.FXMLController;
import com.primer.common.util.AlertUtils;
import com.primer.common.util.ValidateUtils;
import com.primer.gui.main.AppBaseController;
import com.primer.service.DubboService;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Window;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 肖均辉
 */
@FXMLController
@Data
public class DubboGenericController extends AppBaseController implements Initializable {
    @Value("${app.tool.dubbo.addrs}")
    private List<String> addrs;
    @FXML
    public JFXTreeTableView params;
    @FXML
    public JFXTextArea responseTxt;
    @AutoConfig
    @FXML
    public JFXComboBox<String> dubboRegistry;
    @AutoConfig
    @FXML
    public JFXTextField dubboGroup;
    @FXML
    public JFXTextField dubboVersion;
    @FXML
    public JFXTextField dubboInterface;
    @FXML
    public JFXTextField dubboMehod;
    @FXML
    public JFXButton callButton;

    @Qualifier(value = "AppThreadPoolTaskExecutor")
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Autowired
    private DubboService dubboService;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 设置注册中心
        dubboRegistry.getItems().addAll(addrs);
        // 默认选择第一条
        dubboRegistry.getSelectionModel().select(0);

        callButton.setOnMouseClicked(e -> call());

        dubboRegistry.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                dubboRegistry.validate();
            }
        });

        dubboGroup.focusedProperty().addListener((o, oldVal, newVal) -> {
                    if (!newVal) {
                        dubboGroup.validate();
                    }
                }
        );
        dubboVersion.focusedProperty().addListener((o, oldVal, newVal) -> {
                    if (!newVal) {
                        dubboVersion.validate();
                    }
                }
        );
        dubboInterface.focusedProperty().addListener((o, oldVal, newVal) -> {
                    if (!newVal) {
                        dubboInterface.validate();
                    }
                }
        );
        dubboMehod.focusedProperty().addListener((o, oldVal, newVal) -> {
                    if (!newVal) {
                        dubboMehod.validate();
                    }
                }
        );

        initAppConfig(this);
    }

    private void call() {
        Task<Boolean> task = new Task<Boolean>() {
            @Override
            protected Boolean call() {
                if (!validate()) {
                    Platform.runLater(() -> AlertUtils.jfxAlert(callButton, null, "参数校验不通过"));
                    return Boolean.FALSE;
                }
                AtomicReference<JFXAlert<Window>> windowJfxAlert = new AtomicReference<>();
                Platform.runLater(() -> windowJfxAlert.set(AlertUtils.showLoading(callButton)));
                try {
                    DubboCallParam build = DubboCallParam.builder()
                            .applicationName("gateway-test")
                            .registryAddress(dubboRegistry.getSelectionModel().getSelectedItem())
                            .referenceInterface(dubboInterface.getText())
                            .referenceVersion(dubboVersion.getText())
                            .referenceGeneric(true)
                            .invokeMethod(dubboMehod.getText())
                            .invokeMethodParamType(new String[]{})
                            .invokeMethodParam(new Object[]{}).build();
                    responseTxt.setText(JSONObject.toJSONString(dubboService.remoteCall(build)));
                } catch (Exception e) {
                    e.printStackTrace();
                    Platform.runLater(() -> AlertUtils.jfxAlert(callButton, null, e));
                } catch (Throwable throwable) {
                    Platform.runLater(() -> AlertUtils.jfxAlert(callButton, null, throwable));
                } finally {
                    Platform.runLater(() -> AlertUtils.hideLoading(windowJfxAlert.get()));
                }
                return Boolean.TRUE;
            }
        };
        threadPoolTaskExecutor.execute(task);
    }

    private boolean validate() {
        return ValidateUtils.validate(dubboRegistry,dubboGroup, dubboVersion, dubboInterface, dubboMehod);
    }
}
