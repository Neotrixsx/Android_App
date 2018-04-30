package com.demoapp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txResult;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnMul,btnDiv,btnClr,btnEql;
    char temp;
    float v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0= findViewById(R.id.bt0);
        btn1= findViewById(R.id.bt1);
        btn2= findViewById(R.id.bt2);
        btn3= findViewById(R.id.bt3);
        btn4= findViewById(R.id.bt4);
        btn5= findViewById(R.id.bt5);
        btn6= findViewById(R.id.bt6);
        btn7= findViewById(R.id.bt7);
        btn8= findViewById(R.id.bt8);
        btn9= findViewById(R.id.bt9);

        btnSum= findViewById(R.id.btSum);
        btnSub= findViewById(R.id.btSub);
        btnMul= findViewById(R.id.btMul);
        btnDiv= findViewById(R.id.btDiv);

        btnEql= findViewById(R.id.btEql);

        btnClr= findViewById(R.id.btClr);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public  void calculate(View view){

    }
}
