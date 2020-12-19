package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class Margherita extends Pizza {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();

        Olive O= new Olive();
        Cheese C= new Cheese();
        int i= W.getStock();

        int c=C.getStock();
        int d=D.getStock();
        int o=O.getStock();
        ArrayList<Integer> Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(d);

        Stocage.add(c);
        ///Stocage.add(o);
        stock3= Collections.min(Stocage);

    }
    @Override
    public float getPrice() {
        /*
        Ingredient I = new Ingredient();
        return (I.getPrice("Dough") + I.getPrice("Cheese") + I.getPrice("TomatoSauce"));


        */
        return (float) 6.5;
    }

    Margherita(){
        super("Margherita");
        addIngredient(new Cheese());
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}
