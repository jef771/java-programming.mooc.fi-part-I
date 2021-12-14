import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while(true) {
            String title = sc.nextLine();
            
            if(title.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(sc.nextLine());
            int year = Integer.valueOf(sc.nextLine());
            
            bookList.add(new Book(title, pages, year));
        }
        
        String info = sc.nextLine();
        
        if(info.equals("name")) {
            for(Book s: bookList) {
                System.out.println(s.getTitle());
            }
        } else {
            for(Book s: bookList) {
                System.out.println(s.getDetails());
            }
        }
       
    }
}
