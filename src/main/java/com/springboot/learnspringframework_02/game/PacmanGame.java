package com.springboot.learnspringframework_02.game;

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
