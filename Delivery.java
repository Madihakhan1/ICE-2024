public class Delivery {



    private double deliveryFee;






    public Delivery(double delivery){

        this.deliveryFee = delivery;

    }

    public void setDeliveryFee(double deliveryFee){

        this.deliveryFee = deliveryFee;



    }

    public double getDeliveryFee(){

        return deliveryFee;

    }

    public double calculateDeliveryPrice(double deliveryFee,double distance){

        double price = deliveryFee * (deliveryFee * distance);
        return price;

    }

    public String toString(){
        return toString();
    }

}
