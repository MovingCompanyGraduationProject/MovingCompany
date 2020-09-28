package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.MyCollect;
import com.hlbrc.movingcompany.entity.MyCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMyCollectMapper {
    long countByExample(MyCollectExample example);

    int deleteByExample(MyCollectExample example);

    int deleteByPrimaryKey(Integer collectid);

    int insert(MyCollect record);

    int insertSelective(MyCollect record);

    List<MyCollect> selectByExample(MyCollectExample example);

    MyCollect selectByPrimaryKey(Integer collectid);

    int updateByExampleSelective(@Param("record") MyCollect record, @Param("example") MyCollectExample example);

    int updateByExample(@Param("record") MyCollect record, @Param("example") MyCollectExample example);

    int updateByPrimaryKeySelective(MyCollect record);

    int updateByPrimaryKey(MyCollect record);
}