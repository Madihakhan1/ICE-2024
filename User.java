import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String userPassword;
    private String address;

    private List<String> food;
    private List<String> orders;


    public User(String userName, String userPassword, String address, List<String>food, List<String>orders){
        this.userName = userName;
        this.userPassword = userPassword;
        this.address = address;
        this.food = new ArrayList<>();
        this.orders = new ArrayList<>();

    }

    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public List<String>getFood(){

        return null;

    }

    public List<String>getOrders(){
        return null;
    }




}
