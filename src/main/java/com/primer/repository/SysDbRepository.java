package com.primer.repository;

import com.primer.entity.SysDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysDbRepository extends JpaRepository<SysDb, Integer> {

}