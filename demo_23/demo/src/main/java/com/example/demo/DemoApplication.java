package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义系统健康状态监测,实现HealthIndicator类并纳入到spring容器的管理之中
 *
 * 可以自定义一些信息，如git.properties
 *
 * jdk的工具来查看监控
 * jconsole.exe,Java Mission Control(即jmc)，jvisualvm.exe（需要单独安装插件）
 * 在C:\Program Files\Java\jdk1.8.0_181\bin 路径下
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
    }

}
