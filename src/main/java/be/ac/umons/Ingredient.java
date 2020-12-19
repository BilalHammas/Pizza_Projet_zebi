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
            return App.getPriceFromIngredient("Olive");
        } else if(elem.equals("Dough")) {
            return App.getPriceFromIngredient("Dough");
        } else if(elem.equals("TomatoSauce")) {
            return App.getPriceFromIngredient("TomatoSauce");
        } else if(elem.equals("WhiteSauce")) {
            return App.getPriceFromIngredient("WhiteSauce");
        } else if(elem.equals("Cheese")) {
            return App.getPriceFromIngredient("Cheese");
        } else if(elem.equals("Mushroom")) {
            return App.getPriceFromIngredient("Mushroom");
        } else if(elem.equals("Seafood")) {
            return App.getPriceFromIngredient("Seafood");
        } else if(elem.equals("Ham")) {
            return App.getPriceFromIngredient("Ham");
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
    public void AddStock(){


    }
}
