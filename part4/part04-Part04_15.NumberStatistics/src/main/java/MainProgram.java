
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd =  new Statistics();
        
        System.out.println("Enter numbers:");
        
        while(true) {
            int n = sc.nextInt();
            if(n == -1) {
                break;
            }
            stats.addNumber(n);
            if(n%2 == 0) {
                statsEven.addNumber(n);
            } else {
                statsOdd.addNumber(n);
            }
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
        
        
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
