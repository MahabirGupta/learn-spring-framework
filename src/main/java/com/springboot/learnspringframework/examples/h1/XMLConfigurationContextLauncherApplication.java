package com.springboot.learnspringframework.examples.h1;

import com.springboot.learnspringframework.examples.a1.DepInjectionLauncherApplication;
import com.springboot.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@Configuration //Indicates that we are making use of Java configuration
//@ComponentScan // Only for Java configuration

public class XMLConfigurationContextLauncherApplication {


    public static void main(String[] args) {

//        launching context using "contextConfiguration.xml"
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml"))//Create a Spring Context
        {
//            If you want to see what beans are part of the Spring Context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name")); //To print the name
            System.out.println(context.getBean("age")); //To print the age

            context.getBean(GameRunner.class).run();

        }




    }
}
