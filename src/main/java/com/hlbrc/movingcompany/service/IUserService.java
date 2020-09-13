package com.hlbrc.movingcompany.service;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

public interface IUserService {
	/**
	 * 用户登录
	 * @param message
	 * @return
	 */
	public String userlogin(String message, HttpSession session);
	/**
	 * 查看所有用户信息
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryuser(String message) throws ParseException;
	/**
	 * 根据用户id，查看用户信息
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryuserById(String message);
	/**
	 * 根据用户邮箱，查看用户信息
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryuserByTel(String message);
	/**
	 * 根据用户手机号，查看用户信息
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryuserByEmail(String message);
	/**
	 * 查看除用户状态为未删除状态的用户
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String querynotdeluser(String message) throws ParseException;
	/**
	 * 查看已删除状态的用户
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String querydeluser(String message) throws ParseException;
	/**
	 * 用户添加 校验手机号是否存在
	 * @param message
	 * @return
	 */
	public String insertuser(String message, HttpSession session);
	/**
	 * 用户修改密码
	 * @param message
	 * @return
	 */
	public String updateuserpassword(String message, HttpSession session);
	/**
	 * 用户修改信息
	 * @param message
	 * @return
	 */
	public String updateuser(String message, HttpSession session);
	/**
	 * 修改用户状态
	 * @param message
	 * @return
	 */
	public String updateuserstatus(String message, HttpSession session);
	/**
	 * 批量改变用户状态
	 * @param message
	 * @return
	 */
	public String updateuserliststatus(String message, HttpSession session);
	
	
}
