package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Companyphoto;

public interface ICompanyphotoMapper {
    int deleteByPrimaryKey(Integer companyphoto);

    int insert(Companyphoto record);

    int insertSelective(Companyphoto record);

    Companyphoto selectByPrimaryKey(Integer companyphoto);

    int updateByPrimaryKeySelective(Companyphoto record);

    int updateByPrimaryKey(Companyphoto record);
}