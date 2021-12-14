
import java.util.*;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        ArrayList<String> namesAge = new ArrayList<>();
        
        while(true) {
            String phrase = sc.nextLine();
            if(phrase.equals("")) {
                break;
            }
            namesAge.add(phrase);
            String[] words = phrase.split(",");
            
            int age = Integer.valueOf(words[1]);
            
            oldest = Math.max(age, oldest);          
        }
        
        System.out.println(oldest);
    }
}
