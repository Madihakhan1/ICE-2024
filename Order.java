import java.util.List;

public class Order {

private List<Restaurant> orders;

public Order(List<Restaurant>orders){

}
public String placeOrders(){
    return placeOrders();
}

public void displayOrder(){

        for (int i = 0; i < orders.size(); i++) {
            Restaurant order = orders.get(i);
            System.out.println("Order " + (i + 1) + ":");

            for (Restaurant item : order.getItems()) {
                System.out.println("- " + item.getName() + ": $" + item.getPrice());
                // You can include more details like quantity, special instructions, etc. if needed
            }
            System.out.println("Total Price: $" + order.getTotalPrice());

        }
}

public void deleteOrders(){

  orders.clear();

}

public String toString(){
    return toString();
}

}
