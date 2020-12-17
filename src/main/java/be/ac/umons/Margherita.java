package be.ac.umons;

public class Margherita extends Pizza {

    @Override
    public float getPrice() {
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();

        return (price=D.getPrice()+W.getPrice()+ C.getPrice());
    }

    Margherita(){
        super("Margherita");
        addIngredient(new Cheese());
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
    }
}
