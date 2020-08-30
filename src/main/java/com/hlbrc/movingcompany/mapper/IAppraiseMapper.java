package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Appraise;

public interface IAppraiseMapper {
    int deleteByPrimaryKey(Integer appraiseid);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer appraiseid);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}