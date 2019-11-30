package com.hubu.work.service;

import com.hubu.work.H2_MyBatis.mapper.SongsMapper;
import com.hubu.work.H2_MyBatis.mapper.UserMapper;
import com.hubu.work.H2_MyBatis.pojo.Songs;
import com.hubu.work.H2_MyBatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService {
    @Autowired
    SongsMapper songsMapper;

    //按歌名查找歌曲
    public List<Songs> querySongById(String name){
        List<Songs> songs = songsMapper.querySongByName(name);
        return songs;
    }

    //按歌手名查找歌曲
    public List<Songs> querySongByAuthor(String author){
        List<Songs> songs = songsMapper.querySongByAuthor(author);
        return songs;
    }

    //按歌单名查找
    public List<Songs> querySongByAscription(String ascription){
        List<Songs> songsList = songsMapper.querySongByAscription(ascription);
        return songsList;
    }
}
