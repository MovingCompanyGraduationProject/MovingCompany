package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.User;
import com.hlbrc.movingcompany.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}