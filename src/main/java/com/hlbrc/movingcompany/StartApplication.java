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
		String str = "<table  class=\"layui-table layui-input-block\">\r\n" + 
				"                        <tbody>\r\n" + 
				"                            <tr>\r\n" + 
				"                                <td>\r\n" + 
				"                                    用户管理\r\n" + 
				"                                    <input name=\"id[]\" type=\"checkbox\" value=\"2\">\r\n" + 
				"                                </td>\r\n" + 
				"                                <td>\r\n" + 
				"                                    <div class=\"layui-input-block\">\r\n" + 
				"                                        <input name=\"id[]\" type=\"checkbox\" value=\"2\"> 用户停用\r\n" + 
				"                                        <input name=\"id[]\" type=\"checkbox\" value=\"2\"> 用户删除\r\n" + 
				"                                        <input name=\"id[]\" type=\"checkbox\" value=\"2\"> 用户修改\r\n" + 
				"                                        <input name=\"id[]\" type=\"checkbox\" value=\"2\"> 用户改密\r\n" + 
				"                                        <input name=\"id[]\" type=\"checkbox\" value=\"2\"> 用户列表\r\n" + 
				"                                    </div>\r\n" + 
				"                                </td>\r\n" + 
				"                            </tr>\r\n" + 
				"                        </tbody>\r\n" + 
				"                    </table>";
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
