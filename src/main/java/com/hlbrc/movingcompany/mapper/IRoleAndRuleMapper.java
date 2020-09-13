package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.RoleAndRule;
import com.hlbrc.movingcompany.entity.RoleAndRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleAndRuleMapper {
    long countByExample(RoleAndRuleExample example);

    int deleteByExample(RoleAndRuleExample example);

    int deleteByPrimaryKey(Integer roleandruleid);

    int insert(RoleAndRule record);

    int insertSelective(RoleAndRule record);

    List<RoleAndRule> selectByExample(RoleAndRuleExample example);

    RoleAndRule selectByPrimaryKey(Integer roleandruleid);

    int updateByExampleSelective(@Param("record") RoleAndRule record, @Param("example") RoleAndRuleExample example);

    int updateByExample(@Param("record") RoleAndRule record, @Param("example") RoleAndRuleExample example);

    int updateByPrimaryKeySelective(RoleAndRule record);

    int updateByPrimaryKey(RoleAndRule record);
}