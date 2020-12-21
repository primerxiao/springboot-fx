package com.primer.service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.primer.gui.uicomponents.dubbo.DubboCallParam;
import org.springframework.stereotype.Service;

@Service
public class DubboService {

    /**
     * dubbo泛化调用
     * @param dubboCallParam 参数
     * @return 调用响应结果
     */
    public Object remoteCall(DubboCallParam dubboCallParam) {
        ApplicationConfig application = new ApplicationConfig();
        application.setName(dubboCallParam.applicationName);
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress(dubboCallParam.registryAddress);
        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface(dubboCallParam.referenceInterface);
        reference.setVersion(dubboCallParam.referenceVersion);
        reference.setGeneric(dubboCallParam.referenceGeneric);
        reference.setProtocol("dubbo");
        reference.setGroup(dubboCallParam.registryGroup);
        GenericService genericService = reference.get();
        // 如果返回POJO将自动转成Map
        return genericService.$invoke(dubboCallParam.getInvokeMethod(), dubboCallParam.getInvokeMethodParamType(),
                dubboCallParam.getInvokeMethodParam());
    }


}
