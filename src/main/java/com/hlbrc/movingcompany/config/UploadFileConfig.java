package com.hlbrc.movingcompany.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Configuration
public class UploadFileConfig {

    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Bean
    MultipartConfigElement multipartConfigElement(){
    	 MultipartConfigFactory factory = new MultipartConfigFactory();
         //文件最大10M,DataUnit提供5中类型B,KB,MB,GB,TB
         factory.setMaxFileSize(DataSize.of(10, DataUnit.MEGABYTES));
         // 设置总上传数据总大小10M
         factory.setMaxRequestSize(DataSize.of(10, DataUnit.MEGABYTES));
         return factory.createMultipartConfig();
    }
}
