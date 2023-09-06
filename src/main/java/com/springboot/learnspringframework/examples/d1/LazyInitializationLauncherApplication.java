package com.springboot.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //Creating a bean
class ClassA{

}

@Component
@Lazy //prevents Initialization of bean happening automatically
class ClassB{

//    initialization
    private ClassA classA;

    public ClassB(ClassA classA) { //Class B is using Class A bean to initialize itself
//        logic
        System.out.println("Some initialization logic goes here");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}

@Configuration
@ComponentScan // Don't have to explicitly specify.
                                                                  // @ComponentScan will automatically scan

public class LazyInitializationLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class))//Create a Spring Context
        {
//            Initialization of bean happens automatically
//            If want to see what beans are part of the Spring Context
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("Initialization of context is completed");
//            Someone wants to use the bean
            context.getBean(ClassB.class).doSomething();

        }




    }
}
