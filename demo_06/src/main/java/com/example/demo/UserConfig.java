package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

    //获取application.properties配置方法③
    @Value("${local.port}")
    //还会自动转换成整数
    private Integer localPort;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println("local.ip="+environment.getProperty("local.ip"));
        System.out.println("local.port="+localPort);
    }


}
