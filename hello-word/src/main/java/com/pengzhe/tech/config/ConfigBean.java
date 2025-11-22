package com.pengzhe.tech.config;

import com.alibaba.cloud.ai.dashscope.api.DashScopeApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public DashScopeApi dashScopeApi() {
        return DashScopeApi.builder().apiKey("sk-4baafe3feb254b13bb9ef4b750e0bb1d").build();
    }

}
