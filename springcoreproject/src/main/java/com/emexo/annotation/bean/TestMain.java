package com.emexo.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.annotation.bean");

        Customer customer = (Customer) context.getBean("customer");
        customer.setCustomerId(1);
        customer.setCustomerName("Regu");
        System.out.println(customer);

    }
}
