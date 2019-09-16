package com.hubu.work;

import com.hubu.work.H2_MyBatis.pojo.Words;
import com.hubu.work.service.WordsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkApplicationTests {

  @Autowired
  WordsService wordsService;

  @Test
  public void contextLoads() {
    Words words = wordsService.queryWordsById(1);
    String content = words.getContent();

    File file=new File(content);

    InputStream inputStream=null;
    Reader reader=null;
    BufferedReader bufferedReader=null;

    try {
      inputStream=new FileInputStream(file);
      reader=new InputStreamReader(inputStream);
      bufferedReader=new BufferedReader(reader);
      String line=null;
      while ((line=bufferedReader.readLine())!=null){
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if (null != bufferedReader)
          bufferedReader.close();
        if (null != reader)
          reader.close();
        if (null != inputStream)
          inputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
