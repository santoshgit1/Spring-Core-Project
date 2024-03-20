package com.emexo.xml.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterbean.xml");
         Employee employee = context.getBean("employee", Employee.class);

         employee.getEmployeeDetails();
    }
}
