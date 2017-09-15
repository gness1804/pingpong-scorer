package com.example.grahamnessler.athletesdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private Athlete player1;
    private Athlete player2;
    private String p1First;
    private String p1Last;
    private String p2First;
    private String p2Last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView p1Score = (TextView) findViewById(R.id.p1Score);
        TextView p2Score = (TextView) findViewById(R.id.p2Score);

        //start the new game activity
        Intent intent = getIntent();

        p1First = intent.getStringExtra(MainActivity.p1First);

        p1Last = intent.getStringExtra(MainActivity.p1Last);

        p2First = intent.getStringExtra(MainActivity.p2First);

        p2Last = intent.getStringExtra(MainActivity.p2Last);

        insertPlayersNames();

        player1 = new Athlete(p1First, p1Last);
        player2 = new Athlete(p2First, p2Last);
        Game game = new Game(player1, player2);
        game.startGame();

        player1.resetScore();
        player2.resetScore();

        String p1ScoreString = Integer.toString(player1.getScore());
        String p2ScoreString = Integer.toString(player2.getScore());

        p1Score.setText(p1ScoreString);
        p2Score.setText(p2ScoreString);
    }

    private void showNewScore() {
        TextView p1Score = (TextView) findViewById(R.id.p1Score);
        String p1ScoreString = Integer.toString(player1.getScore());
        p1Score.setText(p1ScoreString);
    }

    public void incrementP1Score(View view) {
        player1.incrementScore();
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

}
