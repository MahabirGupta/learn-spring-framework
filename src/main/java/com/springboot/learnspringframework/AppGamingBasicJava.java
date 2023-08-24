package com.springboot.learnspringframework;

import com.springboot.learnspringframework.game.GameRunner;
import com.springboot.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
