package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.AuthorityManager;
import com.hlbrc.movingcompany.entity.AuthorityManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAuthorityManagerMapper {
    long countByExample(AuthorityManagerExample example);

    int deleteByExample(AuthorityManagerExample example);

    int deleteByPrimaryKey(Integer authoritymanagerid);

    int insert(AuthorityManager record);

    int insertSelective(AuthorityManager record);

    List<AuthorityManager> selectByExample(AuthorityManagerExample example);

    AuthorityManager selectByPrimaryKey(Integer authoritymanagerid);

    int updateByExampleSelective(@Param("record") AuthorityManager record, @Param("example") AuthorityManagerExample example);

    int updateByExample(@Param("record") AuthorityManager record, @Param("example") AuthorityManagerExample example);

    int updateByPrimaryKeySelective(AuthorityManager record);

    int updateByPrimaryKey(AuthorityManager record);
}