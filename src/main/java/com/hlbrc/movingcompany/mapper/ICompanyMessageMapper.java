package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.CompanyMessage;
import com.hlbrc.movingcompany.entity.CompanyMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICompanyMessageMapper {
    long countByExample(CompanyMessageExample example);

    int deleteByExample(CompanyMessageExample example);

    int deleteByPrimaryKey(Integer companymessageid);

    int insert(CompanyMessage record);

    int insertSelective(CompanyMessage record);

    List<CompanyMessage> selectByExample(CompanyMessageExample example);

    CompanyMessage selectByPrimaryKey(Integer companymessageid);

    int updateByExampleSelective(@Param("record") CompanyMessage record, @Param("example") CompanyMessageExample example);

    int updateByExample(@Param("record") CompanyMessage record, @Param("example") CompanyMessageExample example);

    int updateByPrimaryKeySelective(CompanyMessage record);

    int updateByPrimaryKey(CompanyMessage record);
}