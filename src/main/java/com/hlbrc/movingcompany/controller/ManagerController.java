package com.hlbrc.movingcompany.controller;

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
import com.hlbrc.movingcompany.util.Log;

import net.sf.json.JSONObject;

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
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message.toString());
			return manager_service.managerlogin(message,session);
		}catch (Exception e) {
			Log.logger.debug("管理员登录出错了！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 管理员查询(模糊 分页)
	 * @param message
	 * @return
	 */
	@RequestMapping(value="managerquery")
	@ResponseBody
	public String managerquery(String message) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message.toString());
			return manager_service.queryManager(message);
		}catch (Exception e) {
			Log.logger.debug(" 管理员查询(模糊 分页)失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 设置管理员状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setManagerstatus")
	@ResponseBody
	public String setManagerstatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setManagerstatus(message,session);
		}catch (Exception e) {
			Log.logger.debug("设置管理员状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 批量设置管理员状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setManagerliststatus")
	@ResponseBody
	public String setManagerliststatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setManagerliststatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("批量设置管理员状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 添加权限分类
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="insertauthoritytype")
	@ResponseBody
	public String insertauthoritytype(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.insertauthoritytype(message, session);
		}catch (Exception e) {
			Log.logger.debug("添加权限分类失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 查询所有权限分类 分页 模糊查询
	 * @param message
	 * @return
	 */
	@RequestMapping(value="queryallauthoritytype")
	@ResponseBody
	public String queryallauthoritytype(String message) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.queryauthoritytype(message,9);
		}catch (Exception e) {
			Log.logger.debug("查询所有权限分类失败  分页 模糊查询！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 查询所有权限分类
	 * @param message
	 * @return
	 */
	@RequestMapping(value="queryallauthoritytype1")
	@ResponseBody
	public String queryallauthoritytype1(String message) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.queryauthoritytype(message,null);
		}catch (Exception e) {
			Log.logger.debug("查询所有权限分类失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 设置权限分类状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setauthoritytypestatus")
	@ResponseBody
	public String setauthoritytypestatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setauthoritytypestatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("设置权限分类状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 批量设置权限分类状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setauthoritytypeliststatus")
	@ResponseBody
	public String setauthoritytypeliststatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setauthoritytypeliststatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("批量设置权限分类状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 修改权限分类信息
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updateauthoritytype")
	@ResponseBody
	public String updateauthoritytype(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.updateauthoritytype(message, session);
		}catch (Exception e) {
			Log.logger.debug("修改权限分类信息失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 添加权限
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="insertauthority")
	@ResponseBody
	public String insertauthority(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.insertauthority(message, session);
		}catch (Exception e) {
			Log.logger.debug("添加权限失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 查询权限 分页
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="queryauthority")
	@ResponseBody
	public String queryauthority(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.queryauthority(message, 9);
		}catch (Exception e) {
			Log.logger.debug("查询权限 分页失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 设置权限管理状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setauthoritystatus")
	@ResponseBody
	public String setauthoritystatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setauthoritystatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("设置权限管理状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 批量设置权限管理状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setauthorityliststatus")
	@ResponseBody
	public String setauthorityliststatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setauthorityliststatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("批量设置权限管理状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 修改权限管理
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updateauthority")
	@ResponseBody
	public String updateauthority(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.updateauthority(message, session);
		}catch (Exception e) {
			Log.logger.debug("修改权限管理失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 查询所有角色 分页 模糊查询
	 * @param message
	 * @return
	 */
	@RequestMapping(value="queryrole")
	@ResponseBody
	public String queryrole(String message) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.queryrole(message,9);
		}catch (Exception e) {
			Log.logger.debug("查询所有角色 分页 模糊查询失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 修改角色信息
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updaterole")
	@ResponseBody
	public String updaterole(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.updaterole(message, session);
		}catch (Exception e) {
			Log.logger.debug("修改角色信息失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 查询所有角色
	 * @param message
	 * @return
	 */
	@RequestMapping(value="queryrole1")
	@ResponseBody
	public String queryrole1(String message) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.queryrole(message, null);
		}catch (Exception e) {
			Log.logger.debug("查询所有角色失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 设置角色状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setrolestatus")
	@ResponseBody
	public String setrolestatus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setrolestatus(message, session);
		}catch (Exception e) {
			Log.logger.debug("设置角色状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 批量设置角色状态
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="setrolelistststus")
	@ResponseBody
	public String setrolelistststus(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.setrolelistststus(message, session);
		}catch (Exception e) {
			Log.logger.debug("批量设置角色状态失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 添加角色
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="insertrole")
	@ResponseBody
	public String insertrole(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.insertrole(message, session);
		}catch (Exception e) {
			Log.logger.debug("添加角色失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 添加管理员
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="insertManager")
	@ResponseBody
	public String insertManager(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.insertManager(message, session);
		}catch (Exception e) {
			Log.logger.debug("添加管理员失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
	
	/**
	 * 修改管理员信息
	 * @param message
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updateManager")
	@ResponseBody
	public String updateManager(String message,HttpSession session) {
		JSONObject obj = new JSONObject();
		try {
			System.err.println(message);
			return manager_service.updateManager(message, session);
		}catch (Exception e) {
			Log.logger.debug("修改管理员信息失败！："+e.getMessage());
			obj.put("msg", IMyEnums.FAIL);
			return obj.toString();
		}
	}
}
