package com.primer.service.impl;

import com.primer.entity.AppToolConfig;
import com.primer.repository.AppToolConfigRepository;
import com.primer.service.AppBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HIFeng
 */
@Service
public class AppBaseServiceImpl implements AppBaseService {

    @Autowired
    private AppToolConfigRepository appToolConfigRepository;

    @Override
    public AppToolConfig findByConfigCode(String configController, String configFiedName) {
        return appToolConfigRepository.findByConfigControllerAndConfigFiedName(configController, configFiedName);
    }

    @Override
    public AppToolConfig save(AppToolConfig appConfig) {
        return appToolConfigRepository.save(appConfig);
    }

    @Override
    public List<AppToolConfig> findAll() {
        return this.appToolConfigRepository.findAll();
    }

}
