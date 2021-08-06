package com.company;

import patterns.Singleton.Game;

public class Main {

    public static void main(String[] args) {
        Game g = Game.getInstance();
        g.gameStart();

        Game AnotherGame = Game.getInstance();

        if(g == AnotherGame){
         System.out.println("Instance be equal");
         if(g.Score == AnotherGame.Score)
         {
         System.out.println("Its work");
         }
        }
    }
}
