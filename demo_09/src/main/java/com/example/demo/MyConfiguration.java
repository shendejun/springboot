package com.example.demo;

import org.springframework.context.annotation.Bean;

/**
 *
 */
public class MyConfiguration {
    @Bean
    public Runnable creatRunnable(){
        return ()->{};
    }
    @Bean
    public Runnable creatRunnable2(){
        return ()->{};
    }
}
