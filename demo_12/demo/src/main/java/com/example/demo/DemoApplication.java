package com.example.demo;

import javafx.application.Application;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
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
 *
 *
 * CommandLineRunner 接口是在容器启动成功后最后一次回调
 * 使用步骤：
 * 1、写一个类，实现CommandLineRunner接口
 * 2、把该类纳入spring容器管理中
 * 注意：可以通过@order注解或者oredered来控制执行顺序。
 *
 * ApplicationRunner和CommandLineRunner区别在于方法的参数不一样
 * CommandLineRunner的参数是最原始的参数，没有做任何处理
 * ApplicationRunner的参数是ApplicationArguments，是对原始参数进一步的封装
 *
 * ApplicationArguments是对参数（main方法）做了进一步的处理
 * 可以解析--name=value的，我们就可以通过name来获取value
 */

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        //注册ApplicationContextInitializer
//        app.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = app.run(args);
        ApplicationArguments arguments = context.getBean(ApplicationArguments.class);
        System.out.println(arguments.getOptionNames());
        context.close();

    }

}
