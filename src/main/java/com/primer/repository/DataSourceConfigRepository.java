package com.primer.repository;

import com.primer.entity.DataSourceConfig;
import com.primer.entity.DataSourceConfigPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, DataSourceConfigPK> {

}