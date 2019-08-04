package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

/**
 * 两种定制tomcat容器的方法
 * 1、实现WebServerFactoryCustomizer接口，并把实现类纳入到spring容器中管理
 * 2、在spring容器中装配一个EmbeddedServletContainerCustomizer对象（但没找找到这个类，未测试）
 */
@SpringBootApplication
public class  DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
