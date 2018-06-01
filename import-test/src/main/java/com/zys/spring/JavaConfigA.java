package com.zys.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigA {
    @Bean(name="volkswagen")
    public Car getVolkswagen(){
        return new Volkswagen();
    }
}
