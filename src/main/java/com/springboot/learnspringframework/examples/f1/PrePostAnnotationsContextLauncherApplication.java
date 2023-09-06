package com.springboot.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
//    Creating a field
    private SomeDependency someDependency;

//    Create a constructor
    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

//    Do some initialization
//    How to run the initialization as soon as the dependencies are wired in
//    use @PostConstruct
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

//    Do something before an application is terminated, before a bean is removed from your context
    @PreDestroy
    public void cleanUp(){
//        can close connections with database in cleanUp()
        System.out.println("Clean up!");
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Some logic using some dependency");
    }
}
@Configuration
@ComponentScan // Don't have to explicitly specify.// @ComponentScan will automatically scan
public class PrePostAnnotationsContextLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class))//Create a Spring Context
        {
//            If want to see what beans are part of the Spring Context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }




    }
}
