
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // implement here a program that reads user input
        // until the user enters 9999
        while(true) {
            int temp = sc.nextInt();
            if(temp == 9999) {
                break;
            }
            arr.add(temp);
        }
        
        int minValue = getSmallest(arr);
        System.out.println("Smallest number: " + minValue);
        printSmallest(arr, minValue);
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times 
    }
    
    public static int getSmallest(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        
        for(int x: arr) {
            if(x < min) {
                min = x;
            }
        }
        return min;
    }
    
    public static void printSmallest(ArrayList<Integer> arr, int minValue) {

        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == minValue) {
                System.out.println("Found at Index: " + i);
            }
        }
    }
}
