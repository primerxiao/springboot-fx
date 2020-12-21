package com.primer.gui.uicomponents.dubbo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起dubbo调用需要的参数
 * @author gcb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DubboCallParam {
    public String applicationName;
    public String registryAddress;
    public String registryGroup;
    public String referenceInterface;
    public String referenceVersion;
    public boolean referenceGeneric;
    public String invokeMethod;
    public String[] invokeMethodParamType;
    public Object[] invokeMethodParam;
}
