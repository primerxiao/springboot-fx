package com.primer.repository;

import com.primer.entity.SysEnv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysEnvRepository extends JpaRepository<SysEnv, Integer> {

}