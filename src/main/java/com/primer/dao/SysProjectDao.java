package com.primer.dao;

import com.primer.entity.SysProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysProjectDao extends JpaRepository<SysProject, Integer> {

}