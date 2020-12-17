package com.primer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class LogFileList {
    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String logFilePath;
    @Column
    private String sysProjectId;
    @Column
    private Integer sysServerId;
    @Column
    private Integer sysEnvId;
}
