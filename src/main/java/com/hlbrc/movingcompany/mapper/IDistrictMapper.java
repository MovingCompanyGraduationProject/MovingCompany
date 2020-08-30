package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.District;

public interface IDistrictMapper {
    int deleteByPrimaryKey(Integer disid);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer disid);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}