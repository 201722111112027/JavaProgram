package com.hubu.work.service;

import com.hubu.work.H2_MyBatis.mapper.UserMapper;
import com.hubu.work.H2_MyBatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  UserMapper userMapper;

  //查询所有的用户
  public List<User> selectAll(){
    return userMapper.selectAll();
  }

  //用户登录功能
  public int login(User user){
    return userMapper.login(user);
  }

  //用户注册功能
  public int registerUser(User user){
    return userMapper.registerUser(user);
  }
}
