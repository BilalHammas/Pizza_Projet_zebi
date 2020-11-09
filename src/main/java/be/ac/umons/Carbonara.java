package be.ac.umons;

public class Carbonara extends Pizza
{
    @Override
    public float getPrice() {
     Dough D=new Dough();
     WhiteSauce W= new WhiteSauce();
     Cheese C= new Cheese();
     Ham H=new Ham();
     return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }


    Carbonara()
    {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new WhiteSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
        //ceci est un commentaire
    }
}