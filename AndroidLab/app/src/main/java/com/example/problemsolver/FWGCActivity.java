package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FWGCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fwgc_activity);
    }

    public void openFWGCProblem(View view){
        Intent intent = new Intent(this, FWGCProblemActivity.class);
        startActivity(intent);
    }
}