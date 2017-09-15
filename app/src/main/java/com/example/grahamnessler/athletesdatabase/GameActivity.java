package com.example.grahamnessler.athletesdatabase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    private Athlete player1;
    private Athlete player2;
    private String p1First;
    private String p1Last;
    private String p2First;
    private String p2Last;
    public Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //start the new game activity
        Intent intent = getIntent();

        p1First = intent.getStringExtra(MainActivity.p1First);

        p1Last = intent.getStringExtra(MainActivity.p1Last);

        p2First = intent.getStringExtra(MainActivity.p2First);

        p2Last = intent.getStringExtra(MainActivity.p2Last);

        insertPlayersNames();

        startNewGame();
    }

    private void showNewScore() {
        TextView p1Score = (TextView) findViewById(R.id.p1Score);
        String p1ScoreString = Integer.toString(player1.getScore());
        p1Score.setText(p1ScoreString);

        TextView p2Score = (TextView) findViewById(R.id.p2Score);
        String p2ScoreString = Integer.toString(player2.getScore());
        p2Score.setText(p2ScoreString);
    }

    public void incrementP1Score(View view) {
        player1.incrementScore();
        showNewScore();
    }

    public void incrementP2Score(View view) {
        player2.incrementScore();
        showNewScore();
    }

    public void decrementP1Score(View view) {
        player1.decrementScore();
        showNewScore();
    }

    public void decrementP2Score(View view) {
        player2.decrementScore();
        showNewScore();
    }

    private void insertPlayersNames () {
        TextView p1FView = (TextView) findViewById(R.id.p1FirstDynamic);
        p1FView.setText(p1First);

        TextView p1LView = (TextView) findViewById(R.id.p1LastDynamic);
        p1LView.setText(p1Last);

        TextView p2FView = (TextView) findViewById(R.id.p2FirstDynamic);
        p2FView.setText(p2First);

        TextView p2LView = (TextView) findViewById(R.id.p2LastDynamic);
        p2LView.setText(p2Last);
    }

    private void startNewGame () {
        player1 = new Athlete(p1First, p1Last, this);
        player2 = new Athlete(p2First, p2Last, this);
        game = new Game(player1, player2);
        player1.addGame(game);
        player2.addGame(game);
        game.startGame(this);
        showNewScore();
    }

    public void showMinScoreError () {
        Context context = getApplicationContext();
        CharSequence text = "Error: Scores cannot decrement below zero.";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void goToWinnersCircle () {
        Intent intent = new Intent(this, WinnersCircle.class);
        startActivity(intent);
    }

    public void showWinnerToast (Athlete winner) {
        Context context = getApplicationContext();
        CharSequence text = "The winner is: " + winner.getFirstName();
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
