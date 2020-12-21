package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class Margherita extends Pizza {
    @Override
    public float getPrice() {
        return price;
    }

    Margherita(){
        super("Margherita");
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();
        price+=AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("TomatoSauce") + AbstractFactory.getPriceFromIngredient("Cheese");
        addIngredient(C);
        addIngredient(D);
        addIngredient(W);
    }
}
