package com.emexo.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.javabased");

        Employee employee = context.getBean("employee", Employee.class);
        employee.getEmpDetails();
    }
}
