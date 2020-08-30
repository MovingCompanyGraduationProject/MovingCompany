package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Servicetype;

public interface IServicetypeMapper {
    int deleteByPrimaryKey(Integer servicetypeid);

    int insert(Servicetype record);

    int insertSelective(Servicetype record);

    Servicetype selectByPrimaryKey(Integer servicetypeid);

    int updateByPrimaryKeySelective(Servicetype record);

    int updateByPrimaryKey(Servicetype record);
}