package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Orderform;
import com.hlbrc.movingcompany.entity.OrderformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IOrderformMapper {
    long countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Integer orderformid);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(OrderformExample example);

    Orderform selectByPrimaryKey(Integer orderformid);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}