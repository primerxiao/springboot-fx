package com.primer.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: StringUtils
 * @Description:提供了对字符创相关做操的公用方法
 * @Author:
 * @CreateDate:2018-12-15 下午08:07:18
 * @Version:0.1
 * @ModifyLog:2018-12-15 下午08:07:18
 */
public class StringUtils {
	private static Logger logger = LoggerFactory.getLogger(StringUtils.class);

	/**
	 * @Title: replaceNullByObj
	 * @Description:如果Object对象为NULL时替换为空字符串
	 * @Parmaters: @param obj
	 * @Parmaters: @return
	 * @Return: String
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized String replaceNullByObj(Object obj) {
		if (obj == null) {
			return "";
		} else {
			return String.valueOf(obj);
		}
	}

	/**
	 * @Title: convertDateFrom10To8
	 * @Description:转换YYYY-MM-DD为YYYYMMDD
	 * @Parmaters: @param obj
	 * @Parmaters: @return
	 * @Return: String
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized String convertDateFrom10To8(Object obj) {
		String temp = replaceNullByObj(obj);
		return temp.replaceAll("-", "");
	}

	/**
	 * @Title: stringIsEmptyOrNull
	 * @Description: 判断String字符串是否为""或者NULL
	 * @Parmaters: @param param 字符串
	 * @Parmaters: @return
	 * @Return: boolean
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized boolean stringIsEmptyOrNull(String param) {
		boolean cheakParamIsEmptyOrNull = false;
		if (param == null || "".equals(param.trim())) {
			cheakParamIsEmptyOrNull = true;
			logger.info("参数为空字符串！");
		}
		return cheakParamIsEmptyOrNull;
	}

	/**
	 * @Title: stringsIsEmptyOrNull
	 * @Description:判断多个String字符串是否为""或者NULL
	 * @Parmaters: @param params
	 * @Parmaters: @return true 或者 false
	 * @Return: boolean
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized boolean stringsIsEmptyOrNull(String... params) {
		boolean cheakParamsIsEmptyOrNull = false;
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				if (params[i] == null || "".equals(params[i].trim())) {
					cheakParamsIsEmptyOrNull = true;
					logger.info("参数中存在空字符串！");
					break;
				}
			}
		} else {
			cheakParamsIsEmptyOrNull = true;
			logger.info("参数中存在空字符串！");
		}
		return cheakParamsIsEmptyOrNull;
	}

	/**
	 * @Title: checkAndPrint
	 * @Description:根据flag判断字段是否必输，如必输时，字符串为空，则抛出异常
	 * @Parmaters: @param sKey 字段值
	 * @Parmaters: @param sName 字段中文名
	 * @Parmaters: @param flag 是否必输
	 * @Parmaters: @throws Exception
	 * @Return: void
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized void checkAndPrint(String sKey, String sName, boolean flag) throws Exception {
		if (flag) {
			if (sKey == null || sKey.equals("")) {
				throw new Exception("传入参数【" + sName + "】为空");
			}
		}
		logger.info("传入参数【" + sName + "：" + sKey + "】【是否必输：" + flag + "】" + "必输项检查通过");
	}

	/**
	 * @Title: isNumericSpace
	 * @Description:根据字符串内容trim后是否为数字， 方法来源于开源工具包org.apache.commons.lang.StringUtils.java
	 * @Parmaters: @param str 字段值
	 * @Parmaters: @return true 是数字，false 不是数字
	 * @Return: boolean
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized boolean isNumericSpace(String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; ++i) {
			if ((!(Character.isDigit(str.charAt(i)))) && (str.charAt(i) != ' ')) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @Title: subStr
	 * @Description: 根据长度截取字符串,中文算两位,英文和数字算一位
	 * @Parmaters: @param source 源字符串
	 * @Parmaters: @param fixLength 截取的长度
	 * @Parmaters: @return
	 * @Return: String
	 * @Throws:
	 * @Author:
	 * @CreateDate:2018-12-15 下午08:07:18
	 * @Version:0.1
	 * @ModifyLog:2018-12-15 下午08:07:18
	 */
	public static synchronized String subStr(String source, int fixLength) {
		int splitPoint = 0;
		if (source == null)
			source = "";
		char charArray[] = source.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int ascii = Character.codePointAt(charArray, i);
			if (ascii >= 0 && ascii <= 255) {
				splitPoint++;
			} else {
				splitPoint += 2;
			}
			if (splitPoint > fixLength) {
				source = source.substring(0, i);
				break;
			}
		}
		return source;
	}

	/**
	 * @Title: countForStr
	 * @Description: 计算子字符串出现次数<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param src
	 * @Parmaters: @param target
	 * @Parmaters: @return
	 * @Return: int
	 * @Throws:
	 * @Author:hengyh
	 * @CreateDate:2018年6月1日 下午2:07:56
	 * @Version:0.1
	 * @ModifyLog:2018年6月1日 下午2:07:56
	 */
	public static int countForStr(String src, String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher matcher = p.matcher(src);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}
}
