package com.emexo.ioc.annotation.di;

import org.springframework.stereotype.Component;

@Component
public class Hyundai implements Vehicle {
    @Override
    public void engine() {
        System.out.println("####Hyundai Engine####");
    }
}
