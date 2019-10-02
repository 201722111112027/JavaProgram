package com.hubu.work.service;

import com.hubu.work.H2_MyBatis.mapper.ReplayMapper;
import com.hubu.work.H2_MyBatis.pojo.Replay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplayService {
    @Autowired
    ReplayMapper replayMapper;

    public List<Replay> selectAllReplayById(Integer id){
        return replayMapper.selectAllRepalyById(id);
    }
}
