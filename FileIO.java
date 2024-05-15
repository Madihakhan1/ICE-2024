import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;


public class FileIO {

   // List<User> loadedUsers = new LinkedList<>();

    public List<User> readUserData() {
        List<User> readUsers = new LinkedList<>();
        try {
            File file = new File("Doc/userData");
            Scanner scanner = new Scanner(file);
            scanner.nextLine(); //skipping the header line
            while (scanner.hasNext()) {
                //Læs den næste linje og gem den i line
                String line = scanner.nextLine();
                //Trim fjerner mellemrum i start og slutning
                line = line.trim();
                String[] splitted = line.split(",");
                //Her laver vi et user object og trimmer på 0,1 og 2 index
                User userObj = new User(splitted[0].trim(), splitted[1].trim(), splitted[2].trim());
                readUsers.add(userObj); // Adding the user object to the local list
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
                //Jeg bygger denne String før den skriver til filen
                String textTosave = u.getUserName() + "," + u.getUserPassword() + "," + u.getAddress() + "\n";
                writer.write(textTosave);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("File was not found" + e.getMessage());
        }
    }


    public void saveOrders(User user) {
        //Den trækker userens orders ud og gemmer den i den lokale variabel, som er orders
        List<String> orders = user.getOrders();
        try {
            FileWriter fwSaved = new FileWriter("Doc/savedOrders");
            String ordresToSave = user.getUserName() + ":";
            for (String o : orders) {
                // Samme som "ordersToSave = OrdersToSave +"
                ordresToSave += o + ",";
            }
            fwSaved.write(ordresToSave + "\n");
            fwSaved.flush();
            fwSaved.close();
        } catch (Exception e) {
            System.out.println("File was not found" + e.getMessage());
        }
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

                //Løber igennem food String[] array og gemmer i en foodListe
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
                restaurants.add(new Restaurant(restaurantName, category, foodList, drinkList, dessertList,"",""));
            }
        } catch(Exception e){
            System.out.println("An error occurred while reading restaurant data: " + e.getMessage());
        }
        return restaurants;
    }


}



