package com.emexo.ioc.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.ioc.annotation.di");

        User user = context.getBean("user", User.class);
        user.print();

    }
}
