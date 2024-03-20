package com.emexo.annotation.di;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Vehicle {
    @Override
    public void engine() {
        System.out.println("####Toyota Engine####");
    }
}
