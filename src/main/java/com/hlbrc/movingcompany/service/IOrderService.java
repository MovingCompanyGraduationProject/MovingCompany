package com.hlbrc.movingcompany.service;

import java.text.ParseException;

public interface IOrderService {
	/**
	 * 查看所有订单 模糊查询 分页
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String queryAllOrderForm(String message) throws ParseException;
	/**
	 * 添加订单
	 * @param message
	 * @return
	 * @throws ParseException 
	 */
	public String insertOrderForm(String message) throws ParseException;
	/**
	 * 删除订单
	 * @param message
	 * @return
	 */
	public String deleteOrderForm(String message);
	/**
	 * 批量删除订单
	 * @param message
	 * @return
	 */
	public String deleteListOrderForm(String message);
}
