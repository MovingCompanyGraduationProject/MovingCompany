package com.hlbrc.movingcompany.service;

public interface IMainService {
	/**
	 * 添加留言
	 * @param message
	 * @return
	 */
	public String insertLeaveMessage(String message);
	/**
	 * 查看所有留言
	 * @return
	 */
	public String queryAllLeaveMessage();
	/**
	 * 预约搬家
	 * @param message
	 */
	public String insertAppointment(String message);
	/**
	 * 查看所有服务分类
	 * @return
	 */
	public String queryAllServiceType();
}
