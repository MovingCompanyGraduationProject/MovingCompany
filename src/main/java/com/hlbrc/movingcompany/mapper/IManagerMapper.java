package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Manager;

public interface IManagerMapper {
    int deleteByPrimaryKey(Integer managerid);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer managerid);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}