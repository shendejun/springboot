package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * 自定义
 */
//这个标签Component是把MyEnvironmentPostProcessor纳入到spring容器中管理起来
@Component
public class MyEnvironmentPostProcessor  implements EnvironmentPostProcessor{

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {



        Properties source = new Properties();
        PropertiesPropertySource propertySource = new PropertiesPropertySource("my",source);
        environment.getPropertySources().addLast(propertySource);
    }
}
