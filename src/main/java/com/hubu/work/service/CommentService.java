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
    public List<Comment> selectAllCommentsByName(String aim){
        List<Comment> comments = commentMapper.selectAllCommentsByName(aim);
        return comments;
    }

    //查询对应评论ID的全部回复评论
    public List<Comment> selectAllCommentsById(Integer id){
        List<Comment> comments=commentMapper.selectAllCommentsById(id);
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
