import java.util.*;

public class StartMenu {

    private String userName;
    private String userPassword;
    private String address;
    protected List<User> registeredUsers = new LinkedList<>();

    private TextUI ui = new TextUI();
    private FileIO io = new FileIO();

    public StartMenu(){
        this.registeredUsers = io.readUserData();
    }
    
    public void createUser(){

        ui.displayMessage("Create a user");

        this.userName = ui.getInput("Please type a username");
        this.userPassword = ui.getInput("Please type a password");
        this.address = ui.getInput("Please type your address");

        List<User>registeredUsers = io.readUserData();

        for(User u: registeredUsers){
            if(u.getUserName().equals(this.userName)){
                ui.displayMessage("User name is not available");
                return;
            }
        }

        User createdUser = new User(userName, userPassword, address);
        this.registeredUsers.add(createdUser);
        io.saveUserData(this.registeredUsers);

    }

    public User login(){
        Scanner userinput = new Scanner(System.in);
        ui.displayMessage("type your username");
        userName = userinput.nextLine();

        ui.displayMessage("type your password");
        userPassword = userinput.nextLine();


        for(User u : registeredUsers){
            if(u.getUserName().equals(userName) && u.getUserPassword().equals(userPassword)){
                System.out.println("current user: "+u.getUserName());
                return u;

            }
        }
        return null;
    }
}
