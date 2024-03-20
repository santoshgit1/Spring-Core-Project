package com.emexo.annotation.postconstructpredestroy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class EmployeeDAO {

    @PostConstruct
    public void getDBConnection(){
        System.out.println("### DB Connection ###");
    }

    @PreDestroy
    public void closeDBConnection(){
        System.out.println("### Close DB Connection ###");
    }
}
