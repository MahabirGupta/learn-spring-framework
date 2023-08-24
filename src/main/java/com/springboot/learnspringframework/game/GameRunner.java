package com.springboot.learnspringframework.game;

public class GameRunner {

//    Creating object of the class MarioGame
   private GamingConsole game;

//    Creating constructor
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: " + game);
        game.up();
        game.right();
        game.down();
        game.left();
    }
}
