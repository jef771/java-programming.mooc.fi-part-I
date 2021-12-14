import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;        
    }
    
    public static int indexOfSmallestFrom(int[] array, int n) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=n; i<array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1; j++) {
                if(array[j+1] < array[j]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

}
