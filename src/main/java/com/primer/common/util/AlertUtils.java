package com.primer.common.util;

import javafx.scene.control.Alert;

import java.util.List;
import java.util.stream.Collectors;

public class AlertUtils {

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
