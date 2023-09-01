package com.springboot.learnspringframework.game;

public class PacmanGame implements com.springboot.learnspringframework.game.GamingConsole {
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
