
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = scan.nextInt();
        double ans;
        
        if(gift >= 1000000) {
            ans = 142100 + (gift - 1000000) * 0.17;
        } else if(gift >= 200000) {
            ans = 22100 + (gift - 200000) * 0.15;
        } else if(gift >= 55000) {
            ans = 4700 + (gift - 55000) * 0.12;
        } else if(gift >= 25000) {
            ans = 1700 + (gift - 25000) * 0.10;
        } else if(gift >= 5000) {
            ans = 100 + (gift - 5000) * 0.08;
        } else {
            ans = 0;
        }
        
        if(gift >= 5000) {
            System.out.println("Tax: " + ans);
        } else {
            System.out.println("No tax!");
        }

    }
}
