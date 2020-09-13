package com.hlbrc.movingcompany.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 本系统用到的工具方法
 * @author DELL
 *
 */
public class MyToos {
	public static void main(String[] args) {
		//----------------------------
		//相同个数的
//    	String[] list = {"1","2","3"};
//    	String[] ros = {"3","4","5"};
//    	String[] ros = {"1","2","5"};
//    	String[] ros = {"4","5","6"};
//    	String[] ros = {"1","2","3"};
    	//不同个数  list个数大
//    	String[] list = {"1","2","3"};
//    	String[] ros = {"1","2"};
//    	String[] ros = {"4","1"};
//    	String[] ros = {"4","5"};
    	//不同个数  list个数小
    	String[] list = {"1","2"};
//    	String[] ros = {"1","2","3"};
//    	String[] ros = {"1","4","5"};
    	String[] ros = {"4","5","6"};
    	
//    	System.out.println(new Test().getCJ(list, ros));
    	System.out.println(new MyToos().Bj(list, ros));
    	for(String s:new MyToos().Bj(list, ros).get("1")) {
			System.out.println(s);
		}
    	//----------------------------
//      String format = "yyyy-MM-dd";
//      Date nowTime = new SimpleDateFormat(format).parse("09:27:00");
//      Date startTime = new SimpleDateFormat(format).parse("09:27:00");
//      Date endTime = new SimpleDateFormat(format).parse("09:27:59");
//      System.out.println(isEffectiveDate(nowTime, startTime, endTime));
    	
	}
	/**
	 * 判断两组数，是不变0，新增1还是删除-1
	 * @param orgList 原本的数据
	 * @param lastList 后来的数据
	 * @return
	 */
    public Map<String,Set<String>> Bj(String[] orgList,String[] lastList) {
    	Map<String,Set<String>> map = new HashMap<String,Set<String>>();
    	Set<String> set = getJJ(orgList,lastList);
    	map.put("0", set);//不变的
    	set = getCJ(lastList,orgList);
    	map.put("1", set);//新增的
    	set = getCJ(orgList,lastList);
    	map.put("-1", set);//删除的
    	return map;
    }
    /**
     * 找交集
     * @param orgList 原本的数据
     * @param lastList 后来的数据
     * @return
     */
    public Set<String> getJJ(String[] orgList,String[] lastList) {
    	Set<String> set1 = new HashSet<>();
    	Set<String> set2 = new HashSet<>();
    	for(String org:orgList) {
    		set1.add(org);
    	}
    	for(String org:lastList) {
    		set2.add(org);
    	}
    	set1.retainAll(set2);
    	return set1;
	}
    
    /**
     * 找并集
     * @param orgList 原本的数据
     * @param lastList 后来的数据
     * @return
     */
    public Set<String> getBJ(String[] orgList,String[] lastList) {
    	Set<String> set1 = new HashSet<>();
    	Set<String> set2 = new HashSet<>();
    	for(String org:orgList) {
    		set1.add(org);
    	}
    	for(String org:lastList) {
    		set2.add(org);
    	}
    	set1.addAll(set2);
    	return set1;
	}
    
    /**
     * 找差集(与数学上的差集不同)
     * @param orgList 原本的数据
     * @param lastList 后来的数据
     * @return
     */
    public Set<String> getCJ(String[] orgList,String[] lastList) {
    	Set<String> set1 = new HashSet<>();
    	Set<String> set2 = new HashSet<>();
    	for(String org:orgList) {
    		set1.add(org);
    	}
    	for(String org:lastList) {
    		set2.add(org);
    	}
    	set1.removeAll(set2);
    	return set1;
	}
    
    /**
     * 找数学意义上的差集
     * @param orgList 原本的数据
     * @param lastList 后来的数据
     * @return
     */
    public Set<String> getMathCJ(String[] orgList,String[] lastList) {
    	Set<String> set1 = getBJ(orgList,lastList);
    	Set<String> set2 = getJJ(orgList,lastList);
    	set1.removeAll(set2);
    	return set1;
	}
    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     * 
     * @param nowTime 当前时间
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * @author jqlin
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}
