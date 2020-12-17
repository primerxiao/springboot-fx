package com.primer.dao;

import com.primer.entity.GitlabMilestone;
import com.primer.entity.GitlabProjectConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface GitlabMilestoneDao extends JpaRepository<GitlabMilestone, Integer> {

}