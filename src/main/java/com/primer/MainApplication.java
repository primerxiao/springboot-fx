package com.primer;

import com.primer.jfxsupport.AbstractJavaFxApplicationSupport;
import com.primer.view.BatchHelperView;
import com.primer.view.MainMenuView;
import javafx.application.Platform;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;


/**
 * app启动类
 *
 * @author HIFeng
 */
@SpringBootApplication
@EnableJpaRepositories
public class MainApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) throws IOException {
        //Platform.setImplicitExit(false);
        launch(MainApplication.class, MainMenuView.class, args);
    }
}
