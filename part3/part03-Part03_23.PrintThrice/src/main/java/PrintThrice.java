
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        for(int i=0; i<3; i++) {
            System.out.print(word);
        }
        // Write your program here

    }
}
