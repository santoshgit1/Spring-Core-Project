package com.emexo.xml.propertiesfile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.PropertySource;


public class MailConfiguration {
    private static final Logger log = LogManager.getLogger(MailConfiguration.class);

    private String host;
    private int port;
    private String username;
    private String password;

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getMailConfiguration(){
        log.info("Mail Configuration, host:{}, port:{}, username:{} and password:{}", host, port,
                username, password);
    }
}
