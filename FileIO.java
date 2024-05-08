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

    }

    public List<String> showSavedOrdreHistory(User user){
        return showSavedOrdreHistory(user);
    }

    public List<Restaurant> readRestuarantData(){
        return readRestuarantData();
    }

    public List<Restaurant> readMenuCardData(){
        return readMenuCardData();
    }

}
