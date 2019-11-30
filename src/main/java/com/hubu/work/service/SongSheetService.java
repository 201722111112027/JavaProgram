package com.hubu.work.service;
import com.hubu.work.H2_MyBatis.mapper.SongSheetMapper;
import com.hubu.work.H2_MyBatis.pojo.SongSheet;
import com.hubu.work.H2_MyBatis.pojo.Songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongSheetService {
    @Autowired
    SongSheetMapper songSheetMapper;

    //查询所有的歌单名
    public List<SongSheet> selectAll(){
        List<SongSheet> songSheets = songSheetMapper.selectAll();
        return songSheets;
    }

    //新建歌单
    public void addSongSheet(SongSheet songSheet){

        songSheetMapper.addSongSheet(songSheet);
    }

    //查询歌单所属歌曲
    public List<Songs> selectAllBySongSheetName(String name){
        List<Songs> songsList = songSheetMapper.selectAllBySongSheetName(name);
        return songsList;
    }
}
