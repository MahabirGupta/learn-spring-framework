package com.springboot.learnspringframework.game;

// A gaming console is the dependency of the GameRunnerClass
public interface GamingConsole {
//    creating the common actions for all the games
    void up();
    void down();
    void right();
    void left();
}
