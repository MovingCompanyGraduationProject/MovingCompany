package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Staff;
import com.hlbrc.movingcompany.entity.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IStaffMapper {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}