package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Inform;
import com.hlbrc.movingcompany.entity.InformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformMapper {
    long countByExample(InformExample example);

    int deleteByExample(InformExample example);

    int deleteByPrimaryKey(Integer informid);

    int insert(Inform record);

    int insertSelective(Inform record);

    List<Inform> selectByExample(InformExample example);

    Inform selectByPrimaryKey(Integer informid);

    int updateByExampleSelective(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByExample(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByPrimaryKeySelective(Inform record);

    int updateByPrimaryKey(Inform record);
}