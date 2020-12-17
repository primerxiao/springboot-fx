package com.primer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class DataExportConfig implements Serializable {

    @Id
    @Column
    private Integer id;

    @Column
    private String queryStatement;

    @Column
    private String className;

    @Column
    private String remark;

    @Column
    private static final long serialVersionUID = 1L;


}