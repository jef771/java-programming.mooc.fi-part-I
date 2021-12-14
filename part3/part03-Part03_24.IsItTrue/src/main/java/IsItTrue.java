
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bool = sc.nextLine();
        
        if(bool.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
