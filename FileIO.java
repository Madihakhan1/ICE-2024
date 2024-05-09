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

    public List<Restaurant> readRestuarantData() {


        {
            File file = new File("Doc/Restaurant");
            List<Restaurant> restuarants = new LinkedList<>();
            String catergory;
            List<Food>foodList = new LinkedList<>();
            List<Drinks>drinkList = new LinkedList<>();
            List<Dessert> dessertList = new LinkedList<>();

            try {
                Scanner scan = new Scanner(file);
                scan.nextLine();
                while (scan.hasNext()) {
                    String restaurantLine = scan.nextLine();
                    String[] splitted = restaurantLine.split(";");
                    catergory = splitted[1].trim();
                    String restaurantName = splitted[0].trim();
                    String[] foodString = splitted[2].split(",");
                    String[] drinksString = splitted[3].split(",");
                    String[] dessertString = splitted[4].split(",");

                    for (int i = 0; i < foodString.length; i++) {
                        foodList.add(new Food(foodString[i].trim()));
                        // Create a new Restaurant object with the restaurant name
                        restuarants.add(new Restaurant(restaurantName, catergory, foodList, drinkList, dessertList, 0 , 0));
                    }
                }
            } catch(Exception e){
                System.out.println("An error occurred while reading restaurant data: " + e.getMessage());
            }
            return restuarants;
        }
    }


}



