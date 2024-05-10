public class Drinks {


    private String name;

    public Drinks(String name){

        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Drink of choice: " + name;
    }
}
