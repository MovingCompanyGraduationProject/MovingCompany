package com.hlbrc.movingcompany.service;

import java.io.IOException;

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
	/**
	  * 延时校验营业执照
	 * @param message json串
	 */
	public void checkBusinessLicense(String message);
	/**
	 * 添加搬家公司
	 * @param message json串
	 * @param frontEndPath 前端项目路径
	 * @throws IOException 
	 */
	public String insertMovingCompany(String message,String frontEndPath) throws IOException;
}
