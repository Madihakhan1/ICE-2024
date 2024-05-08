import java.util.ArrayList;
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
        return searchForCategory();
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
