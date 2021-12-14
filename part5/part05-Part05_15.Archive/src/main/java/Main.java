
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while(true) {
            String identifier = sc.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            
            Item newItem = new Item(identifier, name);
            
            if(items.contains(newItem)) {
                continue;
            } else {
                items.add(newItem);
            }
        }
        
        for(Item s: items) {
            System.out.println(s.toString());
        }
    }
}
