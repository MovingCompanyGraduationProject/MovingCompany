package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Inform;

public interface InformMapper {
    int deleteByPrimaryKey(Integer informid);

    int insert(Inform record);

    int insertSelective(Inform record);

    Inform selectByPrimaryKey(Integer informid);

    int updateByPrimaryKeySelective(Inform record);

    int updateByPrimaryKey(Inform record);
}