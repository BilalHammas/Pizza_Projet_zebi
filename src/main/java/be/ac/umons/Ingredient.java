package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private String name;
    private float price;
    private static List<Observer> observerCollection;
    public static int stock = 5;

    public Ingredient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice(String elem) {
        if(elem.equals("Olive")) {
            return (float) 1;
        } else if(elem.equals("Dough")) {
            return (float) 3;
        } else if(elem.equals("TomatoSauce")) {
            return (float) 1.5;
        } else if(elem.equals("WhiteSauce")) {
            return (float) 1.5;
        } else if(elem.equals("Cheese")) {
            return (float) 2;
        } else if(elem.equals("Mushroom")) {
            return (float) 1;
        } else if(elem.equals("Seafood")) {
            return (float) 2.5;
        } else if(elem.equals("Ham")) {
            return (float) 2;
        }
        return 0;
    }
    /*
    public float getPrice() {
        return this.price;
    }
    */

    public void setPrice(float price) {
        this.price = price;
    }
    public void provide (){
    };
    public int getStock(){
        return 5;

    }
}
