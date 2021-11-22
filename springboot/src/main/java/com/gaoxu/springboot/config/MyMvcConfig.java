package com.gaoxu.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全面扩展配置SpringMVC
 * @author GAOXU
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    /**
     * 试图跳转
     * 所有css,js,images等等都调到static路径下,其他的都跳到templates下
     * @Override： 可以检查你所重写的类
     * @param registry
     @Override
     public void addResourceHandlers(ResourceHandlerRegistry registry) {
     registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
     registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
     }*/

    /**
     * 配置拦截器
     * @param registry
     @Override
     public void addInterceptors(InterceptorRegistry registry) {
     registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index", "/", "login");
     }*/
}
