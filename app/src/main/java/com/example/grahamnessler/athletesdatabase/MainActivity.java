package com.example.grahamnessler.athletesdatabase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void initializeGame(View view) {
        EditText p1FirstName = (EditText) findViewById(R.id.p1FirstName);
        String p1First = p1FirstName.getText().toString();
        EditText p1LastName = (EditText) findViewById(R.id.p1LastName);
        String p1Last = p1LastName.getText().toString();
        Athlete player1 = new Athlete(p1First, p1Last);
        Athlete player2 = new Athlete("Neal", "Alpert");
        Game game = new Game(player1, player2);
        game.startGame();
    }

}
