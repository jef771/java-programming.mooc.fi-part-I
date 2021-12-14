
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String itemName = sc.nextLine();
            if(itemName.isEmpty()) {
                break;
            }
            
            items.add(new Item(itemName));
        }
        
        for(int i=0; i<items.size(); i++) {
            System.out.println(items.get(i).toString());
                   
        }

    }
}
