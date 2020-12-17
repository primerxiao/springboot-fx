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

        Label label = new Label("Click Me");
        label.setStyle(FX_BACKGROUND_COLOR_WHITE);
        label.setPadding(new Insets(20));
        JFXRippler rippler = new JFXRippler(label);
        rippler.setEnabled(false);
        flowPane.getChildren().add(rippler);

        label.setOnMousePressed((e) -> {
            if (counter == 5) {
                step = -1;
            } else if (counter == 0) {
                step = 1;
            }
            JFXDepthManager.setDepth(label, counter += step % JFXDepthManager.getLevels());
        });

        Label l1 = new Label("TEST");
        l1.setStyle(FX_BACKGROUND_COLOR_WHITE);
        l1.setPadding(new Insets(20));
        JFXRippler rippler1 = new JFXRippler(l1);
        flowPane.getChildren().add(rippler1);
        JFXDepthManager.setDepth(rippler1, 1);

        Label l2 = new Label("TEST1");
        l2.setStyle(FX_BACKGROUND_COLOR_WHITE);
        l2.setPadding(new Insets(20));
        JFXRippler rippler2 = new JFXRippler(l2);
        flowPane.getChildren().add(rippler2);
        JFXDepthManager.setDepth(rippler2, 2);


        Label l3 = new Label("TEST2");
        l3.setStyle(FX_BACKGROUND_COLOR_WHITE);
        l3.setPadding(new Insets(20));
        JFXRippler rippler3 = new JFXRippler(l3);
        flowPane.getChildren().add(rippler3);
        JFXDepthManager.setDepth(rippler3, 3);

        Label l4 = new Label("TEST3");
        l4.setStyle(FX_BACKGROUND_COLOR_WHITE);
        l4.setPadding(new Insets(20));
        JFXRippler rippler4 = new JFXRippler(l4);
        flowPane.getChildren().add(rippler4);
        JFXDepthManager.setDepth(rippler4, 4);

        Label l5 = new Label("TEST4");
        l5.setStyle(FX_BACKGROUND_COLOR_WHITE);
        l5.setPadding(new Insets(20));
        JFXRippler rippler5 = new JFXRippler(l5);
        flowPane.getChildren().add(rippler5);
        JFXDepthManager.setDepth(rippler5, 5);

        StackPane.setMargin(flowPane, new Insets(100));
        stackPane.setStyle("-fx-background-color:WHITE");

    }

}