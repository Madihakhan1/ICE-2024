import java.util.LinkedList;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private String catergory;
    private double rating;
    private double delveryPrice;
    private List<Drinks> drinksList = new LinkedList<>();
    private List<Food> foodList = new LinkedList<>();
    private List<Dessert>dessertList = new LinkedList<>();


    private StartMenu startMenu = new StartMenu();
    private User thisUser = null;

    public Restaurant(String restaurantName,String catergory, List<Food>foodList, List<Drinks>drinksList, List<Dessert>dessertList, double rating, double price ){

        this.restaurantName = restaurantName;
        this.catergory = catergory;
        this.foodList = foodList;
        this.drinksList = drinksList;
        this.dessertList = dessertList;
        this.rating = rating;
        this.delveryPrice = delveryPrice;


    }


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

    public double getPrice() {
        return price;
    }

}

