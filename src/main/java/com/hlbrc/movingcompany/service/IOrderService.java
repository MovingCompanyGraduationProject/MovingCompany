package com.hlbrc.movingcompany.service;

import java.text.ParseException;

public interface IOrderService {
	/**
	 * 查看所有订单
	 * @return
	 */
	public String queryAllOrderForm();
	/**
	 * 添加订单
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String insertOrderForm(String message) throws ParseException;
	//改变订单状态
	//批量改变订单状态
	//模糊查询
	//分页
}
