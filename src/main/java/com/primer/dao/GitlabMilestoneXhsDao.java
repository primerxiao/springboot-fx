package com.primer.dao;

import com.primer.entity.GitlabMilestone;
import com.primer.entity.GitlabMilestoneXhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author HIFeng
 */
@Repository
public interface GitlabMilestoneXhsDao extends JpaRepository<GitlabMilestoneXhs, Integer> {

    GitlabMilestoneXhs findByProjectId(Integer projectId);
}