package com.emexo.annotation.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.annotation.scope");
        Product product =  context.getBean("product", Product.class);
        System.out.println(product.hashCode());

        Product product1 =  context.getBean("product", Product.class);
        System.out.println(product1.hashCode());
    }
}
