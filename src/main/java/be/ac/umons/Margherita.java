package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class Margherita extends Pizza {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        D.AddStock();
        TomatoSauce W= new TomatoSauce();
        W.AddStock();
        Olive O= new Olive();
        O.AddStock();
        Cheese C= new Cheese();
        C.AddStock();
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

        return price;
    }

    Margherita(){
        super("Margherita");
        Dough D=new Dough();
        D.AddStock();
        TomatoSauce W= new TomatoSauce();
        W.AddStock();
        Cheese C= new Cheese();
        price=D.getPrice("Dough")+W.getPrice("TomatoSauce")+ C.getPrice("Cheese");
        addIngredient( C);
        addIngredient(D);
        addIngredient(W);
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}
