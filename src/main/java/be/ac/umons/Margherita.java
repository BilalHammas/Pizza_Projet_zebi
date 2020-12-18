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
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();

        return (price=D.getPrice()+W.getPrice()+ C.getPrice());
    }

    Margherita(){
        super("Margherita");
        addIngredient(new Cheese());
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
    }
    public  int getStock3(){
        return stock3;
    }
}
