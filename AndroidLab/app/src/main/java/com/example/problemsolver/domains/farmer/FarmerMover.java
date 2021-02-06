
package com.example.problemsolver.domains.farmer;

/**
 *
 * @author Victor LaBrie
 */

import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;

public class FarmerMover extends Mover {
    public static final String FARMER = "Farmer Goes Alone";
    public static final String WOLF = "Farmer Takes Wolf";
    public static final String GOAT = "Farmer Takes Goat";
    public static final String CABBAGE = "Farmer Takes Cabbage";
    
    /**
     * Constructor for FarmerMover.
     */
    public FarmerMover() {
        super.addMove(FARMER,s->tryFarmer(s));
        super.addMove(WOLF,s->tryWolf(s));
        super.addMove(GOAT,s->tryGoat(s));
        super.addMove(CABBAGE,s->tryCabbage(s));
                
              
    }
    
    /**
     * Attempts to move the farmer by himself across the river. 
     * @param state
     * @return State 
     */
    private State tryFarmer(State state){
        FarmerState s = (FarmerState)state;
        if((s.getWolfPos() == s.getGoatPos()) || (s.getGoatPos() == s.getCabbagePos())){
            return illegalMove(s);
        }
        else{
            if(s.getFarmerPos()=="West"){
                return new FarmerState("East",s.getWolfPos(),s.getGoatPos(),s.getCabbagePos());
            }
            else{
                return new FarmerState("West",s.getWolfPos(),s.getGoatPos(),s.getCabbagePos());
            }
        }
    }
    
    /**
     * Attempts to move the farmer and wolf across the river.
     * @param state
     * @return State
     */
    private State tryWolf(State state){
        FarmerState s = (FarmerState)state;
        if(s.getFarmerPos() == s.getWolfPos()){
            if(s.getGoatPos() == s.getCabbagePos()){
                return illegalMove(s);
            }
            else{
                if(s.getWolfPos() == "West"){
                    return new FarmerState("East","East",s.getGoatPos(),s.getCabbagePos());
                }
                else{
                return new FarmerState("West","West",s.getGoatPos(),s.getCabbagePos());
                }
            }
        }
        else return illegalMove(s);
    }
    
    /**
     * Attempts to move the farmer and goat across the river.
     * @param state
     * @return State
     */
    private State tryGoat(State state){
        FarmerState s = (FarmerState)state;
        if(s.getFarmerPos() == s.getGoatPos()){
            
            if(s.getGoatPos()=="West"){
                return new FarmerState("East",s.getWolfPos(),"East",s.getCabbagePos());
            }
            else{
                return new FarmerState("West",s.getWolfPos(),"West",s.getCabbagePos());
                }
            
        }
        else return illegalMove(s);
    }
    
    /**
     * Attempts to move the farmer and cabbage across the river.
     * @param state
     * @return State
     */
    private State tryCabbage(State state){
        FarmerState s = (FarmerState)state;
        if(s.getFarmerPos()==s.getCabbagePos()){
            if(s.getGoatPos()==s.getWolfPos()){
                return illegalMove(s);
            }
            else{
                if(s.getCabbagePos()=="West"){
                    return new FarmerState("East",s.getWolfPos(),s.getGoatPos(),"East");
                }
                else{
                return new FarmerState("West",s.getWolfPos(),s.getGoatPos(),"West");
                }
            }
        }
        else return illegalMove(s);
    }
    
    /**
     * Gets called when an attempted move cannot be made.
     * @param state
     * @return null 
     */
    private State illegalMove(State state) {
        return null;
    }
    
}
