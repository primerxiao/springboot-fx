package com.primer.dao;

import com.primer.entity.AppConfig;
import com.primer.entity.SysDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysDbDao extends JpaRepository<SysDb, Integer> {

}