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



    public String getRestaurantName(){
        return restaurantName;
    }

    public double getRating(){
        return rating;
    }

    public double getDelveryPricePrice() {
        return delveryPrice;
    }

}

