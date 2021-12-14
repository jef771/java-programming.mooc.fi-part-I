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

public class Grades {
    
    private ArrayList<Integer> gradesList;
    
    public Grades() {
        this.gradesList = new ArrayList<>();
    }
    
    public void add(int grade) {
        this.gradesList.add(grade);
    }
    
    public void average() {
        int sum = 0;
        
        for(int x: this.gradesList) {
            sum+=x;
        }
        
        System.out.println("Point average (all): " + (sum / (double) this.gradesList.size()));
    }
    
    public void passingGradeAverage() {
        int sum = 0;
        int count = 0;
        
        for(int x: this.gradesList) {
            if(x >= 50) {
                sum+=x;
                count++;
            }
        }
        
        if(sum > 0) {
            System.out.println("Point average (passing): " + (sum / (double) count));
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    public void passingPercentage() {
        int count = 0;
        for(int x: this.gradesList) {
            if(x >= 50) {
                count++;
            }
        }
        
        System.out.println("Pass percentage: " + (100*count / (double) this.gradesList.size()));
    }
    
    public void gradeDistribution() {
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";
        
        for(int x: this.gradesList) {
            
            if(x < 50) {
                zero+="*";
            } else if(x < 60) {
                one+="*";
            } else if(x < 70) {
                two+="*";
            } else if(x < 80) {
                three+="*";
            } else if(x < 90) {
                four+="*";
            } else {
                five+="*";
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
    }
}
