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

    public List<Comment> selectAllComments(){
        List<Comment> comments = commentMapper.selectAllComments();
        return comments;
    }

    public void addComment(Comment comment){
        commentMapper.addComment(comment);
    }
}
