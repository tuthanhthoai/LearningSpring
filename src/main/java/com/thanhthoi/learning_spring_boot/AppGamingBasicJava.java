package com.thanhthoi.learning_spring_boot;

import com.thanhthoi.learning_spring_boot.game.GameRunner;
import com.thanhthoi.learning_spring_boot.game.MarioGame;
import com.thanhthoi.learning_spring_boot.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
