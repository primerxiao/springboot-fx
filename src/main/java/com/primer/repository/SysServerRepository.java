package com.primer.repository;

import com.primer.entity.SysServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysServerRepository extends JpaRepository<SysServer, Integer> {

}