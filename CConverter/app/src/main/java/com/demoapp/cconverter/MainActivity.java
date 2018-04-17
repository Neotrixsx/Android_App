package com.demoapp.cconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double result, enterData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fnConverter(View view) {
        EditText myCurrency = findViewById(R.id.txCurrency);
        enterData = Double.parseDouble(myCurrency.getText().toString());
        result = enterData * 56.44;
        Toast.makeText(MainActivity.this, String.format("%.2f", result), Toast.LENGTH_SHORT).show();

    }

}
