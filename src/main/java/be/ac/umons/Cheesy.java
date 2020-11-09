package be.ac.umons;

public class Cheesy extends DecoratorPizza{
    public Cheesy(Pizza p){
     super(p,"Cheesy");
    }
    @Override
    public String decoration(){
        return "Cheesy";
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public float getPrice(){
         return price2=3;
    }
// il faut definir le prix a partir de la base de donnée

    @Override
    public void setName(String n)
    {

        this.name=n;
    }

    @Override
    public void setPrice(float p) {

    }
}
