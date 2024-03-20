package com.emexo.ioc.annotation.bean;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private int customerId;

    private String customerName;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
