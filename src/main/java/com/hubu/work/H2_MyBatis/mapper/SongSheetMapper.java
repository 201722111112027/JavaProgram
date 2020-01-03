package com.hubu.work.H2_MyBatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SongSheetMapper {
    List<SongSheet> selectAll();//查询歌单名

    void addSongSheet(SongSheet songSheet);
}
