package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
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
}
