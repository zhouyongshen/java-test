package com.zys.spring;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
    public void print() {
        System.out.println("I am Toyota");
    }
}
