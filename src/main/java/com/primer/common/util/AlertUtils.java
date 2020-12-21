package com.primer.common.util;

import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXSpinner;
import com.sun.istack.NotNull;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class AlertUtils {

    /**
     * jfx样式的弹框
     * @param node 触发弹框的节点
     * @param heading 标题
     * @param body 弹框展示内容
     */
    public static void jfxAlert(@NotNull Node node, String heading,@NotNull String body) {
        JFXAlert<Window> alert = new JFXAlert<>((Stage) node.getScene().getWindow());
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setOverlayClose(false);
        JFXDialogLayout layout = new JFXDialogLayout();
        if (StringUtils.isNotEmpty(heading)) {
            layout.setHeading(new Label(heading));
        }
        layout.setBody(new Label(body));
        JFXButton closeButton = new JFXButton("确定");
        closeButton.getStyleClass().add("dialog-accept");
        closeButton.setOnAction(event -> alert.hideWithAnimation());
        layout.setActions(closeButton);
        alert.setContent(layout);
        alert.show();
    }

    /**
     * jfx样式的弹框
     * @param node 触发弹框的节点
     * @param heading 标题
     * @param body 弹框展示内容
     */
    public static void jfxAlert(@NotNull Node node, String heading,@NotNull Object body) {
        JFXAlert<Window> alert = new JFXAlert<>((Stage) node.getScene().getWindow());
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setOverlayClose(false);
        JFXDialogLayout layout = new JFXDialogLayout();
        if (StringUtils.isNotEmpty(heading)) {
            layout.setHeading(new Label(heading));
        }
        layout.setBody(new Label(body.toString()));
        JFXButton closeButton = new JFXButton("确定");
        closeButton.getStyleClass().add("dialog-accept");
        closeButton.setOnAction(event -> alert.hideWithAnimation());
        layout.setActions(closeButton);
        alert.setContent(layout);
        alert.show();
    }


    /**
     * 显示loading效果
     * @param node 节点
     */
    public static JFXAlert<Window> showLoading(Node node) {
        JFXAlert<Window> alert = new JFXAlert<>((Stage) node.getScene().getWindow());
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setOverlayClose(false);
        alert.setContent(new JFXSpinner());
        alert.getDialogPane().getContent().setStyle("-fx-background:transparent;");
        alert.show();
        return alert;
    }

    public static void hideLoading(JFXAlert<Window> jfxAlert) {
        jfxAlert.hideWithAnimation();
    }

    public static void alertError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("错误");
        alert.setHeaderText("很抱歉，操作过程中发生了错误");
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void alertError(Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("错误");
        alert.setHeaderText("很抱歉，操作过程中发生了错误");
        alert.setContentText(e.getMessage());
        alert.showAndWait();
    }


    public static void alertInfo(List<String> message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("信息");
        //alert.setHeaderText("下面是相关的变更信息：");
        String collect = message.stream().collect(Collectors.joining("\n"));
        alert.setContentText(collect);
        alert.showAndWait();
    }

    public static void alertInfo(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("信息");
        //alert.setHeaderText("下面是相关的变更信息：");
        alert.setContentText(message);
        alert.showAndWait();
    }

}
