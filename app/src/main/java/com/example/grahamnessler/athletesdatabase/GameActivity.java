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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String test = intent.getStringExtra(MainActivity.p1First);

        TextView view = (TextView) findViewById(R.id.test);
        view.setText(test);

        String test2 = intent.getStringExtra(MainActivity.p1Last);

        TextView view2 = (TextView) findViewById(R.id.test2);
        view2.setText(test2);

    }

}
