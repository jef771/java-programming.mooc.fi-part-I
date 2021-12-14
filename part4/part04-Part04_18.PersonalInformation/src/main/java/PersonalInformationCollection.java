
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String firstName= sc.nextLine();
            if(firstName.isEmpty()) {
                break;
            }
            String lastName = sc.nextLine();
            String idNumber = sc.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        
        for(PersonalInformation s: infoCollection) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        

    }
}
