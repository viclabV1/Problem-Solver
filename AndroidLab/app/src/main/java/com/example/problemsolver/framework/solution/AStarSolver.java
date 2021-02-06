package com.example.problemsolver.framework.solution;

import com.example.problemsolver.framework.graph.Vertex;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * This class represents an A* solver by extending the StateSpaceSolver
 * class.
 * @author Your name and section here
 */
public class AStarSolver extends StateSpaceSolver {
    
    /**
     * Creates an A* solver.
     * This constructor should set the queue to a priority queue (PQ)
     * and set the statistics header.
     * @param problem 
     */
    public AStarSolver(Problem problem) {
        // you must provide
        super(problem);
                Comparator<Vertex> comp = 
                (v1, v2) -> {
                    State goal = getProblem().getFinalState();
                    State s1 = (State)v1.getData();
                    State s2 = (State)v2.getData();
                    int h1 = s1.getHeuristic(goal);
                    int h2 = s2.getHeuristic(goal);
                    int d1 = v1.getDistance();
                    int d2 = v2.getDistance();
                    
                    return (h1+d1) - (h2+d2);
                };
        super.setQueue(new PriorityQueue<>(comp));
        super.getStatistics().setHeader("A* Search");
    }
}