package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Notice;
import com.hlbrc.movingcompany.entity.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface INoticeMapper {
    long countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer noticeid);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Integer noticeid);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}