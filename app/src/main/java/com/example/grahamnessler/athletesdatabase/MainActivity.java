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
    Athlete[] athletes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        instantiateLebron();
    }

    public void instantiateLebron () {
        Athlete lbj = new Athlete("Lebron", "James", "Basketball", 13, 3);
        TextView firstName = (TextView) findViewById(R.id.firstName);
        firstName.setText(lbj.getFirstName());
        TextView lastName = (TextView) findViewById(R.id.lastName);
        lastName.setText(lbj.getLastName());
    }
}
