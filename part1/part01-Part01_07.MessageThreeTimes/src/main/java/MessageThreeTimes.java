
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        String s = scanner.nextLine();
        
        System.out.println(s + '\n' + s + '\n' + s);
        // Write your program here

    }
}
