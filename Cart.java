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

    public List<OrderLine> getOrderline() {
        return orderline;
    }


  public int getTotalPrice(){
        min = rand.nextInt(59)+1;
        max = rand.nextInt(259)+1;
        int totalPrice = min + max;
        
        if(min == max){
            isDouble = true;
        }else {
            isDouble = false;
        }
        return totalPrice;
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


    public void addToCart(OrderLine orderline){
       this.orderline.add(orderline);
    }



}
