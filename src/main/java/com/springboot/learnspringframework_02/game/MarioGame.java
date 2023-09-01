package com.springboot.learnspringframework_02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //for Spring to autowire MariaGame as the Primary GamingConsole
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Jump!");
    }
    public void down(){
        System.out.println("Go into a hole!");
    }

    public void right(){
        System.out.println("Accelerate!");
    }

    public void left(){
        System.out.println("Move Backward!");
    }
}
