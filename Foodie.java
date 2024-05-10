import java.util.LinkedList;
import java.util.List;

public class Foodie {

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    private StartMenu startMenu = new StartMenu();
    private User thisUser = null;

    private List<Restaurant> restaurantsList;

    public void setUp() {
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


    public void chooseRestuarantDialog() {
        String differentOptions = ui.getInput("Please choose an option: \n Option 1: search after category \n Option 2: search after a restuarant \n Option 3: search after a delivery price \n Option 4: search after rating ");
        switch (differentOptions) {
            case "1":
                searchForCategory();
                break;

            case "2":
                searchForRestuarantName();
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

    public void searchForCategory() {
        System.out.println(" ");

        String input = ui.getInput("Write the category you are looking for");

        List<Restaurant> restaurantsByCategory = new LinkedList<>();

        for (Restaurant restaurantbyCategory : restaurantsList) {
            String g = restaurantbyCategory.getCategory();
            if (g.equalsIgnoreCase(input)) {
                restaurantsByCategory.add(restaurantbyCategory);
            }
        }
    }

    public void searchForRestuarantName() {
    }

    public void searchForDeliveryPrice(){
    }

    public void searchForRating() {

        System.out.println(" ");

        String input = ui.getInput("Search for rating");
        List<Restaurant> searchRating = new LinkedList<>();

        for (Restaurant searchForRating : restaurantsList) {
            String r = searchForRating.getRating();
            if(r.equalsIgnoreCase(input)){
                searchRating.add(searchForRating);

            }
        }
    }
}









