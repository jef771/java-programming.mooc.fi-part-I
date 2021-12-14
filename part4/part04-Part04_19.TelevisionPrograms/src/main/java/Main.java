import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String programName= sc.nextLine();
            if(programName.isEmpty()) {
                break;
            }
            int programDuration = Integer.valueOf(sc.nextLine());
            
            programs.add(new TelevisionProgram(programName, programDuration));
        }
        
        int maximumDuration = Integer.valueOf(sc.nextLine());
        
        for(TelevisionProgram s: programs) {
            if(s.getDuration() <= maximumDuration) {
                System.out.println(s.getName() + ", " + s.getDuration() + " minutes");
            }
        }

    }
}
