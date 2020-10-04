package com.hlbrc.movingcompany.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.Appointment;
import com.hlbrc.movingcompany.entity.LeaveWord;
import com.hlbrc.movingcompany.entity.LeaveWordExample;
import com.hlbrc.movingcompany.entity.ServiceType;
import com.hlbrc.movingcompany.entity.ServiceTypeExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.IAppointmentMapper;
import com.hlbrc.movingcompany.mapper.ILeaveWordMapper;
import com.hlbrc.movingcompany.mapper.IServiceTypeMapper;
import com.hlbrc.movingcompany.service.IMainService;

import net.sf.json.JSONObject;

@Service("MainServiceImpl")
public class MainServiceImpl implements IMainService {
	@Autowired
	ILeaveWordMapper leave_word_mapper;
	@Autowired
	IServiceTypeMapper service_type_mapper;
	@Autowired
	IAppointmentMapper appointment_mapper;

	@Override
	public String insertLeaveMessage(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&message!="") {
			json = JSONObject.fromObject(message);
			LeaveWord leaveWord = new LeaveWord();
			leaveWord.setCorporationname(json.getString("corporationname"));
			leaveWord.setCreatetime(new Date());
			leaveWord.setLeavemessage(json.getString("leavemessage"));
			leaveWord.setLinkman(json.getString("linkman"));
			leaveWord.setTel(json.getString("tel"));
			leaveWord.setTown(json.getString("town"));
			leaveWord.setWechatid(json.getString("wechatid"));
			int i = leave_word_mapper.insertSelective(leaveWord);
			if(i>0) {
				obj.put("msg", IMyEnums.SUCCEED);
			}
			else {
				obj.put("msg", IMyEnums.FAIL);
			}
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

	@Override
	public String queryAllLeaveMessage() {
		JSONObject obj = new JSONObject();
		LeaveWordExample example = new LeaveWordExample();
		List<LeaveWord> list = leave_word_mapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			obj.put("msg", list);
			obj.put("msg", IMyEnums.SUCCEED);
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

	@Override
	public String insertAppointment(String message) {
		JSONObject json = new JSONObject();
		JSONObject obj = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			Appointment appointment = new Appointment();
			appointment.setCreatetime(new Timestamp(new Date().getTime()));
			appointment.setEndsite(json.getString("endsite"));
			appointment.setName(json.getString("name"));
			if(json.getString("servicetypeid")!=null&&!"".equals(json.getString("servicetypeid"))) {
				appointment.setServicetypeid(Integer.parseInt(json.getString("servicetypeid")));
			}
			appointment.setStartsite(json.getString("startsite"));
			appointment.setTel(json.getString("tel"));
			if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
				appointment.setUserid(Integer.parseInt(json.getString("userid")));
			}
			int i =appointment_mapper.insertSelective(appointment);
			if(i>0) {
				obj.put("msg", IMyEnums.SUCCEED);
			}
			else {
				obj.put("msg", IMyEnums.FAIL);
			}
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

	@Override
	public String queryAllServiceType() {
		JSONObject obj = new JSONObject();
		ServiceTypeExample example = new ServiceTypeExample();
		List<ServiceType> list = service_type_mapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			obj.put("serviceTypeList", list);
			obj.put("msg", IMyEnums.SUCCEED);
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

}
