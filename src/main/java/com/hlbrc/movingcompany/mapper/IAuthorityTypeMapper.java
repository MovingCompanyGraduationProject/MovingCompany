package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.AuthorityType;
import com.hlbrc.movingcompany.entity.AuthorityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAuthorityTypeMapper {
    long countByExample(AuthorityTypeExample example);

    int deleteByExample(AuthorityTypeExample example);

    int deleteByPrimaryKey(Integer authoritytypeid);

    int insert(AuthorityType record);

    int insertSelective(AuthorityType record);

    List<AuthorityType> selectByExample(AuthorityTypeExample example);

    AuthorityType selectByPrimaryKey(Integer authoritytypeid);

    int updateByExampleSelective(@Param("record") AuthorityType record, @Param("example") AuthorityTypeExample example);

    int updateByExample(@Param("record") AuthorityType record, @Param("example") AuthorityTypeExample example);

    int updateByPrimaryKeySelective(AuthorityType record);

    int updateByPrimaryKey(AuthorityType record);
}