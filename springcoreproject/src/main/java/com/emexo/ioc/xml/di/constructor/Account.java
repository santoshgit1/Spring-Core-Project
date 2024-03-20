package com.emexo.ioc.xml.di.constructor;

public class Account {
    private int accountNo;
    private String accountName;

    private Customer customer;

    public Account(int accountNo, String accountName, Customer customer) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.customer = customer;
    }

    public void getAccountDetails(){
        System.out.println(accountNo);
        System.out.println(accountName);
        customer.getCustomerDetails();
    }
}
