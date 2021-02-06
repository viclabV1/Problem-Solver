package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called to open 8-Puzzle
    public void openEight(View view){
        Intent intent = new Intent(this, EightPuzzleActivity.class);
        startActivity(intent);
    }

    //Called to open FWGC puzzle
    public void openFWGC(View view){
        Intent intent = new Intent(this, FWGCActivity.class);
        startActivity(intent);
    }

    public void openFifteen(View view){
        Intent intent = new Intent(this, FifteenActivity.class );
        startActivity(intent);
    }
}

