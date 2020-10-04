package com.hlbrc.movingcompany.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlbrc.movingcompany.service.IManagerService;
import com.hlbrc.movingcompany.util.Log;

@Controller//将当前类添加到控制层的容器中
@EnableAutoConfiguration//启动自动扫描功能
@ComponentScan(value= {"com.hlbrc.movingcompany.service.Impl","com.hlbrc.movingcompany.controller.*"})//扫描控制层及逻辑的实现层，类似于之前xml中控制层与逻辑层的配置
public class ManagerController {
	@Autowired 
	IManagerService manager_service;
	
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
			return "{'msg':'no'}";
		}
	}
}
