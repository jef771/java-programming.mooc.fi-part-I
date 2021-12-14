
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Sightings birdDb = new Sightings();
        
        loop: while(true) {
            String command = scan.nextLine();
            
            switch(command) {
                case "Add":
                    String name = scan.nextLine();
                    String latinName = scan.nextLine();
                    birdDb.add(name, latinName);
                    break;
                case "Observation":
                    String birdName = scan.nextLine();
                    if(!(birdDb.checkIfContains(birdName))) {
                        System.out.println("Not a bird!");
                    } else {
                        birdDb.observation(birdName);
                    }
                    break;
                case "All":
                    birdDb.all();
                    break;
                case "One":
                    String nameBird = scan.nextLine();
                    birdDb.one(nameBird);
                    break;
                case "Quit":
                    break loop;
            }
        }
    }

}
