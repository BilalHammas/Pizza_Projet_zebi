package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class CarbonaraHut extends Carbonara {
    @Override
    public float getPrice(){
        return price;
        //return (price=C.getPrice()+O.getPrice());
    }


    CarbonaraHut(){
        super();
        setName("CarbonaraHut");
        addIngredient(new Olive());
        Olive O =new Olive();
        price+=AbstractFactory.getPriceFromIngredient("Olive");
        addIngredient(O);
    }













}
