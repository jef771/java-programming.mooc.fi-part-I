
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String number = sc.nextLine();
            if(number.equals("end")) {
                break;
            }
            int n = Integer.valueOf(number);
            
            System.out.println(n*n*n);  
        }
    }
}
