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

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int totalWeight) {
        this.maximumWeight = totalWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int weight = item.getWeight();
        if(weight <= this.maximumWeight) {
            this.items.add(item);
            this.maximumWeight-=weight;
        }
    }
    
    public String toString() {
        int numberItems = this.items.size();
        int weight = 0;
        
        for(Item s: this.items) {
            weight+=s.getWeight();
        }
        
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if(this.items.size() == 1) {
            return "1 item (" + weight + " kg)"; 
        } else {
            return numberItems + " items (" + weight + " kg)";
        }
    }
    
    public void printItems() {
        for(Item s: this.items) {
            System.out.println(s);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Item s: this.items) {
            weight+=s.getWeight();
        }
        
        return weight;
    }
    
    public Item heaviestItem() {
        
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item s: this.items) {
            if(s.getWeight() > heaviest.getWeight()) {
                heaviest = s;
            }
        }
        
        return heaviest;
    }
}
