package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class CarbonaraHut extends Carbonara {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        D.AddStock();
        WhiteSauce W= new WhiteSauce();
        W.AddStock();
        Ham H=new Ham();
        H.AddStock();
        Olive O= new Olive();
        O.AddStock();
        Cheese C= new Cheese();
        C.AddStock();
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
        return price;
        //return (price=C.getPrice()+O.getPrice());
    }


    CarbonaraHut(){
        super();
        setName("CarbonaraHut");
        addIngredient(new Olive());
        Olive O =new Olive();
        price+=price+O.getPrice("Olive");
        addIngredient(O);
    }













}
