package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.MyCollect;

public interface IMyCollectMapper {
    int deleteByPrimaryKey(Integer collectid);

    int insert(MyCollect record);

    int insertSelective(MyCollect record);

    MyCollect selectByPrimaryKey(Integer collectid);

    int updateByPrimaryKeySelective(MyCollect record);

    int updateByPrimaryKey(MyCollect record);
}