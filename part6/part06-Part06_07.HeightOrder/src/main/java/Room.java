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

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if(this.people.isEmpty()) {
            return null;
        }
        
        Person smallest = this.people.get(0);
        
        for(Person s: this.people) {
            if(s.getHeight() < smallest.getHeight()) {
                smallest = s;
            }
        }
        return smallest;
    }
    
    public Person take() {
        if(this.people.isEmpty()) {
            return null;
        }
        
        int smallestHeight = this.shortest().getHeight();
        int index = 0;
        
        for(int i=0; i<this.people.size(); i++) {
            if(this.people.get(i).getHeight() == smallestHeight) {
                index = i;
            }
        }
        
        Person taken = this.people.get(index);
        
        this.people.remove(index);
        
        return taken;
    }
    
    
}
