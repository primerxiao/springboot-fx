package com.primer.repository;

import com.primer.entity.GitlabMilestoneXhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface GitlabMilestoneXhsRepository extends JpaRepository<GitlabMilestoneXhs, Integer> {

    GitlabMilestoneXhs findByProjectId(Integer projectId);
}