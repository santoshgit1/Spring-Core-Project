package com.emexo.xml.di.setter;

public class Address {
    private int doorNo;
    private String city;
    private String state;

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getAddressDetails(){
        System.out.printf("Door No: "+ doorNo +", city: "+ city + ", state:"+state);
    }
}
