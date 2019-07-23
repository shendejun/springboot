package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 *
 */
@Component
public class Jeep implements Runnable {
    /**
     * 光在这里添加Async注解也不起作用，是因为没有启用
     */
    @Async
    @Override
    public void run() {
        try{
            for (int i =1;i<=10;i++){
                System.out.println("---------------"+i);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
