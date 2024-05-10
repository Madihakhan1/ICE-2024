import java.util.LinkedList;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private String category;
    private String rating;
    private String delveryPrice;
    private List<Drinks> drinksList = new LinkedList<>();
    private List<Food> foodList = new LinkedList<>();
    private List<Dessert> dessertList = new LinkedList<>();

    public Restaurant(String restaurantName,String catergory, List<Food>foodList, List<Drinks>drinksList, List<Dessert>dessertList, double rating, double delveryPrice ){

        this.restaurantName = restaurantName;
        this.catergory = catergory;
        this.foodList = foodList;
        this.drinksList = drinksList;
        this.dessertList = dessertList;
        this.rating = rating;
        this.delveryPrice = delveryPrice;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public double getRating(){
        return rating;
    }

    public double getDelveryPrice() {
        return delveryPrice;
    }

    public String getCategory() {
        return category;
    }




    @Override

    public String toString() {


        StringBuilder out = new StringBuilder();
        out.append("Restaurant Name: ").append(this.restaurantName).append(", ");
        out.append("Category: ").append(this.category).append(", ");
        out.append("Food List: ").append(this.foodList).append(", ");
        out.append("Drinks List: ").append(this.drinksList).append(", ");
        out.append("Dessert List: ").append(this.dessertList);

        return out.toString();

    }
}



