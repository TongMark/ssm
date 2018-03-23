package com.dem.mapper;


import com.dem.dto.Girl;

import java.util.List;


/**
 *
 * @author TFR
 * @date 2018/3/15
 */
public interface DemMapper {


    /**
     * 查询girl表全部信息
     * @return
     */
    List<Girl> queryAll();

}
