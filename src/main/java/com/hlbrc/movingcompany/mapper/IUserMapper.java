package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.User;

public interface IUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}