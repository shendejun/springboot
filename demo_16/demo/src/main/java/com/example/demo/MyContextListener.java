package com.example.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

@WebListener
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("应用启动时间："+ LocalDateTime.now().toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
