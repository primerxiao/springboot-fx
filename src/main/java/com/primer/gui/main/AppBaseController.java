package com.primer.gui.main;

import com.primer.common.annotation.AutoConfig;
import com.primer.common.util.AlertUtils;
import com.primer.entity.AppToolConfig;
import com.primer.entity.GitlabMilestone;
import com.primer.repository.SysProjectRepository;
import com.primer.service.AppBaseService;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * app配置处理类，提供给其它controller继承
 *
 * @author HIFeng
 */
public class AppBaseController {

    @Autowired
    public AppBaseService appBaseService;

    @Autowired
    public SysProjectRepository sysProjectRepository;


    /**
     * 保存配置到数据库
     */
    @FXML
    public void saveAppConfig() {
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                AutoConfig configAnnotation = field.getDeclaredAnnotation(AutoConfig.class);
                if (!Objects.isNull(configAnnotation)) {
                    //适用于配置
                    field.setAccessible(true);
                    String fieldName = field.getName();
                    //获取数据库的配置
                    AppToolConfig byConfigCode = appBaseService.findByConfigCode(this.getClass().getName(), fieldName);
                    if (Objects.isNull(byConfigCode)) {
                        //获取到配置为空不做处理
                        byConfigCode = new AppToolConfig();
                    }
                    Object fieldConfigValue = getFieldConfigValue(field);
                    if (Objects.isNull(fieldConfigValue)) {
                        continue;
                    }
                    byConfigCode.setConfigController(this.getClass().getName());
                    byConfigCode.setConfigFieldClass(field.getGenericType().toString());
                    byConfigCode.setConfigFiedName(fieldName);
                    byConfigCode.setConfigFiedValue(String.valueOf(fieldConfigValue));
                    byConfigCode.setConfigFiedValueClass(field.getGenericType().toString());
                    appBaseService.save(byConfigCode);
                }
            }
            AlertUtils.jfxAlert("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtils.jfxAlert("保存配置异常", e);
        }
    }

    /**
     * 初始化配置到程序
     */
    public void initAppConfig(AppBaseController appBaseController) throws Exception {
        //配置的code为类名+字段名
        Field[] declaredFields = appBaseController.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            AutoConfig configAnnotation = declaredField.getDeclaredAnnotation(AutoConfig.class);
            if (!Objects.isNull(configAnnotation)) {
                //适用于配置
                declaredField.setAccessible(true);
                String fieldName = declaredField.getName();
                //获取数据库的配置
                AppToolConfig byConfigCode = appBaseService.findByConfigCode(appBaseController.getClass().getName(), fieldName);
                if (Objects.isNull(byConfigCode)) {
                    //获取到配置为空不做处理
                    continue;
                }
                //获取对应属性在controller中的get函数，以便获取相关对象
                Method fieldGetMethod = appBaseController.getClass().getMethod("get" + WordUtils.capitalize(fieldName));
                if (Objects.isNull(fieldGetMethod)) {
                    continue;
                }
                Object fieldObject = fieldGetMethod.invoke(appBaseController);
                if (Objects.isNull(fieldObject)) {
                    continue;
                }
                if (fieldObject instanceof TextField) {
                    ((TextField) fieldObject).setText(byConfigCode.getConfigFiedValue());
                    continue;
                }
                // combobox
                if (fieldObject instanceof ComboBox) {
                    //获取泛化对象
                    String genericTypeStr = declaredField.getGenericType().toString();
                    //String
                    if (genericTypeStr.contains(String.class.getName())) {
                        ((ComboBox<String>) fieldObject).getSelectionModel().select(byConfigCode.getConfigFiedValue());
                    }
                }
                if ("javafx.scene.control.ChoiceBox<com.primer.entity.GitlabMilestone>".equals(declaredField.getGenericType().toString())) {
                    ChoiceBox<GitlabMilestone> choiceBox = (ChoiceBox<GitlabMilestone>) fieldGetMethod.invoke(this);
                    for (GitlabMilestone item : choiceBox.getItems()) {
                        if (item.getId() == Integer.parseInt(byConfigCode.getConfigFiedValue())) {
                            choiceBox.getSelectionModel().select(item);
                        }
                    }
                }
            }
        }
    }

    private Object getFieldConfigValue(Field field) throws Exception {
        Method fieldGetMethod = this.getClass().getMethod("get" + WordUtils.capitalize(field.getName()));
        if (Objects.isNull(fieldGetMethod)) {
            return null;
        }
        Object fieldObject = fieldGetMethod.invoke(this);
        if (Objects.isNull(fieldObject)) {
            return null;
        }
        // textfield
        if (fieldObject instanceof TextField) {
            return ((TextField) fieldObject).getText();
        }
        // combobox
        if (fieldObject instanceof ComboBox) {
            //获取泛化对象
            String genericTypeStr = field.getGenericType().toString();
            //String
            if (genericTypeStr.contains(String.class.getName())) {
                String selectedItem = ((ComboBox<String>) fieldObject).getSelectionModel().getSelectedItem();
                return StringUtils.isEmpty(selectedItem) ? null : selectedItem;
            }
        }

        if ("javafx.scene.control.ChoiceBox<com.primer.entity.GitlabMilestone>".equals(field.getGenericType().toString())) {
            ChoiceBox<GitlabMilestone> choiceBox = (ChoiceBox<GitlabMilestone>) fieldGetMethod.invoke(this);
            GitlabMilestone selectedItem = choiceBox.getSelectionModel().getSelectedItem();
            if (Objects.isNull(selectedItem)) {
                return null;
            }
            return choiceBox.getSelectionModel().getSelectedItem().getId();
        }
        return null;
    }

}
