package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.City;
import com.hlbrc.movingcompany.entity.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer citid);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer citid);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}