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

    public Restaurant(String restaurantName, String category, List<Food> foodList, List<Drinks> drinksList, List<Dessert> dessertList, String rating, String delveryPrice) {

        this.restaurantName = restaurantName;
        this.category = category;
        this.foodList = foodList;
        this.drinksList = drinksList;
        this.dessertList = dessertList;
        this.rating = rating;
        this.delveryPrice = delveryPrice;
    }

    public String getRestaurantName() {
        return restaurantName;
    }



    public String getCategory() {
        return category;
    }


    public void displayFoodList(){
        System.out.println("here is the food list: ");
        for(Food food : foodList){
            System.out.println(food);
        }
    }

    public void displayDrinksList(){
        System.out.println("Here is the drinks list: ");
        for(Drinks drinks : drinksList){
            System.out.println(drinks);
        }
    }

    public void displayDessertList(){
        System.out.println("Here is the dessert list : " + 1);
        for(Dessert dessert : dessertList){
            System.out.println(dessert);
        }
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



