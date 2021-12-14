
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(true) {
            int temp = sc.nextInt();
            if(temp == -1) {
                break;
            }
            arr.add(temp);
        }
        
        int sum = 0;
        for(int x: arr) {
            sum+=x;
        }
        
        double ans = sum/(double)arr.size();
                
        System.out.println(ans);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
