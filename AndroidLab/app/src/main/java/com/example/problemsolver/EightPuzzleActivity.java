package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EightPuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight_puzzle);
    }

    public void openPuzzleProblem(View view){
        Intent intent = new Intent(this, PuzzleProblemActivity.class);
        startActivity(intent);
    }
}