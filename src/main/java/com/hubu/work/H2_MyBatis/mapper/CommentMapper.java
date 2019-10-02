package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> selectAllComments();

    void addComment(Comment comment);
}
