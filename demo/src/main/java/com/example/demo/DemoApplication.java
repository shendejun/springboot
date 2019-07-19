package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public Runnable createRunnable(){
        return ()->{System.out.println("spring boot is run");};
    }

    public static void main(String[] args) {
        //静态方法
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //这种写法也行
        //SpringApplication app = new SpringApplication(DemoApplication.class);
        //ConfigurableApplicationContext context = app.run(args);


        context.getBean(Runnable.class).run();
        System.out.println( context.getBean(User.class));

        System.out.println(context.getBean(List.class));
    }
}
