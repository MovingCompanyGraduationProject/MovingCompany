package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Companymessage;
import com.hlbrc.movingcompany.entity.CompanymessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICompanymessageMapper {
    long countByExample(CompanymessageExample example);

    int deleteByExample(CompanymessageExample example);

    int deleteByPrimaryKey(Integer companymessageid);

    int insert(Companymessage record);

    int insertSelective(Companymessage record);

    List<Companymessage> selectByExample(CompanymessageExample example);

    Companymessage selectByPrimaryKey(Integer companymessageid);

    int updateByExampleSelective(@Param("record") Companymessage record, @Param("example") CompanymessageExample example);

    int updateByExample(@Param("record") Companymessage record, @Param("example") CompanymessageExample example);

    int updateByPrimaryKeySelective(Companymessage record);

    int updateByPrimaryKey(Companymessage record);
}