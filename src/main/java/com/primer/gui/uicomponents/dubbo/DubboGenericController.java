package com.primer.gui.uicomponents.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSONObject;
import com.jfoenix.controls.*;
import com.primer.common.annotation.FXMLController;
import com.primer.common.util.AlertUtils;
import com.primer.gui.main.AppBaseController;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Window;
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
public class DubboGenericController extends AppBaseController implements Initializable {
    @Value("${app.tool.dubbo.addrs}")
    private List<String> addrs;
    @FXML
    public JFXTreeTableView params;
    @FXML
    public JFXTextArea responseTxt;
    @FXML
    public JFXComboBox<String> dubboRegistry;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 设置注册中心
        dubboRegistry.getItems().addAll(addrs);
        callButton.setOnMouseClicked(e->call());
    }


    private void call() {
        Task<Boolean> task = new Task<Boolean>() {
            @Override
            protected Boolean call() {
                AtomicReference<JFXAlert<Window>> windowJfxAlert = new AtomicReference<>();
                Platform.runLater(() -> {
                    windowJfxAlert.set(AlertUtils.showLoading(callButton));
                });
                try {
                    ApplicationConfig application = new ApplicationConfig();
                    application.setName("gateway-test");
                    RegistryConfig registry = new RegistryConfig();
                    registry.setAddress(dubboRegistry.getSelectionModel().getSelectedItem());
                    application.setRegistry(registry);
                    ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
                    reference.setApplication(application);
                    reference.setInterface(dubboInterface.getText());
                    reference.setVersion(dubboVersion.getText());
                    reference.setGeneric(true);
                    GenericService genericService = reference.get();
                    // 如果返回POJO将自动转成Map
                    Object result = genericService.$invoke(dubboMehod.getText(), new String[]{},
                            new Object[]{});
                    responseTxt.setText(JSONObject.toJSONString(result));
                } catch (Exception e) {
                    e.printStackTrace();
                    Platform.runLater(() -> {
                        AlertUtils.jfxAlert(callButton, null, e.toString());
                    });
                }catch (Throwable throwable){
                    Platform.runLater(() -> {
                        AlertUtils.jfxAlert(callButton, null, throwable.toString());
                    });
                }finally {
                    Platform.runLater(() -> {
                        AlertUtils.hideLoading(windowJfxAlert.get());
                    });
                }

                return Boolean.TRUE;
            }
        };
        threadPoolTaskExecutor.execute(task);

    }
}
