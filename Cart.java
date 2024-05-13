import java.util.LinkedList;
import java.util.List;

public class Cart {


    public List<OrderLine> orderline;

    public Cart(){
        this.orderline = new LinkedList<>();
    }

    public List<OrderLine> getOrderline() {
        return orderline;
    }

  /*
   min 120 og max 300
   get random mellem min og max

  public double getTotalPrice(){
        double min = 120;
        double max = 300;

        double getTotalprice = 0;

        for(OrderLine orderline : orderline){
            totalPrice += orderline.getTotalprice();
        }

        return totalPrice;
    }

   */

    public void addToCart(OrderLine orderline){
       this.orderline.add(orderline);
    }


    @Override

   public String toString(){

        return "Here is the order " + orderline;


    }

}
