/*
    Zachary Stephens Assignment1

    This activity is the AccessController, started by the MainActivity in order to essentially
    prompt the user for an access code, and then have them submit that code. If the code matches
    "1234", then the WelcomeText will change to be Unlocked in the MainActivity
    
 */

package com.example.zachary.welcomeapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class AccessController extends Activity {

    public String passCode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_controller);

        passCode = "";
    }

    public void clickButton1(View v) {
       passCode = passCode + "1";
    }

    public void clickButton2(View v) {
        passCode = passCode + "2";
    }

    public void clickButton3(View v) {
        passCode = passCode + "3";
    }

    public void clickButton4(View v) {
        passCode = passCode + "4";
    }

    public void clickSubmit(View v) {
        Intent summonPassCode = getIntent();
        if(passCode.equals("1234")){
            setResult(1,summonPassCode); //resultCode 1 implies a successful passCode entry
        }
        else{
            setResult(0,summonPassCode); //resultCode 0 implies a failed passCode entry
        }
        finish();
    }

}
