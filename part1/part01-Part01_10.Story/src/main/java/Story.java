
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, job;
        
        System.out.println("I will tell you a story, "
                            + "but I need some information first.\n"
                            + "What is the main character called?");
        name = scanner.nextLine();
        
        System.out.println("What is their job?");
        job = scanner.nextLine();
        
        System.out.println("Here is the story:\n"
                            + "Once upon a time there was "
                            + name + ", who was "
                            + job + ".\nOn the way to work, "
                            + name + " reflected on life.\n"
                            + "Perhaps " + name + " will not be "
                            + job + " forever.");
        
        

        // Write your program here

    }
}
