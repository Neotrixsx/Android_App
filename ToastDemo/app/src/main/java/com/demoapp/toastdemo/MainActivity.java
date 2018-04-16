package com.demoapp.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public  void newDog(View view){
    Log.i("Info","New Dog");
    ImageView newImg = findViewById(R.id.imageViewmain);

    newImg.setImageResource(R.drawable.dog2);
}
//    public void messagetxt(View view){
//
//        EditText vale = findViewById(R.id.txName);
//
//        Toast.makeText(MainActivity.this, vale.getText().toString()+ "!", Toast.LENGTH_SHORT).show();
//
//    }
}
