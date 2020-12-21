package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class MargheritaHut extends Margherita {
    @Override
    public float getPrice(){
        return (float) 6.5;
    }

    public MargheritaHut(){
        super();
        setName("Margherita Hut");
        Olive O =new Olive();
        price+=price+AbstractFactory.getPriceFromIngredient("Olive");
        addIngredient(O);
    }

}
