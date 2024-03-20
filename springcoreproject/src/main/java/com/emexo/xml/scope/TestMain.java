package com.emexo.xml.scope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

        LoggerExample loggerExample = context.getBean("loggerExample", LoggerExample.class);
        System.out.println(loggerExample.hashCode());

        LoggerExample loggerExample1 = context.getBean("loggerExample", LoggerExample.class);
        System.out.println(loggerExample1.hashCode());
    }
}
