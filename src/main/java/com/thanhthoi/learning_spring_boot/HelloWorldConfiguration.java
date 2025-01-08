package com.thanhthoi.learning_spring_boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ranga";
    }
}
