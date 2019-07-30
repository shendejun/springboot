package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableAutoConfiguration 作用：从class中搜索所有META-INF/spring.factories配置文件
 * 然后，将其中org.springframework.boot.autoconfigure.EnableAutoConfiguration key对应的配置项加载到spring容器
 * 需要在pom文件中添加包引用
 *
 * 
 */
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {

    /**
     * springboot入口，启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        ConfigurableApplicationContext context = app.run(args);
        System.out.println(context.getBean(Runnable.class));
        context.close();
    }

}
