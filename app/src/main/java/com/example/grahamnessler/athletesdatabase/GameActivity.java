package com.example.grahamnessler.athletesdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //start the new game activity
        Intent intent = getIntent();

        String p1First = intent.getStringExtra(MainActivity.p1First);

        TextView p1FView = (TextView) findViewById(R.id.test);
        p1FView.setText(p1First);

        String p1Last = intent.getStringExtra(MainActivity.p1Last);

        TextView p1LView = (TextView) findViewById(R.id.test2);
        p1LView.setText(p1Last);

//        Athlete player1 = new Athlete(p1First, p1Last);
//        Athlete player2 = new Athlete(p2First, p2Last);
//        Game game = new Game(player1, player2);
//        game.startGame();
    }

}
