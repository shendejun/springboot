package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 更换web容器
 * springboot web 默认使用tomcat做为web容器
 * 步骤：
 * 1、排查tomcat依赖
 * 2、加入jetty依赖
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
