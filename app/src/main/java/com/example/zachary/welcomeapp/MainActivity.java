/*
    Zachary Stephens Assignment 1

    This activity is the main welcome screen for this project, containing one TextView which
    displays the status of whether the App is locked or not, and also one button widget for
    unlocking the application, ie starting up the AccessController Activity

 */

package com.example.zachary.welcomeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public boolean unlocked = false;
    TextView tvWelcome = findViewById(R.id.WelcomeText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //Everything in OnCreate up until here was provided with the file
        tvWelcome.setText("Welcome to the app!   The App is LOCKED!");
    }

    public void clickUnlock(View v){
        Intent summonPassCode = new Intent();
        startActivityForResult(summonPassCode, 0);
        }

        //header copied from StackOverflow
    protected void onActivityResult(int requestCode, int resultCode, Intent summonPassCode) {
        if (requestCode == 0 && resultCode == 1) { //If the request code is the same and the result is true . . .
            unlocked = true;
        }
        if(unlocked){
            tvWelcome.setText("The App is UNLOCKED!");
        }
        else{
            tvWelcome.setText("The App is still LOCKED");
        }
    }

    //The two methods below were in place upon the creation of the file
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
