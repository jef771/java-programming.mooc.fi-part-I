
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(fileName))) {
            
            while(sc.hasNextLine()) {
                
                String[] data = sc.nextLine().split(",");
                
                if(Integer.valueOf(data[1]) == 1) {
                    System.out.println(data[0] + ", age: " + data[1] + " year");
                } else {
                    System.out.println(data[0] + ", age: " + data[1] + " years");
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
