package com.hubu.work.H2_MyBatis.pojo;


public class User {

  private Integer id;
  private String username;
  private String password;
  private String nickname;
  private String head_portrait;
  private String personal_signature;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getHead_portrait() {
    return head_portrait;
  }

  public void setHead_portrait(String head_portrait) {
    this.head_portrait = head_portrait;
  }

  public String getPersonal_signature() {
    return personal_signature;
  }

  public void setPersonal_signature(String personal_signature) {
    this.personal_signature = personal_signature;
  }
}
