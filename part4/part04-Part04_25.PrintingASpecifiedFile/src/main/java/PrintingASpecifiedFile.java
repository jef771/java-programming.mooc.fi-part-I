
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(fileName))) {
            while(scan.hasNextLine()){
                
                String row = scan.nextLine();
                
                System.out.println(row);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
