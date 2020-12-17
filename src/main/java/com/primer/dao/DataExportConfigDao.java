package com.primer.dao;

import com.primer.entity.DataExportConfig;
import com.primer.entity.DataSourceConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataExportConfigDao extends JpaRepository<DataExportConfig, Integer> {

}