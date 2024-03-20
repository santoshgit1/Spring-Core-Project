package com.emexo.annotation.postconstruct1;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class EmployeeDAO {
    // DB Connection

    @PostConstruct
    public void getDBConnection(){
        System.out.println("#### Connect to DB #####");
    }

    // insert
    // update
    // delete
    // select

    // close the DB connect
    @PreDestroy
    public void  closeDBConnection(){
        System.out.println("****  Close DB Connection ***");
    }

}
