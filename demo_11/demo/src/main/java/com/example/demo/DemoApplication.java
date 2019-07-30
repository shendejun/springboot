package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、自定义事件，一般是继承ApplicationEvent抽象类
 * 2、定义事件监听器，一般是实现applicationListener接口
 * 3、启动的时候，需要把监听器加入到spring容器中
 * 4、发布事件，使用ApplicationContext.publishEvent发布事件
 *
 * 配置监听器
 * 1、SpringApplication.addListeners 添加监听器
 * 2、把监听器纳入到spring容器中管理起来 @Component
 * 3、使用context.listener.classes配置项配置
 * 4、使用注解@EventListener，在方法上面加入@EventListener注解，且该类需要纳入到spring容器中管理
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        //把监听器加入到spring容器中
//        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = app.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()) );
        context.close();
    }

}
