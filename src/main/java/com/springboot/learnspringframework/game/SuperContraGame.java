package com.springboot.learnspringframework.game;

import com.springboot.learnspringframework_02.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") // for Spring to autowire SuperContraGame as the Primary GamingConsole
public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("up!");
    }
    public void down(){
        System.out.println("Sit Down!");
    }

    public void right(){
        System.out.println("Shoot a bullet!");
    }

    public void left(){
        System.out.println("Move Backward!");
    }
}
