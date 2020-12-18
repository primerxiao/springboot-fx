package com.primer.repository;

import com.primer.entity.GitlabProjectConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface GitlabProjectConfigRepository extends JpaRepository<GitlabProjectConfig, String> {

}