import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cart {

    Random rand = new Random();
    private int deliveryPrice;
    private int totalPrice;
    private int randomDiscount;
    private double randNum = Math.random()/2;

    public List<OrderLine> orderline;

    public Cart(){
        this.orderline = new LinkedList<>();
    }


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

    public double randomDiscount(){
        return randNum;
    }


    public void addToCart(OrderLine orderline){
       this.orderline.add(orderline);
    }
}
