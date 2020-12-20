package com.primer.gui.main;

import com.jfoenix.controls.JFXRippler;
import com.jfoenix.effects.JFXDepthManager;
import com.primer.MainApplication;
import com.primer.common.constanst.StyleConstanst;
import com.primer.common.jfxsupport.AbstractFxmlView;
import com.primer.common.jfxsupport.FXMLController;
import com.primer.entity.AppToolList;
import com.primer.service.CommonService;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author HIFeng
 */
@FXMLController
public class MainMenuController implements Initializable {

    public FlowPane flowPane;

    public StackPane stackPane;

    @Autowired
    private CommonService<AppToolList, String> appToolListService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO drop shadow changes the width and height thus need to be considered
        flowPane.setVgap(20);
        flowPane.setHgap(20);
        List<AppToolList> appToolLists = appToolListService.findAll(AppToolList.class);
        for (AppToolList appToolList : appToolLists) {
            Label label = new Label(appToolList.getToolName());
            label.setStyle(StyleConstanst.FX_BACKGROUND_COLOR_WHITE);
            label.setPadding(new Insets(20));
            JFXRippler rippler = new JFXRippler(label);
            flowPane.getChildren().add(rippler);
            JFXDepthManager.setDepth(label, JFXDepthManager.getLevels());
            label.setOnMouseClicked((e) -> {
                try {
                    MainApplication.showView((Class<? extends AbstractFxmlView>) Class.forName(appToolList.getToolViewClass()), getModality(appToolList.getToolOpenModality()));
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
        }
        StackPane.setMargin(flowPane, new Insets(50));
        stackPane.setStyle(StyleConstanst.FX_BACKGROUND_COLOR_WHITE);
    }

    public Modality getModality(Integer modality) {
        if (modality == 0) {
            return Modality.NONE;
        } else if (modality == 1) {
            return Modality.WINDOW_MODAL;
        } else if (modality == 2) {
            return Modality.APPLICATION_MODAL;
        }
        throw new RuntimeException("转换modality异常");
    }
}