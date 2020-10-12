package com.hlbrc.movingcompany.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.Orderform;
import com.hlbrc.movingcompany.entity.OrderformExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.ICompanyMessageMapper;
import com.hlbrc.movingcompany.mapper.IOrderformMapper;
import com.hlbrc.movingcompany.mapper.IUserMapper;
import com.hlbrc.movingcompany.service.IOrderService;

import net.sf.json.JSONObject;

@Service("OrderServiceImpl")
public class OrderServiceImpl implements IOrderService {
	@Autowired
	IOrderformMapper order_form_mapper;
	@Autowired
	IUserMapper user_mapper;
	@Autowired
	ICompanyMessageMapper company_message_mapper;

	@Override
	public String queryAllOrderForm(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			OrderformExample example = new OrderformExample();
			OrderformExample.Criteria criteria = example.createCriteria();
			String format = "yyyy-MM-dd";
			if(!"".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeBetween(new SimpleDateFormat(format).parse(json.getString("startTime")),new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			else if(!"".equals(json.getString("startTime"))&&"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeGreaterThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("startTime")));
			}
			else if("".equals(json.getString("startTime"))&&!"".equals(json.getString("endTime"))) {
				criteria.andCreatetimeLessThanOrEqualTo(new SimpleDateFormat(format).parse(json.getString("endTime")));
			}
			if(json.getString("startsite")!=null&&!"".equals(json.getString("startsite"))) {
				criteria.andStartsiteLike("%"+json.getString("startsite")+"%");
			}
			if(json.getString("endsite")!=null&&!"".equals(json.getString("endsite"))) {
				criteria.andEndsiteLike("%"+json.getString("endsite")+"%");
			}
			long all = order_form_mapper.countByExample(example);
			int index = json.getInt("pageIndex");
			int star = 0;
			int psize = 6;
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
			List<Orderform> list = order_form_mapper.selectByExample(example);
			if(list!=null&&list.size()>0) {
				for(int i=0;i<list.size();i++) {
					list.get(i).setUser(user_mapper.selectByPrimaryKey(list.get(i).getUserid()));
					list.get(i).setCompanyMessage(company_message_mapper.selectByPrimaryKey(list.get(i).getCompanymessageid()));
				}
				obj.put("allPageNumber", all);
				obj.put("allOrderFormList", list);
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
	public String insertOrderForm(String message) throws ParseException {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			Orderform orderform = new Orderform();
			orderform.setCompanymessageid(json.getInt("companymessageid"));
			orderform.setCreatetime(new Date());
			orderform.setEndsite(json.getString("endsite"));
			String movingtime = json.getString("movingtime");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = simpleDateFormat.parse(movingtime);
			orderform.setMovingtime(date);
			orderform.setName(json.getString("name"));
			orderform.setRemark(json.getString("remark"));
			orderform.setStartsite(json.getString("startsite"));
			orderform.setTel(json.getString("tel"));
			orderform.setUserid(json.getInt("userid"));
			int i = order_form_mapper.insert(orderform);
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
	public String deleteOrderForm(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			int i = order_form_mapper.deleteByPrimaryKey(json.getInt("orderformid"));
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
	public String deleteListOrderForm(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			if(json.getString("orderformids")!=null&&!"".equals(json.getString("orderformids"))) {
				String[] orderformids = json.getString("orderformids").split(";");
				int n = 0;
				if(orderformids!=null&&orderformids.length>0) {
					for(int i=0;i<orderformids.length;i++) {
						n+=order_form_mapper.deleteByPrimaryKey(Integer.parseInt(orderformids[i]));
					}
					if(n>0) {
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
		}
		else {
			obj.put("msg", IMyEnums.FAIL);
		}
		return obj.toString();
	}

}
