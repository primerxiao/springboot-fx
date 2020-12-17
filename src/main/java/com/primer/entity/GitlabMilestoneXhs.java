package com.primer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GitlabMilestoneXhs {
    @Id
    @Column
    private Integer id;
    @Column
    private String title;
    @Column
    private Integer projectId;
    @Column
    private String projectName;
}
