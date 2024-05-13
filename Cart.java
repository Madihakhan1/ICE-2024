import java.util.LinkedList;
import java.util.List;

public class Cart {

    private boolean isDouble;
    Random rand = new Random();
    private int min ;
    private int max;
    private int[] price  = new int[2];



    public List<OrderLine> orderline;

    public Cart(){
        this.orderline = new LinkedList<>();
    }

    public List<OrderLine> getOrderline() {
        return orderline;
    }


  // min 120 og max 300
  // get random mellem min og max

  public double getTotalPrice(){
        min = rand.nextInt(59)+1;
        max = rand.nextInt(159)+1;
        int totalPrice = min + max;
        
        for(OrderLine orderline : orderline){
            totalPrice += orderline.getTotalprice();
        }

        return totalPrice;
    }



    public void addToCart(OrderLine orderline){
       this.orderline.add(orderline);
    }


    @Override

   public String toString(){

        return "Here is the order " + orderline;


    }

}
