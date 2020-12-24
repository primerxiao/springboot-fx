package com.primer;


import com.primer.common.jfxsupport.AbstractJavaFxApplicationSupport;
import com.primer.gui.main.MainMenuView;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
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
