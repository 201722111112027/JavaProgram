package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import com.hubu.work.service.CommentService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    Utils utils;

    @ApiOperation("查询全部评论")
    @PostMapping("/selectAllComments")
    public List<Comment> selectAllComments(){
        List<Comment> comments=commentService.selectAllComments();
        return comments;
    }

    @ApiOperation("评论歌曲")
    @PostMapping("/addComments")
    public void addComments(@RequestBody Comment comment){
        comment.setPraisePoints(0);
        comment.setPublicationTime(utils.getTime());
        commentService.addComment(comment);

    }
}
