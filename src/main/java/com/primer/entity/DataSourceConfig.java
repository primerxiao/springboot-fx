package com.primer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
@IdClass(DataSourceConfigPK.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceConfig  implements Serializable {

    @Id
    @Column
    private String ip;

    @Id
    @Column
    private String dataName;

    @Column
    private String port;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String remark;

    @Column
    private String smcenterIp;

}