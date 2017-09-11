package com.example.grahamnessler.athletesdatabase;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Game {
    private Athlete player1;
    private Athlete player2;
    private Athlete winner;
    int p1Score = player1.getScore();
    int p2Score = player2.getScore();

    public Game (Athlete p1, Athlete p2) {
        this.player1 = p1;
        this.player2 = p2;
    }
}
