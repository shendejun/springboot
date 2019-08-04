package com.example.demo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("========");
        System.out.println("app start up");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
