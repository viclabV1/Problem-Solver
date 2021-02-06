package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FifteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_activity);
    }
    public void openFifteenProblem(View view){
        Intent intent = new Intent(this, FifteenProblemActivity.class);
        startActivity(intent);
    }
}