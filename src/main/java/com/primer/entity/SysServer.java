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
public class SysServer {
  @Id
  @Column
  private long id;
  @Column
  private String name;
  @Column
  private String ip;
  @Column
  private String port;
  @Column
  private String username;
  @Column
  private String password;
}
