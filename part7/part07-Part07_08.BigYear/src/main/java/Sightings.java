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

public class Sightings {
    private HashMap<String, String> birds;
    private HashMap<String, Integer> observations;
    
    public Sightings() {
        this.birds = new HashMap<>();
        this.observations = new HashMap<>();
    }
    
    public void add(String bird, String birdInLatin) {
        this.birds.put(bird, birdInLatin);
    }
    
    public void observation(String bird) {
        this.observations.put(bird, this.observations.getOrDefault(bird, 0) + 1);
    }
    
    public void all() {
        this.birds.forEach((k ,v) -> {
            System.out.println(k + " (" + v + ")" + ": " + this.observations.get(k) + " observations");
        });
    }
    
    public void one(String birdName) {
        if(this.observations.get(birdName) == null) {
            System.out.println(birdName + " (" + this.birds.get(birdName) + "): 0 observations");
        } else {
            System.out.println(birdName + " (" + this.birds.get(birdName) + "): " + this.observations.get(birdName) + " observations");
        }
    }
    
    public boolean checkIfContains(String suspiciousName) {
        return this.birds.containsKey(suspiciousName);
    }   
}

