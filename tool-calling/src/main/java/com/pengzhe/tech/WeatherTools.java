package com.pengzhe.tech;

import org.springframework.ai.tool.annotation.Tool;

import java.time.LocalDateTime;

/**
 * @create 2025-07-31 20:39
 * @Description TODO
 */
public class WeatherTools {

    @Tool(description = "获取当前天气", returnDirect = false)
    public String getCurrentWeather() {
        return "今天天气是阴天";
    }
}