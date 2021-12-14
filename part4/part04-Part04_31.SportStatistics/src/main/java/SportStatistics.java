
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        
        try(Scanner sc = new Scanner(Paths.get(file)) ) {
            
            while(sc.hasNextLine()) {
                int count = 0;
                String[] data = sc.nextLine().split(",");
                
                boolean check = checkExistence(data[0], names);
                boolean check2 = checkExistence(data[1], names);
                
                if(!check) {
                    Team a = new Team(data[0]);
                    teams.add(a);
                } if (!check2) {
                    Team b = new Team(data[1]);
                    teams.add(b);
                }
                
                names.add(data[0]);
                names.add(data[1]);
                
                for(Team s: teams) {
                    if(data[0].equals(s.getName())) {
                        playGame(teams, data);
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        String teamQuerry = scan.nextLine();
        
        for(Team s: teams) {
            if(teamQuerry.equals(s.getName())) {
                System.out.println("Games: " + s.getGames());
                System.out.println("Wins: " + s.getWins());
                System.out.println("Losses: " + s.getLosses());
                return;
            }
        }
        
        System.out.println("Games: 0");
        System.out.println("Wins: 0");
        System.out.println("Losses: 0");

    }
    
    public static boolean checkExistence(String teamName, ArrayList<String> teams) {
        for(String s: teams) {
            if(teamName.equals(s)) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void countGame(ArrayList<Team> teams, String teamName) {
        for(Team s: teams) {
            if(teamName.equals(s.getName())) {
                s.setGame();
            }
        }
    }
 
    public static void countWin(ArrayList<Team> teams, String teamName) {
        for(Team s: teams) {
            if(teamName.equals(s.getName())) {
                s.setWin();
            }
        }
    }
    
    public static void countLoss(ArrayList<Team> teams, String teamName) {
        for(Team s: teams) {
            if(teamName.equals(s.getName())) {
                s.setLoss();
            }
        }
    }
    
    public static void playGame(ArrayList<Team> teams, String[] data) {
        if(Integer.valueOf(data[2]) > Integer.valueOf(data[3])) {
            countWin(teams, data[0]);
            countLoss(teams, data[1]);
            countGame(teams, data[0]);
            countGame(teams, data[1]);
        } else {
            countWin(teams, data[1]);
            countLoss(teams, data[0]);
            countGame(teams, data[1]);
            countGame(teams, data[0]);            
        }
    }

}
