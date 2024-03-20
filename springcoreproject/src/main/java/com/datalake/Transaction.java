package com.datalake;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Transaction {
    private int transactionId;

    private double transactionAmount;

    private LocalDate transactionDate;

    public Transaction() {
        this.transactionId = 1;
        this.transactionAmount = 2000.05;
        this.transactionDate = LocalDate.now();
    }

    public void getTransactionDetails(){
        System.out.println(transactionId + " : "+ transactionAmount + " : "+ transactionDate);
    }
}
