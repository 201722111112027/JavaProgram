package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.SongSheet;
import com.hubu.work.service.SongSheetService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "songSheet")
public class SongSheetController {
    @Autowired
    SongSheetService songSheetService;

    @ApiOperation("查询所有的歌单名")
    @PostMapping("/selectAllSongSheet")
    public List<SongSheet> selectAllSongSheet(){
        List<SongSheet> songSheets = songSheetService.selectAll();
        return songSheets;
    }
}
