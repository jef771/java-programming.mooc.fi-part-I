import java.util.*;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFromNumberToOne(n);
    }
    
    public static void printFromNumberToOne(int number) {
        for(int i=number; i>=1; i--) {
            System.out.println(i);
        }
    }
}
