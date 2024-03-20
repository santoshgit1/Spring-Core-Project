package com.emexo.ioc.xml.scope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    private static final Logger LOGGER = LogManager.getLogger(TestMain.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

        LoggerExample loggerExample = context.getBean("loggerExample", LoggerExample.class);
        LOGGER.info("HashCode1:{}", loggerExample.hashCode());

        LoggerExample loggerExample1 = context.getBean("loggerExample", LoggerExample.class);
        LOGGER.info("HashCode2:{}", loggerExample1.hashCode());


    }
}
