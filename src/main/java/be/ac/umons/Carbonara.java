package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;
public class Carbonara extends Pizza
{
    @Override
    public float getPrice() {
        return (float) 9;
        //return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }

    Carbonara()   {
        super("Carbonara");
        price+=AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("WhiteSauce") + AbstractFactory.getPriceFromIngredient("Cheese") + AbstractFactory.getPriceFromIngredient("Ham");
        addIngredient(new Dough());
        addIngredient(new WhiteSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}