
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grades list = new Grades();
        
        while(true) {
            int grade = sc.nextInt();
            
            if(grade >= 0 && grade <= 100) {
                list.add(grade);
            } else if(grade == -1) {
                break;
            }
        }
        
        list.average();
        list.passingGradeAverage();
        list.passingPercentage();
        list.gradeDistribution();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
