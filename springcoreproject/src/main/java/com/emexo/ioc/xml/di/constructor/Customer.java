package com.emexo.ioc.xml.di.constructor;

public class Customer {
    private int customerId;

    private String customerName;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public void getCustomerDetails(){
        System.out.println(customerId);
        System.out.println(customerName);
    }
}
