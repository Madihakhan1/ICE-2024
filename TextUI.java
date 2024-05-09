import java.util.Scanner;
import java.util.List;

public class TextUI {

        public String getInput(String msg){
            Scanner scanner = new Scanner(System.in);
            System.out.println(msg);
            String res = scanner.nextLine();
            return res;
        }

        public void displayMessage(String msg){
            System.out.println(msg);

        }


//public int chooseRestaurant(List<Restaurant>){
        //  return chooseRestaurant();
//}
public int showAllRestuarants(List<Restaurant> in, String msg){
    displayMessage(msg);
    //displayList(optionslist, "");
    String input = getInput("");//1
    //  lav input om til en int
    int choice = Integer.parseInt(input);
    return choice;
    }
}


