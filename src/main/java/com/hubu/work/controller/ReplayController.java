package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Replay;
import com.hubu.work.service.ReplayService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Replay> selectAllReplayById(@RequestParam Integer id){
        List<Replay> replays = replayService.selectAllReplayById(id);
        return replays;
    }
}
