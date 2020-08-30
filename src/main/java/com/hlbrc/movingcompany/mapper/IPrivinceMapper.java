package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Privince;

public interface IPrivinceMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Privince record);

    int insertSelective(Privince record);

    Privince selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Privince record);

    int updateByPrimaryKey(Privince record);
}