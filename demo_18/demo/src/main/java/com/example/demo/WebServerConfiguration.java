package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.TomcatServletWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * 版本太高，很多名称不一致，未测试。教程已截图
 */
//@SpringBootConfiguration
public class WebServerConfiguration {
//    @Bean
    public WebServerFactoryCustomizer creatWebServerFactoryCustomizer(){
        WebServerFactory factory = new TomcatServletWebServerFactory();
//        factory.setPort(8081);
//        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
//        return factory;
        return null;
    }
}
