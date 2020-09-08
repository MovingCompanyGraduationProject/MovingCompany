package com.hlbrc.movingcompany.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * SpringBoot默认的Locale解析器是根据请求头的区域信息进行解析的（浏览器语言）
 * 使用自定义的Locale解析器对url的区域信息进行解析达到点击切换区域效果
 * 一旦我们自定义的区域解析器注册到Spring容器中，则SpringBoot提供的将不自动注册
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l = httpServletRequest.getParameter("locale");
        if(!StringUtils.isEmpty((l))){
            String [] s = l.split("_");
            System.err.println(new Locale(s[0],s[1]));
            return new Locale(s[0],s[1]);
        }
        return Locale.getDefault();
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
    	
    }
}