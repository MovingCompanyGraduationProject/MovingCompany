package com.hlbrc.movingcompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.service.IAddressService;
import com.hlbrc.movingcompany.util.Log;

import net.sf.json.JSONObject;

@Controller
public class AddressController {
	@Autowired
	private IAddressService address_service;
	
	/**
     * 显示所有省信息 初始化
     * @param message
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "initializeAddress")
    @ResponseBody
    public String initializeAddress(){
    	JSONObject obj = new JSONObject();
    	try {
    		String jsonobj = address_service.getAllPro();
    		return jsonobj;
    	}
    	catch (Exception e) {
    		Log.logger.debug("显示所有省信息："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
    
    /**
     * 根据省id更新市区信息
     * @param message
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "queryAddressByProId")
    @ResponseBody
    public String queryAddressByProId(String message){
    	JSONObject obj = new JSONObject();
    	try {
    		System.err.println(message);
    		
    		String jsonobj = address_service.getAllCityByProId(message);
    		return jsonobj;
    	}
    	catch (Exception e) {
    		Log.logger.debug("根据省id更新市区信息失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
    
    /**
     * 根据市id更新区信息
     * @param message
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "queryAddressByCitId")
    @ResponseBody
    public String queryAddressByCitId(String message){
    	JSONObject obj = new JSONObject();
    	try {
    		System.err.println(message);
    		String jsonobj = address_service.getAllDisByCityId(message);
    		return jsonobj;
    	}
    	catch (Exception e) {
    		Log.logger.debug("根据市id更新区信息失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
}
