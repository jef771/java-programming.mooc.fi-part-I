/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
import java.util.*;

public class UserInterface {
    private JokeManager manager;
    private Scanner sc;
    
    public UserInterface(JokeManager manager, Scanner sc) {
        this.manager = manager;
        this.sc = sc;
    }
    
    public void start() {
        loop: while(true) {
            String command = this.sc.nextLine();
            
            switch(command) {
                case "X":
                    break loop;
                case "1":
                    String newJoke = this.sc.nextLine();
                    manager.addJoke(newJoke);
                    break;
                case "2":
                    String joke = this.manager.drawJoke();
                    System.out.println(joke);
                    break;
                case "3":
                    this.manager.printJokes();
                    break;
            }
        }
    }
    
}
