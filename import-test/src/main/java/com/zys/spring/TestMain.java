package com.zys.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);
        Car car = (Toyota)context.getBean("toyota");
        car.print();
        car = (Volkswagen)context.getBean("volkswagen");
        car.print();
        context.close();
    }
}
