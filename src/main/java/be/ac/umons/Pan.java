package be.ac.umons;

public class Pan extends DecoratorPizza{

    public Pan(Pizza p){
        super(p,"Pan " + p.getName(),(float) 1.5);
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
