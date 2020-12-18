package com.primer.repository;

import com.primer.entity.GitlabMilestone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface GitlabMilestoneRepository extends JpaRepository<GitlabMilestone, Integer> {

}