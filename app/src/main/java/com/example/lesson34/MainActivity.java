package com.example.lesson34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  handleClick(View v){
        Intent i = new Intent(this,Settings.class);

        i.putExtra("someData",(  (EditText)  findViewById(R.id.userInput)).getText().toString() );
        startActivity(i);
    }
}