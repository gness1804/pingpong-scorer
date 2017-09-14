package com.example.grahamnessler.athletesdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

        TextView p1FView = (TextView) findViewById(R.id.p1FirstDynamic);
        p1FView.setText(p1First);

        String p1Last = intent.getStringExtra(MainActivity.p1Last);

        TextView p1LView = (TextView) findViewById(R.id.p1LastDynamic);
        p1LView.setText(p1Last);

        String p2First = intent.getStringExtra(MainActivity.p2First);

        TextView p2FView = (TextView) findViewById(R.id.p2FirstDynamic);
        p2FView.setText(p2First);

        String p2Last = intent.getStringExtra(MainActivity.p2Last);

        TextView p2LView = (TextView) findViewById(R.id.p2LastDynamic);
        p2LView.setText(p1Last);

//        Athlete player1 = new Athlete(p1First, p1Last);
//        Athlete player2 = new Athlete(p2First, p2Last);
//        Game game = new Game(player1, player2);
//        game.startGame();
    }

}
