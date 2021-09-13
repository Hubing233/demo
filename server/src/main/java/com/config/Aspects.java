package com.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面
@Component
@Aspect
public class Aspects {

    @Pointcut("execution(* com.dao.*.*(..))")
    public void xxx(){

    }

    @Before("xxx()")
    public void before(){
        System.out.println("before通知-----");
    }


    public void in(){
        System.out.println("in---------");
    }
}
