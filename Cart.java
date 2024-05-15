import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cart {

    Random rand = new Random();
    private int deliveryPrice;
    private int totalPrice;
    private double randNum = Math.random()/2;

    public Cart(){}


    public void calculateTotalPrice(){
        totalPrice = rand.nextInt(300);
    }

    public void calculateDeliveryPrice(){
        deliveryPrice = rand.nextInt(59);
    }

    public int getDeliveryPrice() {
        calculateDeliveryPrice();
        return deliveryPrice;
    }

    public int getTotalPrice() {
        calculateTotalPrice();
        return totalPrice;
    }

    public boolean giveDiscount(){
        return Math.random()>0.5;
    }

    public double randomDiscount(){
        return randNum;
    }

}
