package com.example.demo;

import com.example.demo.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Aop开发流程
 * 1、spring-boot-starter-aop加入依赖，默认开启了AOP的支持
 * 2、写一个Aspect,封装横切关注点（日志，监控等等），需要配置通知（前置条件，后置通知等）和切入点（哪些包的哪些类的哪些方法等等）
 * 3、这个Aspect需要纳入到spring容器管理，并且加入@Aspect注解
 *
 * spring.aop.auto配置项决定是否启用AOP，默认启用
 * spring.aop.proxy-target-class 默认是使用基于JDK的动态代理来实现AOP，设置为true表示使用cglib（建议设置为true）
 * 如果配置了false，而类没有接口，则依然使用cglib
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        context.getBean(UserDao.class).add("admin","123");
        context.close();
    }
}
