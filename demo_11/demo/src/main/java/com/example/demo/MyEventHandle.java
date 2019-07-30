package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
    /**
     * 参数任意
     * 所有该参数事件，或者其事件（子类）都可以接收到
     *
     */
    @EventListener
    //需要监听那个事件，就写哪个Event
    //public void enent(MyApplicationEvent event) {
    public void enent(Object event) {
        System.out.println("接收到事件：" + event.getClass());
    }
}
