package com.emexo.annotation.componentscan;

import com.datalake.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@ComponentScan("com.datalake")
public class ApacReport {

    private String reportName;
    private LocalDate businessDate;

    @Autowired
    private Transaction transaction;

    public ApacReport(){
        this.businessDate = LocalDate.now();
        this.reportName = "APAC";
    }

    public void getReport(){
        System.out.println(reportName + " : "+ businessDate);
        transaction.getTransactionDetails();
    }
}
