package com.hlbrc.movingcompany.service;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

public interface IManagerService {
	/**
	 * 管理员登录
	 * @param message
	 * @return
	 */
	public String managerlogin(String message, HttpSession session);
	/**
	 * 显示所有管理员（模糊查询）
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryManager(String message) throws ParseException;
	/**
	 * 显示所有角色（模糊查询）
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryrole(String message,Integer psize) throws ParseException;
	/**
	 * 显示所有权限分类（模糊查询）
	 * @param message
	 * @return
	 */
	public String queryauthoritytype(String message,Integer psize);
	/**
	 * 显示所有权限（模糊查询）
	 * @param message
	 * @return
	 */
	public String queryauthority(String message,Integer psize);
	/**
	 * 显示角色权限对应表
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryroleandrule(String message) throws ParseException;
	/**
	 * 添加管理员 校验电话号是否存在
	 * @param message
	 * @return
	 */
	public String insertManager(String message, HttpSession session);
	/**
	 * 添加角色 校验角色名称是否存在
	 * @param message 
	 * @return
	 */
	public String insertrole(String message, HttpSession session);
	/**
	 * 添加权限分类 校验权限分类名称是否存在
	 * @param message
	 * @return
	 */
	public String insertauthoritytype(String message, HttpSession session);
	/**
	 * 添加权限 校验权限名称是否存在
	 * @param message
	 * @return
	 */
	public String insertauthority(String message, HttpSession session);
	/**
	 * 添加角色权限对应表
	 * @param message
	 * @return
	 */
	public String insertroleandrule(String message, HttpSession session);
	/**
	 * 修改管理员信息
	 * @param message
	 * @return
	 */
	public String updateManager(String message, HttpSession session);
	/**
	 * 修改角色
	 * @param message
	 * @return
	 */
	public String updaterole(String message, HttpSession session);
	/**
	 * 修改权限分类
	 * @param message
	 * @return
	 */
	public String updateauthoritytype(String message, HttpSession session);
	/**
	 * 修改权限
	 * @param message
	 * @return
	 */
	public String updateauthority(String message, HttpSession session);
	/**
	 * 修改角色权限对应表
	 * @param message
	 * @return
	 */
	public String updateroleandrule(String message, HttpSession session);
	/**
	 * 改变管理员状态
	 * @param message
	 * @return
	 */
	public String setManagerstatus(String message, HttpSession session);
	/**
	 * 改变角色状态
	 * @param message
	 * @return
	 */
	public String setrolestatus(String message, HttpSession session);
	/**
	 * 改变权限分类状态
	 * @param message
	 * @return
	 */
	public String setauthoritytypestatus(String message, HttpSession session);
	/**
	 * 改变权限状态
	 * @param message
	 * @return
	 */
	public String setauthoritystatus(String message, HttpSession session);
	/**
	 * 改变角色权限对应表状态
	 * @param message
	 * @return
	 */
	public String setroleandrulestatus(String message, HttpSession session);
	/**
	 * 批量改变管理员状态
	 * @param message
	 * @return
	 */
	public String setManagerliststatus(String message, HttpSession session);
	/**
	 * 批量改变角色状态
	 * @param message
	 * @return
	 */
	public String setrolelistststus(String message, HttpSession session);
	/**
	 * 批量改变权限分类状态
	 * @param message
	 * @return
	 */
	public String setauthoritytypeliststatus(String message, HttpSession session);
	/**
	 * 批量改变权限状态
	 * @param message
	 * @return
	 */
	public String setauthorityliststatus(String message, HttpSession session);
	/**
	 * 批量改变角色权限对应表状态
	 * @param message
	 * @return
	 */
	public String setroleandruleliststatus(String message, HttpSession session);
	/**
	 * 根据管理员id查看管理员信息
	 * @param message
	 * @return
	 * @throws ParseException
	 */
	public String queryManagerById(String message);
	/**
	 * 根据管理员电话查看管理员信息
	 * @param message
	 * @return
	 */
	public String queryManagerByTel(String message);
	/**
	 * 根据管理员邮箱查看管理员信息
	 * @param message
	 * @return
	 */
	public String queryManagerByEmail(String message);
	/**
	 * 根据角色id查看角色信息
	 * @param message
	 * @return
	 */
	public String queryroleById(String message);
	/**
	 * 根据权限分类id查看权限分类信息
	 * @param message
	 * @return
	 */
	public String queryauthoritytypeById(String message);
	/**
	 * 根据权限id查看权限信息
	 * @param message
	 * @return
	 */
	public String queryauthorityById(String message);
	
}
