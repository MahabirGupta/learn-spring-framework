package com.springboot.learnspringframework.game;

import com.springboot.learnspringframework_02.game.GameRunner;
import com.springboot.learnspringframework_02.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springboot.learnspringframework_02.game") // To scan for the package which has the Pacman Class

public class GamingAppLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(GamingAppLauncherApplication.class))//Create a Spring Context
        {

            context.getBean(GamingConsole.class).up(); // GamingConsole.class is the interface and calling the up() method
            context.getBean(GameRunner.class).run();
        }




    }
}
