
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String phrase = sc.nextLine();
            if(phrase.equals("")) {
                break;
            }
            String[] words = phrase.split(" ");
        
            System.out.println(words[0]);
        }    

    }
}