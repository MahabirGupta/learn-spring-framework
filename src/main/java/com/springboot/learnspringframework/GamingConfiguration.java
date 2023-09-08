package com.springboot.learnspringframework;

import com.springboot.learnspringframework_02.game.GameRunner;
import com.springboot.learnspringframework_02.game.GamingConsole;
import com.springboot.learnspringframework_02.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Create configuration annotation

//This is a configuration file containing Spring Beans
@Configuration
public class GamingConfiguration {

//    Defining the bean
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
