
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        double average = (x + y) / (double) 2;
        
        System.out.println("The average is " + average);
        // Write your program here

    }
}
