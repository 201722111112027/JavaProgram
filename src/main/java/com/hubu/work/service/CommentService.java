package com.hubu.work.service;

import com.github.pagehelper.Page;
import com.hubu.work.H2_MyBatis.mapper.CommentMapper;
import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    //查询对应歌曲的全部评论
    public List<Comment> selectAllComments(String aim){
        List<Comment> comments = commentMapper.selectAllComments(aim);
        return comments;
    }

    //评论歌曲
    public void addComment(Comment comment){
        commentMapper.addComment(comment);
    }

    //对一级评论尽心点赞
    public void addPraise(Comment comment){
        commentMapper.addPraise(comment);
    }
}
