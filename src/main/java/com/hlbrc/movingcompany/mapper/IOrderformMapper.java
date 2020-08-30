package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Orderform;

public interface IOrderformMapper {
    int deleteByPrimaryKey(Integer orderformid);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    Orderform selectByPrimaryKey(Integer orderformid);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}