import java.util.*;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        division(x, y);
    }
    
    public static void division(int numerator, int denominator) {
        float ans = numerator / (float) denominator;
        
        System.out.println(ans);
                
    }

    // implement the method here
}
