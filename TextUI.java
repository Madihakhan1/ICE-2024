import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

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
public void showAllRestuarants(List<Restaurant> in, String msg){
    for(Restaurant r: in){
        displayMessage(in.indexOf(r) + ". " + r.toString());
    }
}

    }


