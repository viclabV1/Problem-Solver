

/**
 *
 * @author Victor LaBrie
 */
package com.example.problemsolver.domains.farmer;

import com.example.problemsolver.framework.graph.Graph;
import com.example.problemsolver.framework.graph.Vertex;
public class FarmerGraph extends Graph{
    FarmerGraph(){
        add(v1,v7);
        add(v7,v4);
        add(v4,v10);
        add(v4,v8);
        add(v10,v3);
        add(v8,v5);
        add(v3,v9);
        add(v5,v9);
        add(v9,v2);
        add(v2,v6);
    }
    
    private void add(Vertex a, Vertex b){
        addEdge(a,b);
        addEdge(b,a);
    }
    Vertex v1 = new Vertex(new FarmerState("West",
                                           "West",
					   "West",
					   "West"));
    Vertex v2 = new Vertex(new FarmerState("West",
                                           "East",
                                           "West",
                                           "East"));
    Vertex v3 = new Vertex(new FarmerState("West",
                                           "East",
                                           "West",
                                           "West"));
    Vertex v4 = new Vertex(new FarmerState("West",
                                           "West",
                                           "East",
                                           "West"));
    Vertex v5 = new Vertex(new FarmerState("West",
                                           "West",
                                           "West",
                                           "East"));
    Vertex v6 = new Vertex(new FarmerState("East",
                                           "East",
                                           "East",
                                           "East"));
    Vertex v7 = new Vertex(new FarmerState("East",
                                           "West",
                                           "East",
                                           "West"));
    Vertex v8 = new Vertex(new FarmerState("East",
                                           "West",
                                           "East",
                                           "East"));
    Vertex v9 = new Vertex(new FarmerState("East",
                                           "East",
                                           "West",
                                           "East"));
    Vertex v10 = new Vertex(new FarmerState("East",
                                           "East",
                                           "East",
                                           "West"));
}
