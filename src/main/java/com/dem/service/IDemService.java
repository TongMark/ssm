package com.dem.service;

import com.dem.dto.Girl;

import java.util.List;

/**
 *
 * @author TFR
 * @date 2018/3/15
 */
public interface IDemService {

    /**
     * 查询girl信息
     * @return
     */
    public List<Girl> queryAll();
}
