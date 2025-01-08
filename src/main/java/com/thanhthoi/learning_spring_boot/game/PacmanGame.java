package com.thanhthoi.learning_spring_boot.game;

public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("Go North");
    }

    public void down() {
        System.out.println("Go South");
    }

    public void left() {
        System.out.println("Go West");
    }

    public void right() {
        System.out.println("Go East");
    }
}
