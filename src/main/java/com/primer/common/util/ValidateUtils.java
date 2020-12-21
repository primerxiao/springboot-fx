package com.primer.common.util;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import java.awt.*;

/**
 * 校验工具类
 *
 * @author gcb
 */
public class ValidateUtils {

    public static boolean validate(Object... textFields) {
        for (Object textField : textFields) {
            if (textField instanceof JFXTextField) {
                if (!((JFXTextField) textField).validate()) {
                    return false;
                }
            }
            if (textField instanceof JFXComboBox) {
                if (!((JFXComboBox) textField).validate()) {
                    return false;
                }
            }
        }
        return true;
    }
}
