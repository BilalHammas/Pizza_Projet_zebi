package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class MargheritaHut extends Margherita {
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
        Stocage.add(o);
        stock3= Collections.min(Stocage);

    }
    @Override
    public float getPrice(){
        Olive O=new Olive();
        Margherita C=new Margherita();
        return (price=C.getPrice()+O.getPrice());
    }

    public MargheritaHut(){
        super();
        setName("MarheritaHut");
        addIngredient(new Olive());
    }
    public  int getStock3(){
        return stock3;
    }

}
