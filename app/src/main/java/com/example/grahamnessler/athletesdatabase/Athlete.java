package com.example.grahamnessler.athletesdatabase;

/**
 * Created by grahamnessler on 9/8/17.
 */

public class Athlete {
    private String firstName;
    private String lastName;
    private String sport;
    private double yearsExperience;
    private int championships;

    public String getFirstName () {
        return "First name: " + this.firstName;
    }

    public String getLastName () {
        return "Last name: " + this.lastName;
    }

    public String getSport () {
        return "sport: " + this.sport;
    }

    public String getExp () {
        return "Experience: " + Double.toString(this.yearsExperience) + " years.";
    }

    public String getChampionships() {
        return this.firstName + " has won " + this.championships + " championships.";
    }

    public void setFirstName (String name) {
        this.firstName = name;
    }

    public void setLastName (String name) {
        this.lastName = name;
    }


    public Athlete (String first, String last, String sport, double exp, int championships) {
        this.firstName = first;
        this.lastName = last;
        this.sport = sport;
        this.yearsExperience = exp;
        this.championships = championships;
    }
}
