package com.hubu.work.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hubu.work.H2_MyBatis.pojo.Comment;
import com.hubu.work.service.CommentService;
import com.hubu.work.utils.PageBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @ApiOperation("查询全部评论")
    @PostMapping("/selectAllComments")
    public List<Comment> selectAllComments(){
        List<Comment> comments=commentService.selectAllComments();
        return comments;
    }

    @ApiOperation("评论歌曲")
    @PostMapping("/addComments")
    public void addComments(@RequestBody Comment comment){
        commentService.addComment(comment);

    }
}
