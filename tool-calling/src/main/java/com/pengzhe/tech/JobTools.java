package com.pengzhe.tech;

import org.springframework.ai.tool.annotation.Tool;

/**
 * @create 2025-07-31 20:39
 * @Description TODO
 */
public class JobTools {

    @Tool(description = "彭哲工作", returnDirect = false)
    public String getPengZheJob() {
        return "彭哲的工作是程序员";
    }
}