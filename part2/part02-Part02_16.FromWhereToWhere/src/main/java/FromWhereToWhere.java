
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Where to? ");
        int x = scanner.nextInt();
        System.out.print("Where from? ");
        int y = scanner.nextInt();
        
        if(x > y) {
            for(int i = y; i<=x; i++) {
                System.out.println(i);
            }            
        } else if (x == y) {
            System.out.println(x);
        }
        // Write your program here
    }
}
