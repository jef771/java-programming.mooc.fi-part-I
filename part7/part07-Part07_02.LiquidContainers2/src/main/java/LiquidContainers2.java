
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


         loop: while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            
            switch(parts[0]) {
                case "quit":
                    break loop;
                case "add":
                    first.add(Integer.valueOf(parts[1]));
                    break;
                case "move":
                    if(Integer.valueOf(parts[1]) <= first.contains() && Integer.valueOf(parts[1]) > 0) {
                    first.remove(Integer.valueOf(parts[1]));
                    second.add(Integer.valueOf(parts[1]));
                    } else {
                        int temp = first.contains() - Integer.valueOf(parts[1]);
                        temp+=Integer.valueOf(parts[1]);
                        first.remove(temp);
                        second.add(temp);
                    }

                    break;
                case "remove":
                    second.remove(Integer.valueOf(parts[1]));
                    break;
            }

        }
    }

}
