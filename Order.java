import java.awt.*;
import java.util.List;

public class Order {

private List<Restaurant> orders;

public Order(List<Restaurant>orders){

}
public String placeOrders(){
    return placeOrders();
}

public void displayOrder(){

    if(orders.isEmpty()){
        System.out.println("The order is empty");

        }else{
        for (Restaurant order : orders) {
            System.out.println("Order:");

            List<Restaurant> items = order.getItems();
            for (Restaurant item : items) {
                System.out.println("- " + item);
            }

            System.out.println("Total Price: $" + order.getPrice());
        }
    }


}

public void deleteOrders(){

  orders.clear();

}

public String toString(){
    return toString();
}

}
