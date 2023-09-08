package com.springboot.learnspringframework.game;

import com.springboot.learnspringframework_02.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//    Creating object of the class MarioGame
   private com.springboot.learnspringframework_02.game.GamingConsole game;

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
