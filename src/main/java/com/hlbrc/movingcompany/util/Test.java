package com.hlbrc.movingcompany.util;

import java.text.ParseException;

import com.hlbrc.movingcompany.enums.IMyEnums;

public class Test {
    public static void main(String[] args) throws ParseException {
//    	System.out.println(new Timestamp(new Date().getTime()).toString());
    	String s = ""+IMyEnums.ADDRESS_DEL;
    	System.out.println(Integer.parseInt(s));
    }
    
}