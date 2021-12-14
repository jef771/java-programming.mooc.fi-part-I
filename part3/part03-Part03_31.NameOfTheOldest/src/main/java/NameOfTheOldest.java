
import java.util.*;

public class NameOfTheOldest {

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
        for(int i=0; i<namesAge.size(); i++) {
            String[] temp = namesAge.get(i).split(",");
            int age = Integer.valueOf(temp[1]);
            if(age == oldest) {
                System.out.println("Name of the oldest: " + temp[0]);
            }
        }

    }
}
