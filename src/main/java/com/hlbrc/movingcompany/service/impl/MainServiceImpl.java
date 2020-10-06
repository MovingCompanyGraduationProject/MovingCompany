package com.hlbrc.movingcompany.service.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.Appointment;
import com.hlbrc.movingcompany.entity.CompanyMessage;
import com.hlbrc.movingcompany.entity.CompanyMessageExample;
import com.hlbrc.movingcompany.entity.Companyphoto;
import com.hlbrc.movingcompany.entity.LeaveWord;
import com.hlbrc.movingcompany.entity.LeaveWordExample;
import com.hlbrc.movingcompany.entity.ServiceDescribe;
import com.hlbrc.movingcompany.entity.ServiceType;
import com.hlbrc.movingcompany.entity.ServiceTypeExample;
import com.hlbrc.movingcompany.entity.User;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.IAppointmentMapper;
import com.hlbrc.movingcompany.mapper.ICompanyMessageMapper;
import com.hlbrc.movingcompany.mapper.ICompanyphotoMapper;
import com.hlbrc.movingcompany.mapper.ILeaveWordMapper;
import com.hlbrc.movingcompany.mapper.IServiceDescribeMapper;
import com.hlbrc.movingcompany.mapper.IServiceTypeMapper;
import com.hlbrc.movingcompany.mapper.IUserMapper;
import com.hlbrc.movingcompany.service.IMainService;
import com.hlbrc.movingcompany.util.ChattingRecordsIO;
import com.hlbrc.movingcompany.util.TimerUtil;

import net.sf.json.JSONObject;

@Service("MainServiceImpl")
public class MainServiceImpl implements IMainService {
	@Autowired
	ILeaveWordMapper leave_word_mapper;
	@Autowired
	IServiceTypeMapper service_type_mapper;
	@Autowired
	IAppointmentMapper appointment_mapper;
	@Autowired
	ICompanyMessageMapper company_message_mapper;
	@Autowired
	ICompanyphotoMapper company_photo_mapper;
	@Autowired
	IServiceDescribeMapper service_describe_mapper;
	@Autowired
	IUserMapper user_mapper;

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

	@Override
	public void checkBusinessLicense(String message) {
		JSONObject json = JSONObject.fromObject(message);
		CompanyMessage record = new CompanyMessage();
		CompanyMessageExample example = new CompanyMessageExample();
		CompanyMessageExample.Criteria criteria = example.createCriteria();
		if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
			criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
		}
		record.setApprovestate(IMyEnums.CERTIFICATION_STATUS_UNDER_REVIEW);
		record.setUpdatetime(new Date());
		company_message_mapper.updateByExampleSelective(record, example);
		TimerUtil.checkBusinessLicense(json.getString("filePath"), json.getInt("time"), message, company_message_mapper);
	}

	@Override
	public String insertMovingCompany(String message,String frontEndPath) throws IOException {
		JSONObject json = new JSONObject();
		JSONObject obj = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			CompanyMessage companyMessage = new CompanyMessage();
			companyMessage.setDisId(json.getInt("disId"));
			companyMessage.setName(json.getString("name"));
			companyMessage.setMoney(json.getDouble("money"));
			String servicecontext = "";
			net.sf.json.JSONArray contextjson = json.getJSONArray("servicecontext");
			for(int i=0;i<contextjson.size();i++) {
				servicecontext+=contextjson.getString(i)+";";
			}
			companyMessage.setServicecontext(servicecontext);
			companyMessage.setFeature(json.getString("feature"));
			companyMessage.setRegion(json.getString("region"));
			servicecontext = "";
			contextjson = json.getJSONArray("promise");
			for(int i=0;i<contextjson.size();i++) {
				servicecontext+=contextjson.getString(i)+";";
			}
			companyMessage.setPromise(servicecontext);
			companyMessage.setLinkman(json.getString("linkman"));
			companyMessage.setTel(json.getString("tel"));
			companyMessage.setAddress(json.getString("address"));
			companyMessage.setUserid(json.getInt("userid"));
			companyMessage.setCreatetime(new Date());
			int n= company_message_mapper.insertSelective(companyMessage);
			if(n>0) {
				CompanyMessageExample example = new CompanyMessageExample();
				CompanyMessageExample.Criteria criteria = example.createCriteria();
				criteria.andUseridEqualTo(json.getInt("userid"));
				List<CompanyMessage> list =company_message_mapper.selectByExample(example);
				contextjson = json.getJSONArray("photopaths");
				List<Companyphoto> list2 = new ArrayList<>();
				for(int i=0;i<contextjson.size();i++) {
					Companyphoto companyphoto = new Companyphoto();
					companyphoto.setPath(contextjson.getString(i));
					companyphoto.setCompanymessageid(list.get(0).getCompanymessageid());
					companyphoto.setUploadtime(new Date());
					list2.add(companyphoto);
					n += company_photo_mapper.insertSelective(companyphoto);
				}
				companyMessage.setCompanyphoto(list2);
				String filePath = frontEndPath+"/message/movingcompany."+list.get(0).getCompanymessageid()+".txt";
				ChattingRecordsIO.writeFileByBytes(filePath, json.getString("serviceDescribe"));
				ServiceDescribe serviceDescribe = new ServiceDescribe();
				serviceDescribe.setCompanymessageid(list.get(0).getCompanymessageid());
				serviceDescribe.setSubtitle(json.getString("name"));
				serviceDescribe.setContextnum(filePath);
				serviceDescribe.setSpecialann("联系北京计时配搬家公司的时候，请说明在北京巧瓜搬家网看到的，谢谢！");
				companyMessage.setServiceDescribe(serviceDescribe);
				n += service_describe_mapper.insertSelective(serviceDescribe);
				if(n>0) {
					User user = user_mapper.selectByPrimaryKey(json.getInt("userid"));
					user.setCompanyMessage(companyMessage);
					obj.put("user", user);
					obj.put("msg", IMyEnums.SUCCEED);
				}
				else {
					obj.put("msg", IMyEnums.FAIL);
				}
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

}
