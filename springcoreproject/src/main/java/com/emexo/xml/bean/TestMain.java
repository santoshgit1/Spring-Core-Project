package com.emexo.xml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        //ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationcontext.xml");
        Employee employee = context.getBean("employee", Employee.class);

        employee.getEmpDetails();
    }
}
