package com.primer.controller;

import com.primer.MainApplication;
import com.primer.jfxsupport.AbstractFxmlView;
import com.primer.jfxsupport.FXMLController;
import com.primer.view.BatchHelperView;
import com.primer.view.VersionHelperView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Modality;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class MainMenuController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void openBatchHelper(ActionEvent actionEvent) {
        MainApplication.showInitialView(BatchHelperView.class);
    }

    @FXML
    public void openLogHelper(ActionEvent actionEvent) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.primer.view.LogHelperView");
        MainApplication.showInitialView((Class<? extends AbstractFxmlView>) aClass);
    }

    @FXML
    public void openEsbHelper(ActionEvent actionEvent) {

    }

    @FXML
    public void openVersionHelper(ActionEvent actionEvent) {
        MainApplication.showView(VersionHelperView.class,Modality.NONE);
    }

}