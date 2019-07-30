package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ApplicationContextInitializer 接口是在spring容器执行refreshed之前的一个回调
 * 使用步骤：
 * 1、写一个类，实现ApplicationContextInitializer接口
 * 2、注册ApplicationContextInitializer
 *
 * 注册方法：
 * 1、SpringApplication.addInitalizers
 * 2、使用配置项context.initializer.classes，可配置多个
 * 3、可以通过spring.factories机制（注册listener监听器也可以使用这种方式）
 *   新建项目A
 *   建立一个类实现ApplicationContextInitializer
 *   配置spring.factories
 *   把项目A引入到pom中
 */

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        //注册ApplicationContextInitializer
//        app.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = app.run(args);
        context.close();

    }

}
