package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 通过启动参数来控制生效的 profile
 * --spring.profiles.active=test
 * 多个
 * --spring.profiles.active=test,dev
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);


        SpringApplication app = new SpringApplication(DemoApplication.class);
        //编码的方式制定生效的profile
        app.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = app.run(args);

        System.out.println(context.getEnvironment().getProperty("jdbc.username"));
        System.out.println(context.getEnvironment().getProperty("jdbc.password"));
        System.out.println(context.getEnvironment().getProperty("springboot.name"));

        System.out.println(context.getEnvironment().getProperty("config"));
        System.out.println(context.getBean(TomcatProperties.class));
        context.close();

    }

}
