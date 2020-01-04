package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplayMapper {

    //根据Id查询对应评论的全部回复
    List<Comment> selectAllReplayById(String id);

    //对一级评论进行评论
    void addReplay(Comment comment);

    //对回复评论进行点赞
    void givePraise(Comment comment);

    //根据ID查询评论全部信息
    Comment queryCommentById(Integer id);
}
