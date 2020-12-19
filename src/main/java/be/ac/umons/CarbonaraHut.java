package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class CarbonaraHut extends Carbonara {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        WhiteSauce W= new WhiteSauce();
        Ham H=new Ham();
        Olive O= new Olive();
        Cheese C= new Cheese();
        int i= W.getStock();
        int h=H.getStock();
        int c=C.getStock();
        int d=D.getStock();
        int o=O.getStock();
        ArrayList<Integer> Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(d);
        Stocage.add(h);
        Stocage.add(c);
        Stocage.add(o);
        stock3= Collections.min(Stocage);

    }
    @Override
    public  int getStock3(){
        return stock3;
    }
    @Override
    public float getPrice(){
        return (float) 10;
        //return (price=C.getPrice()+O.getPrice());
    }


    CarbonaraHut(){
        super();
        setName("CarbonaraHut");
        addIngredient(new Olive());
    }













}
