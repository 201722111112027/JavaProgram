package com.hubu.work.H2_MyBatis.mapper;

import com.hubu.work.H2_MyBatis.pojo.Songs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SongsMapper {
    List<Songs> querySongByName(String name);//按歌名查找歌曲

    List<Songs> querySongByAuthor(String author);//按歌手名查找歌曲

    List<Songs> querySongByAscription(String ascription);//按歌单名查找歌曲

    void addClickThroughput(Songs songs);//歌曲播放量增加

    Songs querySongById(Integer id);//按照Id查询歌曲信息
}
