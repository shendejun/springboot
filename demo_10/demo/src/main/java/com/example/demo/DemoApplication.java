package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.User;

/**
 * @EnableAutoConfiguration 作用：从class中搜索所有META-INF/spring.factories配置文件
 * 然后，将其中org.springframework.boot.autoconfigure.EnableAutoConfiguration key对应的配置项加载到spring容器
 * 需要在pom文件中添加包引用
 *
 * 只有spring.boot.enableautoconfiguration为ture（默认为true）的时候，才启用自动配置
 * @EnableAutoConfiguration 还可以进行删除，排查方式有两种，一种是根据class来排查 @EnableAutoConfiguration(exclude = User.class)
 * 一种是根据类名来排查 @EnableAutoConfiguration(excludeName = "com.example.User")
 *
 * 其内部实现的关键点有：
 * 1、ImportSelector 该接口的方法返回值部分会被纳入到spring容器中
 * 2、springFactoriesLoader该类可以从classpath中搜索所有META-INF/spring.factories配置文件，并读取配置
 */
@EnableAutoConfiguration(excludeName = "com.example.User")
@ComponentScan
public class DemoApplication {

    /**
     * springboot入口，启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        ConfigurableApplicationContext context = app.run(args);
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean(User.class));
        context.close();

    }

}
