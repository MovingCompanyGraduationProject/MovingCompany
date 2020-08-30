package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Carmessage;

public interface ICarmessageMapper {
    int deleteByPrimaryKey(Integer carmessageid);

    int insert(Carmessage record);

    int insertSelective(Carmessage record);

    Carmessage selectByPrimaryKey(Integer carmessageid);

    int updateByPrimaryKeySelective(Carmessage record);

    int updateByPrimaryKey(Carmessage record);
}