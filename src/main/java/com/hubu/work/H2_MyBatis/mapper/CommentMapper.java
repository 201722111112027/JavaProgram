package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    //查询对应歌曲的全部评论
    List<Comment> selectAllComments(String aim);

    //评论歌曲
    void addComment(Comment comment);

    //点赞一级评论
    void addPraise(Comment comment);
}
