package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Appointment;
import com.hlbrc.movingcompany.entity.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAppointmentMapper {
    long countByExample(AppointmentExample example);

    int deleteByExample(AppointmentExample example);

    int deleteByPrimaryKey(Integer appointmentid);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    List<Appointment> selectByExample(AppointmentExample example);

    Appointment selectByPrimaryKey(Integer appointmentid);

    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}