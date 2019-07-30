package com.example.demo;

import org.springframework.context.ApplicationListener;

/**
 * 定义事件监听器
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("接收到事件："+event.getClass());
    }
}
