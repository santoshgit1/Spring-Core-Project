package com.emexo.annotation.postconstruct1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.annotation.postconstruct1");

        //EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);


        context.close();
    }
}
