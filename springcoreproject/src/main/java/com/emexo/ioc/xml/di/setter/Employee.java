package com.emexo.ioc.xml.di.setter;

public class Employee {
    private int employeeId;
    private String employeeName;

    private Address address;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getEmployeeDetails(){
        System.out.println("EmployeeDetails: "+ employeeId + " : "+
                employeeName +" : ");
        address.getAddressDetails();
    }
}
