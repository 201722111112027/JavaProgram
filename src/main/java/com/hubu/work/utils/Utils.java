package com.hubu.work.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class Utils {
  //获取当前系统时间
  public String getTime(){
    Date date=new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    String time=simpleDateFormat.format(date);
    return time;
  }

}
