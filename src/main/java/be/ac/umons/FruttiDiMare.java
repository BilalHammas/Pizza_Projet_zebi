package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class FruttiDiMare extends Pizza {

    @Override
    public float getPrice() {
        return price;
    }

    public FruttiDiMare(){
        super("FruttiDiMare");
        price+=AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("Tomatosauce") + AbstractFactory.getPriceFromIngredient("Seafood") + AbstractFactory.getPriceFromIngredient("Cheese");
        addIngredient(new Seafood());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        addIngredient(new Cheese());
    }
}

