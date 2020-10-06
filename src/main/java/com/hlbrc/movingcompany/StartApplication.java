package com.hlbrc.movingcompany;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.DispatcherServlet;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.hlbrc.movingcompany.*")
@MapperScan("com.hlbrc.movingcompany.mapper")//之前我们使用xml文件写sql语句，而我们现在使用注解，所以需要添加mapper注解扫描
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		String str = "<li class=\"d-flex align-items-center procontent py-3 border-bottom\">\r\n" + 
				"						<a href=\"jishipei.html\"><img src=\"images/0e6aec8424f138014e69ec57b9e024b5.jpeg\" alt class=\"pro-img\"></a>\r\n" + 
				"						<div class=\"pro-content\">\r\n" + 
				"							<h5><a href=\"jishipei.html\" class=\"text-dark\">北京计时配搬家公司</a></h5>\r\n" + 
				"							<p class=\"font-size-14\">北京-北京-顺义 </p>\r\n" + 
				"							<p class=\"pro-desc\">北京计时配搬家介绍：服务是一家正规的搬家公司，首先北京记时配拥有专业的搬家货运团队和丰富的搬家操作经验，我们主要服务北京全城；其次北京计时配目前有600余辆车，15种车型，1000余名专业人员，实力证明一切，用服务说话，北京记时配实现专人专车专配，保障货物安全无忧，是北京每一位搬家朋友选择正规搬家公...</p>\r\n" + 
				"							<p class=\"tags\"> <span>会员1年</span><span>企业认证</span> </p>\r\n" + 
				"						</div>\r\n" + 
				"						<a class=\"ml-4 \" href=\"jishipei.html\">\r\n" + 
				"							<img src=\"images/p5_tel.png\" class=\"pro-telimg \" style=\"width: 100px\">\r\n" + 
				"						</a>\r\n" + 
				"					</li>";
	}
    /**
     * 设置匹配*.action后缀请求
     * @param dispatcherServlet
     * @return
     */
    @Bean
    public ServletRegistrationBean<DispatcherServlet> servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
        servletServletRegistrationBean.addUrlMappings("*.do");
        servletServletRegistrationBean.addUrlMappings("*.css");
        servletServletRegistrationBean.addUrlMappings("*.js");
        servletServletRegistrationBean.addUrlMappings("*.png");
        servletServletRegistrationBean.addUrlMappings("*.gif");
        servletServletRegistrationBean.addUrlMappings("*.ico");
        servletServletRegistrationBean.addUrlMappings("*.jpeg");
        servletServletRegistrationBean.addUrlMappings("*.jpg");
        return servletServletRegistrationBean;
    }
	 /**
	  * 配置mybatis的分页插件pageHelper
	  * @return
	  */
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
