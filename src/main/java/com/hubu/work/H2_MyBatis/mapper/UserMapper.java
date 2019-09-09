package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> selectAll();
}