package com.springboot.learnspringframework.game;

import com.springboot.learnspringframework_02.game.GamingConsole;
import org.springframework.stereotype.Component;

//Add a component that Spring will manage
@Component
public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Jump up!");
    }
    public void down(){
        System.out.println("Go down!");
    }

    public void right(){
        System.out.println("Turn right!");
    }

    public void left(){
        System.out.println("Turn left!");
    }
}
