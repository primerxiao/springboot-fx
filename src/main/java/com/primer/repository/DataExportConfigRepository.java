package com.primer.repository;

import com.primer.entity.DataExportConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataExportConfigRepository extends JpaRepository<DataExportConfig, Integer> {

}