package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Import 用来导入一个或多个类（会被spring容器托管），或者配置类（配置类里面的bean都会被spring容器托管）
 * 其实Enable** 就是Import了一个类 (未测试)
 */
@ComponentScan
//@Import({User.class,Role.class,MyConfiguration.class})
//@EnableAsync
@EnableLog(name = "my springboot")
public class DemoApplication2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication2.class, args);
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBeansOfType(Runnable.class));

		context.close();
	}
}
