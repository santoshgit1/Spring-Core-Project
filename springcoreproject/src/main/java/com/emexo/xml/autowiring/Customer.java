package com.emexo.xml.autowiring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer {
    private static final Logger logger = LogManager.getLogger(Loan.class);

    private int customerId;
    private String customerName;
    private Loan loan;



    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public void getCustomerDetails(){
        logger.info("Customer Details, customerId:{}, customerName:{} ", customerId, customerName);
        loan.getLoanDetails();
    }
}
