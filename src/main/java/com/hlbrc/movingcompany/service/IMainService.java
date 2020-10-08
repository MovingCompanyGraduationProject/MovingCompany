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
	public void checkBusinessLicense(String message,String uploadFolder);
	/**
	 * 添加搬家公司
	 * @param message json串
	 * @param frontEndPath 前端项目路径
	 * @throws IOException 
	 */
	public String insertMovingCompany(String message,String frontEndPath) throws IOException;
	/**
	 * 查询符合条件的搬家公司
	 * @param message
	 * @return
	 * @throws IOException 
	 */
	public String queryMovingCompany(String message) throws IOException;
	/**
	 * 添加评价表
	 * @throws IOException 
	 */
	public String insertMovingCompanyAppraise(String message,String frontEndPath) throws IOException;
	/**
	 * 添加留言
	 * @param message
	 * @return
	 */
	public String insertInform(String message,String frontEndPath) throws IOException;
}
