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
import com.hlbrc.movingcompany.mapper.IOrderformMapper;
import com.hlbrc.movingcompany.service.IOrderService;

import net.sf.json.JSONObject;

@Service("OrderServiceImpl")
public class OrderServiceImpl implements IOrderService {
	@Autowired
	IOrderformMapper order_form_mapper;

	@Override
	public String queryAllOrderForm() {
		JSONObject obj = new JSONObject();
		OrderformExample example = new OrderformExample();
		List<Orderform> list = order_form_mapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			obj.put("allOrderFormList", list);
			obj.put("msg", IMyEnums.SUCCEED);
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

}
