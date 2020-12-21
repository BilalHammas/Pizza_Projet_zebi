package be.ac.umons;

public class Cheesy extends DecoratorPizza{

    public Cheesy(Pizza p){
        super(p,"Cheesy " + p.getName(),2);
    }

    @Override
    public String decoration(){
        Dec="Cheesy";
        return name="Cheesy";
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public float getPrice(){
         return price2;
    }
// il faut definir le prix a partir de la base de donnée

    @Override
    public void setName(String name) { }

    @Override
    public void setPrice(float price2) {
          this.price2=price2;
    }
}
