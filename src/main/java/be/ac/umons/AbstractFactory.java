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
    public void recharge(){
        Olive O=new Olive();
        Dough D=new Dough();
        WhiteSauce W= new WhiteSauce();
        Cheese C= new Cheese();
        Ham H=new Ham();
        TomatoSauce T= new TomatoSauce();
        Seafood S=new Seafood();
        O.provide();
        D.provide();
        W.provide();
        C.provide();
        H.provide();
        T.provide();
        S.provide();
    }

}
