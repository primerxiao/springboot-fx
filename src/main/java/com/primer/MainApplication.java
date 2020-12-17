package com.primer;

import com.primer.jfxsupport.AbstractJavaFxApplicationSupport;
import com.primer.view.BatchHelperView;
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
        launch(MainApplication.class, BatchHelperView.class, args);
        //Platform.setImplicitExit(false);
    }
}
