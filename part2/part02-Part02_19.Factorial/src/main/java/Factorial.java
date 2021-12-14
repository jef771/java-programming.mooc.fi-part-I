
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int factorial = 1;
        
        for(int i=x; i>=1; i--) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
