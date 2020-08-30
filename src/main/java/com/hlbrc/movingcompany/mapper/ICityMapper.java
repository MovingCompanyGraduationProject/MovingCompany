package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.city;

public interface ICityMapper {
    int deleteByPrimaryKey(Integer citid);

    int insert(city record);

    int insertSelective(city record);

    city selectByPrimaryKey(Integer citid);

    int updateByPrimaryKeySelective(city record);

    int updateByPrimaryKey(city record);
}