package com.example.lesson34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent i= getIntent();
        String message=i.getStringExtra("someData");
        ( (TextView) findViewById(R.id.textView)).setText(message);
    }
}