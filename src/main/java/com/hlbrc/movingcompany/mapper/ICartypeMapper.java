package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Cartype;

public interface ICartypeMapper {
    int deleteByPrimaryKey(Integer cartypeid);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    Cartype selectByPrimaryKey(Integer cartypeid);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}