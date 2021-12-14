
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int x = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double y = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bin = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + x);
        System.out.println("You gave the double " + y);
        System.out.println("You gave the boolean " + bin);
        // Write your program here

    }
}
