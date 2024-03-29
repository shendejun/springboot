package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.logging.Filter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//获取application.properties配置方法①
//		System.out.println(context.getEnvironment().getProperty("local.ip"));
		//获取application.properties配置方法②
		context.getBean(UserConfig.class).show();
		context.getBean(FileConfig.class).show();
		context.getBean(DataSourceProperties.class).show();
		context.close();
	}

}
