package be.ac.umons;

public class Margherita extends Pizza {

    Margherita(){
        super("Margherita");
        addIngredient(new Cheese());
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
    }





}
