package com.hlbrc.movingcompany.mapper;

import com.hlbrc.movingcompany.entity.Appointment;

public interface IAppointmentMapper {
    int deleteByPrimaryKey(Integer appointmentid);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    Appointment selectByPrimaryKey(Integer appointmentid);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}