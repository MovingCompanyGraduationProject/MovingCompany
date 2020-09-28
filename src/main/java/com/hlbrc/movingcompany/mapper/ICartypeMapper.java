package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Cartype;
import com.hlbrc.movingcompany.entity.CartypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICartypeMapper {
    long countByExample(CartypeExample example);

    int deleteByExample(CartypeExample example);

    int deleteByPrimaryKey(Integer cartypeid);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    List<Cartype> selectByExample(CartypeExample example);

    Cartype selectByPrimaryKey(Integer cartypeid);

    int updateByExampleSelective(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByExample(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}