/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
import java.util.*;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = suitcase.totalWeight();
        
        if(weight <= this.maximumWeight) {
            this.hold.add(suitcase);
            this.maximumWeight-=weight;
        }
    }
    
    public String toString() {
        int size = this.hold.size();
        int weight = 0;
        for(Suitcase c: this.hold) {
            weight+=c.totalWeight();
        }
        
        return size + " suitcases (" + weight + " kg)";
    }
    
    public void printItems() {
        for(Suitcase c: this.hold) {
            c.printItems();
        }
    }
}

