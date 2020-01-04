package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import com.hubu.work.service.CommentService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    Utils utils;

    @ApiOperation("查询全部评论")
    @PostMapping("/selectAllCommentsByName")
    public List<Comment> selectAllCommentsByName(@RequestParam String aim){
        List<Comment> comments=commentService.selectAllCommentsByName(aim);
        return comments;
    }

    @ApiOperation("查询对应评论ID的全部回复评论")
    @PostMapping("/selectAllCommentsById")
    public List<Comment> selectAllCommentsById(@RequestParam String id){
        List<Comment> comments=commentService.selectAllCommentsById(id);
        return comments;
    }

    @ApiOperation("根据ID值查询评论信息")
    @PostMapping("/selectCommentById")
    public Comment selectCommentById(@RequestParam Integer id){
        Comment comment = commentService.selectCommentById(id);
        return comment;
    }

    @ApiOperation("评论歌曲")
    @PostMapping("/addComments")
    public void addComments(@RequestBody Comment comment){
        comment.setPraisePoints(0);
        comment.setPublicationTime(utils.getTime());
        comment.setReplayId(" ");
        commentService.addComment(comment);
    }

    @ApiOperation("对一级评论进行点赞")
    @PostMapping("/addPraise")
    public void addPraise(@RequestBody Comment comment){
        Integer praisePoints = comment.getPraisePoints();
        Integer praisePoint=praisePoints+1;
        comment.setPraisePoints(praisePoint);

        commentService.addPraise(comment);
    }
}
