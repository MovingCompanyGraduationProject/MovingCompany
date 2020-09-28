package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Carmessage;
import com.hlbrc.movingcompany.entity.CarmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICarmessageMapper {
    long countByExample(CarmessageExample example);

    int deleteByExample(CarmessageExample example);

    int deleteByPrimaryKey(Integer carmessageid);

    int insert(Carmessage record);

    int insertSelective(Carmessage record);

    List<Carmessage> selectByExample(CarmessageExample example);

    Carmessage selectByPrimaryKey(Integer carmessageid);

    int updateByExampleSelective(@Param("record") Carmessage record, @Param("example") CarmessageExample example);

    int updateByExample(@Param("record") Carmessage record, @Param("example") CarmessageExample example);

    int updateByPrimaryKeySelective(Carmessage record);

    int updateByPrimaryKey(Carmessage record);
}