package com.luckyone.luckyapiinterface.config;

import com.luckyone.luckyapiinterface.interceptor.DyeDataInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DyeDataInterceptor())
                .addPathPatterns("/**");
    }
}
