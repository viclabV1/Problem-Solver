/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.problemsolver.domains.fifteen;

/**
 *
 * @author Victor LaBrie
 */
import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;
public class FifteenMover extends Mover{
    
    public static final String SLIDE_1 = "SLIDE TILE 1";
    public static final String SLIDE_2 = "SLIDE TILE 2";
    public static final String SLIDE_3 = "SLIDE TILE 3";
    public static final String SLIDE_4 = "SLIDE TILE 4";
    public static final String SLIDE_5 = "SLIDE TILE 5";
    public static final String SLIDE_6 = "SLIDE TILE 6";
    public static final String SLIDE_7 = "SLIDE TILE 7";
    public static final String SLIDE_8 = "SLIDE TILE 8";
    public static final String SLIDE_9 = "SLIDE TILE 9";
    public static final String SLIDE_10 = "SLIDE TILE 10";
    public static final String SLIDE_11 = "SLIDE TILE 11";
    public static final String SLIDE_12 = "SLIDE TILE 12";
    public static final String SLIDE_13 = "SLIDE TILE 13";
    public static final String SLIDE_14 = "SLIDE TILE 14";
    public static final String SLIDE_15 = "SLIDE TILE 15";
    
    public FifteenMover(){
        super.addMove(SLIDE_1,s->tryOne(s));
        super.addMove(SLIDE_2,s->tryTwo(s));
        super.addMove(SLIDE_3,s->tryThree(s));
        super.addMove(SLIDE_4,s->tryFour(s));
        super.addMove(SLIDE_5,s->tryFive(s));
        super.addMove(SLIDE_6,s->trySix(s));
        super.addMove(SLIDE_7,s->trySeven(s));
        super.addMove(SLIDE_8,s->tryEight(s));
        super.addMove(SLIDE_9,s->tryNine(s));
        super.addMove(SLIDE_10,s->tryTen(s));
        super.addMove(SLIDE_11,s->tryEleven(s));
        super.addMove(SLIDE_12,s->tryTwelve(s));
        super.addMove(SLIDE_13,s->tryThirteen(s));
        super.addMove(SLIDE_14,s->tryFourteen(s));
        super.addMove(SLIDE_15,s->tryFifteen(s));
    }
    
    /**
     * Attempts to slide the 1 tile.
     * @param state
     * @return PuzzleState
     */
    private State tryOne(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(1).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(1).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(1),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(1).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(1).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(1),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }
    
    /**
     * Attempts to slide the 2 tile.
     * @param state
     * @return PuzzleState
     */
    private State tryTwo(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(2).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(2).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(2),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(2).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(2).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(2),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }     
    
    /**
     * Attempts to slide the three tile.
     * @param state
     * @return PuzzleState
     */
    private State tryThree(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(3).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(3).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(3),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(3).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(3).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(3),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }
    
    /**
     * Attempts to slide the four tile.
     * @param state
     * @return PuzzleState
     */
    private State tryFour(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(4).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(4).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(4),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(4).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(4).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(4),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s);  
    }
    
    /**
     * Attempts to slide the five tile.
     * @param state
     * @return PuzzleState
     */
    private State tryFive(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(5).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(5).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(5),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(5).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(5).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(5),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }
    
    /**
     * Attempts to slide the six tile.
     * @param state
     * @return Puzzle State
     */
    private State trySix(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(6).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(6).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(6),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(6).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(6).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(6),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }
    
    /**
     * Attempts to slide the seven tile.
     * @param state
     * @return PuzzleState
     */
    private State trySeven(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(7).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(7).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(7),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(7).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(7).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(7),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }
    
    /**
     * Attempts to slide the eight tile.
     * @param state
     * @return PuzzleState
     */
    private State tryEight(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(8).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(8).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(8),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(8).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(8).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(8),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }    
    
    private State tryNine(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(9).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(9).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(9),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(9).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(9).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(9),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }    
    
    private State tryTen(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(10).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(10).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(10),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(10).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(10).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(10),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    }    
    
    private State tryEleven(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(11).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(11).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(11),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(11).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(11).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(11),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    } 
    
    private State tryTwelve(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(12).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(12).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(12),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(12).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(12).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(12),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    } 
    
    private State tryThirteen(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(13).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(13).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(13),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(13).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(13).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(13),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    } 
    
    private State tryFourteen(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(14).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(14).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(14),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(14).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(14).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(14),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    } 
    
    private State tryFifteen(State state){
    FifteenState s = (FifteenState)state;
    if(s.getLocation(15).getRow() == s.getLocation(0).getRow()){
        if(Math.abs(s.getLocation(15).getColumn()-s.getLocation(0).getColumn())==1){
            return new FifteenState(s,s.getLocation(15),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
    else if(s.getLocation(15).getColumn() == s.getLocation(0).getColumn()){
        if(Math.abs(s.getLocation(15).getRow()-s.getLocation(0).getRow())==1){
            return new FifteenState(s,s.getLocation(15),s.getLocation(0));
        }
        else return illegalMove(s);       
    }
        
    else return illegalMove(s); 
    } 
    /**
     * Called if attempted move is illegal.
     * @param state
     * @return null 
     */
    private State illegalMove(State state){
        return null;
    }
}
