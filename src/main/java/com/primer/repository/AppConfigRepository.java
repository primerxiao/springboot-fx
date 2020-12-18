package com.primer.repository;

import com.primer.entity.AppConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface AppConfigRepository extends JpaRepository<AppConfig, String> {

}