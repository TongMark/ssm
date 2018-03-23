package com.dem.service.impl;

import com.dem.dto.Girl;
import com.dem.mapper.DemMapper;
import com.dem.service.IDemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author TFR
 * @date 2018/3/15
 */
@Service
public class DemServiceImpl implements IDemService {

    @Autowired
    private DemMapper demMapper;

    @Override
    public List<Girl> queryAll() {
        return demMapper.queryAll();
    }
}
