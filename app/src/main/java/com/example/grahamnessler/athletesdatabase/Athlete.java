package com.example.grahamnessler.athletesdatabase;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Athlete {
    public double id;
    private String firstName;
    private String lastName;
    private int championships = 0;
    private int score = 0;
    private Game game;

    public String getChampionships() {
        return this.firstName + " has won " + this.championships + " championships.";
    }

    public int getScore() {
        return this.score;
    }

    public void incrementChampionships () {
        this.championships++;
    }

    public void addGame (Game game) {
        this.game = game;
    }

    public void incrementScore () {
        if (this.score > 20) {
            game.endGame(this);
            return;
        }
        this.score++;
    }

    public void decrementScore () {
        if (this.score < 1) {
            GameActivity.showMinScoreError();
            return;
        }
        this.score--;
    }

    public void resetScore() {
        this.score = 0;
    }

    public Athlete (String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.id = Math.random();
    }
}
