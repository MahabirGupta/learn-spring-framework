package com.springboot.learnspringframework;

import com.springboot.learnspringframework.game.GameRunner;
import com.springboot.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
//      1:  Launch a Spring Context or Spring Application - using @Configuration Class
      var context = new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

//      2:  Configure the things that we want Spring to manage - @Configuration Class using HelloWorldConfiguration class for this
//      example
        context.getBean("name"); //Anything the is managed by Spring is called a bean

//        Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));


    }
}
