package com.hlbrc.movingcompany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlbrc.movingcompany.entity.City;
import com.hlbrc.movingcompany.entity.District;
import com.hlbrc.movingcompany.entity.Privince;
import com.hlbrc.movingcompany.mapper.ICityMapper;
import com.hlbrc.movingcompany.mapper.IDistrictMapper;
import com.hlbrc.movingcompany.mapper.IPrivinceMapper;
import com.hlbrc.movingcompany.service.IAddressService;

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
			District dis = district_mapper.selectByPrimaryKey(Integer.parseInt(disid));
			City city = city_mapper.selectByPrimaryKey(Integer.parseInt(dis.getCitid()));
			Privince pri = privince_mapper.selectByPrimaryKey(city.getCitid());
			str = pri.getProname()+" "+city.getCitname()+" "+dis.getDisname();
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
	
	

}
