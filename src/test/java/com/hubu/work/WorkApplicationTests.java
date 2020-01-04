package com.hubu.work;

import com.hubu.work.H2_MyBatis.mapper.*;
import com.hubu.work.H2_MyBatis.pojo.Comment;
import com.hubu.work.H2_MyBatis.pojo.SongSheet;
import com.hubu.work.H2_MyBatis.pojo.Songs;
import com.hubu.work.H2_MyBatis.pojo.User;
import com.hubu.work.utils.Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.rmi.CORBA.Util;
import java.io.*;
import java.util.List;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkApplicationTests {
    @Autowired
    SongsMapper songsMapper;

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    SongSheetMapper songSheetMapper;

    @Autowired
    SongSheet songSheet;

    @Autowired
    ReplayMapper replayMapper;

    @Autowired
    Utils utils;

    @Autowired
    Songs songs;

    @Autowired
    Comment comment;

    @Autowired
    UserMapper userMapper;

    @Autowired
    User user;

    @Test
    //按照歌名查找歌曲
    public void querySongByName(){
        List<Songs> songsList = songsMapper.querySongByName("十年");
        for (Songs song:songsList) {
            System.out.println(song.toString());
        }
    }

    @Test
    //按照歌手名查找歌曲
    public void querySongByAuthor(){
        List<Songs> songsList = songsMapper.querySongByName("陈奕迅");
        for (Songs song:songsList) {
            System.out.println(song.toString());
        }
    }

    @Test
    //按照歌单名查找歌曲
    public void querySongByAscription(){
        List<Songs> songsList = songsMapper.querySongByName("七月七日晴");
        for (Songs song:songsList) {
            System.out.println(song.toString());
        }
    }

    @Test
    //播放量增加
    public void addClickThroughputInSong(){
        songs.setId(23);
        Songs songs = songsMapper.querySongById(23);
        Integer click_throughput = songs.getClick_throughput();
        click_throughput=click_throughput+1;
        songs.setClick_throughput(click_throughput);
        songsMapper.addClickThroughput(songs);
        System.out.println("播放成功");
    }

    @Test
    //按照ID查询歌曲信息
    public void querySongById(){
        Songs songs = songsMapper.querySongById(56);
        System.out.println(songs.toString());
    }

    @Test
    //查询所有的歌曲
    public void queryAllSongs(){
        List<Songs> list=songsMapper.queryAllSongs();
        for (Songs song:list) {
            System.out.println(song.toString());
        }
    }

    @Test
    //按照歌曲的作者或者歌名或者歌单查找
    public void querySongByAnything(){
        List<Songs> songsList = songsMapper.querySongByAnything("的");
        for (Songs song:songsList) {
            System.out.println(song.toString());
        }
    }

    @Test
    //根据一级评论ID查询对应回复
    public void selectAllReplayById(){
        List<Comment> comments = replayMapper.selectAllReplayById("1");
        for (Comment comment:comments) {
            System.out.println(comment.toString());
        }
    }

    @Test
    //评论一级评论
    public void addReplay(){
        comment.setReplayId("1");
        comment.setPraisePoints(0);
        comment.setCommentAim("");
        comment.setPublicationTime(utils.getTime());
        comment.setAuthor("whm");
        comment.setContent("老铁的评论六六六啊");
        replayMapper.addReplay(comment);
        System.out.println("回复成功");
    }

    @Test
    //对回复评论进行点赞
    public void givePraise(){
        Comment comment = commentMapper.selectCommentById(2);
        Integer praisePoints = comment.getPraisePoints();
        praisePoints=praisePoints+1;
        comment.setPraisePoints(praisePoints);
        replayMapper.givePraise(comment);
        System.out.println("点赞成功");
    }

    @Test
    //根据ID查询评论对应信息
    public void queryCommentById(){
        Comment comment = replayMapper.queryCommentById(2);
        System.out.println(comment.toString());
    }

    @Test
    //查询对应歌曲的全部评论
    public void selectAllCommentsByNameInSong(){
        List<Comment> comments = commentMapper.selectAllCommentsByName("十年");
        for (Comment comment:comments) {
            System.out.println(comment.toString());
        }
    }

    @Test
    //查询对应评论ID的全部回复评论
    public void selectAllCommentsById(){
        List<Comment> comments=commentMapper.selectAllCommentsById("4");
        for (Comment comment:comments) {
            System.out.println(comment.toString());
        }
    }

    @Test
    //根据ID查询评论信息
    public void selectCommentById(){
        Comment comments=commentMapper.selectCommentById(1);
        System.out.println(comments.toString());
    }

    @Test
    //评论歌曲
    public void addComment(){
        comment.setPraisePoints(0);
        comment.setContent("好听");
        comment.setAuthor("myq");
        comment.setPublicationTime(utils.getTime());
        comment.setReplayId(" ");
        comment.setCommentAim("听");
        commentMapper.addComment(comment);
        System.out.println("评论成功");
    }

    @Test
    //对一级评论进行点赞
    public void addPraise(){
        Comment comment = commentMapper.selectCommentById(5);
        Integer praisePoints = comment.getPraisePoints();
        praisePoints=praisePoints+1;
        comment.setPraisePoints(praisePoints);
        commentMapper.addPraise(comment);
        System.out.println("点赞成功");
    }

    @Test
    //查询所有的用户
    public void selectAllUsers(){
        List<User> users = userMapper.selectAll();
        for (User user:users) {
            System.out.println(user.toString());
        }
    }

    @Test
    //验证用户登录功能
    public void login(){
        user.setPassword("1234");
        user.setUsername("root");
        userMapper.login(user);
        System.out.println("登陆成功");
    }

    @Test
    //验证用户注册功能
    public void registerUser(){
        user.setUsername("gxm");
        user.setPassword("12345");
        user.setHead_portrait("pictures/1.jpg");
        user.setNickname("憨憨");
        user.setPersonal_signature("啦啦啦啦");
        userMapper.registerUser(user);
        System.out.println("注册成功");
    }


    @Test
    //查询所有的歌单名
    public void selectAll(){
        List<SongSheet> songSheets = songSheetMapper.selectAll();
        for (SongSheet songSheet :songSheets) {
            System.out.println(songSheet.getName());
        }
    }

    @Test
    //查询歌单所属歌曲
    public void selectAllBySongSheetName(){
        List<Songs> songsList = songSheetMapper.selectAllBySongSheetName("表面的和平");
        for (Songs song:songsList) {
            System.out.println(song.toString());
        }
    }

    @Test
    //按照歌单ID查询歌单信息
    public void querySongSheetById(){
        SongSheet songSheet = songSheetMapper.querySongSheetById(1);
        System.out.println(songSheet.toString());
    }

    @Test
    //增加歌单点击量
    public void addClickThroughput(){
        songSheet.setId(1);
        SongSheet songSheet = songSheetMapper.querySongSheetById(1);
        Integer click_throughput = songSheet.getClick_throughput();
        click_throughput=click_throughput+1;
        songSheet.setClick_throughput(click_throughput);
        songSheetMapper.addClickThroughput(songSheet);
        System.out.println(songSheet.toString());
    }

    @Test
    //新建歌单
    public void addSongSheet(){
        songSheet.setName("七月与安生");
        songSheet.setAuthor("gxm");
        songSheet.setClick_throughput(0);
        songSheet.setTime(utils.getTime());
        songSheet.setState("N");
        songSheetMapper.addSongSheet(songSheet);
        System.out.println("新建成功");
    }
}
