package com.samroid.mindrelextest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.ErrnoException;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

new Thread(){


    @Override
    public void run() {
        try{

            Thread.sleep(3000);
            Intent i=new Intent(Splash_screen.this,MainActivity.class);
            startActivity(i);




        }catch (Exception e)
        {

        }

    }
}.start();





    }
}
