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
    public List<Songs> querySongByName(String name){
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

    //播放量增加
    public void addClickThroughput(Songs songs){
        songsMapper.addClickThroughput(songs);
    }

    //按照ID查询歌曲信息
    public Songs querySongById(Integer id){
        Songs songs = songsMapper.querySongById(id);
        return songs;
    }

    //查询所有的歌曲
    public List<Songs> queryAllSongs(){
        List<Songs> list=songsMapper.queryAllSongs();
        return list;
    }

    //按照歌曲的作者或者歌名或者歌单查找
    public List<Songs> querySongByAnything(String string){
        List<Songs> songsList = songsMapper.querySongByAnything(string);
        return songsList;
    }
}
