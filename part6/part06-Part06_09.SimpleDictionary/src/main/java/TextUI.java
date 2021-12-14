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

public class TextUI {
    private Scanner sc;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner sc, SimpleDictionary dictionary) {
        this.sc = sc;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        loop: while(true) {
            String command = this.sc.nextLine();
            
            switch(command) {
                case "end":
                    System.out.println("Bye bye!");
                    break loop;
                case "add":
                    String word = this.sc.nextLine();
                    String translation = this.sc.nextLine();
                    this.dictionary.add(word, translation);
                    break;
                case "search":
                    String wordToTranslate =  this.sc.nextLine();
                    String wordTranslated = this.dictionary.translate(wordToTranslate);
                    if(wordTranslated == null) {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } else {
                        System.out.println(wordTranslated);
                    }
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
