package com.springboot.learnspringframework;

//Adding the Spring configuration

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

//    define the methods to create the spring beans in your configuration class
    @Bean // create the name method using the @Bean notation
    public String name(){
        return "Mahabir";
    }
//    launch a spring context with the @ configuration class
}
