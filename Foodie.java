import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Foodie {

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    private StartMenu startMenu = new StartMenu();
    private User thisUser = null;

    private List<Restaurant> restaurantsList = new ArrayList<>();


    public void setUp() {
        restaurantsList = io.readRestaurantData();
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


    public void chooseRestuarantDialog() {
        String differentOptions = ui.getInput("Please choose an option: \n Option 1: See all restuarants \n Option 2: search after category \n Option 3: search after a restuarant \n Option 4: search after a delivery price \n Option 5: search after rating ");
        switch (differentOptions) {
            case "1":
                ui.displayRestuarantList(restaurantsList);
                break;

            case "2":
                searchForCategory();
                break;

            case "3":
                searchForRestuarantName();
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


    public void searchForCategory() {
            System.out.println(" ");

            String input = ui.getInput("Write the category you are looking for");

            List<Restaurant> restaurantsByCategory = new LinkedList<>();

            for (Restaurant restaurant : restaurantsList) {
                String category = restaurant.getCategory();
                if (category.equalsIgnoreCase(input)) {
                    restaurantsByCategory.add(restaurant);
                }
            }

            if (restaurantsByCategory.isEmpty()) {
                System.out.println("No restaurants found in category: " + input);
            } else {
                System.out.println("Restaurants in category " + input + ":");
                for (Restaurant r : restaurantsByCategory) {
                    System.out.println(r);
                }
            }
              choice(ui.getInput("Choose one of the restuarants"));

    }

        public void searchForRestuarantName() {
        System.out.println(" ");
        String input = ui.getInput("Write the name of the Restuarant you a looking for");
        List<Restaurant> restaurantsByName = new LinkedList<>();
        for (Restaurant rName : restaurantsList) {
            String n = restaurantsByName.getFirst().getRestaurantName();
            if (n.equalsIgnoreCase(input)) {
                restaurantsByName.add(rName);
            }
        }
     /*   Restaurant chosenRestuarant = restaurantsByName.get(0);
        ui.displayMessage("You have chosen: " + chosenRestuarant.getRestaurantName());
    if(input = chosenRestuarant){
        choice();
    }else {
        ui.displayMessage("Invalid choice. Please try again");
    }*/
    }

   public void searchForDeliveryPrice() {
        System.out.println(" ");
        String input = ui.getInput("Search after the delivery price");
        List<Restaurant> deliveryPrice = new LinkedList<>();
        for (Restaurant dPrice : restaurantsList) {
            String dp = String.valueOf(deliveryPrice.getFirst().getDelveryPrice());
            if (dp.equalsIgnoreCase(input)) {
                deliveryPrice.add(dPrice);
            }
        }
    }

   public void searchForRating() {

        System.out.println(" ");

        String input = ui.getInput("Search for rating");
        List<Restaurant> searchRating = new LinkedList<>();

        for (Restaurant searchForRating : restaurantsList) {
            String r = String.valueOf(searchForRating.getRating());
            if(r.equalsIgnoreCase(input)){
                searchRating.add(searchForRating);

            }
        }
    }

    public void choice(String chosenRestuarant){
        for(Restaurant r : restaurantsList) {
            if (r.getRestaurantName().equalsIgnoreCase(chosenRestuarant) && chosenRestuarant != null) {
                ui.displayMessage("You have chosen: " + chosenRestuarant);

                String userChoice = ui.getInput("Do you want see the options for \n1: food \n2: drinks \n3: dessert");

                switch (userChoice){
                    case "1":
                        r.displayFoodList();

                        break;

                    case "2":
                        r.displayDrinksList();
                        break;

                    case "3":
                        r.displayDessertList();
                        break;
                }


                String addToOrdre = ui.getInput("Chose what you want to ordre");

            }
        }
    }
}









