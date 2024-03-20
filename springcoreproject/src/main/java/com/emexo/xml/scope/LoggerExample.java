package com.emexo.xml.scope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {

    private String logLevel;


    public LoggerExample(String logLevel) {
        System.out.println("Default constructor");
        this.logLevel = logLevel;
    }

    public void getLogLevel()
    {
        System.out.println("Log Level: "+ logLevel);
    }
}
