import java.util.LinkedList;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private String[] restaurant;
    private double rating;
    private String showMenuCard;
    private double price;
    private List<String> menuCard = new LinkedList<>();
    private List<Restaurant> allRestaurant = new LinkedList<>();
    private List<Restaurant> allItems = new LinkedList<>();
    private List<Restaurant> items = new LinkedList<>();

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    private StartMenu startMenu = new StartMenu();
    private User thisUser = null;



public void options(){
        String differentOptions = ui.getInput("Please choose an option: \n Option 1: search for a category \n Option 2: search for a restuarant \n Option 3: search for a food item \n Option 4: search for a delivery price \n Option 5: search for a rating ");
 switch (differentOptions){
     case "1":
         searchForCategory();
         break;

     case "2":
         searchForRestuarant();
         break;

     case "3":
         searchForItems();
         break;

     case "4":
         searchForDeliveryPrice();
         break;

     case "5":
         searchForRating();
         break;

     case "6":
        thisUser = null;
        break;
 }

    }

    public void getItem(){

    }

    public List<String> getMenuCard(){
        return menuCard;
    }

    public void searchForCategory(){
        String input = ui.getInput("Write the catergory you are looking for");
        List<Restaurant> restaurantCatergory = new LinkedList<>();
        for (Restaurant r : allRestaurant) {
            for (String s : r.getRestaurant()) {
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
    }

    public void searchForRestuarant(){

    }

    public String searchForItems(){
        return searchForItems();
    }

    public String searchForDeliveryPrice(){
        return searchForDeliveryPrice();
    }

    public String searchForRating(){
        return searchForRating();
    }

    public String getRestaurantName(){
        return restaurantName;
    }

    public double getRating(){
        return rating;
    }

    public String[] getRestaurant(){
        return restaurant;
    }


    public List<Restaurant> getItems() {
        return items;
    }

    public double getPrice() {
        return price;
    }

public void setUp(){
        allRestaurant = io.readRestuarantData();
}

public void startFoodie(){
    setUp();
    ui.displayMessage("Welcome to Foodie, do you want to create a user or login?");
    String options = "";
    boolean running = true;

    while (running) {
        if (thisUser != null) {
            options();
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
}
