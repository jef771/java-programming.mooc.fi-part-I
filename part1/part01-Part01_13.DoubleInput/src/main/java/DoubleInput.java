
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        
        System.out.println("Give a number:");
        x = Double.valueOf(scanner.nextLine());
        
        System.out.println("You gave the number " + x);
        // write your program here

    }
}
