package com.hlbrc.movingcompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.service.IMainService;
import com.hlbrc.movingcompany.service.IManagerService;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.ChattingRecordsIO;
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
	@Autowired
	IMainService main_service;
	@Value("${file.frontEndPath}")
    private String frontEndPath;
	@Value("${file.uploadFolder}")
    private String uploadFolder;
	
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
    				JSONObject obj1 = JSONObject.fromObject(user_service.queryuserByEmail(message,request.getSession()));
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
    		Log.logger.debug("忘记密码发送验证码失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
    }
    
    /**
     * 校验该邮箱是否注册
     * @param message
     * @return
     */
    @RequestMapping(value = "checkEmeil")
    @ResponseBody
    public String checkEmeil(String message,HttpSession session) {
    	JSONObject obj = new JSONObject();
    	try {
    		if(message!=null&&!"".equals(message)) {
    			JSONObject json = JSONObject.fromObject(message);
    			if(json.getString("email")!=null&&!"".equals(json.getString("email"))) {
    				return user_service.queryuserByEmail(message,session);
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
    		Log.logger.debug("校验该邮箱是否注册失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 校验该用户名是否已存在
     * @param message
     * @return
     */
    @RequestMapping(value = "checkUserName")
    @ResponseBody
    public String checkUserName(String message) {
    	JSONObject obj = new JSONObject();
    	try {
    		if(message!=null&&!"".equals(message)) {
    			JSONObject json = JSONObject.fromObject(message);
    			if(json.getString("username")!=null&&!"".equals(json.getString("username"))) {
    				return user_service.queryuserByUserName(message);
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
    		Log.logger.debug("校验该用户名是否已存在失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 添加留言
     * @param message
     * @return
     */
    @RequestMapping(value = "insertLeaveMessage")
    @ResponseBody
    public String insertLeaveMessage(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.insertLeaveMessage(message);
		}
    	catch (Exception e) {
    		Log.logger.debug("添加留言失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 预约搬家
     * @param message
     * @return
     */
    @RequestMapping(value = "insertAppointment")
    @ResponseBody
    public String insertAppointment(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.insertAppointment(message);
		}
    	catch (Exception e) {
    		Log.logger.debug("预约搬家失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 获取所有服务分类
     * @param message
     * @return
     */
    @RequestMapping(value = "queryAllServiceType")
    @ResponseBody
    public String queryAllServiceType() {
    	JSONObject obj = new JSONObject();
		try {
			return main_service.queryAllServiceType();
		}
    	catch (Exception e) {
    		Log.logger.debug("获取所有服务分类失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     *营业执照认证
     * @param message
     * @return
     */
    @RequestMapping(value = "checkBusinessLicense")
    @ResponseBody
    public String checkBusinessLicense(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			main_service.checkBusinessLicense(message, uploadFolder);
			obj.put("msg", IMyEnums.SUCCEED);
			return obj.toString();
		}
    	catch (Exception e) {
    		Log.logger.debug("营业执照认证失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     *发布咨询
     * @param message
     * @return
     */
    @RequestMapping(value = "insertZiXun")
    @ResponseBody
    public String insertZiXun(String message) {
    	JSONObject obj = new JSONObject();
		try {
			JSONObject json = JSONObject.fromObject(message);
			String filePath = frontEndPath+json.getString("fileName");
			System.err.println(filePath);
			ChattingRecordsIO.clearFile(filePath);
			ChattingRecordsIO.writeFileByBytes(filePath,json.getString("message"));
			obj.put("msg", IMyEnums.SUCCEED);
			return obj.toString();
		}
    	catch (Exception e) {
    		Log.logger.debug("发布咨询失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 发布搬家公司
     * @param message
     * @return
     */
    @RequestMapping(value = "insertMovingCompany")
    @ResponseBody
    public String insertMovingCompany(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.insertMovingCompany(message,frontEndPath);
		}
    	catch (Exception e) {
    		Log.logger.debug("发布搬家公司失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 查询符合条件的搬家公司
     * @param message
     * @return
     */
    @RequestMapping(value = "queryMovingCompany")
    @ResponseBody
    public String queryMovingCompany(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.queryMovingCompany(message);
		}
    	catch (Exception e) {
    		Log.logger.debug("查询符合条件的搬家公司失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 添加评伦
     * @param message
     * @return
     */
    @RequestMapping(value = "insertMovingCompanyAppraise")
    @ResponseBody
    public String insertMovingCompanyAppraise(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.insertMovingCompanyAppraise(message,frontEndPath);
		}
    	catch (Exception e) {
    		Log.logger.debug("查询符合条件的搬家公司失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 添加留言
     * @param message
     * @return
     */
    @RequestMapping(value = "insertInform")
    @ResponseBody
    public String insertInform(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return main_service.insertInform(message,frontEndPath);
		}
    	catch (Exception e) {
    		Log.logger.debug("添加留言失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
}
