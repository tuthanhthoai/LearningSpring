package com.thanhthoi.learning_spring_boot;

import com.thanhthoi.learning_spring_boot.game.GameRunner;
import com.thanhthoi.learning_spring_boot.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();
//        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
