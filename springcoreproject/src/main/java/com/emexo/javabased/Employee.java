package com.emexo.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Employee {

    @Autowired
    public Date date;



    public void getEmpDetails(){
        System.out.println(date);
    }
}
