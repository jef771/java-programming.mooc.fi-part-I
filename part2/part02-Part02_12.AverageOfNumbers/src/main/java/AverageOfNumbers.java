
import java.util.Scanner;

public class AverageOfNumbers {

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
        double ans = sum/(double)count;
        
        System.out.println("Average of the numbers: " + ans);;
    }
}
