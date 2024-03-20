package com.emexo.ioc.xml.scope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {
    private static final Logger LOGGER = LogManager.getLogger(LoggerExample.class);
    private String logLevel;

    public LoggerExample(String logLevel) {
        this.logLevel = logLevel;
    }

    public void getLogLevel(){
        LOGGER.info("Log Level: {}", logLevel);
    }
}
