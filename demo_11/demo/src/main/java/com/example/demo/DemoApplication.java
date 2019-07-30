package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
