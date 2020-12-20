package com.primer.gui.main;

import com.primer.common.annotation.AppConfigAnnotation;
import com.primer.repository.SysDbRepository;
import com.primer.repository.SysEnvRepository;
import com.primer.repository.SysProjectRepository;
import com.primer.repository.SysServerRepository;
import com.primer.entity.AppConfig;
import com.primer.entity.GitlabMilestone;
import com.primer.service.AppConfigService;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * app配置处理类，提供给其它controller继承
 *
 * @author HIFeng
 */
public class AppBaseController {

    @Autowired
    public AppConfigService appConfigService;

    @Autowired
    public SysDbRepository sysDbRepository;

    @Autowired
    public SysEnvRepository sysEnvRepository;

    @Autowired
    public SysProjectRepository sysProjectRepository;

    @Autowired
    public SysServerRepository sysServerRepository;

    /**
     * 保存配置到数据库
     */
    @FXML
    public void saveAppConfig() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            AppConfigAnnotation configAnnotation = field.getDeclaredAnnotation(AppConfigAnnotation.class);
            if (!Objects.isNull(configAnnotation)) {
                //适用于配置
                field.setAccessible(true);
                String fieldName = field.getName();
                //获取数据库的配置
                AppConfig byConfigCode = appConfigService.findByConfigCode(this.getClass().getSimpleName() + "_" +WordUtils.capitalize(fieldName));
                if (Objects.isNull(byConfigCode)) {
                    //获取到配置为空不做处理
                    byConfigCode = new AppConfig();
                }
                Object fieldConfigValue = getFieldConfigValue(field);
                if (Objects.isNull(fieldConfigValue)) {
                    continue;
                }
                byConfigCode.setConfigCode(this.getClass().getSimpleName()+"_"+WordUtils.capitalize(fieldName));
                byConfigCode.setConfigClass(field.getGenericType().toString());
                byConfigCode.setConfigValue(String.valueOf(fieldConfigValue));
                appConfigService.save(byConfigCode);
            }
        }
    }

    /**
     * 初始化配置到程序
     */
    public void initAppConfig(AppBaseController appBaseController) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //配置的code为类名+字段名
        Field[] declaredFields = appBaseController.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            AppConfigAnnotation configAnnotation = declaredField.getDeclaredAnnotation(AppConfigAnnotation.class);
            if (!Objects.isNull(configAnnotation)) {
                //适用于配置
                declaredField.setAccessible(true);
                String fieldName = declaredField.getName();
                //获取数据库的配置
                AppConfig byConfigCode = appConfigService.findByConfigCode(appBaseController.getClass().getSimpleName() + "_" +WordUtils.capitalize(fieldName));
                if (Objects.isNull(byConfigCode)) {
                    //获取到配置为空不做处理
                    continue;
                }
                //获取对应属性在controller中的get函数，以便获取相关对象
                Method fieldGetMethod = appBaseController.getClass().getMethod("get" + WordUtils.capitalize(fieldName));
                if (Objects.isNull(fieldGetMethod)) {
                    continue;
                }
                if ("class javafx.scene.control.TextField".equals(declaredField.getGenericType().toString())) {
                    TextField textField = (TextField) fieldGetMethod.invoke(appBaseController);
                    textField.setText(byConfigCode.getConfigValue());
                    continue;
                }
                if ("javafx.scene.control.ChoiceBox<com.primer.entity.GitlabMilestone>".equals(declaredField.getGenericType().toString())) {
                    ChoiceBox<GitlabMilestone> choiceBox = (ChoiceBox<GitlabMilestone>) fieldGetMethod.invoke(this);
                    for (GitlabMilestone item : choiceBox.getItems()) {
                        if (item.getId() == Integer.parseInt(byConfigCode.getConfigValue())) {
                            choiceBox.getSelectionModel().select(item);
                        }
                    }
                }
            }
        }
    }

    private Object getFieldConfigValue(Field field) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method fieldGetMethod = this.getClass().getMethod("get" + WordUtils.capitalize(field.getName()));
        if (Objects.isNull(fieldGetMethod)) {
            return null;
        }
        if ("class javafx.scene.control.TextField".equals(field.getGenericType().toString())) {
            TextField textField = (TextField) fieldGetMethod.invoke(this);
            return textField.getText();
        }
        if ("javafx.scene.control.ChoiceBox<com.primer.entity.GitlabMilestone>".equals(field.getGenericType().toString())) {
            ChoiceBox<GitlabMilestone> choiceBox = (ChoiceBox<GitlabMilestone>) fieldGetMethod.invoke(this);
            return choiceBox.getSelectionModel().getSelectedItem().getId();
        }
        return null;
    }

}
