package be.ac.umons;

public class Pan extends DecoratorPizza{
    public  Pan(Pizza p){
          super(p,"Pan");

    }
    @Override
    public String decoration (){

        return "Pan";
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
