
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ans;
        String temp;
        
        System.out.println("Write something:");
        temp = scanner.nextLine();
        ans = Boolean.valueOf(temp);
        
        System.out.println("True or false? " + ans);

        // write your program here

    }
}
