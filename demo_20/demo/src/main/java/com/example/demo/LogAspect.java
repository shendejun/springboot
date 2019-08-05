package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    /**
     * com.example.demo.dao..*.*(..)) 表示这个包com.example.demo.dao下的子包、以及子子包下的所有的类的所有的方法
     */
    @Before("execution(* com.example.demo.dao..*.*(..))")
    public void log(){

        System.out.println("before method log dome");
    }

    @After("execution(* com.example.demo.dao..*.*(..))")
    public void logAfter(JoinPoint point){
        System.out.println("after method log done "+point.getTarget().getClass()+",args="+ Arrays.asList(point.getArgs())
        +",method="+point.getSignature().getName());
    }
}
