/**
 * @author Victor LaBrie
 */
package com.example.problemsolver.domains.farmer;
import com.example.problemsolver.framework.problem.State;
import java.util.Objects;

public class FarmerState extends State{
    
    public FarmerState(String farmer, String wolf, String goat, String cabbage){
        this.farmerPos=farmer;
        this.wolfPos=wolf;
        this.goatPos=goat;
        this.cabbagePos=cabbage;
    } 

/**
 * Tests if two states are equal.
 * @param other
 * @return boolean 
 */
    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        FarmerState otherFarmer = (FarmerState) other;
        boolean isEqual=false;
        if(this.farmerPos == otherFarmer.farmerPos){
            if(this.wolfPos==otherFarmer.wolfPos){
                if(this.goatPos==otherFarmer.goatPos){
                    if(this.cabbagePos==otherFarmer.cabbagePos){
                        isEqual = true;
                    }
                }
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.farmerPos);
        hash = 83 * hash + Objects.hashCode(this.wolfPos);
        hash = 83 * hash + Objects.hashCode(this.goatPos);
        hash = 83 * hash + Objects.hashCode(this.cabbagePos);
        return hash;
    }
    
/**
 * Represents the current state as a string.
 * @return String 
 */
    @Override
    public String toString(){
        String visualState =          "   |  |   \n";
        if(farmerPos == "West"){
            visualState = visualState+" F |  |   \n";
        }
        else if(farmerPos == "East"){
            visualState = visualState+"   |  | F \n";            
        }
        if(wolfPos == "West"){
            visualState = visualState+" W |  |   \n";
        }
        else if(wolfPos == "East"){
            visualState = visualState+"   |  | W \n";
        }
        if(goatPos == "West"){
            visualState = visualState+" G |  |   \n";
        }
        else if(goatPos == "East"){
            visualState = visualState+"   |  | G \n";
        }
        if(cabbagePos == "West"){
            visualState = visualState+" C |  |   \n";
        }
        else if(cabbagePos == "East"){
            visualState = visualState+"   |  | C \n";
        }

        String endString = visualState+"   |  |   ";
        return endString;
    }
    /**
     * Getter for the farmer position.
     * @return String farmerPos
     */
    public String getFarmerPos(){
        return farmerPos;
    }
    
    /**
     * Getter for the wolf position.
     * @return String wolfPos
     */
    public String getWolfPos(){
        return wolfPos;
    }
    
    /**
     * Getter for the goat position.
     * @return String goatPos
     */
    public String getGoatPos(){
        return goatPos;
    }
    
    /**
     * Getter for the cabbage position.
     * @return String cabbagePos                                  
     */
    public String getCabbagePos(){
        return cabbagePos;
    }
    private final String farmerPos;
    private final String wolfPos;
    private final String goatPos;
    private final String cabbagePos;
}