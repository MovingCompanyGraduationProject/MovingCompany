package com.hlbrc.movingcompany.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {
        pathMatchConfigurer.setUseSuffixPatternMatch(false);
        pathMatchConfigurer.setUseRegisteredSuffixPatternMatch(true);
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }
    
    //注册我们自定义的区域解析器，一旦将我们的区域解析器注册到Spring容器中则SpingBoot
    //默认提供的区域解析器将不会自动注册
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
