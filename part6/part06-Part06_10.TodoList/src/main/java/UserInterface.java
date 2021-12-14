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
    private TodoList list;
    private Scanner sc;
    
    public UserInterface(TodoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }
    
    public void start() {
        
        loop: while(true) {
            String command = this.sc.nextLine();
            switch(command) {
                case "stop":
                    break loop;
                case "add":
                    String newTask = this.sc.nextLine();
                    this.list.add(newTask);
                    break;
                case "list":
                    this.list.print();
                    break;
                case "remove":
                    int toRemove = Integer.valueOf(this.sc.nextLine());
                    this.list.remove(toRemove);
                    break;
                default:
                    continue;
            }
        }
    }
}
