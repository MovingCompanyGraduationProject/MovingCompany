package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Servicedescribe;

public interface IServicedescribeMapper {
    int deleteByPrimaryKey(Integer servicedescribeid);

    int insert(Servicedescribe record);

    int insertSelective(Servicedescribe record);

    Servicedescribe selectByPrimaryKey(Integer servicedescribeid);

    int updateByPrimaryKeySelective(Servicedescribe record);

    int updateByPrimaryKey(Servicedescribe record);
}