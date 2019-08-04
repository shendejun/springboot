package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.server.ErrorPageRegistrar;

/**
 * 拦截器的使用
 * 1、写一个拦截器，实现HandlerInterceptor接口
 * 2、写一个类，继承WebMvcConfigurerAdapter抽象类，重写addInterceptors方法，把上一步的拦截器加进去
 *
 * HandlerInterceptor接口
 * preHandle:controller执行之前调用
 * postHandle:controller执行之后，且页面渲染之前调用
 * afterCompletion:页面渲染之后调用，一般用于资源的清理
 *
 * 异常处理
 * 如何去掉springboot默认的异常处理
 * @SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
 *
 * 使用ErrorPageRegistrar方法
 * 写一个类，实现ErrorPageRegistrar接口，然后实现registerErrorPages方法，在方法里添加具体的处理逻辑(类似web.xml里面配置的处理方式)
 *
 * 全局异常处理步骤
 * 1、写一个类，需要加上ControllerAdvice注解
 * 2、写一个异常处理方法，方法上面需要机上@ExceptionHandler(value = Exception.class)这个注解，在该方法里面处理异常
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
