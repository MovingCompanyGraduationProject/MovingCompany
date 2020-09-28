package com.hlbrc.movingcompany.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.hlbrc.movingcompany.entity.City;

import net.sf.json.JSONObject;

public class Test {
    public static void main(String[] args) throws ParseException {
//    	System.out.println(new Timestamp(new Date().getTime()).toString());
//    	String s = ""+IMyEnums.ADDRESS_DEL;
//    	System.out.println(Integer.parseInt(s));
    	City city = new City();
    	city.setCitid(123);
    	city.setCitname("哈的空间");
    	city.setProid("qweqw");
    	City city1 = new City();
    	city1.setCitid(123);
    	city1.setCitname("哈的空间");
    	city1.setProid("qweqw");
    	List<City> list = new ArrayList<City>();
    	list.add(city);
    	list.add(city1);
    	JSONObject obj = new JSONObject();
    	obj.accumulate("msg", "ok");
    	obj.accumulate("city", list.get(0));
    	System.out.println(obj.toString());
    }
    
}