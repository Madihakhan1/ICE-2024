public class Dessert {

    private String name;


    public Dessert(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }


    @Override
    public String toString(){
        return name;
    }
}
