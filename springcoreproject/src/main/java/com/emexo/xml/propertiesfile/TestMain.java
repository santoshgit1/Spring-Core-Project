package com.emexo.xml.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesfile.xml");
        MailConfiguration configuration = context.getBean("mailConfig", MailConfiguration.class);
        configuration.getMailConfiguration();
    }
}
