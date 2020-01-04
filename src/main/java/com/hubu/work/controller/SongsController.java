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
    @PostMapping("/querySongByName")
    public List<Songs> querySongByName(@RequestParam String name){
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

    @ApiOperation("查询所有的歌曲")
    @PostMapping("/queryAllSongs")
    public List<Songs> queryAllSongs(){
        List<Songs> songsList = songsService.queryAllSongs();
        return songsList;
    }

    @ApiOperation("按照歌曲ID查找歌曲")
    @PostMapping("/querySongById")
    public Songs querySongById(@RequestParam Integer id){
        Songs songs = songsService.querySongById(id);
        return songs;
    }

    @ApiOperation("按照作者或者歌曲名或者歌单名查找歌曲")
    @PostMapping("/querySongByAnything")
    public List<Songs> querySongByAnything(@RequestParam String string){
        List<Songs> songsList = songsService.querySongByAnything(string);
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
