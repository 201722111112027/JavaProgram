package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Comment;
import com.hubu.work.service.ReplayService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "replay")
public class ReplayController {
    @Autowired
    ReplayService replayService;

    @Autowired
    Utils utils;

    @ApiOperation("查询对应ID的全部回复")
    @PostMapping("/selectAllComments")
    public List<Comment> selectAllReplayById(@RequestParam Integer id){
        List<Comment> replays = replayService.selectAllReplayById(id);
        return replays;
    }

    @ApiOperation("回复一级评论")
    @PostMapping("/addReplay")
    public void addReplay(@RequestParam Comment comment){
        comment.setPraisePoints(0);
        comment.setPublicationTime(utils.getTime());
        comment.setCommentAim("");

        replayService.addRplay(comment);
    }

    @ApiOperation("点赞回复评论")
    @PostMapping("/givePraise")
    public void givePraise(@RequestBody Comment comment){
        Integer praisePoints = comment.getPraisePoints();
        Integer praisePoint=praisePoints+1;
        comment.setPraisePoints(praisePoint);
        replayService.givePraise(comment);
    }
}
