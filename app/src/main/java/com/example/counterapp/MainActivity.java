package com.example.counterapp;


import android.os.Bundle;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    TextView counter;
    AppCompatButton increment;
    AppCompatButton decrement;
    String result;
    {
        result = "undefined";
    }
    NumberCount numbercount;
    Integer number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.counterLabel);
        increment = findViewById(R.id.btIncrement);
        decrement = findViewById(R.id.btDecrement);
        if (savedInstanceState != null){
            String tempData = savedInstanceState.getString("Result");
            number= Integer.parseInt(tempData);
            numbercount = new NumberCount(number);
            counter.setText(numbercount.displayInfo());
        }
        else{
             numbercount = new NumberCount();
        }
            decrement.setOnClickListener(view -> counter.setText(numbercount.displayDecrement()));
            increment.setOnClickListener(view -> counter.setText(numbercount.displayIncrement()));
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        counter = findViewById(R.id.counterLabel);
        bundle.putString("Result",counter.getText().toString());
    }
}