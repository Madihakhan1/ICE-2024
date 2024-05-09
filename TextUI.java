import java.util.Scanner;
import java.util.List;

public class TextUI {


        private Scanner scanner;

        public String getInput(String msg){
            return msg;
        }

        public void displayMessage(String msg){

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


