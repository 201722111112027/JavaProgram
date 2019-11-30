package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.SongSheet;
import com.hubu.work.H2_MyBatis.pojo.Songs;
import com.hubu.work.service.SongSheetService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "songSheet")
public class SongSheetController {
    @Autowired
    SongSheetService songSheetService;

    @Autowired
    Utils utils;

    @ApiOperation("查询所有的歌单名")
    @PostMapping("/selectAllSongSheet")
    public List<SongSheet> selectAllSongSheet(){
        List<SongSheet> songSheets = songSheetService.selectAll();
        return songSheets;
    }

    @ApiOperation("新建歌单")
    @PostMapping("/addSongSheet")
    public void addSongSheet(@RequestBody SongSheet songSheet){
       songSheet.setClick_throughput(0);
       songSheet.setState("N");
       songSheet.setTime(utils.getTime());
       songSheetService.addSongSheet(songSheet);
    }

    @ApiOperation("查询歌单所属歌曲")
    @PostMapping("/selectAllBySongSheetName")
    public List<Songs> selectAllBySongSheetName(@RequestParam String name){
        List<Songs> songsList = songSheetService.selectAllBySongSheetName(name);
        return songsList;
    }
}
