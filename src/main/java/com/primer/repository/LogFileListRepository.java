package com.primer.repository;

import com.primer.entity.LogFileList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HIFeng
 */
@Repository
public interface LogFileListRepository extends JpaRepository<LogFileList, Integer> {

}