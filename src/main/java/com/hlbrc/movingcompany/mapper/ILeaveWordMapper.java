package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.LeaveWord;
import com.hlbrc.movingcompany.entity.LeaveWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ILeaveWordMapper {
    long countByExample(LeaveWordExample example);

    int deleteByExample(LeaveWordExample example);

    int deleteByPrimaryKey(Integer leavewordid);

    int insert(LeaveWord record);

    int insertSelective(LeaveWord record);

    List<LeaveWord> selectByExample(LeaveWordExample example);

    LeaveWord selectByPrimaryKey(Integer leavewordid);

    int updateByExampleSelective(@Param("record") LeaveWord record, @Param("example") LeaveWordExample example);

    int updateByExample(@Param("record") LeaveWord record, @Param("example") LeaveWordExample example);

    int updateByPrimaryKeySelective(LeaveWord record);

    int updateByPrimaryKey(LeaveWord record);
}