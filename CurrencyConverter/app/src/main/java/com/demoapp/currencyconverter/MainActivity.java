package com.demoapp.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double dollar = 62.77, enterdata, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void currencyConvert(View view) {
        Log.i("Info", "currencyConvert");

        EditText currency = findViewById(R.id.txCurrency);
        enterdata = Double.parseDouble(currency.getText().toString());
        result = enterdata * 62.77;
        Toast.makeText(MainActivity.this, String.format( "%.2f",result), Toast.LENGTH_SHORT).show();
    }

}
