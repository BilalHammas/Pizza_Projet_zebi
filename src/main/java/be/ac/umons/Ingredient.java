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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void provide (){


    };
    public int getStock(){
        return 3;

    }
}
