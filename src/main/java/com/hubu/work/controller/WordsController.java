package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.Words;
import com.hubu.work.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "words")
public class WordsController {
    @Autowired
    WordsService wordsService;

    @GetMapping(value = "selectAll")
    public Words selectAll(Integer id){

        return wordsService.queryWordsById(id);
    }
}
