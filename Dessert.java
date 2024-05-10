public class Dessert {

    private String name;


    public Dessert(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Dessert of choice: " + name;
    }
}
