package com.dao;


import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("dao")
public class IndexDaoImpl {

    public void query() {
        System.out.println("----开始----");
    }


}
