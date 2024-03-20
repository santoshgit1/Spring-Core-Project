package com.emexo.xml.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");

        Customer customer = context.getBean("customer", Customer.class);
        customer.getCustomerDetails();
    }
}
