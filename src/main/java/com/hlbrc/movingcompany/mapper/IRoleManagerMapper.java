package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.RoleManager;
import com.hlbrc.movingcompany.entity.RoleManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleManagerMapper {
    long countByExample(RoleManagerExample example);

    int deleteByExample(RoleManagerExample example);

    int deleteByPrimaryKey(Integer rolemanagerid);

    int insert(RoleManager record);

    int insertSelective(RoleManager record);

    List<RoleManager> selectByExample(RoleManagerExample example);

    RoleManager selectByPrimaryKey(Integer rolemanagerid);

    int updateByExampleSelective(@Param("record") RoleManager record, @Param("example") RoleManagerExample example);

    int updateByExample(@Param("record") RoleManager record, @Param("example") RoleManagerExample example);

    int updateByPrimaryKeySelective(RoleManager record);

    int updateByPrimaryKey(RoleManager record);
}