package be.ac.umons;

public class Prosciutto extends Pizza{
    @Override
    public float getPrice() {
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();
        Ham H=new Ham();
        return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }


    Prosciutto()
    {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
        //ceci est un commentaire
    }
}