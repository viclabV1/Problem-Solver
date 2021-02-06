package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.problemsolver.domains.fifteen.FifteenProblem;
import com.example.problemsolver.domains.fifteen.FifteenState;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.SolvingAssistant;
import com.example.problemsolver.framework.solution.AStarSolver;
import com.example.problemsolver.framework.solution.Solution;

import java.util.ArrayList;
import java.util.List;


public class FifteenProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteenproblem_activity);
        problem = new FifteenProblem();
        currentView = (TextView) findViewById(R.id.FifteenCurrentState);
        finalView = (TextView) findViewById(R.id.FifteenFinalState);
        message = (TextView) findViewById(R.id.fifteensolve_message);
        count = (TextView) findViewById(R.id.FifteenMoveCount);
        statistics = (TextView) findViewById(R.id.FifteenStatistics);
        solveAssistant = new SolvingAssistant(problem);
        solver = new AStarSolver(problem);
        next = (Button) findViewById(R.id.FifteenNextButton);
        solveButton = (Button) findViewById(R.id.FifteenSolveButton);
        benchSpinner = (Spinner) findViewById(R.id.fifteenspinner);
        count.setText("0");
        statistics.setText("No stats yet");
        currentView.setText(problem.getInitialState().toString());
        finalView.setText(problem.getFinalState().toString());
        statistics.setText(solver.getStatistics().toString());
        message.setText(" ");
        next.setEnabled(false);
        intCount = 0;
        nameArray = problem.getBenchmarks();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(benchSpinner.getContext(), android.R.layout.simple_spinner_dropdown_item, nameArray);
        benchSpinner.setAdapter(adapter);
        spinnerSelection();
    }

    public void updateDisplay() {
        if (problem.getCurrentState().equals(problem.getFinalState())) {
            message.setText(R.string.congrats);
            next.setEnabled(false);
        }
        currentView.setText(problem.getCurrentState().toString());
        statistics.setText(solver.getStatistics().toString());
    }

    public void reset(View view) {
        message.setText(" ");
        solveAssistant.reset();
        problem.setCurrentState(problem.getInitialState());
        count.setText("0");
        solver.getStatistics().clear();
        next.setEnabled(false);
        intCount = 0;
        solveButton.setEnabled(true);
        benchSpinner.setEnabled(true);
        updateDisplay();
    }

    @SuppressLint("ResourceAsColor")
    public void nextAction(View view) {
        State nextState = (State) solvedSolution.next().getData();
        problem.setCurrentState(nextState);
        intCount++;
        count.setText(Integer.toString(intCount));
        updateDisplay();
    }

    public void spinnerSelection() {

        benchSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                reset(view);
                Benchmark selectedBench = problem.getBenchmarks().get(i);
                problem.setCurrentState(selectedBench.getStart());
                updateDisplay();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //currentView.setText(problem.getInitialState().toString());
            }
        });
    }

    public void solve(View view) {
        solver.solve();
        intCount = 0;
        next.setEnabled(true);
        solveButton.setEnabled(false);
        solvedSolution = solver.getSolution();
        solvedSolution.next();
        benchSpinner.setEnabled(false);
        updateDisplay();

    }





    private TextView message;
    private TextView currentView;
    private TextView finalView;
    private TextView statistics;
    private TextView count;
    private int intCount;
    FifteenProblem problem;
    SolvingAssistant solveAssistant;
    AStarSolver solver;
    Button next;
    Button solveButton;
    Solution solvedSolution;
    Spinner benchSpinner;
    List nameArray;

}