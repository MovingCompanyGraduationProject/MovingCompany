package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Appraise;
import com.hlbrc.movingcompany.entity.AppraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAppraiseMapper {
    long countByExample(AppraiseExample example);

    int deleteByExample(AppraiseExample example);

    int deleteByPrimaryKey(Integer appraiseid);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    List<Appraise> selectByExample(AppraiseExample example);

    Appraise selectByPrimaryKey(Integer appraiseid);

    int updateByExampleSelective(@Param("record") Appraise record, @Param("example") AppraiseExample example);

    int updateByExample(@Param("record") Appraise record, @Param("example") AppraiseExample example);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}