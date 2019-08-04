package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 如何出来静态资源
 * 1、src/main/webapp目录下，就可以直接访问
 * 2、默认的静态资源路径是：classpath:[/META-INF/resources/,/resources/,/static/,/public/]
 * 3、可以通过配置项spring.resources.staticLocations修改默认的配置
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
