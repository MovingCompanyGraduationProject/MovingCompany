package com.hlbrc.movingcompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.service.IManagerService;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.Log;
import com.hlbrc.movingcompany.util.MD5;
import com.hlbrc.movingcompany.util.QqEmailSendMessage;

import net.sf.json.JSONObject;

@Controller//将当前类添加到控制层的容器中
@EnableAutoConfiguration//启动自动扫描功能
@ComponentScan(value= {"com.hlbrc.movingcompany.service.Impl","com.hlbrc.movingcompany.controller.*"})//扫描控制层及逻辑的实现层，类似于之前xml中控制层与逻辑层的配置
public class MainController {
	@Autowired 
	IUserService user_service;
	@Autowired 
	IManagerService manager_service;
	
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
	 * 管理员登录
	 * @param message
	 * @return
	 */
	@RequestMapping(value="managerlogin")
	@ResponseBody
	public String managerlogin(String message,HttpSession session,HttpServletResponse response) {
		try {
			System.err.println(message.toString());
			return manager_service.managerlogin(message,session);
		}catch (Exception e) {
			Log.logger.debug("管理员登录出错了！："+e.getMessage());
			return "{'msg':'no'}";
		}
	}
	
	/**
	 * 管理员查询(模糊 分页)
	 * @param message
	 * @return
	 */
	@RequestMapping(value="managerquery")
	@ResponseBody
	public String managerquery(String message,HttpServletResponse response) {
		try {
			System.err.println(message.toString());
			return manager_service.queryManager(message);
		}catch (Exception e) {
			Log.logger.debug(" 管理员查询(模糊 分页)！："+e.getMessage());
			e.printStackTrace();
			return "{'msg':'no'}";
		}
	}
	
	 /**
     * 发送验证码
     * @param message
     * @return
     */
    @RequestMapping(value = "sendVisCode")
    @ResponseBody
    public String sendVisCode(String message,HttpServletRequest request){
    	JSONObject obj = new JSONObject();
    	try {
    		if(message!=null&&!"".equals(message)) {
    			JSONObject json = JSONObject.fromObject(message);
    			if(json.getString("email")!=null&&!"".equals(json.getString("email"))) {
					if(QqEmailSendMessage.sendEmail(json.getString("email"), request)) {
    					String code =  (String) request.getSession().getAttribute("appEmailVerifyCode");
    					obj.put("code", MD5.getMD5(code));
    					obj.put("msg", IMyEnums.SUCCEED);
    					return obj.toString();
    				}
    				else {
    					obj.put("msg", IMyEnums.FAIL);
    					return obj.toString();
    				}
    			}
    			else {
    				obj.put("msg", IMyEnums.FAIL);
    				return obj.toString();
    			}
    		}
    		else {
    			obj.put("msg", IMyEnums.FAIL);
    			return obj.toString();
    		}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		Log.logger.debug("发送验证码失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
    
    /**
     * 忘记密码发送验证码
     * @param message
     * @return
     */
    @RequestMapping(value = "sendVisCodeForget")
    @ResponseBody
    public String sendVisCodeForget(String message,HttpServletRequest request){
    	JSONObject obj = new JSONObject();
    	try {
    		if(message!=null&&!"".equals(message)) {
    			JSONObject json = JSONObject.fromObject(message);
    			if(json.getString("email")!=null&&!"".equals(json.getString("email"))) {
    				JSONObject obj1 = JSONObject.fromObject(user_service.queryuserByEmail(message));
    				if(!"no".equals(obj1.getString("msg"))) {
    					if(QqEmailSendMessage.sendEmail(json.getString("email"), request)) {
        					String code =  (String) request.getSession().getAttribute("appEmailVerifyCode");
        					obj.put("user", obj1.getJSONObject("user"));
        					obj.put("code", MD5.getMD5(code));
        					obj.put("msg", IMyEnums.SUCCEED);
        					return obj.toString();
        				}
        				else {
        					obj.put("msg", IMyEnums.FAIL);
        					return obj.toString();
        				}
    				}
    				else {
    					obj.put("msg", IMyEnums.EMAIL_NOT_ALREADY_EXISTS);
    					return obj.toString();
    				}
    				
    			}
    			else {
    				obj.put("msg", IMyEnums.FAIL);
    				return obj.toString();
    			}
    		}
    		else {
    			obj.put("msg", IMyEnums.FAIL);
    			return obj.toString();
    		}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		Log.logger.debug("发送验证码失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
}
