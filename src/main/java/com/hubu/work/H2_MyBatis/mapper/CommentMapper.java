package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> selectAllCommentsByName(String aim);

    //查询对应评论ID的全部回复评论
    List<Comment> selectAllCommentsById(String  id);

    //根据ID查询评论
    Comment selectCommentById(Integer id);


    void addComment(Comment comment);
}
