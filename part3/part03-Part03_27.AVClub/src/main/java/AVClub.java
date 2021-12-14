
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String phrase = sc.nextLine();
            if(phrase.equals("")) {
                break;
            }
            String[] words = phrase.split(" ");
        
            for(int i=0; i<words.length; i++) {
                if(words[i].contains("av")) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
