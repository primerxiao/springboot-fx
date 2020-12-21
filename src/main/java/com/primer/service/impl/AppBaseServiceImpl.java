package com.primer.service.impl;

import com.primer.repository.AppConfigRepository;
import com.primer.entity.AppConfig;
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
    private AppConfigRepository appConfigRepository;

    @Override
    public AppConfig findByConfigCode(String configCode) {
        return appConfigRepository.findById(configCode).orElse(null);
    }
    @Override
    public AppConfig save(AppConfig appConfig) {
        return appConfigRepository.save(appConfig);
    }

    @Override
    public List<AppConfig> findAll() {
        return this.appConfigRepository.findAll();
    }

}
