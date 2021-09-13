package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class Config {

    public static void main(String[] args) {

    }

}
