
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength = Integer.MIN_VALUE;
        long averageBirthYear = 0L;
        double count = 0.0;
        String name = new String();
        ArrayList<String> namesAge = new ArrayList<>();
        
        while(true) {
            String phrase = sc.nextLine();
            if(phrase.equals("")) {
                break;
            }
            String[] details = phrase.split(",");

            int nameLength = details[0].length();
            if(nameLength > maxLength) {
                maxLength = nameLength;
                name = details[0];
            }
            
            averageBirthYear += Long.valueOf(details[1]);
            count++;
        }
        
        System.out.println(name);
        System.out.println(averageBirthYear / count);

    }
}
