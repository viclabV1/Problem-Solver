package com.example.problemsolver.framework.graph;

import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;
import java.util.Stack;
import java.util.List;
import com.example.problemsolver.framework.graph.Vertex;

/**
 * @author Victor LaBrie
 */
public class GraphCreator {
    
    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        stack = new Stack();
        start = new Vertex(problem.getInitialState());
        mover = problem.getMover();
        stack.push(start);
        moves = mover.getMoveNames();
        
        while(!stack.isEmpty()){
           currentState = (Vertex) stack.pop();
            for (String move : moves) {
                next = mover.doMove(move,(State)currentState.getData());
                if(next != null){
                    Vertex thisMove = new Vertex(next);
                    if(graph.getVertices().containsKey(thisMove)){
                       thisMove = graph.getVertices().get(thisMove);
                    }
                    else{
                       stack.push(thisMove);
                    }
                    graph.addEdge(currentState, thisMove);
                    
                }
            }
        }
        // You must provide
        return graph;
    }
    
    private Graph graph = null;
    private Stack stack = null;
    private Vertex start = null;
    private Mover mover = null;
    private List<String> moves = null;
    private Vertex currentState = null;
    private State next = null;
}