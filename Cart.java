import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cart {

    private boolean isDouble;
    Random rand = new Random();
    private int min ;
    private int max;


    public List<OrderLine> orderline;

    public Cart(){
        this.orderline = new LinkedList<>();
    }


    public void calculateTotalPrice(){
        totalPrice = rand.nextInt(300);
    }

    public int getDeliveryPrice(){

        min = rand.nextInt(29) + 1;
        max = rand.nextInt(59) + 1;
        int totalDeliveryPrice = min + max;

        if(min == max){
            isDouble = true;
        }else {
            isDouble = false;
        }return totalDeliveryPrice;
    }


    public int getDeliveryPrice() {
        calculateDeliveryPrice();
        return deliveryPrice;
    }

    public int getTotalPrice() {
        calculateTotalPrice();
        return totalPrice;
    }

    public void addToCart(OrderLine orderline){
       this.orderline.add(orderline);
    }



}
