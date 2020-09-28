package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.ServiceType;
import com.hlbrc.movingcompany.entity.ServiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IServiceTypeMapper {
    long countByExample(ServiceTypeExample example);

    int deleteByExample(ServiceTypeExample example);

    int deleteByPrimaryKey(Integer servicetypeid);

    int insert(ServiceType record);

    int insertSelective(ServiceType record);

    List<ServiceType> selectByExample(ServiceTypeExample example);

    ServiceType selectByPrimaryKey(Integer servicetypeid);

    int updateByExampleSelective(@Param("record") ServiceType record, @Param("example") ServiceTypeExample example);

    int updateByExample(@Param("record") ServiceType record, @Param("example") ServiceTypeExample example);

    int updateByPrimaryKeySelective(ServiceType record);

    int updateByPrimaryKey(ServiceType record);
}