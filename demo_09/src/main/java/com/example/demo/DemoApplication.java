package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @EnableConfigurationProperties 是是用来启用一个特性的，这个特性就是，可以把配置文件的属性注入到bean里面,
 *                                一般要和ConfigurationProperties一起使用
 * @EnableAsync 启用异步，一般是和@Async一起使用
 * 未测试
 *
 */
@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan
@EnableAsync
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getBean(TomcatProperties.class));
		context.getBean(Runnable.class).run();
		System.out.println("----------------------end----------------");
		context.close();
	}

}
