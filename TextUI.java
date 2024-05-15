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

    public void displayRestuarantList(List<Restaurant> in){
        for(Restaurant r: in){
            displayMessage(in.indexOf(r) + ". " + r.toString());
        }
    }


}


