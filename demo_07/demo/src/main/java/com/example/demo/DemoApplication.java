package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context.getEnvironment().getProperty("jdbc.username"));
        System.out.println(context.getEnvironment().getProperty("jdbc.password"));
        System.out.println(context.getBean(TomcatProperties.class));
        context.close();

    }

}
