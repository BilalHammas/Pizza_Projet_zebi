package be.ac.umons;

public abstract class AbstractFactory
{
    String name;
    public getFactory(String name){
        if (name=="FactoryHut"){
            return new FactoryHut();
        }
        else if (name=="FactoryDominos"){
            return new FactoryDominos();
        }
        else{
            return null;
        }
    }
   public  Pizza createPizza(String name){
        return new Pizza(name);
    }

}
