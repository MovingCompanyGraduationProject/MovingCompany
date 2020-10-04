package com.hlbrc.movingcompany.service.impl;



import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.Manager;
import com.hlbrc.movingcompany.entity.User;
import com.hlbrc.movingcompany.entity.UserExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.IUserMapper;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.MD5;
import com.hlbrc.movingcompany.util.Time;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserMapper user_mapper;
	
	@Override
	public String userlogin(String message, HttpSession session) {
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
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(Integer.parseInt(json.getString("pageIndex"))-1);
	        example.setPageSize(2);
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
	public String queryuserByEmail(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andEmailEqualTo(json.getString("email"));
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
		User ord_user = (User) session.getAttribute("user");
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager!=null||ord_user!=null) {
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
				user.setDelstate(IMyEnums.NORMAL);
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
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
			user.setAddress(json.getString("disId"));
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
			if(json.getString("disId")!=null&&!"".equals(json.getString("disId"))) {
				user.setDisid(Integer.parseInt(json.getString("disId")));
			}
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
		User ord_user = (User) session.getAttribute("user");
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				User user = new User();
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				json = JSONObject.fromObject(message);
				criteria.andEmailEqualTo(json.getString("userid"));
				AddressServiceImpl address = new AddressServiceImpl();
				user.setAddress(address.getCityDis(json.getString("disId")));
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
				user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
				user.setDelstate(IMyEnums.NORMAL);
				user.setDisid(Integer.parseInt(json.getString("disId")));
				user.setEmail(json.getString("email"));
				user.setIdnumber(idnumber);
				user.setName(json.getString("name"));
				user.setPassword(MD5.getMD5(json.getString("password")));
				user.setUserstate(json.getString("userstate"));
				user.setUsertel(json.getString("usertel"));
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
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
			criteria.andUserstateNotEqualTo(IMyEnums.DELETE);
			String format = "yyyy-MM-dd";
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(Integer.parseInt(json.getString("pageIndex"))-1);
	        example.setPageSize(2);
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
	public String querydeluser(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			UserExample example = new UserExample();
			UserExample.Criteria criteria = example.createCriteria();
			json = JSONObject.fromObject(message);
			criteria.andUserstateEqualTo(IMyEnums.DELETE);
			String format = "yyyy-MM-dd";
			example.setOrderByClause("createTime ASC");
			example.setPageIndex(Integer.parseInt(json.getString("pageIndex"))-1);
	        example.setPageSize(2);
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
	public String updateuserpassword(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		User ord_user = (User) session.getAttribute("user");
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager!=null||ord_user!=null) {
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
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
		User ord_user = (User) session.getAttribute("user");
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				User user = new User();
				json = JSONObject.fromObject(message);
				criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
				user.setUserstate(json.getString("userstate"));
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

	@Override
	public String updateuserliststatus(String message, HttpSession session) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		User ord_user = (User) session.getAttribute("user");
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager!=null||ord_user!=null) {
			if(message!=null&&!"".equals(message)) {
				UserExample example = new UserExample();
				UserExample.Criteria criteria = example.createCriteria();
				User user = new User();
				json = JSONObject.fromObject(message);
				String[] userids = json.getString("userids").split(";");
				int i = 0;
				if(userids!=null&&userids.length>0) {
					for(String id:userids) {
						criteria.andUseridEqualTo(Integer.parseInt(id));
						user.setUserstate(json.getString("userstate"));
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}
	
}
