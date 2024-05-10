import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;


public class FileIO {

    List<User> loadedUsers = new LinkedList<>();

    public List<User> readUserData() {
        List<User> readUsers = new LinkedList<>();
        try {
            File file = new File("Doc/userData");
            Scanner scanner = new Scanner(file);
            scanner.nextLine(); //skipping the header line
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                line = line.trim();
                String[] splitted = line.split(",");
                User loaded = new User(splitted[0].trim(), splitted[1].trim(), splitted[2].trim());
                List<String> d = new LinkedList<>();
                loaded.setFood(d);
                readUsers.add(loaded); // Adding to the local list
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("File was not found: " + e.getMessage());
        }
        return readUsers; // Returning the local list
    }


    public void saveUserData(List<User> users) {
        File file = new File("Doc/userData");
        try {
            FileWriter writer = new FileWriter("Doc/userData");
            writer.write("Name, Password, Address \n");//Giv csv filen en header
            for (User u : users) {
                String textTosave = u.getUserName() + "," + u.getUserPassword() + "," + u.getAddress() + "\n";
                writer.write(textTosave);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("File was not found");
        }
    }


    public void saveOrders(User user) {
        List<String> orders = user.getOrders();
        try {
            FileWriter fwSaved = new FileWriter("Doc/savedOrders");
            String ordresToSave = user.getUserName() + ":";
            for (String o : orders) {
                ordresToSave += o + ",";
            }
            fwSaved.write(ordresToSave + "\n");
            fwSaved.close();
        } catch (IOException e) {
            System.out.println("File was not found");
        }
    }

    public List<String> showSavedOrdreHistory(User user) {
        return showSavedOrdreHistory(user);
    }
    public List<Restaurant> readRestaurantData() {
        File file = new File("Doc/Restaurant");
        List<Restaurant> restaurants = new LinkedList<>();

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); // Skip the header line
            while (scan.hasNext()) {
                String restaurantLine = scan.nextLine();
                String[] splitted = restaurantLine.split(";");
                String category = splitted[1].trim();
                String restaurantName = splitted[0].trim();
                String[] foodString = splitted[2].split(",");
                String[] drinksString = splitted[3].split(",");
                String[] dessertString = splitted[4].split(",");

                List<Food> foodList = new LinkedList<>();
                for (String foodItem : foodString) {
                    foodList.add(new Food(foodItem.trim()));
                }

                List<Drinks> drinkList = new LinkedList<>();
                for (String drinkItem : drinksString) {
                    drinkList.add(new Drinks(drinkItem.trim()));
                }

                List<Dessert> dessertList = new LinkedList<>();
                for (String dessertItem : dessertString) {
                    dessertList.add(new Dessert(dessertItem.trim()));
                }

                // Create a new Restaurant object with the restaurant name and its details
                restaurants.add(new Restaurant(restaurantName, category, foodList, drinkList, dessertList, "", ""));
            }
        } catch(Exception e){
            System.out.println("An error occurred while reading restaurant data: " + e.getMessage());
        }
        return restaurants;
    }


}



