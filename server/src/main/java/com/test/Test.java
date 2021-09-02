package com.test;

import com.config.Config;
import com.dao.IndexDao;
import com.dao.IndexDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        IndexDaoImpl bean = (IndexDaoImpl) annotationConfigApplicationContext.getBean("dao");
        bean.query();
    }
}
