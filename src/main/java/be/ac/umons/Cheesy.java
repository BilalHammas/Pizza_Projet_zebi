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
        return price;
    }
    @Override
    public void setPrice(float p)
    {

        this.price=p;
    }
    @Override
    public void setName(String n)
    {

        this.name=n;
    }


}
