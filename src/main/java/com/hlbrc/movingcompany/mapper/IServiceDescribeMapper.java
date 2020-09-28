package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.ServiceDescribe;
import com.hlbrc.movingcompany.entity.ServiceDescribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IServiceDescribeMapper {
    long countByExample(ServiceDescribeExample example);

    int deleteByExample(ServiceDescribeExample example);

    int deleteByPrimaryKey(Integer servicedescribeid);

    int insert(ServiceDescribe record);

    int insertSelective(ServiceDescribe record);

    List<ServiceDescribe> selectByExample(ServiceDescribeExample example);

    ServiceDescribe selectByPrimaryKey(Integer servicedescribeid);

    int updateByExampleSelective(@Param("record") ServiceDescribe record, @Param("example") ServiceDescribeExample example);

    int updateByExample(@Param("record") ServiceDescribe record, @Param("example") ServiceDescribeExample example);

    int updateByPrimaryKeySelective(ServiceDescribe record);

    int updateByPrimaryKey(ServiceDescribe record);
}