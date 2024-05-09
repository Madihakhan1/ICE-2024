import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private String[] restaurant;
    private double rating;
    private String showMenuCard;
    private List<String> menuCard;
    private List<Restaurant> allRestaurant;
    private List <Restaurant> allItems;
    private String item;

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    private User thisUser = null;

    public Restaurant(String restaurantName, String [] restaurant, double rating, String showMenuCard, List<String> menuCard, List<Restaurant> allRestaurant, List <Restaurant> allItems, String item){
        this.restaurantName = restaurantName;
        this.restaurant = new String[]{""};
        this.rating = rating;
        this.showMenuCard = showMenuCard;
        this.menuCard = new ArrayList<>();
        this.allRestaurant = new ArrayList<>();
        this.allItems = new ArrayList<Restaurant>();
        this.item = item;
    }

    public void getItem(){

    }

    public List<String> getMenuCard(){
        return menuCard;
    }

    public String searchForCategory(){
        System.out.println(" ");
        String input = ui.getInput("Write the genre you are looking for");
        List<Restaurant> restaurantCatergory = new LinkedList<>();
        for (Restaurant r : allRestaurant) {
            for (String s : r.getRestaurant()) {
                if (s.equalsIgnoreCase(input)) {
                    restaurantCatergory.add(r);
                }
            }
        }
        ui.showAllRestuarants(restaurantCatergory);
        int chosenIndexRestuarant = ui.showAllRestuarants(restaurantCatergory, "Please choose a restuarant ");
        if (chosenIndexRestuarant >= 0 && chosenIndexRestuarant < restaurantCatergory.size()) {
            Restaurant chosenRestuarant = restaurantCatergory.get(chosenIndexRestuarant);
            ui.displayMessage("You have chosen " + chosenRestuarant.getRestaurantName());
            ui.displayMessage("Do you want to eat here at " + restaurantName + "or somewhere else?");
            String choice = ui.getInput("1. Eat here, 2. Another place");
            switch (choice) {
                case "1":
                    eatAtRestuarant(chosenRestuarant); // Pass the chosen movie to the play() method
                    User.placeOrders(chosenRestuarant.getRestaurantName());
                    io.saveOrders(thisUser);
                    break;

                case "2":
                    ui.displayMessage("you can chose somewhere else " + searchForCategory());
                    User.placeOrders(chosenRestuarant.getRestaurantName());
                    io.saveOrders(thisUser);
                    break;
            }
            //play(chosenMovie); // Pass the chosen movie to the play() method
        } else {
            ui.displayMessage("Invalid selection.");
        }
    }
public void eatAtRestuarant(Restaurant chosenRestuarant) {
    if (chosenRestuarant != null) {
        ui.displayMessage("Now playing: " + chosenRestuarant);
        User.order(chosenRestuarant.getResturant);
    } else {
        ui.displayMessage("Invalid selection. Please try again.");
    }
}
    public String searchForResurant(){
        return searchForResurant();
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

    public String toString(){
        return toString();
    }

}
