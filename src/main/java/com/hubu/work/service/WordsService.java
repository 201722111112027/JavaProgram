package com.hubu.work.service;

import com.hubu.work.H2_MyBatis.mapper.WordsMapper;
import com.hubu.work.H2_MyBatis.pojo.Words;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordsService {
    @Autowired
    WordsMapper wordsMapper;

    public Words queryWordsById(Integer id){
        Words words = wordsMapper.queryWordsById(id);
        return words;
    }
}
