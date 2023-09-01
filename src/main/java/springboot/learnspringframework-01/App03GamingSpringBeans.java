package com.springboot.learnspringframework;

import com.springboot.learnspringframework.game.GameRunner;
import com.springboot.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(com.springboot.learnspringframework.GamingConfiguration.class))//Create a Spring Context
        {

            context.getBean(GamingConsole.class).up(); // GamingConsole.class is the interface and calling the up() method
            context.getBean(GameRunner.class).run();
        }




    }
}
