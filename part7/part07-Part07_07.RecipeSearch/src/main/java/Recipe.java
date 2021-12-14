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

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public void add(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime; 
    }
    
    public boolean checkIngredient(String searchedIngredient) {
        for(String s: this.ingredients) {
            if(s.equals(searchedIngredient)) {
                return true;
            }
        }
        
        return false;
    }
    
}
