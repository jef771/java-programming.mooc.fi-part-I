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

public class TodoList {
    private ArrayList<String> todo;
    
    public TodoList() {
        this.todo = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todo.add(task);
    }
    
    public void print() {
        for(int i=1; i<=this.todo.size(); i++) {
            System.out.println(i + ": " + this.todo.get(i-1));
        }
    }
    
    public void remove(int number) {
        this.todo.remove(number-1);
    }
}
