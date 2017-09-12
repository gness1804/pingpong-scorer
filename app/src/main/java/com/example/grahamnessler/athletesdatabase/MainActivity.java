package com.example.grahamnessler.athletesdatabase;

import android.content.Context;
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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    void throwEmptyFieldError () {
        Context context = getApplicationContext();
        CharSequence text = "Error: You must fill in all input fields.";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void initializeGame(View view) {
        EditText p1FirstName = (EditText) findViewById(R.id.p1FirstName);
        String p1First = p1FirstName.getText().toString();

        EditText p1LastName = (EditText) findViewById(R.id.p1LastName);
        String p1Last = p1LastName.getText().toString();

        EditText p2FirstName = (EditText) findViewById(R.id.p2FirstName);
        String p2First = p2FirstName.getText().toString();

        EditText p2LastName = (EditText) findViewById(R.id.p2LastName);
        String p2Last = p2LastName.getText().toString();

        if (p1First.length() > 0 && p1Last.length() > 0 && p2First.length() > 0 && p2Last.length() > 0) {
            Athlete player1 = new Athlete(p1First, p1Last);
            Athlete player2 = new Athlete(p2First, p2Last);
            Game game = new Game(player1, player2);
            game.startGame();
        } else {
            throwEmptyFieldError();
        }
    }

}
