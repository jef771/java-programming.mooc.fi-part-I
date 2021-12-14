
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;


        loop: while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            
            switch(parts[0]) {
                case "quit":
                    break loop;
                case "add":
                    if(Integer.valueOf(parts[1]) > 0) {
                    first+=Integer.valueOf(parts[1]);
                    if(first > 100) {
                        first = 100;
                    }                        
                    }
                    break;
                case "move":
                    if(Integer.valueOf(parts[1]) <= first && Integer.valueOf(parts[1]) > 0) {
                    first-=Integer.valueOf(parts[1]);
                    second+=Integer.valueOf(parts[1]);
                    if(second > 100) {
                        second = 100;
                    }
                    } else {
                        int temp = first - Integer.valueOf(parts[1]);
                        temp+=Integer.valueOf(parts[1]);
                        first*=0;
                        second+=temp;
                    }
                    break;
                case "remove":
                    second-=Integer.valueOf(parts[1]);
                    if(second < 0) {
                        second*=0;
                    } 
                    break;
            }

        }
    }
}
