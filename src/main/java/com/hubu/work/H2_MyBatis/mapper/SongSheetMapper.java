package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.SongSheet;
import com.hubu.work.H2_MyBatis.pojo.Songs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SongSheetMapper {

    List<SongSheet> selectAll();//查询所有的歌单名

    void addSongSheet(SongSheet songSheet);//新建歌单

    List<Songs> selectAllBySongSheetName(String name);//查询歌单下的所有歌曲

    SongSheet querySongSheetById(Integer id);//根据Id值查询歌单信息

    void addClickThroughput(SongSheet songSheet);//增加歌单点击量


}
