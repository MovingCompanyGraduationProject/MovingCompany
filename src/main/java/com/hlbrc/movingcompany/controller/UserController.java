package com.hlbrc.movingcompany.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.Log;

import net.sf.json.JSONObject;

@Controller//将当前类添加到控制层的容器中
@EnableAutoConfiguration//启动自动扫描功能
@ComponentScan(value= {"com.hlbrc.movingcompany.service.Impl","com.hlbrc.movingcompany.controller.*"})//扫描控制层及逻辑的实现层，类似于之前xml中控制层与逻辑层的配置
public class UserController {
	@Autowired 
	IUserService user_service;
	
	/**
	 * 用户登录
	 * @param message
	 * @return
	 */
	@RequestMapping(value="userlogin")
	@ResponseBody
	public String userlogin(String message,HttpSession session) {
		try {
			System.err.println(message.toString());
			return user_service.userlogin(message,session);
		}catch (Exception e) {
			Log.logger.debug("用户登录出错了！："+e.getMessage());
			return "{'msg':'no'}";
		}
	}
	
	/**
	 * 修改用户密码
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "updatePassword")
    @ResponseBody
    public String updatePassword(String message) {
    	JSONObject obj = new JSONObject();
    	try {
    		return user_service.updateuserpassword(message);
	    }
		catch (Exception e) {
			Log.logger.debug("修改用户密码失败："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
	
	/**
	 * 用户注册
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "userRegister")
    @ResponseBody
    public String userRegister(String message) {
    	JSONObject obj = new JSONObject();
    	try {
    		return user_service.insertuser(message);
	    }
		catch (Exception e) {
			e.printStackTrace();
			Log.logger.debug("用户注册失败："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
}
