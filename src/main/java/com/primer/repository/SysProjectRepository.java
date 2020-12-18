package com.primer.repository;

import com.primer.entity.SysProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface SysProjectRepository extends JpaRepository<SysProject, Integer> {

}