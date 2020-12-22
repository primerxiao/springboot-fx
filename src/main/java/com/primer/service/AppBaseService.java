package com.primer.service;

import com.primer.entity.AppToolConfig;

import java.util.List;

/**
 * @author HIFeng
 */
public interface AppBaseService {

    AppToolConfig findByConfigCode(String configController, String configFiedName);

    AppToolConfig save(AppToolConfig appConfig);

    List<AppToolConfig> findAll();
}
