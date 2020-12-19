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
        O.AddStock();
        Dough D=new Dough();
        D.AddStock();
        WhiteSauce W= new WhiteSauce();
        W.AddStock();
        Cheese C= new Cheese();
        C.AddStock();
        Ham H=new Ham();
        H.AddStock();
        TomatoSauce T= new TomatoSauce();
        T.AddStock();
        Seafood S=new Seafood();
        S.AddStock();
        O.provide();
        D.provide();
        W.provide();
        C.provide();
        H.provide();
        T.provide();
        S.provide();
    }

}
