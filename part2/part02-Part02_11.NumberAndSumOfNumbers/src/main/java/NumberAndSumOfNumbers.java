
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int x = scanner.nextInt();
            
            if(x == 0) {
                break;
            }
            sum+=x;
            count++;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
