package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 *
 */
@SpringBootConfiguration
public class UserConfiguration {

    @Bean
    //ConditionalOnProperty 根据属性进行装配,matchIfMissing配置不存在的时候默认装配
    @ConditionalOnProperty(name = "runnable.enabled",havingValue = "true",matchIfMissing = true)
    public Runnable createRunnable(){
        return ()->{};
    }

    /**
     * ConditionalOnClass存在某个类的时候进行装配
     * ConditionalOnMissingClass 不存在
     * @return
     */
    @Bean
    @ConditionalOnClass(name = "com.google.gson.Gson")
    public Runnable createGsonRunnable(){
        System.out.println("----------------------com.google.gson.Gson----------------------");
        return ()->{};
    }

    /**
     * ConditionalOnBean根据容器中存在某个bean进行装配 name小写？
     * ConditionalOnMissingBean 不存在某个bean进行装配
     * @return
     */
    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable createBeanRunnable(){
        System.out.println("----------------------user----------------------");
        return ()->{};
    }

}
