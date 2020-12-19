package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class Prosciutto extends Pizza{
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        D.AddStock();
        TomatoSauce W= new TomatoSauce();
        W.AddStock();
        Ham H=new Ham();
        H.AddStock();
        Cheese C= new Cheese();
        C.AddStock();
        Olive O= new Olive();
        O.AddStock();
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
        //Stocage.add(o);
        stock3= Collections.min(Stocage);

    }
    @Override
    public float getPrice() {
        return price ;
        //return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }


    Prosciutto()
    {

        super("Prosciutto");

        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Ham H=new Ham();
        Cheese C= new Cheese();
        price=D.getPrice("Dough")+W.getPrice("TomatoSauce")+ C.getPrice("Cheese")+H.getPrice("Ham");
        addIngredient(D);
        addIngredient(W);
        addIngredient(H);
        addIngredient(C);
        //ceci est un commentaire
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}