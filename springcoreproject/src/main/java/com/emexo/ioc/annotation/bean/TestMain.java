package com.emexo.ioc.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.ioc.annotation.bean");
        CustomerService customerService= context.getBean("customerService", CustomerService.class);

        customerService.setCustomerId(1);
        customerService.setCustomerName("Raju");

        System.out.println(customerService);

        Customer customer = context.getBean("customer", Customer.class);

    }
}
