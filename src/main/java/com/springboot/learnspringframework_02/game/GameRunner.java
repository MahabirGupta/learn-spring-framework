package com.springboot.learnspringframework_02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//    Creating object of the class MarioGame
   private GamingConsole game;

//    Creating constructor
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) // "SuperContraGameQualifier" is the qualifier that
                                                                                // needs to be autowired
    {
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
