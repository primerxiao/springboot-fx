package com.primer.common.constant;

import javafx.application.HostServices;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

/**
 * The enum {@link GUIState} stores Scene and Stage objects as singletons in
 * this VM.
 *
 * @author Felix Roske
 * @author Andreas Jay
 */
public enum GUIState {

	/**
	 *
	 */
	INSTANCE;

	/**
	 * 场景
	 */
	private static Scene scene;

	/**
	 * 阶段
	 */
	private static Stage stage;

	/**
	 * 标题
	 */
	private static String title;

	/**
	 * 服务
	 */
	private static HostServices hostServices;

	/**
	 * 后台运行的托盘程序
	 */
	private static SystemTray systemTray;
	
	public static String getTitle() {
		return title;
	}

	public static Scene getScene() {
		return scene;
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setScene(final Scene scene) {
		GUIState.scene = scene;
	}

	public static void setStage(final Stage stage) {
		GUIState.stage = stage;
	}

	public static void setTitle(final String title) {
		GUIState.title = title;
	}

    public static HostServices getHostServices() {
        return hostServices;
    }

    public static void setHostServices(HostServices hostServices) {
        GUIState.hostServices = hostServices;
    }

    public static SystemTray getSystemTray() {
        return systemTray;
    }

    public static void setSystemTray(SystemTray systemTray) {
        GUIState.systemTray = systemTray;
    }

}
