package com.hlbrc.movingcompany.util;

import java.util.Calendar;

/**
 * ʱ�䴦��
 * @author DELL
 *
 */
public class Time {
	static Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
	public static void main(String[] args) {
		System.out.println( Getyear() + "/" + Getmonth() + "/" + Getday() + " " +Gettime()); 
//		String sfz="152327199905250023";
//		sfz.substring(6,9);
//		System.out.println(sfz.substring(16,17));
	}
	public static int Getyear() {
		return c.get(Calendar.YEAR); 
	}
	public static String Getmonth() {
		String m=c.get(Calendar.MONTH)+1+"";
		if(m.length()==1)
			m="0"+m;
		return m;
	}
	public static String Getday() {
		String d=c.get(Calendar.DATE)+"";
		if(d.length()==1)
			d="0"+d;
		return d;
		
	}
	public static String Gettime() {
		int hour = c.get(Calendar.HOUR_OF_DAY); 
		int minute = c.get(Calendar.MINUTE); 
		int second = c.get(Calendar.SECOND); 
		return hour + ":" +minute + ":" + second;
	}
	
	
}


