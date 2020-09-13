package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.City;

public interface ICityMapper {
    int deleteByPrimaryKey(Integer citid);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer citid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}