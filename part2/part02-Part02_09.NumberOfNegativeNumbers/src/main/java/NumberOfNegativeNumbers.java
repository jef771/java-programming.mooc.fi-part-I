
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int x = scanner.nextInt();
            
            if(x == 0) {
                break;
            } else if(x < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
