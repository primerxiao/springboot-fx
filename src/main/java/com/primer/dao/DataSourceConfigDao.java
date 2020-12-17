package com.primer.dao;

import com.primer.entity.DataSourceConfig;
import com.primer.entity.DataSourceConfigPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceConfigDao extends JpaRepository<DataSourceConfig, DataSourceConfigPK> {

}