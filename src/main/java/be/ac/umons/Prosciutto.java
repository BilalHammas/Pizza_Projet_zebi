package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class Prosciutto extends Pizza{
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Ham H=new Ham();
        Cheese C= new Cheese();
        Olive O= new Olive();
        int i=H.getStock();
        int h=H.getStock();
        int w=D.getStock();
        int c=D.getStock();
        int o=O.getStock();
        ArrayList<Integer> Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(h);
        Stocage.add(w);
        Stocage.add(c);
        //Stocage.add(c);
        stock3= Collections.min(Stocage);

    }
    @Override
    public float getPrice() {
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();
        Ham H=new Ham();
        return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }


    Prosciutto()
    {
        super("Prosciutto");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
        //ceci est un commentaire
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}