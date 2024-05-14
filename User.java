import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String userPassword;
    private String address;

    private List<String> food = new ArrayList<>();
    private List<String> orders = new ArrayList<>();
    Cart cart = new Cart();


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

    public List<String>getOrders(){
        return orders;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }


    public void displayOrder(){
        for(String order : orders){

            //System.out.println("Your order: " + order + "\nAnd the total price is: " +  cart.getTotalPrice() + " kr. " + "Your delivery price is: "  + cart.getDeliveryPrice() + " kr.");
         }
    }


    public void addOrder(String order){
      orders.add(order);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        double unformatedTotalNum = (float)(cart.getTotalPrice() * cart.randomDiscount());
        DecimalFormat formatedTotal = new DecimalFormat("#.00");
        double unformatedPercentage = (float)((float)(cart.randomDiscount() * 100));
        DecimalFormat formatedPercentage = new DecimalFormat("#");

        return "Here is your order: " + orders + "\n" +
                "and the total is: " + formatedTotal.format(unformatedTotalNum) + " kr." + "\n" +
                "you have saved " + formatedPercentage.format(unformatedPercentage) + " %" + "\n" +
                "and the delivery price is:" + cart.getDeliveryPrice() + " kr.";

    }
}
