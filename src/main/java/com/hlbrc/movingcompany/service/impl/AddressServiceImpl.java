package com.hlbrc.movingcompany.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.City;
import com.hlbrc.movingcompany.entity.CityExample;
import com.hlbrc.movingcompany.entity.District;
import com.hlbrc.movingcompany.entity.DistrictExample;
import com.hlbrc.movingcompany.entity.Privince;
import com.hlbrc.movingcompany.entity.PrivinceExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.ICityMapper;
import com.hlbrc.movingcompany.mapper.IDistrictMapper;
import com.hlbrc.movingcompany.mapper.IPrivinceMapper;
import com.hlbrc.movingcompany.service.IAddressService;

import net.sf.json.JSONObject;

@Service("AddressServiceImpl")
public class AddressServiceImpl implements IAddressService {
	@Autowired
	private IPrivinceMapper privince_mapper;
	@Autowired
	private ICityMapper city_mapper;
	@Autowired
	private IDistrictMapper district_mapper;
	
	@Override
	public String getProCity(String disid) {
		String str = "";
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			Privince pri = privince_mapper.selectByPrimaryKey(city.getCitid());
			str = pri.getProname()+" "+city.getCitname();
			return str;
		}
		return null;
	}
	@Override
	public String getProDis(String disid) {
		String str = "";
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			Privince pri = privince_mapper.selectByPrimaryKey(city.getCitid());
			str = pri.getProname()+" "+dis.getDisname();
			return str;
		}
		return null;
	}
	@Override
	public String getProCityDis(String disid) {
		String str = "";
		if(disid!=null) {
			System.out.println(Integer.parseInt(disid));
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			Privince pri = privince_mapper.selectByPrimaryKey(Integer.parseInt(city.getProid()));
			str = pri.getProname()+"-"+city.getCitname()+"-"+dis.getDisname();
			return str;
		}
		return null;
	}
	@Override
	public String getCityDis(String disid) {
		String str = "";
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			str = city.getCitname()+" "+dis.getDisname();
			return str;
		}
		return null;
	}
	@Override
	public String getPro(String disid) {
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			Privince pri = privince_mapper.selectByPrimaryKey(city.getCitid());
			return pri.getProname();
		}
		return null;
	}
	@Override
	public String getCity(String disid) {
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			return city.getCitname();
		}
		return null;
	}
	@Override
	public String getDis(String disid) {
		if(disid!=null) {
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			return dis.getDisname();
		}
		return null;
	}
	@Override
	public String getAllPro() {
		JSONObject json = new JSONObject();
		PrivinceExample example = new PrivinceExample();
		List<Privince> list = privince_mapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			CityExample example2 = new CityExample();
			CityExample.Criteria criteria = example2.createCriteria();
			criteria.andProidEqualTo(list.get(0).getProid()+"");
			List<City> list2 =  city_mapper.selectByExample(example2);
			if(list2!=null&&list2.size()>0) {
				json.put("city", list2);
				DistrictExample example3 = new DistrictExample();
				DistrictExample.Criteria criteria2 = example3.createCriteria();
				criteria2.andCitidEqualTo(list2.get(0).getCitid()+"");
				List<District> list3 =  district_mapper.selectByExample(example3);
				json.put("dis", list3);
			}
			json.put("pro", list);
			json.put("msg", IMyEnums.SUCCEED);
		}
		else {
			json.put("msg", IMyEnums.FAIL);
		}
		return json.toString();
	}
	@Override
	public String getAllCityByProId(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			if(json.getString("proid")!=null&&!"".equals(json.getString("proid"))) {
				CityExample example = new CityExample();
				CityExample.Criteria criteria = example.createCriteria();
				criteria.andProidEqualTo(json.getString("proid"));
				List<City> list = city_mapper.selectByExample(example);
				if(list!=null&&list.size()>0) {
				
					DistrictExample example2 =  new DistrictExample();
					DistrictExample.Criteria criteria2 = example2.createCriteria();
					criteria2.andCitidEqualTo(list.get(0).getCitid()+"");
					List<District> list2 = district_mapper.selectByExample(example2);
					obj.put("dis", list2);
				}
				obj.put("city", list);
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
	public String getAllDisByCityId(String message) {
		JSONObject obj = new JSONObject();
		JSONObject json = new JSONObject();
		if(message!=null&&!"".equals(message)) {
			json = JSONObject.fromObject(message);
			if(json.getString("citid")!=null&&!"".equals(json.getString("citid"))) {
				DistrictExample example3 = new DistrictExample();
				DistrictExample.Criteria criteria2 = example3.createCriteria();
				criteria2.andCitidEqualTo(json.getString("citid"));
				List<District> list3 =  district_mapper.selectByExample(example3);
				obj.put("dis", list3);
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
