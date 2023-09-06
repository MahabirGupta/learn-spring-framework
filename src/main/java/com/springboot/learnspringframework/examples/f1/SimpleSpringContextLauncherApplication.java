package com.springboot.learnspringframework.examples.f1;

import com.springboot.learnspringframework.examples.a1.DepInjectionLauncherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan // Don't have to explicitly specify.
                                                                  // @ComponentScan will automatically scan

public class SimpleSpringContextLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))//Create a Spring Context
        {
//            If want to see what beans are part of the Spring Context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }




    }
}
