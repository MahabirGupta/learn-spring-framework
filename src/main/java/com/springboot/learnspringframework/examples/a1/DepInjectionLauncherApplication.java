package com.springboot.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//By right Need to create in 3 different classes
//Your Business Class
//Dependency1 Class
//Dependency2 Class

//To create beans we use @Component
@Component
class YourBusinessClass {

//    dependency injection using Field
//    @Autowired
    Dependency1 dependency1;
//    @Autowired
    Dependency2 dependency2;

//    dependency injection using constructors

//    @Autowired //@Autowired is not mandatory for Constructor injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinessClass");

        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }


//    dependency injection using Setters
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
////        check to see whether setter injection has been done
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        //        check to see whether setter injection has been done
//        System.out.println("Setter Injection - setDependency2");
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan("com.springboot.learnspringframework.examples.a1") // Don't have to explicitly specify.
                                                                  // @ComponentScan will automatically scan

public class DepInjectionLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class))//Create a Spring Context
        {
//            If want to see what beans are part of the Spring Context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

//            to get beans
            System.out.println(context.getBean(YourBusinessClass.class));

        }




    }
}
