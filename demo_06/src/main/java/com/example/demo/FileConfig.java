package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 */
@Configuration
@PropertySource("jdbc.properties")
public class FileConfig {

    @Value("${url}")
    private String url;
    @Value("${driverClassName}")
    private String driverClassName;

    public void show(){
        System.out.println("url="+url);
        System.out.println("driverClassName="+driverClassName);
    }
}
