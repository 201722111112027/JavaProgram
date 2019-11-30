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
}
