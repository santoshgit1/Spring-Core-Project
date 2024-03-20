package com.emexo.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaBasedConfig {

    @Bean("date")
    public Date getDate(){
        return new Date();
    }
}
