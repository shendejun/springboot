package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springboot 如何出来静态资源
 * 1、src/main/webapp目录下，就可以直接访问
 * 2、默认的静态资源路径是：classpath:[/META-INF/resources/,/resources/,/static/,/public/]
 * 3、可以通过配置项spring.resources.staticLocations修改默认的配置
 *
 * springboot 中使用servlet的api
 * 方法一(servlet3可以使用这种方法)
 * 1、编写servlet，然后加上对应的注解，如：@WebServlet，@WebListener，@WebFilter
 * 2、需要启动ServletComponentScan注解
 *
 * 方法二（servlet2.5及以下版本可以使用这种版本）
 * 1、编写servlet
 * 2、装配相应的bean到spring容器中
 * servlet --> ServletRegistrationBean
 * filter --> FilterRegistrationBean
 * listener --> ServletListenerRegistrationBean
 *
 */
//@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
