package com.emexo.annotation.postconstructpredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.annotation.postconstructpredestroy");

        EmployeeDAO employeeDAO  = context.getBean("employeeDAO", EmployeeDAO.class);

        context.close();
    }
}
