package com.demoapp.randomguess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int mainResult, userinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(String data) {
        Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
    }

    public void fnCheckNo(View view) {

        EditText userno = findViewById(R.id.txUserNo);
        userinput = Integer.parseInt(userno.getText().toString());

        Random rand = new Random();
        mainResult = rand.nextInt(21);

        if (userinput > mainResult) {
            makeToast("Higher");
        } else if (userinput == mainResult) {
            makeToast("Equal");
        } else if (userinput < mainResult) {
            makeToast("Lower");
        }

    }
}
