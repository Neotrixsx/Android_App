package com.demoapp.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {

        Toast.makeText(MainActivity.this, "Hi there", Toast.LENGTH_SHORT).show();
        EditText username = findViewById(R.id.txUserName);
        EditText password = findViewById(R.id.txPassword);

        Toast.makeText(MainActivity.this, username.getText().toString() + " !", Toast.LENGTH_SHORT).show();

        Log.i("Info", username.getText().toString());
        Log.i("Info", password.getText().toString());
    }
}
