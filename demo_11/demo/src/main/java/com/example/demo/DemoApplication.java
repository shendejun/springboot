package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、自定义事件，一般是继承ApplicationEvent抽象类
 * 2、定义事件监听器，一般是实现applicationListener接口
 * 3、发布事件，使用ApplicationContext.publishEvent发布事件
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = app.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()) );
        context.close();
    }

}
