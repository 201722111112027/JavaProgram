package com.hubu.work.H2_MyBatis.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String username;
  private String password;
  private String nickname;
  private String avatarUrl;
}
