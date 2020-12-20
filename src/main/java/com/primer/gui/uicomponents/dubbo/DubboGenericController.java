package com.primer.gui.uicomponents.dubbo;

import com.jfoenix.controls.*;
import com.primer.common.annotation.FXMLController;
import com.primer.gui.main.AppBaseController;
import javafx.fxml.Initializable;
import org.springframework.beans.factory.annotation.Value;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author 肖均辉
 */
@FXMLController
public class DubboGenericController extends AppBaseController implements Initializable {

    @Value("${app.tool.dubbo.addrs}")
    private List<String> addrs;

    public JFXTreeTableView params;
    public JFXTextArea responseTxt;
    public JFXSpinner spiner;
    public JFXComboBox<String> dubboRegistry;
    public JFXTextField dubboGroup;
    public JFXTextField dubboVersion;
    public JFXTextField dubboInterface;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 设置注册中心
        dubboRegistry.getItems().addAll(addrs);

    }
}
