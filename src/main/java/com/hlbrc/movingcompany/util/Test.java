package com.hlbrc.movingcompany.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hlbrc.movingcompany.entity.City;

import net.sf.json.JSONObject;

public class Test {
	@Value("${file.uploadFolder}")
    private String uploadFolder;
	
    public static void main(String[] args) throws ParseException {
//    	System.out.println(new Timestamp(new Date().getTime()).toString());
//    	String s = ""+IMyEnums.ADDRESS_DEL;
//    	System.out.println(Integer.parseInt(s));
    	
//    	City city = new City();
//    	city.setCitid(123);
//    	city.setCitname("哈的空间");
//    	city.setProid("qweqw");
//    	City city1 = new City();
//    	city1.setCitid(123);
//    	city1.setCitname("哈的空间");
//    	city1.setProid("qweqw");
//    	List<City> list = new ArrayList<City>();
//    	list.add(city);
//    	list.add(city1);
//    	JSONObject obj = new JSONObject();
//    	obj.accumulate("msg", "ok");
//    	obj.accumulate("city", list.get(0));
//    	System.out.println(obj.toString());
//    	
    	String str = "<li class=\"py-2 border-top\"> \r\n" + 
    			"						<a href=\"https://bj.qgbjvip.com/article/4876.html\" title=\"北京西城区搬家哪个好？\" target=\"_blank\" class=\"text-dark position-relative d-flex align-items-center pr-2\"> \r\n" + 
    			"							<span></span> 北京西城区搬家哪个好？ \r\n" + 
    			"							<img src=\"images/home_right.png\" alt=\"北京西城区搬家哪个好？\" class=\"index-news-ul-rightimg position-absolute\">\r\n" + 
    			"						</a> \r\n" + 
    			"					</li>";
    	String messge = "{\"words_result\":{\"姓名\":{\"words\":\"张宇\",\"location\":{\"top\":1019,\"left\":365,\"width\":80,\"height\":31}},\"民族\":{\"words\":\"汉\",\"location\":{\"top\":1082,\"left\":547,\"width\":20,\"height\":24}},\"住址\":{\"words\":\"内蒙古武川县哈乐镇东苏计村A7号\",\"location\":{\"top\":1197,\"left\":356,\"width\":320,\"height\":71}},\"公民身份号码\":{\"words\":\"150125199712171219\",\"location\":{\"top\":1351,\"left\":532,\"width\":416,\"height\":40}},\"出生\":{\"words\":\"19971217\",\"location\":{\"top\":1137,\"left\":362,\"width\":302,\"height\":31}},\"性别\":{\"words\":\"男\",\"location\":{\"top\":1082,\"left\":360,\"width\":26,\"height\":26}}},\"log_id\":1313077723043725312,\"words_result_num\":6,\"idcard_number_type\":1,\"image_status\":\"normal\"}\r\n";
    	JSONObject obj = JSONObject.fromObject(messge);
    	String name = obj.getJSONObject("words_result").getJSONObject("姓名").getString("words");
		String idnumber = obj.getJSONObject("words_result").getJSONObject("公民身份号码").getString("words");
		System.err.println(name+" "+idnumber);
    }
    
}