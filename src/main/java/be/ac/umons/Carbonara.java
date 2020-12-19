package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;
public class Carbonara extends Pizza
{


    private static int stock3=1;

    private static void StockX(){
        Dough D=new Dough();
        WhiteSauce W= new WhiteSauce();
        Ham H=new Ham();
        Cheese C= new Cheese();
        int i=H.getStock();
        int h=H.getStock();
        int w=D.getStock();
        int c=D.getStock();
        ArrayList<Integer>Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(h);
        Stocage.add(w);
        Stocage.add(c);
        stock3= Collections.min(Stocage);

    }
    @Override
    public  int getStock3(){
        return stock3;
    }

    @Override
    public float getPrice() {
        return (float) 9;
        //return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }

    Carbonara()   {



         super("Carbonara");
         addIngredient(new Dough());
         addIngredient(new WhiteSauce());
         addIngredient(new Cheese());
         addIngredient(new Ham());


    }
};