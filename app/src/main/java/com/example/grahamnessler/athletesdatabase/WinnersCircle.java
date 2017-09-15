package com.example.grahamnessler.athletesdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WinnersCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners_circle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //start the new activity
        Intent intent = getIntent();
    }

}
