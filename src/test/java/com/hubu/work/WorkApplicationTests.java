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


}
