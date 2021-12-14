
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        while(true) {
            String word = sc.nextLine();
            
            if(word.equals("end")) {
                break;
            }
            
            count++;
        }
        
        System.out.println(count);
        
    }
}
