package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Songs;
import com.hubu.work.service.SongsService;
import com.hubu.work.utils.Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "songs")
public class SongsController {
    @Autowired
    SongsService songsService;

    @Autowired
    Utils utils;

    @ApiOperation("根据歌名搜索歌曲")
    @PostMapping("/querySongById")
    public List<Songs> querySongById(@RequestParam String name){
        List<Songs> songsList = songsService.querySongByName(name);
        return songsList;
    }

    @ApiOperation("根据歌手名搜索歌曲")
    @PostMapping("/querySongByAuthor")
    public List<Songs> querySongByAuthor(@RequestParam String author){
        List<Songs> songsList = songsService.querySongByAuthor(author);
        return songsList;
    }

    @ApiOperation("根据歌单名搜索歌曲")
    @PostMapping("/querySongByAscription")
    public List<Songs> querySongByAscription(@RequestParam String ascription){
        List<Songs> songsList = songsService.querySongByAscription(ascription);
        return songsList;
    }

    @ApiOperation("增加歌曲播放量")
    @PostMapping("/addClickThroughput")
    public void addClickThroughput(@RequestBody Songs songs){
        Songs songs1 = songsService.querySongById(songs.getId());
        Integer click_throughput = songs1.getClick_throughput();
        click_throughput=click_throughput+1;
        songs.setClick_throughput(click_throughput);
        songsService.addClickThroughput(songs);
    }
}
