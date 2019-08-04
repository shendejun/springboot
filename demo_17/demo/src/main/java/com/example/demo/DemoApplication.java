package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 拦截器的使用
 * 1、写一个拦截器，实现HandlerInterceptor接口
 * 2、写一个类，继承WebMvcConfigurerAdapter抽象类，重写addInterceptors方法，把上一步的拦截器加进去
 *
 * HandlerInterceptor接口
 * preHandle:controller执行之前调用
 * postHandle:controller执行之后，且页面渲染之前调用
 * afterCompletion:页面渲染之后调用，一般用于资源的清理
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
