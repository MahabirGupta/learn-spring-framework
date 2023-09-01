package com.springboot.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
//      1:  Launch a Spring Context or Spring Application - using @Configuration Class
        AnnotationConfigApplicationContext context;
        try {

            context = new AnnotationConfigApplicationContext(com.springboot.learnspringframework.helloworld.HelloWorldConfiguration.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//      2:  Configure the things that we want Spring to manage - @Configuration Class using HelloWorldConfiguration class for this
//      example
        context.getBean("name"); //Anything that is managed by Spring is called a bean

//        Retrieving Beans managed by Spring by passing the name attributes
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

//        Retrieving Beans managed by Spring by passing the type attributes using class
        System.out.println(context.getBean(com.springboot.learnspringframework.helloworld.Person.class));
        System.out.println(context.getBean(com.springboot.learnspringframework.helloworld.Address.class));
        System.out.println(context.getBean("person5Qualifier"));


//        System.out.println();
//        create a list of Arrays to store the getBeanDefinitionNames() Will print out all the bean names
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //using Method reference in functional programming




    }
}
