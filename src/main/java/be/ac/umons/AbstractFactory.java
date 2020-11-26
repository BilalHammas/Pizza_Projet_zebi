package be.ac.umons;

public abstract class AbstractFactory
{
    String name;

    public  AbstractFactory getFactory(String name){
        if (name.equals("FactoryHut")){
            return new FactoryHut();
        }
        else if (name.equals("FactoryDominos")){
            return new FactoryDominos();
        }
        else{
            return null;
        }
    }


   public Pizza createPizza(String name){
        System.out.println("on est la");
        return new Pizza(name);
    }

}
