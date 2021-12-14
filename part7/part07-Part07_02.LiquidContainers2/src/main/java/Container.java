/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
public class Container {
    private int value;
    private int limit;
    
    public Container() {
        this.value = 0;
        this.limit = 100;
    }
    
    public int contains() {
        return this.value;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            this.value+=amount;
            if(this.value > this.limit) {
                this.value = this.limit;
            }
        }
    }
    
    public void remove(int amount) {
        if(amount > 0) {
            this.value-=amount;
            if(this.value < 0) {
                this.value*=0;
            }
        }
    }
    
    public String toString() {
        return this.value + "/" + this.limit;
    }
    
}
