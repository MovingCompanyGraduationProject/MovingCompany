package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Companyphoto;
import com.hlbrc.movingcompany.entity.CompanyphotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICompanyphotoMapper {
    long countByExample(CompanyphotoExample example);

    int deleteByExample(CompanyphotoExample example);

    int deleteByPrimaryKey(Integer companyphoto);

    int insert(Companyphoto record);

    int insertSelective(Companyphoto record);

    List<Companyphoto> selectByExample(CompanyphotoExample example);

    Companyphoto selectByPrimaryKey(Integer companyphoto);

    int updateByExampleSelective(@Param("record") Companyphoto record, @Param("example") CompanyphotoExample example);

    int updateByExample(@Param("record") Companyphoto record, @Param("example") CompanyphotoExample example);

    int updateByPrimaryKeySelective(Companyphoto record);

    int updateByPrimaryKey(Companyphoto record);
}