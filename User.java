import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String userPassword;
    private String address;

    private List<String> food = new ArrayList<>();
    private List<String> orders = new ArrayList<>();;


    public User(String userName, String userPassword, String address){
        this.userName = userName;
        this.userPassword = userPassword;
        this.address = address;


    }

    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public List<String>getFood(){
        return food;
    }

    public List<String>getOrders(){
        return orders;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }
}
