package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 *
 */
@SpringBootConfiguration
public class MyConfig {
    @Bean
    public Runnable createRunnable(){
        System.out.println("===========1===========");
        return ()->{};
    }

    @Bean
    //这个注解说的是，只有test Profile激活之后才装配createRunnable2
    @Profile("test")
    public Runnable createRunnable2(){
        System.out.println("===========2===========");
        return ()->{};
    }
    @Bean
    //这个注解说的是，只有dev Profile激活之后才装配createRunnable2
    @Profile("dev")
    public Runnable createRunnable3(){
        System.out.println("===========3===========");
        return ()->{};
    }
}
