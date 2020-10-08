package com.hlbrc.movingcompany.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.service.IOrderService;
import com.hlbrc.movingcompany.service.IUserService;
import com.hlbrc.movingcompany.util.Log;

import net.sf.json.JSONObject;

@Controller//将当前类添加到控制层的容器中
@EnableAutoConfiguration//启动自动扫描功能
@ComponentScan(value= {"com.hlbrc.movingcompany.service.Impl","com.hlbrc.movingcompany.controller.*"})//扫描控制层及逻辑的实现层，类似于之前xml中控制层与逻辑层的配置
public class UserController {
	@Autowired 
	IUserService user_service;
	@Autowired
	IOrderService order_service;
	@Value("${file.uploadFolder}")
    private String uploadFolder;
	
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
	
	/**
	 * 图片上传
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "uploadUserPhoto")
    @ResponseBody
	public Map<String ,Object> uploadUserPhoto(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> resultSrc = new HashMap<String, Object>();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		String myfilename = request.getParameter("myfilename");
		String outStr = "";
		// 文件保存目录路径
		String savePath = "F:/moving_company_pic/";
		response.setContentType("text/html; charset=UTF-8");
		// 检查目录
		File uploadDir = new File(savePath);
		if (!uploadDir.isDirectory()) {
			// 如果不存在，创建文件夹
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String ymd = sdf.format(new Date());
		savePath += "/" + ymd + "/"+ myfilename + "/";
		File dirFile = new File(savePath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		// 此处是直接采用Spring的上传
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf = entity.getValue();
			String fileFullname = mf.getOriginalFilename();
			fileFullname = fileFullname.replace('&', 'a');
			fileFullname = fileFullname.replace(',', 'b');
			fileFullname = fileFullname.replace('，', 'c');
			// 扩展名
			String fileExt = fileFullname.substring(fileFullname.lastIndexOf(".") + 1).toLowerCase();

			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
			String newFileName = df.format(new Date()) + "_"+ new Random().nextInt(1000) + "." + fileExt;

			File uploadFile = new File(savePath + newFileName);
			try {
				FileCopyUtils.copy(mf.getBytes(), uploadFile);
				outStr += "http://localhost:9090/picture/" + ymd + "/"+ myfilename + "/"+ newFileName;
			} catch (IOException e) {
				result.put("code", 200);
				result.put("msg", "上传失败");
				e.printStackTrace();
			}
		}
		result.put("code", 1);
		result.put("msg", "上传成功");
		resultSrc. put("src", outStr);
		result.put("data", resultSrc);
		return result;
		// 上传结束
	}
	
	/**
     *身份证认证
     * @param message
     * @return
     */
    @RequestMapping(value = "checkIdCard")
    @ResponseBody
    public String checkIdCard(String message) {
    	JSONObject obj = new JSONObject();
		try {
			user_service.checkIdCard(message,uploadFolder);
			obj.put("msg", IMyEnums.SUCCEED);
			return obj.toString();
		}
    	catch (Exception e) {
    		Log.logger.debug("身份证认证失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     *上传头像
     * @param message
     * @return
     */
    @RequestMapping(value = "setUserPhotoPath")
    @ResponseBody
    public String setUserPhotoPath(String message,HttpSession session) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return user_service.updateuserphoto(message, session);
		}
    	catch (Exception e) {
    		Log.logger.debug("上传头像失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 添加用户收藏
     * @param message
     * @return
     */
    @RequestMapping(value = "insertUserCollect")
    @ResponseBody
    public String insertUserCollect(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return user_service.insertUserCollect(message);
		}
    	catch (Exception e) {
    		Log.logger.debug("添加用户收藏失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 添加用户订单
     * @param message
     * @return
     */
    @RequestMapping(value = "insertOrderForm")
    @ResponseBody
    public String insertOrderForm(String message) {
    	JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return order_service.insertOrderForm(message);
		}
    	catch (Exception e) {
    		Log.logger.debug("添加用户订单失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
    
    /**
     * 测试
     * @return
     */
    @RequestMapping(value = "test")
    @ResponseBody
    public String test() {
    	JSONObject obj = new JSONObject();
		try {
			String[] filePath = "http://localhost:9090/picture/202010/idcard/20201005175952_232.jpg".split("/");
			System.err.println(uploadFolder+filePath[4]+"/"+filePath[5]+"/"+filePath[6]);
			obj.put("msg", IMyEnums.SUCCEED);
			return obj.toString();
		}
    	catch (Exception e) {
    		e.printStackTrace();
    		Log.logger.debug("测试失败："+e.getMessage());
    		obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
}
