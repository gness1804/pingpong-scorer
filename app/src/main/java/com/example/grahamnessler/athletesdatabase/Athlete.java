package com.example.grahamnessler.athletesdatabase;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Athlete {
    public double id;
    private String firstName;
    private String lastName;
    private int wins = 0;
    private int score = 0;
    private Game game;

    public String getChampionships() {
        return this.firstName + " has won " + this.wins + " championships.";
    }

    public int getScore() {
        return this.score;
    }

    public void incrementWins () {
        this.wins++;
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
