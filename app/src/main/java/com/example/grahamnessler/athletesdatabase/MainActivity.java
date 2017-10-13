package com.example.grahamnessler.athletesdatabase;

import android.content.Context;
import android.content.Intent;
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
    public static String p1First;
    public static String p1Last;
    public static String p2First;
    public static String p2Last;

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
        p1First = p1FirstName.getText().toString();

        EditText p1LastName = (EditText) findViewById(R.id.p1LastName);
        p1Last = p1LastName.getText().toString();

        EditText p2FirstName = (EditText) findViewById(R.id.p2FirstName);
        p2First = p2FirstName.getText().toString();

        EditText p2LastName = (EditText) findViewById(R.id.p2LastName);
        p2Last = p2LastName.getText().toString();

        if (p1First.length() > 0 && p1Last.length() > 0 && p2First.length() > 0 && p2Last.length() > 0) {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra(p1First, p1First);
            intent.putExtra(p1Last, p1Last);
            intent.putExtra(p2First, p2First);
            intent.putExtra(p2Last, p2Last);
            startActivity(intent);
        } else {
            throwEmptyFieldError();
        }
    }

    public void clearFields() {
        EditText p1FirstName = (EditText) findViewById(R.id.p1FirstName);
        p1FirstName.setText("");

        EditText p1LastName = (EditText) findViewById(R.id.p1LastName);
        p1LastName.setText("");

        EditText p2FirstName = (EditText) findViewById(R.id.p2FirstName);
        p2FirstName.setText("");

        EditText p2LastName = (EditText) findViewById(R.id.p2LastName);
        p2LastName.setText("");
    }

}
