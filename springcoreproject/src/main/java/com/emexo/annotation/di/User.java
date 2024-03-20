package com.emexo.annotation.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Resource - JSR 250
 * Match by Name
 * Match by Type
 * Match by Qualifier
 *
 * @Inject - JSR - 330
 * Match by Type
 * Match by Qualifier
 * Match by Name - @Named
 *
 * @Autowired
 * Match by Type
 * Match by Qualifier
 * Match by Name
 */
@Component
public class User {

    @Autowired
    Hyundai hyundai;

    public User() {
    }

    public void print() {
        hyundai.engine();
    }

}
