package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Replay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplayMapper {

    //根据Id查询对应评论的全部回复
    List<Replay> selectAllRepalyById(Integer id);
}
