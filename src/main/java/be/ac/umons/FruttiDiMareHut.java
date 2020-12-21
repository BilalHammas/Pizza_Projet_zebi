package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class FruttiDiMareHut extends FruttiDiMare {
    @Override
    public float getPrice(){
        return price ;
    }

    FruttiDiMareHut(){
        super();
        setName("FruttiDiMare Hutt");
        Olive O =new Olive();
        price+=AbstractFactory.getPriceFromIngredient("Olive");
        addIngredient(O);
        addIngredient(O);
    }
}
