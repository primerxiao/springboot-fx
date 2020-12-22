package com.primer.repository;

import com.primer.entity.AppToolConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HIFeng
 */
@Repository
public interface AppToolConfigRepository extends JpaRepository<AppToolConfig, Integer> {

    /**
     * 根据类和字段名查询数据
     *
     * @param configController 查询的参数
     * @param configFiedName   查询的参数
     * @return 返回查询数据集
     */
    AppToolConfig findByConfigControllerAndConfigFiedName(String configController, String configFiedName);
}