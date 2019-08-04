package com.example.demo.servlet;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootConfiguration
public class ServletConfiguration {
    @Bean
    public ServletRegistrationBean createBookServlet(){
        ServletRegistrationBean servlet = new ServletRegistrationBean(new BookServlet(),"/book.do");
        return servlet;
    }

    @Bean
    public FilterRegistrationBean createEchoFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new EchoFilter());
        bean.setUrlPatterns(Arrays.asList("/book.do"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<StartupListener> createStartupListener(){
        ServletListenerRegistrationBean<StartupListener> bean = new ServletListenerRegistrationBean<>(new StartupListener());
        return bean;
    }
}
