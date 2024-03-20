package com.emexo.xml.bean;

public class Employee {
    private int empId;

    private String empName;

    public Employee(){
        System.out.println("Default constructor");
        this.empId =1;
        this.empName ="Regu";
    }

    public void getEmpDetails(){
        System.out.printf("empId: "+ empId);
        System.out.printf("empName: "+ empName);
    }
}
