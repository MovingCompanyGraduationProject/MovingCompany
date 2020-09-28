package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.District;
import com.hlbrc.movingcompany.entity.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IDistrictMapper {
    long countByExample(DistrictExample example);

    int deleteByExample(DistrictExample example);

    int deleteByPrimaryKey(Integer disid);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    District selectByPrimaryKey(Integer disid);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}