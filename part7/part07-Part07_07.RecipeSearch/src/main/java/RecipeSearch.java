
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tempRecipe = new ArrayList<>();
        RecipeBook myRecipes = new RecipeBook();
        String fileName = scan.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(fileName))) {
            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                if(!(data.isEmpty())) {
                    tempRecipe.add(data);
                } else {
                    Recipe newRecipe = new Recipe(tempRecipe.get(0), Integer.valueOf(tempRecipe.get(1)));
                    for(int i=2; i<tempRecipe.size(); i++) {
                        newRecipe.add(tempRecipe.get(i));
                    }
                    tempRecipe.clear();
                    myRecipes.add(newRecipe);
                }
            }
            Recipe newRecipe = new Recipe(tempRecipe.get(0), Integer.valueOf(tempRecipe.get(1)));
            for(int i=2; i<tempRecipe.size(); i++) {
                newRecipe.add(tempRecipe.get(i));
            }
            tempRecipe.clear();
            myRecipes.add(newRecipe);            
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }        
        
        loop: while(true) {
            String command = scan.nextLine();
            
            switch(command) {
                case "list":
                    myRecipes.print();
                    break;
                case "find name":
                    String searchedWord = scan.nextLine();
                    myRecipes.searchRecipe(searchedWord);
                    break;
                case "find cooking time":
                    int searchedTime = Integer.valueOf(scan.nextLine());
                    myRecipes.searchTime(searchedTime);
                    break;
                case "find ingredient":
                    String searchedIngredient = scan.nextLine();
                    myRecipes.searchIngredient(searchedIngredient);
                    break;
                case "stop":
                    break loop;
            }
        }
    }

}
