import java.util.LinkedList;
import java.util.List;

public class Foodie {

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    private StartMenu startMenu = new StartMenu();
    private User thisUser = null;

    private List<Restaurant> restaurantsList;

    public void setUp(){
        restaurantsList = io.readRestuarantData();
    }

    public void startDialog() {
        setUp();
        ui.displayMessage("Welcome to Foodie, do you want to create a user or login?");
        String options = " ";
        boolean running = true;

        while (running) {
            if (thisUser != null) {
                chooseRestuarantDialog();
            } else {
                options = ui.getInput("Choose an option: \n Option 1: create a user \n option 2: login \n option 3: Exit");
                switch (options) {
                    case "1":
                        startMenu.createUser();
                        break;
                    case "2":
                        thisUser = startMenu.login();
                        break;
                    case "3":
                        running = false;
                        break;
                }
            }
        }

    }


public void chooseRestuarantDialog(){
    String differentOptions = ui.getInput("Please choose an option: \n Option 1: search after category \n Option 2: search after a restuarant \n Option 3: search after a delivery price \n Option 4: search after rating ");
    switch (differentOptions){
        case "1":
           // searchForCategory();
            break;

        case "2":
            searchForRestuarant();
            break;

        case "3":
            searchForDeliveryPrice();
            break;

        case "4":
            searchForRating();
            break;

        case "5":
            thisUser = null;
            break;
    }
}

  /*  public void searchForCategory(){
        String input = ui.getInput("Write the catergory you are looking for");
        List<Restaurant> restaurantCatergory = new LinkedList<>();
        for (Restaurant r : getRestuarantName) {
            for (String s : r.getFoodList()) {
                if (s.equalsIgnoreCase(input)) {
                    restaurantCatergory.add(r);
                }
            }
        }
        ui.showAllRestuarants(restaurantCatergory, " ");
        int chosenIndexRestuarant = ui.showAllRestuarants(restaurantCatergory, "Please choose a restuarant ");
        if (chosenIndexRestuarant >= 0 && chosenIndexRestuarant < restaurantCatergory.size()) {
            Restaurant chosenRestuarant = restaurantCatergory.get(chosenIndexRestuarant);
            ui.displayMessage("You have chosen " + chosenRestuarant.getRestaurantName());
            ui.displayMessage("Do you want to eat here at " + restaurantName + "or somewhere else?");
            String choice = ui.getInput("1. Eat here, 2. Another place");
            switch (choice) {
                case "1":
                    eatAtRestuarant(chosenRestuarant);
                    thisUser.getOrders();
                    io.saveOrders(thisUser);
                    break;

                case "2":
                    ui.displayMessage("Choose another place");
                    thisUser.getOrders();
                    io.saveOrders(thisUser);
                    break;
            }
        } else {
            ui.displayMessage("Invalid selection.");
        }
    }

    public void eatAtRestuarant(Restaurant chosenRestuarant) {
        if (chosenRestuarant != null) {
            ui.displayMessage("Chosen restuarant: " + chosenRestuarant);
            thisUser.getOrders();
        } else {
            ui.displayMessage("Invalid selection. Please try again.");
        }
    }*/

    public void searchForRestuarant(){
    }

    public void searchForDeliveryPrice(){
    }

    public void searchForRating(){
    }

}
