package com.example.grahamnessler.athletesdatabase;

import android.widget.TextView;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Game {
    private Athlete player1;
    private Athlete player2;
//    private Athlete winner;

    public Game (Athlete p1, Athlete p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public void startGame () {
        this.player1.resetScore();
        this.player2.resetScore();
//        String p1ScoreString = Integer.toString(player1.getScore());
//        String p2ScoreString = Integer.toString(player2.getScore());
    }
}
