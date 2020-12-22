package com.primer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author gcb
 */
@Entity
@Table(name = "app_tool_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppToolConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String configController;
    @Column
    private String configFiedName;
    @Column
    private String configFieldClass;
    @Column
    private String configFiedValueClass;
    @Column
    private String configFiedValue;
}

