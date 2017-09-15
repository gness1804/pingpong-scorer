package com.example.grahamnessler.athletesdatabase;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Athlete {
    private String firstName;
    private String lastName;
    private double yearsExperience = 0;
    private int championships = 0;
    private int score = 0;

    public String getFirstName () {
        return "First name: " + this.firstName;
    }

    public String getLastName () {
        return "Last name: " + this.lastName;
    }

    public String getExp () {
        return "Experience: " + Double.toString(this.yearsExperience) + " years.";
    }

    public String getChampionships() {
        return this.firstName + " has won " + this.championships + " championships.";
    }

    public int getScore() {
        return this.score;
    }

    public void setFirstName (String name) {
        this.firstName = name;
    }

    public void setLastName (String name) {
        this.lastName = name;
    }

    public void incrementChampionships () {
        this.championships++;
    }

    public void incrementScore () {
        this.score++;
    }

    public void decrementScore () {
        this.score--;
    }

    public void resetScore() {
        this.score = 0;
    }

    public Athlete (String first, String last, double exp, int championships) {
        this.firstName = first;
        this.lastName = last;
        this.yearsExperience = exp;
        this.championships = championships;
    }

    public Athlete (String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }
}
