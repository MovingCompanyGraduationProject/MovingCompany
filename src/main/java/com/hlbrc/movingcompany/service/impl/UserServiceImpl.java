package com.hlbrc.movingcompany.service.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.Appraise;
import com.hlbrc.movingcompany.entity.AppraiseExample;
import com.hlbrc.movingcompany.entity.CompanyMessage;
import com.hlbrc.movingcompany.entity.CompanyMessageExample;
import com.hlbrc.movingcompany.entity.Companyphoto;
import com.hlbrc.movingcompany.entity.CompanyphotoExample;
import com.hlbrc.movingcompany.entity.MyCollect;
import com.hlbrc.movingcompany.entity.MyCollectExample;
import com.hlbrc.movingcompany.entity.ServiceDescribe;
import com.hlbrc.movingcompany.entity.ServiceDescribeExample;
import com.hlbrc.movingcompany.entity.User;
import com.hlbrc.movingcompany.entity.UserExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.IAppraiseMapper;
import com.hlbrc.movingcompany.mapper.ICompanyMessageMapper;
import com.hlbrc.movingcompany.mapper.ICompanyphotoMapper;
import com.hlbrc.movingcompany.mapper.IMyCollectMapper;
import com.hlbrc.movingcompany.mapper.IServiceDescribeMapper;
import com.hlbrc.movingcompany.mapper.IUserMapper;
import com.hlbrc.movingcompany.service.IAddressService;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.ChattingRecordsIO;
import com.hlbrc.movingcompany.util.MD5;
import com.hlbrc.movingcompany.util.Time;
import com.hlbrc.movingcompany.util.TimerUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserMapper user_mapper;
	@Autowired
	ICompanyMessageMapper company_message_mapper;
	@Autowired
	ICompanyphotoMapper company_photo_mapper;
	@Autowired
	IServiceDescribeMapper service_describe_mapper;
	@Autowired
	IAppraiseMapper appraise_mapper;
	@Autowired
	IMyCollectMapper mycollect_mapper;
	@Autowired
	IAddressService address_service;
	
	@Override
	public String userlogin(String message, HttpSession session) throws IOException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andNameEqualTo(json.getString("username"));
			criteria.andPasswordEqualTo(MD5.getMD5(json.getString("password")));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				//公司信息
				CompanyMessageExample example2 = new CompanyMessageExample();
				CompanyMessageExample.Criteria criteria2 = example2.createCriteria();
				criteria2.andUseridEqualTo(list.get(0).getUserid());
				List<CompanyMessage> companyMessage = company_message_mapper.selectByExample(example2);
				if(companyMessage!=null&&companyMessage.size()>0) {
					//公司描述
					ServiceDescribeExample example3 = new ServiceDescribeExample();
					ServiceDescribeExample.Criteria criteria3 = example3.createCriteria();
					criteria3.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<ServiceDescribe> serviceDescribe = service_describe_mapper.selectByExample(example3);
					companyMessage.get(0).setServiceDescribe(serviceDescribe.get(0));
					//公司图片
					CompanyphotoExample example4 = new CompanyphotoExample();
					CompanyphotoExample.Criteria criteria4 = example4.createCriteria();
					criteria4.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<Companyphoto> companyphotos = company_photo_mapper.selectByExample(example4);
					companyMessage.get(0).setCompanyphoto(companyphotos);
					//搬家公司评伦 留言
					AppraiseExample example5 = new AppraiseExample();
					AppraiseExample.Criteria criteria5 = example5.createCriteria();
					criteria5.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<Appraise> list2 = appraise_mapper.selectByExample(example5);
					if(list2!=null&&list2.size()>0) {
						for(int i=0;i<list2.size();i++) {
							//获取评伦信息
							String content = ChattingRecordsIO.readFile(list2.get(i).getContextcode());
							list2.get(i).setContextcode(content);
							//获取评伦用户名
							User user = user_mapper.selectByPrimaryKey(list2.get(i).getUserid());
							list2.get(i).setUser(user);
						}
					}
					list.get(0).setCompanyMessage(companyMessage.get(0));
				}
				session.setAttribute("user", list.get(0));
				obj.put("user", list.get(0));
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
	public String queryuser(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			String format = "yyyy-MM-dd";
			if(!"".equals(json.getString("username"))) {
	        	criteria.andNameLike("%"+json.getString("username")+"%");
	        }
			if(!"".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeBetween(new SimpleDateFormat(format).parse(json.getString("startTime")),new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			else if(!"".equals(json.getString("startTime"))&&"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeGreaterThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("startTime")));
			}
			else if("".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeLessThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			criteria.andDelstateEqualTo(IMyEnums.NORMAL);
			long all = user_mapper.countByExample(example);
			int index = json.getInt("pageIndex");
			int star = 0;
			int psize = 8;
			obj.put("allNumber", all);
			if (all % psize == 0) {
				all = all / psize;
			} else {
				all = all / psize + 1;
			}
			if (index > 1) {
				star = (index - 1) * psize;
			}
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(star);
	        example.setPageSize(psize);
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				obj.put("msg", IMyEnums.SUCCEED);
				for(User m:list) {
					AddressServiceImpl address = new AddressServiceImpl();
					m.setAddress(address.getProCity(m.getDisid()+""));
					
					if(!IMyEnums.USER_LIMIT_LOGIN.equals(m.getUserstate())) {
						m.setUserstate("已启用");
					}
					else {
						m.setUserstate("已停用");
					}
				}
				JSONArray jsonarray = JSONArray.fromObject(list);
				obj.put("jsonarray", jsonarray);
			}
			else {
				obj.put("msg", IMyEnums.FAIL);
			}
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		System.err.println("qwe:"+obj.toString());
		return obj.toString();
	}

	@Override
	public String queryuserById(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				obj.put("user", list.get(0));
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
	public String queryuserByTel(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andUsertelEqualTo(json.getString("usertel"));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				obj.put("user", list.get(0));
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
	public String queryuserByEmail(String message,HttpSession session) throws IOException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andEmailEqualTo(json.getString("email"));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				//公司信息
				CompanyMessageExample example2 = new CompanyMessageExample();
				CompanyMessageExample.Criteria criteria2 = example2.createCriteria();
				criteria2.andUseridEqualTo(list.get(0).getUserid());
				List<CompanyMessage> companyMessage = company_message_mapper.selectByExample(example2);
				if(companyMessage!=null&&companyMessage.size()>0) {
					//公司描述
					ServiceDescribeExample example3 = new ServiceDescribeExample();
					ServiceDescribeExample.Criteria criteria3 = example3.createCriteria();
					criteria3.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<ServiceDescribe> serviceDescribe = service_describe_mapper.selectByExample(example3);
					companyMessage.get(0).setServiceDescribe(serviceDescribe.get(0));
					//公司图片
					CompanyphotoExample example4 = new CompanyphotoExample();
					CompanyphotoExample.Criteria criteria4 = example4.createCriteria();
					criteria4.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<Companyphoto> companyphotos = company_photo_mapper.selectByExample(example4);
					companyMessage.get(0).setCompanyphoto(companyphotos);
					//搬家公司评伦 留言
					AppraiseExample example5 = new AppraiseExample();
					AppraiseExample.Criteria criteria5 = example5.createCriteria();
					criteria5.andCompanymessageidEqualTo(companyMessage.get(0).getCompanymessageid());
					List<Appraise> list2 = appraise_mapper.selectByExample(example5);
					if(list2!=null&&list2.size()>0) {
						for(int i=0;i<list2.size();i++) {
							//获取评伦信息
							String content = ChattingRecordsIO.readFile(list2.get(i).getContextcode());
							list2.get(i).setContextcode(content);
							//获取评伦用户名
							User user = user_mapper.selectByPrimaryKey(list2.get(i).getUserid());
							list2.get(i).setUser(user);
						}
					}
					list.get(0).setCompanyMessage(companyMessage.get(0));
				}
				session.setAttribute("user", list.get(0));
				obj.put("user", list.get(0));
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
	public String queryuserByUserName(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andNameEqualTo(json.getString("username"));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				obj.put("user", list.get(0));
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
	public String insertuser(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				json = JSONObject.fromObject(message);
				User user = new User();
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				criteria.andUsertelEqualTo(json.getString("usertel"));
				List<User> list = user_mapper.selectByExample(example);
				if(list!=null&&list.size()>0) {
					obj.put("msg", IMyEnums.TEL_ALREADY_EXISTS);
					return obj.toString();
				}
				user.setAddress(json.getString("disId"));
				String idnumber = json.getString("idnumber");
				if(idnumber!=null&&!"".equals(idnumber)) {
//					String birthday=idnumber.substring(6,14);
					int day=Integer.parseInt(idnumber.substring(10,14));
					int age=Time.Getyear()-Integer.parseInt(idnumber.substring(6,10));
					if(Integer.parseInt(Time.Getmonth()+Time.Getday())<day)
						 age=age-1;		
					//通过身份证号码判断性别
					String sex;
					if(Integer.parseInt(idnumber.substring(16,17))%2==0)
						sex="女";
					else
						sex="男";
					user.setAge(age);
					user.setSex(sex);
				}
				user.setCreatetime(new Date());
				user.setDelstate(IMyEnums.USER_NORMAL);
				user.setDisid(Integer.parseInt(json.getString("disId")));
				user.setEmail(json.getString("email"));
				user.setIdnumber(idnumber);
				user.setName(json.getString("name"));
				user.setPassword(MD5.getMD5(json.getString("password")));
				user.setUserstate(json.getString("userstate"));
				user.setUsertel(json.getString("usertel"));
				int i = user_mapper.insertSelective(user);
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
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}
	
	@Override
	public String insertuser(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			User user = new User();
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			criteria.andEmailEqualTo(json.getString("email"));
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				obj.put("msg", IMyEnums.EMAIL_ALREADY_EXISTS);
				return obj.toString();
			}
			example = new UserExample();
			criteria = example.createCriteria();
			criteria.andNameEqualTo(json.getString("name"));
			List<User> list1 = user_mapper.selectByExample(example);
			if(list1!=null&&list1.size()>0) {
				obj.put("msg", IMyEnums.USERNAME_ALREADY_EXISTS);
				return obj.toString();
			}
			if(json.getString("disId")!=null&&!"".equals(json.getString("disId"))) {
				user.setDisid(Integer.parseInt(json.getString("disId")));
			}
			if(json.getString("address")!=null&&!"".equals(json.getString("address"))) {
				user.setAddress(json.getString("address"));
			}
			String idnumber = json.getString("idnumber");
			if(idnumber!=null&&!"".equals(idnumber)) {
//				String birthday=idnumber.substring(6,14);
				int day=Integer.parseInt(idnumber.substring(10,14));
				int age=Time.Getyear()-Integer.parseInt(idnumber.substring(6,10));
				if(Integer.parseInt(Time.Getmonth()+Time.Getday())<day)
					 age=age-1;		
				//通过身份证号码判断性别
				String sex;
				if(Integer.parseInt(idnumber.substring(16,17))%2==0)
					sex="女";
				else
					sex="男";
				user.setAge(age);
				user.setSex(sex);
			}
			user.setCreatetime(new Date());
			user.setDelstate(IMyEnums.NORMAL);
			
			user.setEmail(json.getString("email"));
			user.setIdnumber(idnumber);
			user.setName(json.getString("name"));
			user.setPassword(MD5.getMD5(json.getString("password")));
			user.setUserstate(IMyEnums.NORMAL);
			user.setUsertel(json.getString("usertel"));
			int i = user_mapper.insertSelective(user);
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
	public String updateuser(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				User user = new User();
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				json = JSONObject.fromObject(message);
				criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
				String idnumber = json.getString("idnumber");
				if(idnumber!=null&&!"".equals(idnumber)) {
	//				String birthday=idnumber.substring(6,14);
					int day=Integer.parseInt(idnumber.substring(10,14));
					int age=Time.Getyear()-Integer.parseInt(idnumber.substring(6,10));
					if(Integer.parseInt(Time.Getmonth()+Time.Getday())<day)
						 age=age-1;		
					//通过身份证号码判断性别
					String sex;
					if(Integer.parseInt(idnumber.substring(16,17))%2==0)
						sex="女";
					else
						sex="男";
					user.setAge(age);
					user.setSex(sex);
					user.setIdnumber(idnumber);
				}
				user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
				if(json.getString("disId")!=null&&!"".equals(json.getString("disId"))) {
					user.setDisid(Integer.parseInt(json.getString("disId")));
				}
				if(json.getString("email")!=null&&!"".equals(json.getString("email"))) {
					user.setEmail(json.getString("email"));
				}
				if(json.getString("name")!=null&&!"".equals(json.getString("name"))) {
					user.setName(json.getString("name"));
				}
				if(json.getString("password")!=null&&!"".equals(json.getString("password"))) {
					user.setPassword(MD5.getMD5(json.getString("password")));
				}
				if(json.getString("usertel")!=null&&!"".equals(json.getString("usertel"))) {
					user.setUsertel(json.getString("usertel"));
				}
				int i = user_mapper.updateByExampleSelective(user, example);
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
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}
	
	@Override
	public String updateuserphoto(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				User user = new User();
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				json = JSONObject.fromObject(message);
				if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
					criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
				}
				user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
				user.setUserphoto(json.getString("userphoto"));
				int i = user_mapper.updateByExampleSelective(user, example);
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
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}

	@Override
	public String querynotdeluser(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andDelstateGreaterThan(IMyEnums.DELETE);
			String format = "yyyy-MM-dd";
			if(!"".equals(json.getString("username"))) {
	        	criteria.andNameLike("%"+json.getString("username")+"%");
	        }
			if(!"".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeBetween(new SimpleDateFormat(format).parse(json.getString("startTime")),new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			else if(!"".equals(json.getString("startTime"))&&"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeGreaterThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("startTime")));
			}
			else if("".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeLessThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			criteria.andDelstateEqualTo(IMyEnums.NORMAL);
			long all = user_mapper.countByExample(example);
			int index = json.getInt("pageIndex");
			int star = 0;
			int psize = 8;
			obj.put("allNumber", all);
			if (all % psize == 0) {
				all = all / psize;
			} else {
				all = all / psize + 1;
			}
			if (index > 1) {
				star = (index - 1) * psize;
			}
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(star);
	        example.setPageSize(psize);
			List<User> list = user_mapper.selectByExample(example);
			obj.put("allPageNumber", all);
			if(list!=null&&list.size()>0) {
				for(int i = 0;i<list.size();i++) {
					String address = "";
					if(list.get(i).getDisid()!=null) {
						address = address_service.getProCityDis(list.get(i).getDisid()+"");
					}
					if(list.get(i).getAddress()!=null) {
						address+="-"+list.get(i).getAddress();
					}
					list.get(i).setAddress(address);
				}
				obj.put("usernotdellist", list);
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
	public String querydeluser(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andDelstateEqualTo(IMyEnums.DELETE);
			String format = "yyyy-MM-dd";
			if(!"".equals(json.getString("username"))) {
	        	criteria.andNameLike("%"+json.getString("username")+"%");
	        }
			if(!"".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeBetween(new SimpleDateFormat(format).parse(json.getString("startTime")),new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			else if(!"".equals(json.getString("startTime"))&&"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeGreaterThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("startTime")));
			}
			else if("".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeLessThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			criteria.andDelstateEqualTo(IMyEnums.DELETE);
			long all = user_mapper.countByExample(example);
			int index = json.getInt("pageIndex");
			int star = 0;
			int psize = 8;
			obj.put("allNumber", all);
			if (all % psize == 0) {
				all = all / psize;
			} else {
				all = all / psize + 1;
			}
			if (index > 1) {
				star = (index - 1) * psize;
			}
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(star);
	        example.setPageSize(psize);
			List<User> list = user_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				for(int i = 0;i<list.size();i++) {
					String address = "";
					if(list.get(i).getDisid()!=null) {
						address = address_service.getProCityDis(list.get(i).getDisid()+"");
					}
					if(list.get(i).getAddress()!=null) {
						address+="-"+list.get(i).getAddress();
					}
					list.get(i).setAddress(address);
				}
				obj.put("userdellist", list);
				obj.put("allPageNumber", all);
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
	public String updateuserpassword(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				User user = new User();
				json = JSONObject.fromObject(message);
				criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
				user.setPassword(MD5.getMD5(json.getString("password")));
				user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
				int i = user_mapper.updateByExampleSelective(user, example);
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
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}
	
	@Override
	public String updateuserpassword(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			User user = new User();
			json = JSONObject.fromObject(message);
			criteria.andEmailEqualTo(json.getString("email"));
			user.setPassword(MD5.getMD5(json.getString("password")));
			user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
			int i = user_mapper.updateByExampleSelective(user, example);
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
	public String updateuserstatus(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				User user = new User();
				json = JSONObject.fromObject(message);
				criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
				if(json.getString("userstate")!=null&&!"".equals(json.getString("userstate"))) {
					user.setUserstate(json.getString("userstate"));
				}
				if(json.getString("delstate")!=null&&!"".equals(json.getString("delstate"))) {
					user.setDelstate(json.getString("delstate"));
				}
				user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
				int i = user_mapper.updateByExampleSelective(user, example);
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
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}

	@Override
	public String updateuserliststatus(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
//		User ord_user = (User) session.getAttribute("user");
//		Manager manager = (Manager) session.getAttribute("manager");
//		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				User user = new User();
				json = JSONObject.fromObject(message);
				String[] userids = json.getString("userids").split(";");
				int i = 0;
				if(userids!=null&&userids.length>0) {
					for(String id:userids) {
						user = new User();
						example = new UserExample();
						criteria = example.createCriteria();
						criteria.andUseridEqualTo(Integer.parseInt(id));
						if(json.getString("userstate")!=null&&!"".equals(json.getString("userstate"))) {
							user.setUserstate(json.getString("userstate"));
						}
						if(json.getString("delstate")!=null&&!"".equals(json.getString("delstate"))) {
							user.setDelstate(json.getString("delstate"));
						}
						user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
						i += user_mapper.updateByExampleSelective(user, example);
					}
					if(i>0) {
						obj.put("msg", IMyEnums.SUCCEED);
					}
					else {
						obj.put("msg", IMyEnums.FAIL);
					}
				}
			}
			else {
				obj.put("msg", IMyEnums.FAIL);
			}
//		}
//		else {
//			obj.put("msg", IMyEnums.FAIL);
//		}
		return obj.toString();
	}

	@Override
	public void checkIdCard(String message,String uploadFolder) {
		User user = new User();
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		JSONObject json = JSONObject.fromObject(message);
		if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
			criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
		}
		user.setApprovestate(IMyEnums.CERTIFICATION_STATUS_UNDER_REVIEW);
		user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
		user_mapper.updateByExampleSelective(user, example);
		String[] filePath = json.getString("idcardz").split("/");
		TimerUtil.checkIdCard(json.getString("idCardSide"), uploadFolder+filePath[4]+"/"+filePath[5]+"/"+filePath[6], json.getInt("time"), message, user_mapper);
	}
	
	@Override
	public String insertUserCollect(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			MyCollectExample example = new MyCollectExample();
			MyCollectExample.Criteria criteria = example.createCriteria();
			criteria.andCompanymessageidEqualTo(json.getInt("companymessageid"));
			criteria.andUseridEqualTo(json.getInt("userid"));
			List<MyCollect> collects = mycollect_mapper.selectByExample(example);
			int i = 0;
			if(collects!=null&&collects.size()<=0) {
				MyCollect myCollect = new MyCollect();
				myCollect.setCompanymessageid(json.getInt("companymessageid"));
				myCollect.setUserid(json.getInt("userid"));
				i =mycollect_mapper.insertSelective(myCollect);
			}
			else {
				i=1;
			}
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
}
