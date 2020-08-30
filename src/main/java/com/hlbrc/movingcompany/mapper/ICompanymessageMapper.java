package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Companymessage;

public interface ICompanymessageMapper {
    int deleteByPrimaryKey(Integer companymessageid);

    int insert(Companymessage record);

    int insertSelective(Companymessage record);

    Companymessage selectByPrimaryKey(Integer companymessageid);

    int updateByPrimaryKeySelective(Companymessage record);

    int updateByPrimaryKey(Companymessage record);
}