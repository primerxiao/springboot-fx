package com.primer.controller;

import com.jfoenix.controls.JFXRippler;
import com.jfoenix.effects.JFXDepthManager;
import com.primer.MainApplication;
import com.primer.jfxsupport.AbstractFxmlView;
import com.primer.jfxsupport.FXMLController;
import com.primer.view.BatchHelperView;
import com.primer.view.VersionHelperView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author HIFeng
 */
@FXMLController
public class MainMenuController implements Initializable {

    public FlowPane flowPane;

    private static final String FX_BACKGROUND_COLOR_WHITE = "-fx-background-color:WHITE;";
    private static int counter = 0;
    private static int step = 1;
    public StackPane stackPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO drop shadow changes the width and height thus need to be considered
        flowPane.setVgap(20);
        flowPane.setHgap(20);

        Label label = new Label("提版助手");
        label.setStyle(FX_BACKGROUND_COLOR_WHITE);
        label.setPadding(new Insets(20));
        JFXRippler rippler = new JFXRippler(label);
        flowPane.getChildren().add(rippler);
        JFXDepthManager.setDepth(label, JFXDepthManager.getLevels());

        label.setOnMousePressed((e) -> {
            MainApplication.showView(VersionHelperView.class, Modality.NONE);
        });

        Label label2 = new Label("提版助手");
        label2.setStyle(FX_BACKGROUND_COLOR_WHITE);
        label2.setPadding(new Insets(20));
        JFXRippler rippler1 = new JFXRippler(label2);
        flowPane.getChildren().add(rippler1);
        JFXDepthManager.setDepth(label2, JFXDepthManager.getLevels());
        label2.setOnMousePressed((e) -> {
            MainApplication.getStage().hide();

        });
        StackPane.setMargin(flowPane, new Insets(50));
        stackPane.setStyle("-fx-background-color:WHITE");

    }

}