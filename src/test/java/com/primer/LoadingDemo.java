package com.primer;

import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.primer.common.util.AlertUtils;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.concurrent.atomic.AtomicReference;

public final class LoadingDemo extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane main = new FlowPane();
        main.setVgap(20);
        main.setHgap(20);

        JFXButton button = new JFXButton("点我加载");
        button.getStyleClass().add("button-raised");
        main.getChildren().add(button);

        button.setOnMouseClicked(e->{
            Task<Integer> task = new Task<Integer>() {
                @Override
                protected Integer call() {
                    AtomicReference<JFXAlert<Window>> windowJFXAlert = new AtomicReference<>();
                    Platform.runLater(() -> {
                        windowJFXAlert.set(AlertUtils.showLoading(button));
                    });
                    for (int i = 0; i < 1000000; i++) {
                        System.out.println(i + "测试i");
                    }
                    Platform.runLater(() -> {
                        AlertUtils.hideLoading(windowJFXAlert.get());
                    });
                    return null;
                }
            };

            new Thread(task).start();

        });

        StackPane pane = new StackPane();
        pane.getChildren().add(main);
        StackPane.setMargin(main, new Insets(100));
        pane.setStyle("-fx-background-color:WHITE");

        final Scene scene = new Scene(pane, 800, 200);
        scene.getStylesheets().add(LoadingDemo.class.getResource("/css/jfoenix-components.css").toExternalForm());
        stage.setTitle("JFX Button Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
