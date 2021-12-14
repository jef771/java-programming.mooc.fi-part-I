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

public class RecipeBook {
    private ArrayList<Recipe> recipeBook;
    
    public RecipeBook() {
        this.recipeBook = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipeBook.add(recipe);
    }
    
    public void print() {
        for(Recipe r: this.recipeBook) {
            System.out.println(r);
        }
    }
    
    public void searchRecipe(String searchedName) {
        for(Recipe r: this.recipeBook) {
            if(r.getName().contains(searchedName)) {
                System.out.println(r);
            }
        }
    }
    
    public void searchTime(int searchedTime) {
        for(Recipe r: this.recipeBook) {
            if(r.getCookingTime() <= searchedTime) {
                System.out.println(r);
            }
        }
    }
    
    public void searchIngredient(String searchedIngredient) {
        for(Recipe r: this.recipeBook) {
            if(r.checkIngredient(searchedIngredient)) {
                System.out.println(r);
            }
        }
    }
}
