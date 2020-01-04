package com.hubu.work.service;

import com.hubu.work.H2_MyBatis.mapper.ReplayMapper;
import com.hubu.work.H2_MyBatis.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplayService {
    @Autowired
    ReplayMapper replayMapper;

    //根据一级评论ID查询对应回复
    public List<Comment> selectAllReplayById(String id){

        return replayMapper.selectAllReplayById(id);
    }

    //评论一级评论
    public void addReplay(Comment comment){
        replayMapper.addReplay(comment);
    }

    //对回复评论进行点赞
    public void givePraise(Comment comment){
        replayMapper.givePraise(comment);
    }

    //根据ID查询评论对应信息
    public Comment queryCommentById(public Comment selectCommentById(Integer  id){
        Comment comments=commentMapper.selectCommentById(id);
        return comments;
    } id){
        Comment comment = replayMapper.queryCommentById(id);
        return comment;
    }
}
