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
import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.domains.puzzle.PuzzleState;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.SolvingAssistant;
import com.example.problemsolver.framework.solution.AStarSolver;
import com.example.problemsolver.framework.solution.Solution;

import java.util.ArrayList;
import java.util.List;


public class PuzzleProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzleproblem_activity);
        problem = new PuzzleProblem();
        currentView = (TextView) findViewById(R.id.PuzzleCurrentState);
        finalView = (TextView) findViewById(R.id.PuzzleFinalState);
        message = (TextView) findViewById(R.id.puzzlesolve_message);
        count = (TextView) findViewById(R.id.PuzzleMoveCount);
        //statistics = (TextView) findViewById(R.id.PuzzleStatistics);
        solveAssistant = new SolvingAssistant(problem);
        solver = new AStarSolver(problem);
        next = (Button) findViewById(R.id.PuzzleNextButton);
        solveButton = (Button) findViewById(R.id.PuzzleSolveButton);
        moveButtons = (LinearLayout) findViewById(R.id.PuzzleMoveButtons);
        benchSpinner = (Spinner) findViewById(R.id.puzzlespinner);
        createMoveButtons();
        count.setText("0");
        //statistics.setText("No stats yet");
        currentView.setText(problem.getInitialState().toString());
        finalView.setText(problem.getFinalState().toString());
        //statistics.setText(solver.getStatistics().toString());
        message.setText(" ");
        next.setEnabled(false);
        intCount = 0;
        nameArray = problem.getBenchmarks();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(benchSpinner.getContext(), android.R.layout.simple_spinner_dropdown_item, nameArray);
        benchSpinner.setAdapter(adapter);
        spinnerSelection();
    }

    public void updateDisplay(){
        if (problem.getCurrentState().equals(problem.getFinalState())){
            message.setText(R.string.congrats);
            next.setEnabled(false);
        }
        currentView.setText(problem.getCurrentState().toString());
        //statistics.setText(solver.getStatistics().toString());
    }

    public void reset(View view){
        message.setText(" ");
        solveAssistant.reset();
        problem.setCurrentState(problem.getInitialState());
        count.setText("0");
        solver.getStatistics().clear();
        next.setEnabled(false);
        intCount = 0;
        solveButton.setEnabled(true);
        for(int i = 0; i < moveButtons.getChildCount(); i++){
            moveButtons.getChildAt(i).setEnabled(true);
        }
        benchSpinner.setEnabled(true);
        updateDisplay();
    }

    @SuppressLint("ResourceAsColor")
    public void nextAction(View view){
        State nextState = (State)solvedSolution.next().getData();
        problem.setCurrentState(nextState);
        intCount++;
        count.setText(Integer.toString(intCount));
        for(int i = 0; i < moveButtons.getChildCount(); i++){




        }
        updateDisplay();
    }
    public void spinnerSelection(){

        benchSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
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
    public void solve(View view){
        solver.solve();
        intCount = 0;
        next.setEnabled(true);
        solveButton.setEnabled(false);
        benchSpinner.setEnabled(false);
        for(int i = 0; i < moveButtons.getChildCount(); i++){
            moveButtons.getChildAt(i).setEnabled(false);
        }
        solvedSolution = solver.getSolution();
        solvedSolution.next();
        updateDisplay();

    }


    public void createMoveButtons(){
        List<String> moves = problem.getMover().getMoveNames();
        moves.forEach(e->{
            Button newButton = new Button(moveButtons.getContext());

            newButton.setOnClickListener(view ->{
                newButton.setTag(e);
                solveAssistant.tryMove(e);
                if(!solveAssistant.isMoveLegal()){
                    message.setText(R.string.illegal_move);
                }
                else {
                    message.setText(" ");
                    intCount++;
                    count.setText(Integer.toString(intCount));
                }
                updateDisplay();
            });
            newButton.setText(e);
            moveButtons.addView(newButton);
        });

    }


    private TextView message;
    private TextView currentView;
    private TextView finalView;
    private TextView statistics;
    private TextView count;
    private int intCount;
    private LinearLayout moveButtons;
    PuzzleProblem problem;
    SolvingAssistant solveAssistant;
    AStarSolver solver;
    Button next;
    Button solveButton;
    Solution solvedSolution;
    Spinner benchSpinner;
    List nameArray;

}