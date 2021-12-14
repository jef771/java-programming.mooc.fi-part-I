
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        
        while(true) {
            int x = scanner.nextInt();
            
            if(x == 0) {
                break;
            } else if(x > 0){
                sum+=x;
                count++;
            }                      
        }
        double ans = sum/(double)count;
        
        if((int) ans == 0) {
            System.out.println("Cannot calculate the average");                    
        } else {
            System.out.println(ans);
        }
    }
}
