package de.felixroske.jfxsupport;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 肖均辉
 */
@SpringBootApplication
public class HelloFxMain extends AbstractJavaFxApplicationSupport{
    public static void main(String[] args) {
        launch(HelloFxMain.class, HelloFXView.class, args);
    }
}