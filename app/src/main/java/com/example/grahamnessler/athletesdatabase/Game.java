package com.example.grahamnessler.athletesdatabase;

import android.content.Intent;
import android.util.Log;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Game {
    private Athlete player1;
    private Athlete player2;
    private Athlete winner;
    private GameActivity ga;

    public Game (Athlete p1, Athlete p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public void startGame (GameActivity ga) {
        this.player1.resetScore();
        this.player2.resetScore();
        this.ga = ga;
    }

    public void endGame (Athlete winner) {
        this.winner = winner;
        winner.incrementWins();
        ga.goToWinnersCircle();
    }
}
