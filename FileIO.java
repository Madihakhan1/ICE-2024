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


    public void saveUserData (List<User> users){
        File file = new File("Doc/userData");
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            FileWriter writer = new FileWriter("Doc/userData");
            writer.write("Name, Password, Address \n");//Giv csv filen en header
            for (User u: users) {
                String textTosave = u.getUserName()+ "," +u.getUserPassword() + "," + u.getAddress() + "\n";
                writer.write(textTosave);
            }
            writer.close();
        }catch (IOException e){
            System.out.println("File was not found");
        }
    }


    public void saveOrders (User user){
        List<String> orders = user.getOrders();
        try {
            FileWriter fwSaved = new FileWriter("Doc/savedOrders");
            String ordresToSave = user.getUserName() + ":";
            for (String o: orders) {
                ordresToSave += o + ",";
            }
            fwSaved.write(ordresToSave + "\n");
            fwSaved.close();
        }catch (IOException e){
            System.out.println("File was not found");
        }
    }

    public List<String> showSavedOrdreHistory(User user){
        return showSavedOrdreHistory(user);
    }

    public List<Restaurant> readRestuarantData(){

            File file = new File("Doc/Restaurant"); // Adjust the file path here
            List<Restaurant> restaurants = new LinkedList<>();

            try (Scanner scan = new Scanner(file)) {
                while (scan.hasNext()) {
                    String dataLine = scan.nextLine();
                    String[] splitted = dataLine.split(",");
                    String userName = splitted[0].trim();
                    String restaurantName = splitted[1].trim(); // Restaurant name from file

                    if (userName.equals(user.getUserName())) {
                        Restaurant restaurant = new Restaurant();
                        restaurants.add(restaurant);
                    }
                }
            } catch (Exception e) {
                System.out.println("An error occurred while reading restaurant data: " + e.getMessage());
            }
            return restaurants;
        }
    }



