package com.hlbrc.movingcompany.service;

public interface IAddressService {
	/**
	 * 获取省市
	 * @param disid
	 */
	public String getProCity(String disid);
	/**
	 * 获取省区
	 * @param disid
	 */
	public String getProDis(String disid);
	/**
	 * 获取省市区
	 * @param disid
	 */
	public String getProCityDis(String disid);
	/**
	 * 获取市区
	 * @param disid
	 */
	public String getCityDis(String disid);
	/**
	 * 获取省
	 * @param disid
	 */
	public String getPro(String disid);
	/**
	 * 获取市
	 * @param disid
	 */
	public String getCity(String disid);
	/**
	 * 获取区
	 * @param disid
	 */
	public String getDis(String disid);
	/**
	 * 获取所有省 初始化
	 * @return
	 */
	public String getAllPro();
	/**
	 * 通过省id获取所有市区
	 * @return
	 */
	public String getAllCityByProId(String message);
	/**
	 * 通过市id获取所有区
	 * @return
	 */
	public String getAllDisByCityId(String message);
}
